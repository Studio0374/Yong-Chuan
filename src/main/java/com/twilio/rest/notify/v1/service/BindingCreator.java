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
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.util.List;

import java.util.List;




/*
    * Twilio - Notify
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class BindingCreator extends Creator<Binding>{
    private String serviceSid;
    private String identity;
    private Binding.BindingType bindingType;
    private String address;
    private List<String> tag;
    private String notificationProtocolVersion;
    private String credentialSid;
    private String endpoint;

    public BindingCreator(final String serviceSid, final String identity, final Binding.BindingType bindingType, final String address) {
        this.serviceSid = serviceSid;
        this.identity = identity;
        this.bindingType = bindingType;
        this.address = address;
    }

    public BindingCreator setIdentity(final String identity){
        this.identity = identity;
        return this;
    }
    public BindingCreator setBindingType(final Binding.BindingType bindingType){
        this.bindingType = bindingType;
        return this;
    }
    public BindingCreator setAddress(final String address){
        this.address = address;
        return this;
    }
    public BindingCreator setTag(final List<String> tag){
        this.tag = tag;
        return this;
    }
    public BindingCreator setNotificationProtocolVersion(final String notificationProtocolVersion){
        this.notificationProtocolVersion = notificationProtocolVersion;
        return this;
    }
    public BindingCreator setCredentialSid(final String credentialSid){
        this.credentialSid = credentialSid;
        return this;
    }
    public BindingCreator setEndpoint(final String endpoint){
        this.endpoint = endpoint;
        return this;
    }

    @Override
    public Binding create(final TwilioRestClient client){
        String path = "/v1/Services/{ServiceSid}/Bindings";

        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());
        path = path.replace("{"+"Identity"+"}", this.identity.toString());
        path = path.replace("{"+"BindingType"+"}", this.bindingType.toString());
        path = path.replace("{"+"Address"+"}", this.address.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.NOTIFY.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Binding creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Binding.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (identity != null) {
            request.addPostParam("Identity", identity);
    
        }
        if (bindingType != null) {
            request.addPostParam("BindingType", bindingType.toString());
    
        }
        if (address != null) {
            request.addPostParam("Address", address);
    
        }
        if (tag != null) {
            for (String prop : tag) {
                request.addPostParam("Tag", prop);
            }
    
        }
        if (notificationProtocolVersion != null) {
            request.addPostParam("NotificationProtocolVersion", notificationProtocolVersion);
    
        }
        if (credentialSid != null) {
            request.addPostParam("CredentialSid", credentialSid);
    
        }
        if (endpoint != null) {
            request.addPostParam("Endpoint", endpoint);
    
        }
    }
}
