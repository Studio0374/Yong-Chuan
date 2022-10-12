/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Autopilot
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.autopilot.v1;

import com.twilio.base.Updater;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;

import java.util.Map;


public class AssistantUpdater extends Updater<Assistant>{
    private String sid;
    private String friendlyName;
    private Boolean logQueries;
    private String uniqueName;
    private URI callbackUrl;
    private String callbackEvents;
    private Map<String, Object> styleSheet;
    private Map<String, Object> defaults;
    private String developmentStage;

    public AssistantUpdater(final String sid){
        this.sid = sid;
    }

    public AssistantUpdater setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public AssistantUpdater setLogQueries(final Boolean logQueries){
        this.logQueries = logQueries;
        return this;
    }
    public AssistantUpdater setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }
    public AssistantUpdater setCallbackUrl(final URI callbackUrl){
        this.callbackUrl = callbackUrl;
        return this;
    }

    public AssistantUpdater setCallbackUrl(final String callbackUrl){
        return setCallbackUrl(Promoter.uriFromString(callbackUrl));
    }
    public AssistantUpdater setCallbackEvents(final String callbackEvents){
        this.callbackEvents = callbackEvents;
        return this;
    }
    public AssistantUpdater setStyleSheet(final Map<String, Object> styleSheet){
        this.styleSheet = styleSheet;
        return this;
    }
    public AssistantUpdater setDefaults(final Map<String, Object> defaults){
        this.defaults = defaults;
        return this;
    }
    public AssistantUpdater setDevelopmentStage(final String developmentStage){
        this.developmentStage = developmentStage;
        return this;
    }

    @Override
    public Assistant update(final TwilioRestClient client){
        String path = "/v1/Assistants/{Sid}";

        path = path.replace("{"+"Sid"+"}", this.sid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.AUTOPILOT.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Assistant update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Assistant.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (logQueries != null) {
            request.addPostParam("LogQueries", logQueries.toString());
    
        }
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
    
        }
        if (callbackUrl != null) {
            request.addPostParam("CallbackUrl", callbackUrl.toString());
    
        }
        if (callbackEvents != null) {
            request.addPostParam("CallbackEvents", callbackEvents);
    
        }
        if (styleSheet != null) {
            request.addPostParam("StyleSheet",  Converter.mapToJson(styleSheet));
    
        }
        if (defaults != null) {
            request.addPostParam("Defaults",  Converter.mapToJson(defaults));
    
        }
        if (developmentStage != null) {
            request.addPostParam("DevelopmentStage", developmentStage);
    
        }
    }
}
