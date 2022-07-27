/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1.interaction.interactionchannel;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.util.Map;
import com.twilio.converter.Converter;

import java.util.Map;




/*
    * Twilio - Flex
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.32.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class InteractionChannelParticipantCreator extends Creator<InteractionChannelParticipant>{
    private String interactionSid;
    private String channelSid;
    private InteractionChannelParticipant.Type type;
    private Map<String, Object> mediaProperties;

    public InteractionChannelParticipantCreator(final String interactionSid, final String channelSid, final InteractionChannelParticipant.Type type, final Map<String, Object> mediaProperties) {
        this.interactionSid = interactionSid;
        this.channelSid = channelSid;
        this.type = type;
        this.mediaProperties = mediaProperties;
    }

    public InteractionChannelParticipantCreator setType(final InteractionChannelParticipant.Type type){
        this.type = type;
        return this;
    }
    public InteractionChannelParticipantCreator setMediaProperties(final Map<String, Object> mediaProperties){
        this.mediaProperties = mediaProperties;
        return this;
    }

    @Override
    public InteractionChannelParticipant create(final TwilioRestClient client){
        String path = "/v1/Interactions/{InteractionSid}/Channels/{ChannelSid}/Participants";

        path = path.replace("{"+"InteractionSid"+"}", this.interactionSid.toString());
        path = path.replace("{"+"ChannelSid"+"}", this.channelSid.toString());
        path = path.replace("{"+"Type"+"}", this.type.toString());
        path = path.replace("{"+"MediaProperties"+"}", this.mediaProperties.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.FLEXAPI.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("InteractionChannelParticipant creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return InteractionChannelParticipant.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (type != null) {
            request.addPostParam("Type", type.toString());
    
        }
        if (mediaProperties != null) {
            request.addPostParam("MediaProperties",  Converter.mapToJson(mediaProperties));
    
        }
    }
}
