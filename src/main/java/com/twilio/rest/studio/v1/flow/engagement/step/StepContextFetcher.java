/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Studio
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.studio.v1.flow.engagement.step;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Studio
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class StepContextFetcher extends Fetcher<StepContext> {
    private String flowSid;
    private String engagementSid;
    private String stepSid;

    public StepContextFetcher(final String flowSid, final String engagementSid, final String stepSid){
        this.flowSid = flowSid;
        this.engagementSid = engagementSid;
        this.stepSid = stepSid;
    }


    @Override
    public StepContext fetch(final TwilioRestClient client) {
        String path = "/v1/Flows/{FlowSid}/Engagements/{EngagementSid}/Steps/{StepSid}/Context";

        path = path.replace("{"+"FlowSid"+"}", this.flowSid.toString());
        path = path.replace("{"+"EngagementSid"+"}", this.engagementSid.toString());
        path = path.replace("{"+"StepSid"+"}", this.stepSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.STUDIO.toString(),
            path
        );
        Response response = client.request(request);

        if (response == null) {
        throw new ApiConnectionException("StepContext fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return StepContext.fromJson(response.getStream(), client.getObjectMapper());
    }
}

