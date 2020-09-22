/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.autopilot.v1.assistant.task;

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
public class FieldFetcher extends Fetcher<Field> {
    private final String pathAssistantSid;
    private final String pathTaskSid;
    private final String pathSid;

    /**
     * Construct a new FieldFetcher.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         Task associated with the resource to fetch
     * @param pathTaskSid The SID of the
     *                    <a href="https://www.twilio.com/docs/autopilot/api/task">Task</a>
     *                    resource associated with the Field resource to fetch
     * @param pathSid The unique string that identifies the resource
     */
    public FieldFetcher(final String pathAssistantSid,
                        final String pathTaskSid,
                        final String pathSid) {
        this.pathAssistantSid = pathAssistantSid;
        this.pathTaskSid = pathTaskSid;
        this.pathSid = pathSid;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched Field
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Field fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.AUTOPILOT.toString(),
            "/v1/Assistants/" + this.pathAssistantSid + "/Tasks/" + this.pathTaskSid + "/Fields/" + this.pathSid + ""
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Field fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Field.fromJson(response.getStream(), client.getObjectMapper());
    }
}