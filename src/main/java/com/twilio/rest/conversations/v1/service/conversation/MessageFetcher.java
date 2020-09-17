/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1.service.conversation;

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
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class MessageFetcher extends Fetcher<Message> {
    private final String pathChatServiceSid;
    private final String pathConversationSid;
    private final String pathSid;

    /**
     * Construct a new MessageFetcher.
     *
     * @param pathChatServiceSid The SID of the Chat Service that the resource is
     *                           associated with.
     * @param pathConversationSid The unique id of the Conversation for this
     *                            message.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     */
    public MessageFetcher(final String pathChatServiceSid,
                          final String pathConversationSid,
                          final String pathSid) {
        this.pathChatServiceSid = pathChatServiceSid;
        this.pathConversationSid = pathConversationSid;
        this.pathSid = pathSid;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched Message
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Message fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.CONVERSATIONS.toString(),
            "/v1/Services/" + this.pathChatServiceSid + "/Conversations/" + this.pathConversationSid + "/Messages/" + this.pathSid + ""
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Message fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Message.fromJson(response.getStream(), client.getObjectMapper());
    }
}