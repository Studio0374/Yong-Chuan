/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.studio.v2.flow;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.util.List;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class FlowTestUserUpdater extends Updater<FlowTestUser> {
    private final String pathSid;
    private final List<String> testUsers;

    /**
     * Construct a new FlowTestUserUpdater.
     *
     * @param pathSid The sid
     * @param testUsers The test_users
     */
    public FlowTestUserUpdater(final String pathSid,
                               final List<String> testUsers) {
        this.pathSid = pathSid;
        this.testUsers = testUsers;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated FlowTestUser
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public FlowTestUser update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.STUDIO.toString(),
            "/v2/Flows/" + this.pathSid + "/TestUsers"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("FlowTestUser update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return FlowTestUser.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (testUsers != null) {
            for (String prop : testUsers) {
                request.addPostParam("TestUsers", prop);
            }
        }
    }
}