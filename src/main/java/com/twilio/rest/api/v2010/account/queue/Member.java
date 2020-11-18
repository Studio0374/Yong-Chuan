/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.queue;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Member extends Resource {
    private static final long serialVersionUID = 8025703048462L;

    /**
     * Create a MemberFetcher to execute fetch.
     *
     * @param pathAccountSid The SID of the Account that created the resource(s) to
     *                       fetch
     * @param pathQueueSid The SID of the Queue in which to find the members
     * @param pathCallSid The Call SID of the resource(s) to fetch
     * @return MemberFetcher capable of executing the fetch
     */
    public static MemberFetcher fetcher(final String pathAccountSid,
                                        final String pathQueueSid,
                                        final String pathCallSid) {
        return new MemberFetcher(pathAccountSid, pathQueueSid, pathCallSid);
    }

    /**
     * Create a MemberFetcher to execute fetch.
     *
     * @param pathQueueSid The SID of the Queue in which to find the members
     * @param pathCallSid The Call SID of the resource(s) to fetch
     * @return MemberFetcher capable of executing the fetch
     */
    public static MemberFetcher fetcher(final String pathQueueSid,
                                        final String pathCallSid) {
        return new MemberFetcher(pathQueueSid, pathCallSid);
    }

    /**
     * Create a MemberUpdater to execute update.
     *
     * @param pathAccountSid The SID of the Account that created the resource(s) to
     *                       update
     * @param pathQueueSid The SID of the Queue in which to find the members
     * @param pathCallSid The Call SID of the resource(s) to update
     * @param url The absolute URL of the Queue resource
     * @return MemberUpdater capable of executing the update
     */
    public static MemberUpdater updater(final String pathAccountSid,
                                        final String pathQueueSid,
                                        final String pathCallSid,
                                        final URI url) {
        return new MemberUpdater(pathAccountSid, pathQueueSid, pathCallSid, url);
    }

    /**
     * Create a MemberUpdater to execute update.
     *
     * @param pathQueueSid The SID of the Queue in which to find the members
     * @param pathCallSid The Call SID of the resource(s) to update
     * @param url The absolute URL of the Queue resource
     * @return MemberUpdater capable of executing the update
     */
    public static MemberUpdater updater(final String pathQueueSid,
                                        final String pathCallSid,
                                        final URI url) {
        return new MemberUpdater(pathQueueSid, pathCallSid, url);
    }

    /**
     * Create a MemberReader to execute read.
     *
     * @param pathAccountSid The SID of the Account that created the resource(s) to
     *                       read
     * @param pathQueueSid The SID of the Queue in which to find the members
     * @return MemberReader capable of executing the read
     */
    public static MemberReader reader(final String pathAccountSid,
                                      final String pathQueueSid) {
        return new MemberReader(pathAccountSid, pathQueueSid);
    }

    /**
     * Create a MemberReader to execute read.
     *
     * @param pathQueueSid The SID of the Queue in which to find the members
     * @return MemberReader capable of executing the read
     */
    public static MemberReader reader(final String pathQueueSid) {
        return new MemberReader(pathQueueSid);
    }

    /**
     * Converts a JSON String into a Member object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Member object represented by the provided JSON
     */
    public static Member fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Member.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Member object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Member object represented by the provided JSON
     */
    public static Member fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Member.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String callSid;
    private final ZonedDateTime dateEnqueued;
    private final Integer position;
    private final String uri;
    private final Integer waitTime;
    private final String queueSid;

    @JsonCreator
    private Member(@JsonProperty("call_sid")
                   final String callSid,
                   @JsonProperty("date_enqueued")
                   final String dateEnqueued,
                   @JsonProperty("position")
                   final Integer position,
                   @JsonProperty("uri")
                   final String uri,
                   @JsonProperty("wait_time")
                   final Integer waitTime,
                   @JsonProperty("queue_sid")
                   final String queueSid) {
        this.callSid = callSid;
        this.dateEnqueued = DateConverter.rfc2822DateTimeFromString(dateEnqueued);
        this.position = position;
        this.uri = uri;
        this.waitTime = waitTime;
        this.queueSid = queueSid;
    }

    /**
     * Returns The SID of the Call the resource is associated with.
     *
     * @return The SID of the Call the resource is associated with
     */
    public final String getCallSid() {
        return this.callSid;
    }

    /**
     * Returns The date the member was enqueued.
     *
     * @return The date the member was enqueued
     */
    public final ZonedDateTime getDateEnqueued() {
        return this.dateEnqueued;
    }

    /**
     * Returns This member's current position in the queue..
     *
     * @return This member's current position in the queue.
     */
    public final Integer getPosition() {
        return this.position;
    }

    /**
     * Returns The URI of the resource, relative to `https://api.twilio.com`.
     *
     * @return The URI of the resource, relative to `https://api.twilio.com`
     */
    public final String getUri() {
        return this.uri;
    }

    /**
     * Returns The number of seconds the member has been in the queue..
     *
     * @return The number of seconds the member has been in the queue.
     */
    public final Integer getWaitTime() {
        return this.waitTime;
    }

    /**
     * Returns The SID of the Queue the member is in.
     *
     * @return The SID of the Queue the member is in
     */
    public final String getQueueSid() {
        return this.queueSid;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Member other = (Member) o;

        return Objects.equals(callSid, other.callSid) &&
               Objects.equals(dateEnqueued, other.dateEnqueued) &&
               Objects.equals(position, other.position) &&
               Objects.equals(uri, other.uri) &&
               Objects.equals(waitTime, other.waitTime) &&
               Objects.equals(queueSid, other.queueSid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callSid,
                            dateEnqueued,
                            position,
                            uri,
                            waitTime,
                            queueSid);
    }
}