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

package com.twilio.rest.ipmessaging.v2.service.user;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.time.ZonedDateTime;




/*
    * Twilio - Ip_messaging
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.31.1
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class UserChannelUpdater extends Updater<UserChannel>{
    private String serviceSid;
    private String userSid;
    private String channelSid;
    private UserChannel.NotificationLevel notificationLevel;
    private Integer lastConsumedMessageIndex;
    private ZonedDateTime lastConsumptionTimestamp;

    public UserChannelUpdater(final String serviceSid, final String userSid, final String channelSid){
        this.serviceSid = serviceSid;
        this.userSid = userSid;
        this.channelSid = channelSid;
    }

    public UserChannelUpdater setNotificationLevel(final UserChannel.NotificationLevel notificationLevel){
        this.notificationLevel = notificationLevel;
        return this;
    }
    public UserChannelUpdater setLastConsumedMessageIndex(final Integer lastConsumedMessageIndex){
        this.lastConsumedMessageIndex = lastConsumedMessageIndex;
        return this;
    }
    public UserChannelUpdater setLastConsumptionTimestamp(final ZonedDateTime lastConsumptionTimestamp){
        this.lastConsumptionTimestamp = lastConsumptionTimestamp;
        return this;
    }

    @Override
    public UserChannel update(final TwilioRestClient client){
        String path = "/v2/Services/{ServiceSid}/Users/{UserSid}/Channels/{ChannelSid}";

        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());
        path = path.replace("{"+"UserSid"+"}", this.userSid.toString());
        path = path.replace("{"+"ChannelSid"+"}", this.channelSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.IPMESSAGING.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("UserChannel update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return UserChannel.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (notificationLevel != null) {
            request.addPostParam("NotificationLevel", notificationLevel.toString());
    
        }
        if (lastConsumedMessageIndex != null) {
            request.addPostParam("LastConsumedMessageIndex", lastConsumedMessageIndex.toString());
    
        }
        if (lastConsumptionTimestamp != null) {
            request.addPostParam("LastConsumptionTimestamp", lastConsumptionTimestamp.toInstant().toString());

        }
    }
}
