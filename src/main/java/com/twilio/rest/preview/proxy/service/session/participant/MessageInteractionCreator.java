/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.proxy.service.session.participant;

import com.twilio.annotations.Preview;
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
import java.util.List;

@Preview
public class MessageInteractionCreator extends Creator<MessageInteraction> {
    private final String pathServiceSid;
    private final String pathSessionSid;
    private final String pathParticipantSid;
    private String body;
    private List<URI> mediaUrl;

    /**
     * Construct a new MessageInteractionCreator.
     * 
     * @param pathServiceSid The service_sid
     * @param pathSessionSid The session_sid
     * @param pathParticipantSid The participant_sid
     * @param body The body of the message. Up to 1600 characters long.
     */
    public MessageInteractionCreator(final String pathServiceSid, 
                                     final String pathSessionSid, 
                                     final String pathParticipantSid, 
                                     final String body) {
        this.pathServiceSid = pathServiceSid;
        this.pathSessionSid = pathSessionSid;
        this.pathParticipantSid = pathParticipantSid;
        this.body = body;
    }

    /**
     * Construct a new MessageInteractionCreator.
     * 
     * @param pathServiceSid The service_sid
     * @param pathSessionSid The session_sid
     * @param pathParticipantSid The participant_sid
     * @param mediaUrl The url of an image or video.
     */
    public MessageInteractionCreator(final String pathServiceSid, 
                                     final String pathSessionSid, 
                                     final String pathParticipantSid, 
                                     final List<URI> mediaUrl) {
        this.pathServiceSid = pathServiceSid;
        this.pathSessionSid = pathSessionSid;
        this.pathParticipantSid = pathParticipantSid;
        this.mediaUrl = mediaUrl;
    }

    /**
     * The text body of the message to send to the Participant. Up to 1600
     * characters long..
     * 
     * @param body The body of the message. Up to 1600 characters long.
     * @return this
     */
    public MessageInteractionCreator setBody(final String body) {
        this.body = body;
        return this;
    }

    /**
     * The public url of an image or video to send to the Participant..
     * 
     * @param mediaUrl The url of an image or video.
     * @return this
     */
    public MessageInteractionCreator setMediaUrl(final List<URI> mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * The public url of an image or video to send to the Participant..
     * 
     * @param mediaUrl The url of an image or video.
     * @return this
     */
    public MessageInteractionCreator setMediaUrl(final URI mediaUrl) {
        return setMediaUrl(Promoter.listOfOne(mediaUrl));
    }

    /**
     * The public url of an image or video to send to the Participant..
     * 
     * @param mediaUrl The url of an image or video.
     * @return this
     */
    public MessageInteractionCreator setMediaUrl(final String mediaUrl) {
        return setMediaUrl(Promoter.uriFromString(mediaUrl));
    }

    /**
     * Make the request to the Twilio API to perform the create.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Created MessageInteraction
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public MessageInteraction create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            "/Proxy/Services/" + this.pathServiceSid + "/Sessions/" + this.pathSessionSid + "/Participants/" + this.pathParticipantSid + "/MessageInteractions",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("MessageInteraction creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }

            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }

        return MessageInteraction.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (body != null) {
            request.addPostParam("Body", body);
        }

        if (mediaUrl != null) {
            for (URI prop : mediaUrl) {
                request.addPostParam("MediaUrl", prop.toString());
            }
        }
    }
}