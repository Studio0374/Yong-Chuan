/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Notify
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.notify.v1.service;

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
import java.util.List;
import java.util.Map;
import com.twilio.converter.Converter;

import java.util.List;
import java.util.Map;




/*
    * Twilio - Notify
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class NotificationCreator extends Creator<Notification>{
    private String serviceSid;
    private String body;
    private Notification.Priority priority;
    private Integer ttl;
    private String title;
    private String sound;
    private String action;
    private Map<String, Object> data;
    private Map<String, Object> apn;
    private Map<String, Object> gcm;
    private Map<String, Object> sms;
    private Map<String, Object> facebookMessenger;
    private Map<String, Object> fcm;
    private List<String> segment;
    private Map<String, Object> alexa;
    private List<String> toBinding;
    private String deliveryCallbackUrl;
    private List<String> identity;
    private List<String> tag;

    public NotificationCreator(final String serviceSid) {
        this.serviceSid = serviceSid;
    }

    public NotificationCreator setBody(final String body){
        this.body = body;
        return this;
    }
    public NotificationCreator setPriority(final Notification.Priority priority){
        this.priority = priority;
        return this;
    }
    public NotificationCreator setTtl(final Integer ttl){
        this.ttl = ttl;
        return this;
    }
    public NotificationCreator setTitle(final String title){
        this.title = title;
        return this;
    }
    public NotificationCreator setSound(final String sound){
        this.sound = sound;
        return this;
    }
    public NotificationCreator setAction(final String action){
        this.action = action;
        return this;
    }
    public NotificationCreator setData(final Map<String, Object> data){
        this.data = data;
        return this;
    }
    public NotificationCreator setApn(final Map<String, Object> apn){
        this.apn = apn;
        return this;
    }
    public NotificationCreator setGcm(final Map<String, Object> gcm){
        this.gcm = gcm;
        return this;
    }
    public NotificationCreator setSms(final Map<String, Object> sms){
        this.sms = sms;
        return this;
    }
    public NotificationCreator setFacebookMessenger(final Map<String, Object> facebookMessenger){
        this.facebookMessenger = facebookMessenger;
        return this;
    }
    public NotificationCreator setFcm(final Map<String, Object> fcm){
        this.fcm = fcm;
        return this;
    }
    public NotificationCreator setSegment(final List<String> segment){
        this.segment = segment;
        return this;
    }
    public NotificationCreator setAlexa(final Map<String, Object> alexa){
        this.alexa = alexa;
        return this;
    }
    public NotificationCreator setToBinding(final List<String> toBinding){
        this.toBinding = toBinding;
        return this;
    }
    public NotificationCreator setDeliveryCallbackUrl(final String deliveryCallbackUrl){
        this.deliveryCallbackUrl = deliveryCallbackUrl;
        return this;
    }
    public NotificationCreator setIdentity(final List<String> identity){
        this.identity = identity;
        return this;
    }
    public NotificationCreator setTag(final List<String> tag){
        this.tag = tag;
        return this;
    }

    @Override
    public Notification create(final TwilioRestClient client){
        String path = "/v1/Services/{ServiceSid}/Notifications";

        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.NOTIFY.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Notification creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Notification.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (body != null) {
            request.addPostParam("Body", body);
    
        }
        if (priority != null) {
            request.addPostParam("Priority", priority.toString());
    
        }
        if (ttl != null) {
            request.addPostParam("Ttl", ttl.toString());
    
        }
        if (title != null) {
            request.addPostParam("Title", title);
    
        }
        if (sound != null) {
            request.addPostParam("Sound", sound);
    
        }
        if (action != null) {
            request.addPostParam("Action", action);
    
        }
        if (data != null) {
            request.addPostParam("Data",  Converter.mapToJson(data));
    
        }
        if (apn != null) {
            request.addPostParam("Apn",  Converter.mapToJson(apn));
    
        }
        if (gcm != null) {
            request.addPostParam("Gcm",  Converter.mapToJson(gcm));
    
        }
        if (sms != null) {
            request.addPostParam("Sms",  Converter.mapToJson(sms));
    
        }
        if (facebookMessenger != null) {
            request.addPostParam("FacebookMessenger",  Converter.mapToJson(facebookMessenger));
    
        }
        if (fcm != null) {
            request.addPostParam("Fcm",  Converter.mapToJson(fcm));
    
        }
        if (segment != null) {
            for (String prop : segment) {
                request.addPostParam("Segment", prop);
            }
    
        }
        if (alexa != null) {
            request.addPostParam("Alexa",  Converter.mapToJson(alexa));
    
        }
        if (toBinding != null) {
            for (String prop : toBinding) {
                request.addPostParam("ToBinding", prop);
            }
    
        }
        if (deliveryCallbackUrl != null) {
            request.addPostParam("DeliveryCallbackUrl", deliveryCallbackUrl);
    
        }
        if (identity != null) {
            for (String prop : identity) {
                request.addPostParam("Identity", prop);
            }
    
        }
        if (tag != null) {
            for (String prop : tag) {
                request.addPostParam("Tag", prop);
            }
    
        }
    }
}
