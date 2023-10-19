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

package com.twilio.rest.flexapi.v1;

import com.twilio.base.Creator;
import com.twilio.constant.EnumConstants;
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



public class InteractionCreator extends Creator<Interaction>{
    private Map<String, Object> channel;
    private Map<String, Object> routing;
    private String interactionContextSid;

    public InteractionCreator(final Map<String, Object> channel, final Map<String, Object> routing) {
        this.channel = channel;
        this.routing = routing;
    }

    public InteractionCreator setChannel(final Map<String, Object> channel){
        this.channel = channel;
        return this;
    }
    public InteractionCreator setRouting(final Map<String, Object> routing){
        this.routing = routing;
        return this;
    }
    public InteractionCreator setInteractionContextSid(final String interactionContextSid){
        this.interactionContextSid = interactionContextSid;
        return this;
    }

    @Override
    public Interaction create(final TwilioRestClient client){
        String path = "/v1/Interactions";

        path = path.replace("{"+"Channel"+"}", this.channel.toString());
        path = path.replace("{"+"Routing"+"}", this.routing.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.FLEXAPI.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Interaction creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return Interaction.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (channel != null) {
            request.addPostParam("Channel",  Converter.mapToJson(channel));
    
        }
        if (routing != null) {
            request.addPostParam("Routing",  Converter.mapToJson(routing));
    
        }
        if (interactionContextSid != null) {
            request.addPostParam("InteractionContextSid", interactionContextSid);
    
        }
    }
}
