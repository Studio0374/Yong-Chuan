/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.authy.v1.service.entity;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class FactorCreator extends Creator<Factor> {
    private final String pathServiceSid;
    private final String pathIdentity;
    private final String binding;
    private final String friendlyName;
    private final Factor.FactorTypes factorType;
    private String twilioAuthySandboxMode;

    /**
     * Construct a new FactorCreator.
     *
     * @param pathServiceSid Service Sid.
     * @param pathIdentity Unique identity of the Entity
     * @param binding A unique binding for this Factor
     * @param friendlyName The friendly name of this Factor
     * @param factorType The Type of this Factor
     */
    public FactorCreator(final String pathServiceSid,
                         final String pathIdentity,
                         final String binding,
                         final String friendlyName,
                         final Factor.FactorTypes factorType) {
        this.pathServiceSid = pathServiceSid;
        this.pathIdentity = pathIdentity;
        this.binding = binding;
        this.friendlyName = friendlyName;
        this.factorType = factorType;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Factor
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Factor create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.AUTHY.toString(),
            "/v1/Services/" + this.pathServiceSid + "/Entities/" + this.pathIdentity + "/Factors",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Factor creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }

            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }

        return Factor.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (binding != null) {
            request.addPostParam("Binding", binding);
        }

        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (factorType != null) {
            request.addPostParam("FactorType", factorType.toString());
        }
    }
}