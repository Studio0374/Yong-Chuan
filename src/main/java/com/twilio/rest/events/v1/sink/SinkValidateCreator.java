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

package com.twilio.rest.events.v1.sink;

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
    * Twilio - Events
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.33.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class SinkValidateCreator extends Creator<SinkValidate>{
    private String sid;
    private String testId;

    public SinkValidateCreator(final String sid, final String testId) {
        this.sid = sid;
        this.testId = testId;
    }

    public SinkValidateCreator setTestId(final String testId){
        this.testId = testId;
        return this;
    }

    @Override
    public SinkValidate create(final TwilioRestClient client){
        String path = "/v1/Sinks/{Sid}/Validate";

        path = path.replace("{"+"Sid"+"}", this.sid.toString());
        path = path.replace("{"+"TestId"+"}", this.testId.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.EVENTS.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("SinkValidate creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return SinkValidate.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (testId != null) {
            request.addPostParam("TestId", testId);
    
        }
    }
}
