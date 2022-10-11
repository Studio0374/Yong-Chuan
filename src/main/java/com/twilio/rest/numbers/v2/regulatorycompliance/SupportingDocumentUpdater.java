/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Numbers
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.numbers.v2.regulatorycompliance;

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


public class SupportingDocumentUpdater extends Updater<SupportingDocument>{
    private String sid;
    private String friendlyName;
    private Map<String, Object> attributes;

    public SupportingDocumentUpdater(final String sid){
        this.sid = sid;
    }

    public SupportingDocumentUpdater setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public SupportingDocumentUpdater setAttributes(final Map<String, Object> attributes){
        this.attributes = attributes;
        return this;
    }

    @Override
    public SupportingDocument update(final TwilioRestClient client){
        String path = "/v2/RegulatoryCompliance/SupportingDocuments/{Sid}";

        path = path.replace("{"+"Sid"+"}", this.sid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.NUMBERS.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("SupportingDocument update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return SupportingDocument.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (attributes != null) {
            request.addPostParam("Attributes",  Converter.mapToJson(attributes));
    
        }
    }
}
