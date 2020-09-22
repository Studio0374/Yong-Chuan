/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1;

import com.twilio.base.Updater;
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
public class ConfigurationUpdater extends Updater<Configuration> {
    private String defaultChatServiceSid;
    private String defaultMessagingServiceSid;
    private String defaultInactiveTimer;
    private String defaultClosedTimer;

    /**
     * The SID of the default <a
     * href="https://www.twilio.com/docs/conversations/api/service-resource">Conversation
     * Service</a> to use when creating a conversation..
     *
     * @param defaultChatServiceSid The SID of the default Conversation Service
     *                              that every new conversation will be associated
     *                              with.
     * @return this
     */
    public ConfigurationUpdater setDefaultChatServiceSid(final String defaultChatServiceSid) {
        this.defaultChatServiceSid = defaultChatServiceSid;
        return this;
    }

    /**
     * The SID of the default <a
     * href="https://www.twilio.com/docs/sms/services/api">Messaging Service</a> to
     * use when creating a conversation..
     *
     * @param defaultMessagingServiceSid The SID of the default Messaging Service
     *                                   that every new conversation will be
     *                                   associated with.
     * @return this
     */
    public ConfigurationUpdater setDefaultMessagingServiceSid(final String defaultMessagingServiceSid) {
        this.defaultMessagingServiceSid = defaultMessagingServiceSid;
        return this;
    }

    /**
     * Default ISO8601 duration when conversation will be switched to `inactive`
     * state. Minimum value for this timer is 1 minute..
     *
     * @param defaultInactiveTimer Default ISO8601 duration when conversation will
     *                             be switched to `inactive` state.
     * @return this
     */
    public ConfigurationUpdater setDefaultInactiveTimer(final String defaultInactiveTimer) {
        this.defaultInactiveTimer = defaultInactiveTimer;
        return this;
    }

    /**
     * Default ISO8601 duration when conversation will be switched to `closed`
     * state. Minimum value for this timer is 10 minutes..
     *
     * @param defaultClosedTimer Default ISO8601 duration when conversation will be
     *                           switched to `closed` state.
     * @return this
     */
    public ConfigurationUpdater setDefaultClosedTimer(final String defaultClosedTimer) {
        this.defaultClosedTimer = defaultClosedTimer;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated Configuration
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Configuration update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.CONVERSATIONS.toString(),
            "/v1/Configuration"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Configuration update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Configuration.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (defaultChatServiceSid != null) {
            request.addPostParam("DefaultChatServiceSid", defaultChatServiceSid);
        }

        if (defaultMessagingServiceSid != null) {
            request.addPostParam("DefaultMessagingServiceSid", defaultMessagingServiceSid);
        }

        if (defaultInactiveTimer != null) {
            request.addPostParam("DefaultInactiveTimer", defaultInactiveTimer);
        }

        if (defaultClosedTimer != null) {
            request.addPostParam("DefaultClosedTimer", defaultClosedTimer);
        }
    }
}