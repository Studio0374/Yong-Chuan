/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account;

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
import java.util.List;
import java.net.URI;

import java.util.List;



import java.net.URI;

/*
    * Twilio - Api
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.33.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class CallCreator extends Creator<Call>{
    private com.twilio.type.Endpoint to;
    private com.twilio.type.Endpoint from;
    private String accountSid;
    private HttpMethod method;
    private URI fallbackUrl;
    private HttpMethod fallbackMethod;
    private URI statusCallback;
    private List<String> statusCallbackEvent;
    private HttpMethod statusCallbackMethod;
    private String sendDigits;
    private Integer timeout;
    private Boolean record;
    private String recordingChannels;
    private String recordingStatusCallback;
    private HttpMethod recordingStatusCallbackMethod;
    private String sipAuthUsername;
    private String sipAuthPassword;
    private String machineDetection;
    private Integer machineDetectionTimeout;
    private List<String> recordingStatusCallbackEvent;
    private String trim;
    private String callerId;
    private Integer machineDetectionSpeechThreshold;
    private Integer machineDetectionSpeechEndThreshold;
    private Integer machineDetectionSilenceTimeout;
    private String asyncAmd;
    private URI asyncAmdStatusCallback;
    private HttpMethod asyncAmdStatusCallbackMethod;
    private String byoc;
    private String callReason;
    private String callToken;
    private String recordingTrack;
    private Integer timeLimit;
    private URI url;
    private com.twilio.type.Twiml twiml;
    private String applicationSid;

    public CallCreator(final com.twilio.type.Endpoint to, final com.twilio.type.Endpoint from, final URI url) {
        this.to = to;
        this.from = from;
        this.url = url;
    }
    public CallCreator(final String accountSid, final com.twilio.type.Endpoint to, final com.twilio.type.Endpoint from, final URI url) {
        this.accountSid = accountSid;
        this.to = to;
        this.from = from;
        this.url = url;
    }
    public CallCreator(final com.twilio.type.Endpoint to, final com.twilio.type.Endpoint from, final com.twilio.type.Twiml twiml) {
        this.to = to;
        this.from = from;
        this.twiml = twiml;
    }
    public CallCreator(final String accountSid, final com.twilio.type.Endpoint to, final com.twilio.type.Endpoint from, final com.twilio.type.Twiml twiml) {
        this.accountSid = accountSid;
        this.to = to;
        this.from = from;
        this.twiml = twiml;
    }
    public CallCreator(final com.twilio.type.Endpoint to, final com.twilio.type.Endpoint from, final String applicationSid) {
        this.to = to;
        this.from = from;
        this.applicationSid = applicationSid;
    }
    public CallCreator(final String accountSid, final com.twilio.type.Endpoint to, final com.twilio.type.Endpoint from, final String applicationSid) {
        this.accountSid = accountSid;
        this.to = to;
        this.from = from;
        this.applicationSid = applicationSid;
    }

    public CallCreator setTo(final com.twilio.type.Endpoint to){
        this.to = to;
        return this;
    }
    public CallCreator setFrom(final com.twilio.type.Endpoint from){
        this.from = from;
        return this;
    }
    public CallCreator setMethod(final HttpMethod method){
        this.method = method;
        return this;
    }
    public CallCreator setFallbackUrl(final URI fallbackUrl){
        this.fallbackUrl = fallbackUrl;
        return this;
    }

    public CallCreator setFallbackUrl(final String fallbackUrl){
    this.fallbackUrl = Promoter.uriFromString(fallbackUrl);
    return this;
    }
    public CallCreator setFallbackMethod(final HttpMethod fallbackMethod){
        this.fallbackMethod = fallbackMethod;
        return this;
    }
    public CallCreator setStatusCallback(final URI statusCallback){
        this.statusCallback = statusCallback;
        return this;
    }

    public CallCreator setStatusCallback(final String statusCallback){
    this.statusCallback = Promoter.uriFromString(statusCallback);
    return this;
    }
    public CallCreator setStatusCallbackEvent(final List<String> statusCallbackEvent){
        this.statusCallbackEvent = statusCallbackEvent;
        return this;
    }
    public CallCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod){
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }
    public CallCreator setSendDigits(final String sendDigits){
        this.sendDigits = sendDigits;
        return this;
    }
    public CallCreator setTimeout(final Integer timeout){
        this.timeout = timeout;
        return this;
    }
    public CallCreator setRecord(final Boolean record){
        this.record = record;
        return this;
    }
    public CallCreator setRecordingChannels(final String recordingChannels){
        this.recordingChannels = recordingChannels;
        return this;
    }
    public CallCreator setRecordingStatusCallback(final String recordingStatusCallback){
        this.recordingStatusCallback = recordingStatusCallback;
        return this;
    }
    public CallCreator setRecordingStatusCallbackMethod(final HttpMethod recordingStatusCallbackMethod){
        this.recordingStatusCallbackMethod = recordingStatusCallbackMethod;
        return this;
    }
    public CallCreator setSipAuthUsername(final String sipAuthUsername){
        this.sipAuthUsername = sipAuthUsername;
        return this;
    }
    public CallCreator setSipAuthPassword(final String sipAuthPassword){
        this.sipAuthPassword = sipAuthPassword;
        return this;
    }
    public CallCreator setMachineDetection(final String machineDetection){
        this.machineDetection = machineDetection;
        return this;
    }
    public CallCreator setMachineDetectionTimeout(final Integer machineDetectionTimeout){
        this.machineDetectionTimeout = machineDetectionTimeout;
        return this;
    }
    public CallCreator setRecordingStatusCallbackEvent(final List<String> recordingStatusCallbackEvent){
        this.recordingStatusCallbackEvent = recordingStatusCallbackEvent;
        return this;
    }
    public CallCreator setTrim(final String trim){
        this.trim = trim;
        return this;
    }
    public CallCreator setCallerId(final String callerId){
        this.callerId = callerId;
        return this;
    }
    public CallCreator setMachineDetectionSpeechThreshold(final Integer machineDetectionSpeechThreshold){
        this.machineDetectionSpeechThreshold = machineDetectionSpeechThreshold;
        return this;
    }
    public CallCreator setMachineDetectionSpeechEndThreshold(final Integer machineDetectionSpeechEndThreshold){
        this.machineDetectionSpeechEndThreshold = machineDetectionSpeechEndThreshold;
        return this;
    }
    public CallCreator setMachineDetectionSilenceTimeout(final Integer machineDetectionSilenceTimeout){
        this.machineDetectionSilenceTimeout = machineDetectionSilenceTimeout;
        return this;
    }
    public CallCreator setAsyncAmd(final String asyncAmd){
        this.asyncAmd = asyncAmd;
        return this;
    }
    public CallCreator setAsyncAmdStatusCallback(final URI asyncAmdStatusCallback){
        this.asyncAmdStatusCallback = asyncAmdStatusCallback;
        return this;
    }

    public CallCreator setAsyncAmdStatusCallback(final String asyncAmdStatusCallback){
    this.asyncAmdStatusCallback = Promoter.uriFromString(asyncAmdStatusCallback);
    return this;
    }
    public CallCreator setAsyncAmdStatusCallbackMethod(final HttpMethod asyncAmdStatusCallbackMethod){
        this.asyncAmdStatusCallbackMethod = asyncAmdStatusCallbackMethod;
        return this;
    }
    public CallCreator setByoc(final String byoc){
        this.byoc = byoc;
        return this;
    }
    public CallCreator setCallReason(final String callReason){
        this.callReason = callReason;
        return this;
    }
    public CallCreator setCallToken(final String callToken){
        this.callToken = callToken;
        return this;
    }
    public CallCreator setRecordingTrack(final String recordingTrack){
        this.recordingTrack = recordingTrack;
        return this;
    }
    public CallCreator setTimeLimit(final Integer timeLimit){
        this.timeLimit = timeLimit;
        return this;
    }
    public CallCreator setUrl(final URI url){
        this.url = url;
        return this;
    }

    public CallCreator setUrl(final String url){
    this.url = Promoter.uriFromString(url);
    return this;
    }
    public CallCreator setTwiml(final com.twilio.type.Twiml twiml){
        this.twiml = twiml;
        return this;
    }

    public CallCreator setTwiml(final String twiml){
    this.twiml = Promoter.twimlFromString(twiml);
    return this;
    }
    public CallCreator setApplicationSid(final String applicationSid){
        this.applicationSid = applicationSid;
        return this;
    }

    @Override
    public Call create(final TwilioRestClient client){
        String path = "/2010-04-01/Accounts/{AccountSid}/Calls.json";

        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        path = path.replace("{"+"AccountSid"+"}", this.accountSid.toString());
        path = path.replace("{"+"To"+"}", this.to.toString());
        path = path.replace("{"+"From"+"}", this.from.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Call creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Call.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (to != null) {
            request.addPostParam("To", to.toString());
    
        }
        if (from != null) {
            request.addPostParam("From", from.toString());
    
        }
        if (method != null) {
            request.addPostParam("Method", method.toString());
    
        }
        if (fallbackUrl != null) {
            request.addPostParam("FallbackUrl", fallbackUrl.toString());
    
        }
        if (fallbackMethod != null) {
            request.addPostParam("FallbackMethod", fallbackMethod.toString());
    
        }
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
    
        }
        if (statusCallbackEvent != null) {
            for (String prop : statusCallbackEvent) {
                request.addPostParam("StatusCallbackEvent", prop);
            }
    
        }
        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
    
        }
        if (sendDigits != null) {
            request.addPostParam("SendDigits", sendDigits);
    
        }
        if (timeout != null) {
            request.addPostParam("Timeout", timeout.toString());
    
        }
        if (record != null) {
            request.addPostParam("Record", record.toString());
    
        }
        if (recordingChannels != null) {
            request.addPostParam("RecordingChannels", recordingChannels);
    
        }
        if (recordingStatusCallback != null) {
            request.addPostParam("RecordingStatusCallback", recordingStatusCallback);
    
        }
        if (recordingStatusCallbackMethod != null) {
            request.addPostParam("RecordingStatusCallbackMethod", recordingStatusCallbackMethod.toString());
    
        }
        if (sipAuthUsername != null) {
            request.addPostParam("SipAuthUsername", sipAuthUsername);
    
        }
        if (sipAuthPassword != null) {
            request.addPostParam("SipAuthPassword", sipAuthPassword);
    
        }
        if (machineDetection != null) {
            request.addPostParam("MachineDetection", machineDetection);
    
        }
        if (machineDetectionTimeout != null) {
            request.addPostParam("MachineDetectionTimeout", machineDetectionTimeout.toString());
    
        }
        if (recordingStatusCallbackEvent != null) {
            for (String prop : recordingStatusCallbackEvent) {
                request.addPostParam("RecordingStatusCallbackEvent", prop);
            }
    
        }
        if (trim != null) {
            request.addPostParam("Trim", trim);
    
        }
        if (callerId != null) {
            request.addPostParam("CallerId", callerId);
    
        }
        if (machineDetectionSpeechThreshold != null) {
            request.addPostParam("MachineDetectionSpeechThreshold", machineDetectionSpeechThreshold.toString());
    
        }
        if (machineDetectionSpeechEndThreshold != null) {
            request.addPostParam("MachineDetectionSpeechEndThreshold", machineDetectionSpeechEndThreshold.toString());
    
        }
        if (machineDetectionSilenceTimeout != null) {
            request.addPostParam("MachineDetectionSilenceTimeout", machineDetectionSilenceTimeout.toString());
    
        }
        if (asyncAmd != null) {
            request.addPostParam("AsyncAmd", asyncAmd);
    
        }
        if (asyncAmdStatusCallback != null) {
            request.addPostParam("AsyncAmdStatusCallback", asyncAmdStatusCallback.toString());
    
        }
        if (asyncAmdStatusCallbackMethod != null) {
            request.addPostParam("AsyncAmdStatusCallbackMethod", asyncAmdStatusCallbackMethod.toString());
    
        }
        if (byoc != null) {
            request.addPostParam("Byoc", byoc);
    
        }
        if (callReason != null) {
            request.addPostParam("CallReason", callReason);
    
        }
        if (callToken != null) {
            request.addPostParam("CallToken", callToken);
    
        }
        if (recordingTrack != null) {
            request.addPostParam("RecordingTrack", recordingTrack);
    
        }
        if (timeLimit != null) {
            request.addPostParam("TimeLimit", timeLimit.toString());
    
        }
        if (url != null) {
            request.addPostParam("Url", url.toString());
    
        }
        if (twiml != null) {
            request.addPostParam("Twiml", twiml.toString());
    
        }
        if (applicationSid != null) {
            request.addPostParam("ApplicationSid", applicationSid);
    
        }
    }
}
