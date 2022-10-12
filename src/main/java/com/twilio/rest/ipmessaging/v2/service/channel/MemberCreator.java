/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Ip_messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.ipmessaging.v2.service.channel;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.time.ZonedDateTime;




public class MemberCreator extends Creator<Member>{
    private String serviceSid;
    private String channelSid;
    private String identity;
    private Member.WebhookEnabledType xTwilioWebhookEnabled;
    private String roleSid;
    private Integer lastConsumedMessageIndex;
    private ZonedDateTime lastConsumptionTimestamp;
    private ZonedDateTime dateCreated;
    private ZonedDateTime dateUpdated;
    private String attributes;

    public MemberCreator(final String serviceSid, final String channelSid, final String identity) {
        this.serviceSid = serviceSid;
        this.channelSid = channelSid;
        this.identity = identity;
    }

    public MemberCreator setIdentity(final String identity){
        this.identity = identity;
        return this;
    }
    public MemberCreator setXTwilioWebhookEnabled(final Member.WebhookEnabledType xTwilioWebhookEnabled){
        this.xTwilioWebhookEnabled = xTwilioWebhookEnabled;
        return this;
    }
    public MemberCreator setRoleSid(final String roleSid){
        this.roleSid = roleSid;
        return this;
    }
    public MemberCreator setLastConsumedMessageIndex(final Integer lastConsumedMessageIndex){
        this.lastConsumedMessageIndex = lastConsumedMessageIndex;
        return this;
    }
    public MemberCreator setLastConsumptionTimestamp(final ZonedDateTime lastConsumptionTimestamp){
        this.lastConsumptionTimestamp = lastConsumptionTimestamp;
        return this;
    }
    public MemberCreator setDateCreated(final ZonedDateTime dateCreated){
        this.dateCreated = dateCreated;
        return this;
    }
    public MemberCreator setDateUpdated(final ZonedDateTime dateUpdated){
        this.dateUpdated = dateUpdated;
        return this;
    }
    public MemberCreator setAttributes(final String attributes){
        this.attributes = attributes;
        return this;
    }

    @Override
    public Member create(final TwilioRestClient client){
        String path = "/v2/Services/{ServiceSid}/Channels/{ChannelSid}/Members";

        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());
        path = path.replace("{"+"ChannelSid"+"}", this.channelSid.toString());
        path = path.replace("{"+"Identity"+"}", this.identity.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.IPMESSAGING.toString(),
            path
        );
        addPostParams(request);
        addHeaderParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Member creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Member.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (identity != null) {
            request.addPostParam("Identity", identity);
    
        }
        if (roleSid != null) {
            request.addPostParam("RoleSid", roleSid);
    
        }
        if (lastConsumedMessageIndex != null) {
            request.addPostParam("LastConsumedMessageIndex", lastConsumedMessageIndex.toString());
    
        }
        if (lastConsumptionTimestamp != null) {
            request.addPostParam("LastConsumptionTimestamp", lastConsumptionTimestamp.toInstant().toString());

        }
        if (dateCreated != null) {
            request.addPostParam("DateCreated", dateCreated.toInstant().toString());

        }
        if (dateUpdated != null) {
            request.addPostParam("DateUpdated", dateUpdated.toInstant().toString());

        }
        if (attributes != null) {
            request.addPostParam("Attributes", attributes);
    
        }
    }
    private void addHeaderParams(final Request request) {
        if (xTwilioWebhookEnabled != null) {
            request.addHeaderParam("X-Twilio-Webhook-Enabled", xTwilioWebhookEnabled.toString());

        }
    }
}
