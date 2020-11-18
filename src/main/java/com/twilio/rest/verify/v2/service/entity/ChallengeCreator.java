/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.verify.v2.service.entity;

import com.twilio.base.Creator;
import com.twilio.converter.Converter;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class ChallengeCreator extends Creator<Challenge> {
    private final String pathServiceSid;
    private final String pathIdentity;
    private final String factorSid;
    private ZonedDateTime expirationDate;
    private String detailsMessage;
    private List<Map<String, Object>> detailsFields;
    private Map<String, Object> hiddenDetails;

    /**
     * Construct a new ChallengeCreator.
     *
     * @param pathServiceSid Service Sid.
     * @param pathIdentity Unique external identifier of the Entity
     * @param factorSid Factor Sid.
     */
    public ChallengeCreator(final String pathServiceSid,
                            final String pathIdentity,
                            final String factorSid) {
        this.pathServiceSid = pathServiceSid;
        this.pathIdentity = pathIdentity;
        this.factorSid = factorSid;
    }

    /**
     * The future date in which this Challenge will expire, given in <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format..
     *
     * @param expirationDate The future date in which this Challenge will expire
     * @return this
     */
    public ChallengeCreator setExpirationDate(final ZonedDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Shown to the user when the push notification arrives. Required when
     * `factor_type` is `push`.
     *
     * @param detailsMessage Shown to the user when the push notification arrives
     * @return this
     */
    public ChallengeCreator setDetailsMessage(final String detailsMessage) {
        this.detailsMessage = detailsMessage;
        return this;
    }

    /**
     * A list of objects that describe the Fields included in the Challenge. Each
     * object contains the label and value of the field. Used when `factor_type` is
     * `push`..
     *
     * @param detailsFields A list of objects that describe the Fields included in
     *                      the Challenge
     * @return this
     */
    public ChallengeCreator setDetailsFields(final List<Map<String, Object>> detailsFields) {
        this.detailsFields = detailsFields;
        return this;
    }

    /**
     * A list of objects that describe the Fields included in the Challenge. Each
     * object contains the label and value of the field. Used when `factor_type` is
     * `push`..
     *
     * @param detailsFields A list of objects that describe the Fields included in
     *                      the Challenge
     * @return this
     */
    public ChallengeCreator setDetailsFields(final Map<String, Object> detailsFields) {
        return setDetailsFields(Promoter.listOfOne(detailsFields));
    }

    /**
     * Details provided to give context about the Challenge. Not shown to the end
     * user. It must be a stringified JSON with only strings values eg. `{"ip":
     * "172.168.1.234"}`.
     *
     * @param hiddenDetails Hidden details provided to contextualize the Challenge
     * @return this
     */
    public ChallengeCreator setHiddenDetails(final Map<String, Object> hiddenDetails) {
        this.hiddenDetails = hiddenDetails;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Challenge
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Challenge create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.VERIFY.toString(),
            "/v2/Services/" + this.pathServiceSid + "/Entities/" + this.pathIdentity + "/Challenges"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Challenge creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Challenge.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (factorSid != null) {
            request.addPostParam("FactorSid", factorSid);
        }

        if (expirationDate != null) {
            request.addPostParam("ExpirationDate", expirationDate.toOffsetDateTime().toString());
        }

        if (detailsMessage != null) {
            request.addPostParam("Details.Message", detailsMessage);
        }

        if (detailsFields != null) {
            for (Map<String, Object> prop : detailsFields) {
                request.addPostParam("Details.Fields", Converter.mapToJson(prop));
            }
        }

        if (hiddenDetails != null) {
            request.addPostParam("HiddenDetails", Converter.mapToJson(hiddenDetails));
        }
    }
}