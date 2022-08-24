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

package com.twilio.rest.preview.sync.service.syncmap;

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
    * Twilio - Preview
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class SyncMapItemCreator extends Creator<SyncMapItem>{
    private String serviceSid;
    private String mapSid;
    private String key;
    private Map<String, Object> data;

    public SyncMapItemCreator(final String serviceSid, final String mapSid, final String key, final Map<String, Object> data) {
        this.serviceSid = serviceSid;
        this.mapSid = mapSid;
        this.key = key;
        this.data = data;
    }

    public SyncMapItemCreator setKey(final String key){
        this.key = key;
        return this;
    }
    public SyncMapItemCreator setData(final Map<String, Object> data){
        this.data = data;
        return this;
    }

    @Override
    public SyncMapItem create(final TwilioRestClient client){
        String path = "/Sync/Services/{ServiceSid}/Maps/{MapSid}/Items";

        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());
        path = path.replace("{"+"MapSid"+"}", this.mapSid.toString());
        path = path.replace("{"+"Key"+"}", this.key.toString());
        path = path.replace("{"+"Data"+"}", this.data.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("SyncMapItem creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return SyncMapItem.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (key != null) {
            request.addPostParam("Key", key);
    
        }
        if (data != null) {
            request.addPostParam("Data",  Converter.mapToJson(data));
    
        }
    }
}
