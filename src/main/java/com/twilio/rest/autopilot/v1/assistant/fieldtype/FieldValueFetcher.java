/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.autopilot.v1.assistant.fieldtype;

import com.twilio.base.Fetcher;
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
public class FieldValueFetcher extends Fetcher<FieldValue> {
    private final String pathAssistantSid;
    private final String pathFieldTypeSid;
    private final String pathSid;

    /**
     * Construct a new FieldValueFetcher.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         FieldType associated with the resource to fetch
     * @param pathFieldTypeSid The SID of the Field Type associated with  the Field
     *                         Value to fetch
     * @param pathSid The unique string that identifies the resource
     */
    public FieldValueFetcher(final String pathAssistantSid,
                             final String pathFieldTypeSid,
                             final String pathSid) {
        this.pathAssistantSid = pathAssistantSid;
        this.pathFieldTypeSid = pathFieldTypeSid;
        this.pathSid = pathSid;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched FieldValue
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public FieldValue fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.AUTOPILOT.toString(),
            "/v1/Assistants/" + this.pathAssistantSid + "/FieldTypes/" + this.pathFieldTypeSid + "/FieldValues/" + this.pathSid + ""
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("FieldValue fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return FieldValue.fromJson(response.getStream(), client.getObjectMapper());
    }
}