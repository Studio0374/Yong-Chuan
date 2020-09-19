/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.video.v1.room;

import com.twilio.base.Page;
import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.time.ZonedDateTime;

public class RoomRecordingReader extends Reader<RoomRecording> {
    private final String pathRoomSid;
    private RoomRecording.Status status;
    private String sourceSid;
    private ZonedDateTime dateCreatedAfter;
    private ZonedDateTime dateCreatedBefore;

    /**
     * Construct a new RoomRecordingReader.
     *
     * @param pathRoomSid The SID of the room with the RoomRecording resources to
     *                    read
     */
    public RoomRecordingReader(final String pathRoomSid) {
        this.pathRoomSid = pathRoomSid;
    }

    /**
     * Read only the recordings with this status. Can be: `processing`, `completed`,
     * or `deleted`..
     *
     * @param status Read only the recordings with this status
     * @return this
     */
    public RoomRecordingReader setStatus(final RoomRecording.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Read only the recordings that have this `source_sid`..
     *
     * @param sourceSid Read only the recordings that have this source_sid
     * @return this
     */
    public RoomRecordingReader setSourceSid(final String sourceSid) {
        this.sourceSid = sourceSid;
        return this;
    }

    /**
     * Read only recordings that started on or after this <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> datetime with time
     * zone..
     *
     * @param dateCreatedAfter Read only Recordings that started on or after this
     *                         ISO 8601 datetime with time zone
     * @return this
     */
    public RoomRecordingReader setDateCreatedAfter(final ZonedDateTime dateCreatedAfter) {
        this.dateCreatedAfter = dateCreatedAfter;
        return this;
    }

    /**
     * Read only Recordings that started before this <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> datetime with time
     * zone..
     *
     * @param dateCreatedBefore Read only Recordings that started before this ISO
     *                          8601 date-time with time zone
     * @return this
     */
    public RoomRecordingReader setDateCreatedBefore(final ZonedDateTime dateCreatedBefore) {
        this.dateCreatedBefore = dateCreatedBefore;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return RoomRecording ResourceSet
     */
    @Override
    public ResourceSet<RoomRecording> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return RoomRecording ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<RoomRecording> firstPage(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.VIDEO.toString(),
            "/v1/Rooms/" + this.pathRoomSid + "/Recordings"
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the target page from the Twilio API.
     *
     * @param targetUrl API-generated URL for the requested results page
     * @param client TwilioRestClient with which to make the request
     * @return RoomRecording ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<RoomRecording> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }

    /**
     * Retrieve the next page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Next Page
     */
    @Override
    public Page<RoomRecording> nextPage(final Page<RoomRecording> page,
                                        final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.VIDEO.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the previous page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Previous Page
     */
    @Override
    public Page<RoomRecording> previousPage(final Page<RoomRecording> page,
                                            final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.VIDEO.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of RoomRecording Resources for a given request.
     *
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<RoomRecording> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("RoomRecording read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
           throw new ApiException(restException);
        }

        return Page.fromJson(
            "recordings",
            response.getContent(),
            RoomRecording.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (status != null) {
            request.addQueryParam("Status", status.toString());
        }

        if (sourceSid != null) {
            request.addQueryParam("SourceSid", sourceSid);
        }

        if (dateCreatedAfter != null) {
            request.addQueryParam("DateCreatedAfter", dateCreatedAfter.toString());
        }

        if (dateCreatedBefore != null) {
            request.addQueryParam("DateCreatedBefore", dateCreatedBefore.toString());
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}