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

package com.twilio.rest.sync.v1.service.synclist;

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
    * Twilio - Sync
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.33.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class SyncListItemCreator extends Creator<SyncListItem>{
    private String serviceSid;
    private String listSid;
    private Map<String, Object> data;
    private Integer ttl;
    private Integer itemTtl;
    private Integer collectionTtl;

    public SyncListItemCreator(final String serviceSid, final String listSid, final Map<String, Object> data) {
        this.serviceSid = serviceSid;
        this.listSid = listSid;
        this.data = data;
    }

    public SyncListItemCreator setData(final Map<String, Object> data){
        this.data = data;
        return this;
    }
    public SyncListItemCreator setTtl(final Integer ttl){
        this.ttl = ttl;
        return this;
    }
    public SyncListItemCreator setItemTtl(final Integer itemTtl){
        this.itemTtl = itemTtl;
        return this;
    }
    public SyncListItemCreator setCollectionTtl(final Integer collectionTtl){
        this.collectionTtl = collectionTtl;
        return this;
    }

    @Override
    public SyncListItem create(final TwilioRestClient client){
        String path = "/v1/Services/{ServiceSid}/Lists/{ListSid}/Items";

        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());
        path = path.replace("{"+"ListSid"+"}", this.listSid.toString());
        path = path.replace("{"+"Data"+"}", this.data.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.SYNC.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("SyncListItem creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return SyncListItem.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (data != null) {
            request.addPostParam("Data",  Converter.mapToJson(data));
    
        }
        if (ttl != null) {
            request.addPostParam("Ttl", ttl.toString());
    
        }
        if (itemTtl != null) {
            request.addPostParam("ItemTtl", itemTtl.toString());
    
        }
        if (collectionTtl != null) {
            request.addPostParam("CollectionTtl", collectionTtl.toString());
    
        }
    }
}
