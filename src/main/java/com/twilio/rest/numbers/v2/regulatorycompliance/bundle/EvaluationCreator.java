/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.numbers.v2.regulatorycompliance.bundle;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class EvaluationCreator extends Creator<Evaluation> {
    private final String pathBundleSid;

    /**
     * Construct a new EvaluationCreator.
     *
     * @param pathBundleSid The bundle_sid
     */
    public EvaluationCreator(final String pathBundleSid) {
        this.pathBundleSid = pathBundleSid;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Evaluation
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Evaluation create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.NUMBERS.toString(),
            "/v2/RegulatoryCompliance/Bundles/" + this.pathBundleSid + "/Evaluations"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Evaluation creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Evaluation.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
    }
}