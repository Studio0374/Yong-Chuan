/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Trusthub
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.trusthub.v1;

import com.twilio.base.Updater;
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




/*
    * Twilio - Trusthub
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.31.1
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class CustomerProfilesUpdater extends Updater<CustomerProfiles>{
    private String sid;
    private CustomerProfiles.Status status;
    private URI statusCallback;
    private String friendlyName;
    private String email;

    public CustomerProfilesUpdater(final String sid){
        this.sid = sid;
    }

    public CustomerProfilesUpdater setStatus(final CustomerProfiles.Status status){
        this.status = status;
        return this;
    }
    public CustomerProfilesUpdater setStatusCallback(final URI statusCallback){
        this.statusCallback = statusCallback;
        return this;
    }

    public CustomerProfilesUpdater setStatusCallback(final String statusCallback){
    this.statusCallback = Promoter.uriFromString(statusCallback);
    return this;
    }
    public CustomerProfilesUpdater setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public CustomerProfilesUpdater setEmail(final String email){
        this.email = email;
        return this;
    }

    @Override
    public CustomerProfiles update(final TwilioRestClient client){
        String path = "/v1/CustomerProfiles/{Sid}";

        path = path.replace("{"+"Sid"+"}", this.sid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.TRUSTHUB.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("CustomerProfiles update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return CustomerProfiles.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (status != null) {
            request.addPostParam("Status", status.toString());
    
        }
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
    
        }
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (email != null) {
            request.addPostParam("Email", email);
    
        }
    }
}
