/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Video
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.video.v1;

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
import java.util.List;
import java.util.Map;
import com.twilio.converter.Converter;
import java.net.URI;

import java.util.List;
import java.util.Map;



import java.net.URI;

/*
    * Twilio - Video
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.33.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class RoomCreator extends Creator<Room>{
    private Boolean enableTurn;
    private Room.RoomType type;
    private String uniqueName;
    private URI statusCallback;
    private HttpMethod statusCallbackMethod;
    private Integer maxParticipants;
    private Boolean recordParticipantsOnConnect;
    private List<Room.VideoCodec> videoCodecs;
    private String mediaRegion;
    private Map<String, Object> recordingRules;
    private Boolean audioOnly;
    private Integer maxParticipantDuration;
    private Integer emptyRoomTimeout;
    private Integer unusedRoomTimeout;
    private Boolean largeRoom;

    public RoomCreator() {
    }

    public RoomCreator setEnableTurn(final Boolean enableTurn){
        this.enableTurn = enableTurn;
        return this;
    }
    public RoomCreator setType(final Room.RoomType type){
        this.type = type;
        return this;
    }
    public RoomCreator setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }
    public RoomCreator setStatusCallback(final URI statusCallback){
        this.statusCallback = statusCallback;
        return this;
    }

    public RoomCreator setStatusCallback(final String statusCallback){
    this.statusCallback = Promoter.uriFromString(statusCallback);
    return this;
    }
    public RoomCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod){
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }
    public RoomCreator setMaxParticipants(final Integer maxParticipants){
        this.maxParticipants = maxParticipants;
        return this;
    }
    public RoomCreator setRecordParticipantsOnConnect(final Boolean recordParticipantsOnConnect){
        this.recordParticipantsOnConnect = recordParticipantsOnConnect;
        return this;
    }
    public RoomCreator setVideoCodecs(final List<Room.VideoCodec> videoCodecs){
        this.videoCodecs = videoCodecs;
        return this;
    }
    public RoomCreator setMediaRegion(final String mediaRegion){
        this.mediaRegion = mediaRegion;
        return this;
    }
    public RoomCreator setRecordingRules(final Map<String, Object> recordingRules){
        this.recordingRules = recordingRules;
        return this;
    }
    public RoomCreator setAudioOnly(final Boolean audioOnly){
        this.audioOnly = audioOnly;
        return this;
    }
    public RoomCreator setMaxParticipantDuration(final Integer maxParticipantDuration){
        this.maxParticipantDuration = maxParticipantDuration;
        return this;
    }
    public RoomCreator setEmptyRoomTimeout(final Integer emptyRoomTimeout){
        this.emptyRoomTimeout = emptyRoomTimeout;
        return this;
    }
    public RoomCreator setUnusedRoomTimeout(final Integer unusedRoomTimeout){
        this.unusedRoomTimeout = unusedRoomTimeout;
        return this;
    }
    public RoomCreator setLargeRoom(final Boolean largeRoom){
        this.largeRoom = largeRoom;
        return this;
    }

    @Override
    public Room create(final TwilioRestClient client){
        String path = "/v1/Rooms";


        Request request = new Request(
            HttpMethod.POST,
            Domains.VIDEO.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Room creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Room.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (enableTurn != null) {
            request.addPostParam("EnableTurn", enableTurn.toString());
    
        }
        if (type != null) {
            request.addPostParam("Type", type.toString());
    
        }
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
    
        }
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
    
        }
        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
    
        }
        if (maxParticipants != null) {
            request.addPostParam("MaxParticipants", maxParticipants.toString());
    
        }
        if (recordParticipantsOnConnect != null) {
            request.addPostParam("RecordParticipantsOnConnect", recordParticipantsOnConnect.toString());
    
        }
        if (videoCodecs != null) {
            for (Room.VideoCodec prop : videoCodecs) {
                request.addPostParam("VideoCodecs", prop.toString());
            }
    
        }
        if (mediaRegion != null) {
            request.addPostParam("MediaRegion", mediaRegion);
    
        }
        if (recordingRules != null) {
            request.addPostParam("RecordingRules",  Converter.mapToJson(recordingRules));
    
        }
        if (audioOnly != null) {
            request.addPostParam("AudioOnly", audioOnly.toString());
    
        }
        if (maxParticipantDuration != null) {
            request.addPostParam("MaxParticipantDuration", maxParticipantDuration.toString());
    
        }
        if (emptyRoomTimeout != null) {
            request.addPostParam("EmptyRoomTimeout", emptyRoomTimeout.toString());
    
        }
        if (unusedRoomTimeout != null) {
            request.addPostParam("UnusedRoomTimeout", unusedRoomTimeout.toString());
    
        }
        if (largeRoom != null) {
            request.addPostParam("LargeRoom", largeRoom.toString());
    
        }
    }
}
