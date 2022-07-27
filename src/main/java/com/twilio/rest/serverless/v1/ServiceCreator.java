/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Serverless
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.serverless.v1;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Serverless
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.32.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class ServiceCreator extends Creator<Service>{
    private String uniqueName;
    private String friendlyName;
    private Boolean includeCredentials;
    private Boolean uiEditable;

    public ServiceCreator(final String uniqueName, final String friendlyName) {
        this.uniqueName = uniqueName;
        this.friendlyName = friendlyName;
    }

    public ServiceCreator setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }
    public ServiceCreator setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public ServiceCreator setIncludeCredentials(final Boolean includeCredentials){
        this.includeCredentials = includeCredentials;
        return this;
    }
    public ServiceCreator setUiEditable(final Boolean uiEditable){
        this.uiEditable = uiEditable;
        return this;
    }

    @Override
    public Service create(final TwilioRestClient client){
        String path = "/v1/Services";

        path = path.replace("{"+"UniqueName"+"}", this.uniqueName.toString());
        path = path.replace("{"+"FriendlyName"+"}", this.friendlyName.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.SERVERLESS.toString(),
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
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
    
        }
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (includeCredentials != null) {
            request.addPostParam("IncludeCredentials", includeCredentials.toString());
    
        }
        if (uiEditable != null) {
            request.addPostParam("UiEditable", uiEditable.toString());
    
        }
    }
}
