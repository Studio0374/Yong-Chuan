/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Sync
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.sync.v1;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.net.URI;




import java.net.URI;

/*
    * Twilio - Sync
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.31.1
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class ServiceCreator extends Creator<Service>{
    private String friendlyName;
    private URI webhookUrl;
    private Boolean reachabilityWebhooksEnabled;
    private Boolean aclEnabled;
    private Boolean reachabilityDebouncingEnabled;
    private Integer reachabilityDebouncingWindow;
    private Boolean webhooksFromRestEnabled;

    public ServiceCreator() {
    }

    public ServiceCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public ServiceCreator setWebhookUrl(final URI webhookUrl){
        this.webhookUrl = webhookUrl;
        return this;
    }

    public ServiceCreator setWebhookUrl(final String webhookUrl){
    this.webhookUrl = Promoter.uriFromString(webhookUrl);
    return this;
    }
    public ServiceCreator setReachabilityWebhooksEnabled(final Boolean reachabilityWebhooksEnabled){
        this.reachabilityWebhooksEnabled = reachabilityWebhooksEnabled;
        return this;
    }
    public ServiceCreator setAclEnabled(final Boolean aclEnabled){
        this.aclEnabled = aclEnabled;
        return this;
    }
    public ServiceCreator setReachabilityDebouncingEnabled(final Boolean reachabilityDebouncingEnabled){
        this.reachabilityDebouncingEnabled = reachabilityDebouncingEnabled;
        return this;
    }
    public ServiceCreator setReachabilityDebouncingWindow(final Integer reachabilityDebouncingWindow){
        this.reachabilityDebouncingWindow = reachabilityDebouncingWindow;
        return this;
    }
    public ServiceCreator setWebhooksFromRestEnabled(final Boolean webhooksFromRestEnabled){
        this.webhooksFromRestEnabled = webhooksFromRestEnabled;
        return this;
    }

    @Override
    public Service create(final TwilioRestClient client){
        String path = "/v1/Services";


        Request request = new Request(
            HttpMethod.POST,
            Domains.SYNC.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Service creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Service.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (webhookUrl != null) {
            request.addPostParam("WebhookUrl", webhookUrl.toString());
    
        }
        if (reachabilityWebhooksEnabled != null) {
            request.addPostParam("ReachabilityWebhooksEnabled", reachabilityWebhooksEnabled.toString());
    
        }
        if (aclEnabled != null) {
            request.addPostParam("AclEnabled", aclEnabled.toString());
    
        }
        if (reachabilityDebouncingEnabled != null) {
            request.addPostParam("ReachabilityDebouncingEnabled", reachabilityDebouncingEnabled.toString());
    
        }
        if (reachabilityDebouncingWindow != null) {
            request.addPostParam("ReachabilityDebouncingWindow", reachabilityDebouncingWindow.toString());
    
        }
        if (webhooksFromRestEnabled != null) {
            request.addPostParam("WebhooksFromRestEnabled", webhooksFromRestEnabled.toString());
    
        }
    }
}
