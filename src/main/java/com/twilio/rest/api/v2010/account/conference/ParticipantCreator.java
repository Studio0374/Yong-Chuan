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

package com.twilio.rest.api.v2010.account.conference;

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


public class ParticipantCreator extends Creator<Participant>{
    private String conferenceSid;
    private com.twilio.type.Endpoint from;
    private com.twilio.type.Endpoint to;
    private String accountSid;
    private URI statusCallback;
    private HttpMethod statusCallbackMethod;
    private List<String> statusCallbackEvent;
    private String label;
    private Integer timeout;
    private Boolean record;
    private Boolean muted;
    private String beep;
    private Boolean startConferenceOnEnter;
    private Boolean endConferenceOnExit;
    private URI waitUrl;
    private HttpMethod waitMethod;
    private Boolean earlyMedia;
    private Integer maxParticipants;
    private String conferenceRecord;
    private String conferenceTrim;
    private URI conferenceStatusCallback;
    private HttpMethod conferenceStatusCallbackMethod;
    private List<String> conferenceStatusCallbackEvent;
    private String recordingChannels;
    private URI recordingStatusCallback;
    private HttpMethod recordingStatusCallbackMethod;
    private String sipAuthUsername;
    private String sipAuthPassword;
    private String region;
    private URI conferenceRecordingStatusCallback;
    private HttpMethod conferenceRecordingStatusCallbackMethod;
    private List<String> recordingStatusCallbackEvent;
    private List<String> conferenceRecordingStatusCallbackEvent;
    private Boolean coaching;
    private String callSidToCoach;
    private String jitterBufferSize;
    private String byoc;
    private String callerId;
    private String callReason;
    private String recordingTrack;
    private Integer timeLimit;

    public ParticipantCreator(final String conferenceSid, final com.twilio.type.Endpoint from, final com.twilio.type.Endpoint to) {
        this.conferenceSid = conferenceSid;
        this.from = from;
        this.to = to;
    }
    public ParticipantCreator(final String accountSid, final String conferenceSid, final com.twilio.type.Endpoint from, final com.twilio.type.Endpoint to) {
        this.accountSid = accountSid;
        this.conferenceSid = conferenceSid;
        this.from = from;
        this.to = to;
    }

    public ParticipantCreator setFrom(final com.twilio.type.Endpoint from){
        this.from = from;
        return this;
    }
    public ParticipantCreator setTo(final com.twilio.type.Endpoint to){
        this.to = to;
        return this;
    }
    public ParticipantCreator setStatusCallback(final URI statusCallback){
        this.statusCallback = statusCallback;
        return this;
    }

    public ParticipantCreator setStatusCallback(final String statusCallback){
    this.statusCallback = Promoter.uriFromString(statusCallback);
    return this;
    }
    public ParticipantCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod){
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }
    public ParticipantCreator setStatusCallbackEvent(final List<String> statusCallbackEvent){
        this.statusCallbackEvent = statusCallbackEvent;
        return this;
    }
    public ParticipantCreator setLabel(final String label){
        this.label = label;
        return this;
    }
    public ParticipantCreator setTimeout(final Integer timeout){
        this.timeout = timeout;
        return this;
    }
    public ParticipantCreator setRecord(final Boolean record){
        this.record = record;
        return this;
    }
    public ParticipantCreator setMuted(final Boolean muted){
        this.muted = muted;
        return this;
    }
    public ParticipantCreator setBeep(final String beep){
        this.beep = beep;
        return this;
    }
    public ParticipantCreator setStartConferenceOnEnter(final Boolean startConferenceOnEnter){
        this.startConferenceOnEnter = startConferenceOnEnter;
        return this;
    }
    public ParticipantCreator setEndConferenceOnExit(final Boolean endConferenceOnExit){
        this.endConferenceOnExit = endConferenceOnExit;
        return this;
    }
    public ParticipantCreator setWaitUrl(final URI waitUrl){
        this.waitUrl = waitUrl;
        return this;
    }

    public ParticipantCreator setWaitUrl(final String waitUrl){
    this.waitUrl = Promoter.uriFromString(waitUrl);
    return this;
    }
    public ParticipantCreator setWaitMethod(final HttpMethod waitMethod){
        this.waitMethod = waitMethod;
        return this;
    }
    public ParticipantCreator setEarlyMedia(final Boolean earlyMedia){
        this.earlyMedia = earlyMedia;
        return this;
    }
    public ParticipantCreator setMaxParticipants(final Integer maxParticipants){
        this.maxParticipants = maxParticipants;
        return this;
    }
    public ParticipantCreator setConferenceRecord(final String conferenceRecord){
        this.conferenceRecord = conferenceRecord;
        return this;
    }
    public ParticipantCreator setConferenceTrim(final String conferenceTrim){
        this.conferenceTrim = conferenceTrim;
        return this;
    }
    public ParticipantCreator setConferenceStatusCallback(final URI conferenceStatusCallback){
        this.conferenceStatusCallback = conferenceStatusCallback;
        return this;
    }

    public ParticipantCreator setConferenceStatusCallback(final String conferenceStatusCallback){
    this.conferenceStatusCallback = Promoter.uriFromString(conferenceStatusCallback);
    return this;
    }
    public ParticipantCreator setConferenceStatusCallbackMethod(final HttpMethod conferenceStatusCallbackMethod){
        this.conferenceStatusCallbackMethod = conferenceStatusCallbackMethod;
        return this;
    }
    public ParticipantCreator setConferenceStatusCallbackEvent(final List<String> conferenceStatusCallbackEvent){
        this.conferenceStatusCallbackEvent = conferenceStatusCallbackEvent;
        return this;
    }
    public ParticipantCreator setRecordingChannels(final String recordingChannels){
        this.recordingChannels = recordingChannels;
        return this;
    }
    public ParticipantCreator setRecordingStatusCallback(final URI recordingStatusCallback){
        this.recordingStatusCallback = recordingStatusCallback;
        return this;
    }

    public ParticipantCreator setRecordingStatusCallback(final String recordingStatusCallback){
    this.recordingStatusCallback = Promoter.uriFromString(recordingStatusCallback);
    return this;
    }
    public ParticipantCreator setRecordingStatusCallbackMethod(final HttpMethod recordingStatusCallbackMethod){
        this.recordingStatusCallbackMethod = recordingStatusCallbackMethod;
        return this;
    }
    public ParticipantCreator setSipAuthUsername(final String sipAuthUsername){
        this.sipAuthUsername = sipAuthUsername;
        return this;
    }
    public ParticipantCreator setSipAuthPassword(final String sipAuthPassword){
        this.sipAuthPassword = sipAuthPassword;
        return this;
    }
    public ParticipantCreator setRegion(final String region){
        this.region = region;
        return this;
    }
    public ParticipantCreator setConferenceRecordingStatusCallback(final URI conferenceRecordingStatusCallback){
        this.conferenceRecordingStatusCallback = conferenceRecordingStatusCallback;
        return this;
    }

    public ParticipantCreator setConferenceRecordingStatusCallback(final String conferenceRecordingStatusCallback){
    this.conferenceRecordingStatusCallback = Promoter.uriFromString(conferenceRecordingStatusCallback);
    return this;
    }
    public ParticipantCreator setConferenceRecordingStatusCallbackMethod(final HttpMethod conferenceRecordingStatusCallbackMethod){
        this.conferenceRecordingStatusCallbackMethod = conferenceRecordingStatusCallbackMethod;
        return this;
    }
    public ParticipantCreator setRecordingStatusCallbackEvent(final List<String> recordingStatusCallbackEvent){
        this.recordingStatusCallbackEvent = recordingStatusCallbackEvent;
        return this;
    }
    public ParticipantCreator setConferenceRecordingStatusCallbackEvent(final List<String> conferenceRecordingStatusCallbackEvent){
        this.conferenceRecordingStatusCallbackEvent = conferenceRecordingStatusCallbackEvent;
        return this;
    }
    public ParticipantCreator setCoaching(final Boolean coaching){
        this.coaching = coaching;
        return this;
    }
    public ParticipantCreator setCallSidToCoach(final String callSidToCoach){
        this.callSidToCoach = callSidToCoach;
        return this;
    }
    public ParticipantCreator setJitterBufferSize(final String jitterBufferSize){
        this.jitterBufferSize = jitterBufferSize;
        return this;
    }
    public ParticipantCreator setByoc(final String byoc){
        this.byoc = byoc;
        return this;
    }
    public ParticipantCreator setCallerId(final String callerId){
        this.callerId = callerId;
        return this;
    }
    public ParticipantCreator setCallReason(final String callReason){
        this.callReason = callReason;
        return this;
    }
    public ParticipantCreator setRecordingTrack(final String recordingTrack){
        this.recordingTrack = recordingTrack;
        return this;
    }
    public ParticipantCreator setTimeLimit(final Integer timeLimit){
        this.timeLimit = timeLimit;
        return this;
    }

    @Override
    public Participant create(final TwilioRestClient client){
        String path = "/2010-04-01/Accounts/{AccountSid}/Conferences/{ConferenceSid}/Participants.json";

        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        path = path.replace("{"+"AccountSid"+"}", this.accountSid.toString());
        path = path.replace("{"+"ConferenceSid"+"}", this.conferenceSid.toString());
        path = path.replace("{"+"From"+"}", this.from.toString());
        path = path.replace("{"+"To"+"}", this.to.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Participant creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Participant.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (from != null) {
            request.addPostParam("From", from.toString());
    
        }
        if (to != null) {
            request.addPostParam("To", to.toString());
    
        }
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
    
        }
        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
    
        }
        if (statusCallbackEvent != null) {
            for (String prop : statusCallbackEvent) {
                request.addPostParam("StatusCallbackEvent", prop);
            }
    
        }
        if (label != null) {
            request.addPostParam("Label", label);
    
        }
        if (timeout != null) {
            request.addPostParam("Timeout", timeout.toString());
    
        }
        if (record != null) {
            request.addPostParam("Record", record.toString());
    
        }
        if (muted != null) {
            request.addPostParam("Muted", muted.toString());
    
        }
        if (beep != null) {
            request.addPostParam("Beep", beep);
    
        }
        if (startConferenceOnEnter != null) {
            request.addPostParam("StartConferenceOnEnter", startConferenceOnEnter.toString());
    
        }
        if (endConferenceOnExit != null) {
            request.addPostParam("EndConferenceOnExit", endConferenceOnExit.toString());
    
        }
        if (waitUrl != null) {
            request.addPostParam("WaitUrl", waitUrl.toString());
    
        }
        if (waitMethod != null) {
            request.addPostParam("WaitMethod", waitMethod.toString());
    
        }
        if (earlyMedia != null) {
            request.addPostParam("EarlyMedia", earlyMedia.toString());
    
        }
        if (maxParticipants != null) {
            request.addPostParam("MaxParticipants", maxParticipants.toString());
    
        }
        if (conferenceRecord != null) {
            request.addPostParam("ConferenceRecord", conferenceRecord);
    
        }
        if (conferenceTrim != null) {
            request.addPostParam("ConferenceTrim", conferenceTrim);
    
        }
        if (conferenceStatusCallback != null) {
            request.addPostParam("ConferenceStatusCallback", conferenceStatusCallback.toString());
    
        }
        if (conferenceStatusCallbackMethod != null) {
            request.addPostParam("ConferenceStatusCallbackMethod", conferenceStatusCallbackMethod.toString());
    
        }
        if (conferenceStatusCallbackEvent != null) {
            for (String prop : conferenceStatusCallbackEvent) {
                request.addPostParam("ConferenceStatusCallbackEvent", prop);
            }
    
        }
        if (recordingChannels != null) {
            request.addPostParam("RecordingChannels", recordingChannels);
    
        }
        if (recordingStatusCallback != null) {
            request.addPostParam("RecordingStatusCallback", recordingStatusCallback.toString());
    
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
        if (region != null) {
            request.addPostParam("Region", region);
    
        }
        if (conferenceRecordingStatusCallback != null) {
            request.addPostParam("ConferenceRecordingStatusCallback", conferenceRecordingStatusCallback.toString());
    
        }
        if (conferenceRecordingStatusCallbackMethod != null) {
            request.addPostParam("ConferenceRecordingStatusCallbackMethod", conferenceRecordingStatusCallbackMethod.toString());
    
        }
        if (recordingStatusCallbackEvent != null) {
            for (String prop : recordingStatusCallbackEvent) {
                request.addPostParam("RecordingStatusCallbackEvent", prop);
            }
    
        }
        if (conferenceRecordingStatusCallbackEvent != null) {
            for (String prop : conferenceRecordingStatusCallbackEvent) {
                request.addPostParam("ConferenceRecordingStatusCallbackEvent", prop);
            }
    
        }
        if (coaching != null) {
            request.addPostParam("Coaching", coaching.toString());
    
        }
        if (callSidToCoach != null) {
            request.addPostParam("CallSidToCoach", callSidToCoach);
    
        }
        if (jitterBufferSize != null) {
            request.addPostParam("JitterBufferSize", jitterBufferSize);
    
        }
        if (byoc != null) {
            request.addPostParam("Byoc", byoc);
    
        }
        if (callerId != null) {
            request.addPostParam("CallerId", callerId);
    
        }
        if (callReason != null) {
            request.addPostParam("CallReason", callReason);
    
        }
        if (recordingTrack != null) {
            request.addPostParam("RecordingTrack", recordingTrack);
    
        }
        if (timeLimit != null) {
            request.addPostParam("TimeLimit", timeLimit.toString());
    
        }
    }
}
