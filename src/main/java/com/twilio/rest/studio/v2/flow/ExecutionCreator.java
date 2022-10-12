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

package com.twilio.rest.studio.v2.flow;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
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



public class ExecutionCreator extends Creator<Execution>{
    private String flowSid;
    private com.twilio.type.PhoneNumber to;
    private com.twilio.type.PhoneNumber from;
    private Map<String, Object> parameters;

    public ExecutionCreator(final String flowSid, final com.twilio.type.PhoneNumber to, final com.twilio.type.PhoneNumber from) {
        this.flowSid = flowSid;
        this.to = to;
        this.from = from;
    }

    public ExecutionCreator setTo(final com.twilio.type.PhoneNumber to){
        this.to = to;
        return this;
    }

    public ExecutionCreator setTo(final String to){
        return setTo(Promoter.phoneNumberFromString(to));
    }
    public ExecutionCreator setFrom(final com.twilio.type.PhoneNumber from){
        this.from = from;
        return this;
    }

    public ExecutionCreator setFrom(final String from){
        return setFrom(Promoter.phoneNumberFromString(from));
    }
    public ExecutionCreator setParameters(final Map<String, Object> parameters){
        this.parameters = parameters;
        return this;
    }

    @Override
    public Execution create(final TwilioRestClient client){
        String path = "/v2/Flows/{FlowSid}/Executions";

        path = path.replace("{"+"FlowSid"+"}", this.flowSid.toString());
        path = path.replace("{"+"To"+"}", this.to.encode("utf-8"));
        path = path.replace("{"+"From"+"}", this.from.encode("utf-8"));

        Request request = new Request(
            HttpMethod.POST,
            Domains.STUDIO.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Execution creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Execution.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (to != null) {
            request.addPostParam("To", to.toString());
    
        }
        if (from != null) {
            request.addPostParam("From", from.toString());
    
        }
        if (parameters != null) {
            request.addPostParam("Parameters",  Converter.mapToJson(parameters));
    
        }
    }
}
