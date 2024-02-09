/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Conversations
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.conversations.v1.user;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class UserConversationFetcher extends Fetcher<UserConversation> {

    private String pathUserSid;
    private String pathConversationSid;

    public UserConversationFetcher(
        final String pathUserSid,
        final String pathConversationSid
    ) {
        this.pathUserSid = pathUserSid;
        this.pathConversationSid = pathConversationSid;
    }

    @Override
    public UserConversation fetch(final TwilioRestClient client) {
        String path = "/v1/Users/{UserSid}/Conversations/{ConversationSid}";

        path = path.replace("{" + "UserSid" + "}", this.pathUserSid.toString());
        path =
            path.replace(
                "{" + "ConversationSid" + "}",
                this.pathConversationSid.toString()
            );

        Request request = new Request(
            HttpMethod.GET,
            Domains.CONVERSATIONS.toString(),
            path
        );
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "UserConversation fetch failed: Unable to connect to server"
            );
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(
                response.getStream(),
                client.getObjectMapper()
            );
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return UserConversation.fromJson(
            response.getStream(),
            client.getObjectMapper()
        );
    }
}
