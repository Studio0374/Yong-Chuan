/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Preview
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.preview.understand.assistant;

import com.twilio.base.Updater;
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


public class AssistantFallbackActionsUpdater extends Updater<AssistantFallbackActions>{
    private String assistantSid;
    private Map<String, Object> fallbackActions;

    public AssistantFallbackActionsUpdater(final String assistantSid){
        this.assistantSid = assistantSid;
    }

    public AssistantFallbackActionsUpdater setFallbackActions(final Map<String, Object> fallbackActions){
        this.fallbackActions = fallbackActions;
        return this;
    }

    @Override
    public AssistantFallbackActions update(final TwilioRestClient client){
        String path = "/understand/Assistants/{AssistantSid}/FallbackActions";

        path = path.replace("{"+"AssistantSid"+"}", this.assistantSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("AssistantFallbackActions update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return AssistantFallbackActions.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (fallbackActions != null) {
            request.addPostParam("FallbackActions",  Converter.mapToJson(fallbackActions));
    
        }
    }
}
