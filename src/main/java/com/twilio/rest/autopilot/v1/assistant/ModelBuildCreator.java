/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Autopilot
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.autopilot.v1.assistant;

import com.twilio.base.Creator;
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



import java.net.URI;

public class ModelBuildCreator extends Creator<ModelBuild>{
    private String assistantSid;
    private URI statusCallback;
    private String uniqueName;

    public ModelBuildCreator(final String assistantSid) {
        this.assistantSid = assistantSid;
    }

    public ModelBuildCreator setStatusCallback(final URI statusCallback){
        this.statusCallback = statusCallback;
        return this;
    }

    public ModelBuildCreator setStatusCallback(final String statusCallback){
        return setStatusCallback(Promoter.uriFromString(statusCallback));
    }
    public ModelBuildCreator setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }

    @Override
    public ModelBuild create(final TwilioRestClient client){
        String path = "/v1/Assistants/{AssistantSid}/ModelBuilds";

        path = path.replace("{"+"AssistantSid"+"}", this.assistantSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.AUTOPILOT.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("ModelBuild creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return ModelBuild.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
    
        }
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
    
        }
    }
}
