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

package com.twilio.rest.conversations.v1.service;

import com.twilio.base.Creator;
import com.twilio.constant.EnumConstants;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class UserCreator extends Creator<User>{
    private String pathChatServiceSid;
    private String identity;
    private User.WebhookEnabledType xTwilioWebhookEnabled;
    private String friendlyName;
    private String attributes;
    private String roleSid;

    public UserCreator(final String pathChatServiceSid, final String identity) {
        this.pathChatServiceSid = pathChatServiceSid;
        this.identity = identity;
    }

    public UserCreator setIdentity(final String identity){
        this.identity = identity;
        return this;
    }
    public UserCreator setXTwilioWebhookEnabled(final User.WebhookEnabledType xTwilioWebhookEnabled){
        this.xTwilioWebhookEnabled = xTwilioWebhookEnabled;
        return this;
    }
    public UserCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public UserCreator setAttributes(final String attributes){
        this.attributes = attributes;
        return this;
    }
    public UserCreator setRoleSid(final String roleSid){
        this.roleSid = roleSid;
        return this;
    }

    @Override
    public User create(final TwilioRestClient client){
        String path = "/v1/Services/{ChatServiceSid}/Users";

        path = path.replace("{"+"ChatServiceSid"+"}", this.pathChatServiceSid.toString());
        path = path.replace("{"+"Identity"+"}", this.identity.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.CONVERSATIONS.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        addHeaderParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("User creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return User.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (identity != null) {
            request.addPostParam("Identity", identity);
    
        }
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (attributes != null) {
            request.addPostParam("Attributes", attributes);
    
        }
        if (roleSid != null) {
            request.addPostParam("RoleSid", roleSid);
    
        }
    }
    private void addHeaderParams(final Request request) {
        if (xTwilioWebhookEnabled != null) {
            request.addHeaderParam("X-Twilio-Webhook-Enabled", xTwilioWebhookEnabled.toString());
        }
    }
}
