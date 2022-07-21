/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Events
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.events.v1;

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
    * Twilio - Events
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.31.1
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class SinkCreator extends Creator<Sink>{
    private String description;
    private Map<String, Object> sinkConfiguration;
    private Sink.SinkType sinkType;

    public SinkCreator(final String description, final Map<String, Object> sinkConfiguration, final Sink.SinkType sinkType) {
        this.description = description;
        this.sinkConfiguration = sinkConfiguration;
        this.sinkType = sinkType;
    }

    public SinkCreator setDescription(final String description){
        this.description = description;
        return this;
    }
    public SinkCreator setSinkConfiguration(final Map<String, Object> sinkConfiguration){
        this.sinkConfiguration = sinkConfiguration;
        return this;
    }
    public SinkCreator setSinkType(final Sink.SinkType sinkType){
        this.sinkType = sinkType;
        return this;
    }

    @Override
    public Sink create(final TwilioRestClient client){
        String path = "/v1/Sinks";

        path = path.replace("{"+"Description"+"}", this.description.toString());
        path = path.replace("{"+"SinkConfiguration"+"}", this.sinkConfiguration.toString());
        path = path.replace("{"+"SinkType"+"}", this.sinkType.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.EVENTS.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Sink creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Sink.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (description != null) {
            request.addPostParam("Description", description);
    
        }
        if (sinkConfiguration != null) {
            request.addPostParam("SinkConfiguration",  Converter.mapToJson(sinkConfiguration));
    
        }
        if (sinkType != null) {
            request.addPostParam("SinkType", sinkType.toString());
    
        }
    }
}
