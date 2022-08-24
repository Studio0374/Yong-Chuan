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

package com.twilio.rest.autopilot.v1.assistant;

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
    * Twilio - Autopilot
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class WebhookCreator extends Creator<Webhook>{
    private String assistantSid;
    private String uniqueName;
    private String events;
    private URI webhookUrl;
    private String webhookMethod;

    public WebhookCreator(final String assistantSid, final String uniqueName, final String events, final URI webhookUrl) {
        this.assistantSid = assistantSid;
        this.uniqueName = uniqueName;
        this.events = events;
        this.webhookUrl = webhookUrl;
    }

    public WebhookCreator setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }
    public WebhookCreator setEvents(final String events){
        this.events = events;
        return this;
    }
    public WebhookCreator setWebhookUrl(final URI webhookUrl){
        this.webhookUrl = webhookUrl;
        return this;
    }

    public WebhookCreator setWebhookUrl(final String webhookUrl){
    this.webhookUrl = Promoter.uriFromString(webhookUrl);
    return this;
    }
    public WebhookCreator setWebhookMethod(final String webhookMethod){
        this.webhookMethod = webhookMethod;
        return this;
    }

    @Override
    public Webhook create(final TwilioRestClient client){
        String path = "/v1/Assistants/{AssistantSid}/Webhooks";

        path = path.replace("{"+"AssistantSid"+"}", this.assistantSid.toString());
        path = path.replace("{"+"UniqueName"+"}", this.uniqueName.toString());
        path = path.replace("{"+"Events"+"}", this.events.toString());
        path = path.replace("{"+"WebhookUrl"+"}", this.webhookUrl.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.AUTOPILOT.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Webhook creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Webhook.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
    
        }
        if (events != null) {
            request.addPostParam("Events", events);
    
        }
        if (webhookUrl != null) {
            request.addPostParam("WebhookUrl", webhookUrl.toString());
    
        }
        if (webhookMethod != null) {
            request.addPostParam("WebhookMethod", webhookMethod);
    
        }
    }
}
