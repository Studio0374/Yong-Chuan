/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.messaging.v1.brandregistration;

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
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class BrandVettingCreator extends Creator<BrandVetting> {
    private final String pathBrandSid;
    private final BrandVetting.VettingProvider vettingProvider;
    private String vettingId;

    /**
     * Construct a new BrandVettingCreator.
     *
     * @param pathBrandSid A2P BrandRegistration Sid
     * @param vettingProvider Third-party provider of the vettings to create
     */
    public BrandVettingCreator(final String pathBrandSid,
                               final BrandVetting.VettingProvider vettingProvider) {
        this.pathBrandSid = pathBrandSid;
        this.vettingProvider = vettingProvider;
    }

    /**
     * The unique ID of the vetting.
     *
     * @param vettingId The unique ID of the vetting
     * @return this
     */
    public BrandVettingCreator setVettingId(final String vettingId) {
        this.vettingId = vettingId;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created BrandVetting
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public BrandVetting create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.MESSAGING.toString(),
            "/v1/a2p/BrandRegistrations/" + this.pathBrandSid + "/Vettings"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("BrandVetting creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return BrandVetting.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (vettingProvider != null) {
            request.addPostParam("VettingProvider", vettingProvider.toString());
        }

        if (vettingId != null) {
            request.addPostParam("VettingId", vettingId);
        }
    }
}