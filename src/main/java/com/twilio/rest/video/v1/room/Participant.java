/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.video.v1.room;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
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
public class Participant extends Resource {
    private static final long serialVersionUID = 34001242407544L;

    public enum Status {
        CONNECTED("connected"),
        DISCONNECTED("disconnected");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Status from a string.
         * @param value string value
         * @return generated Status
         */
        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    /**
     * Create a ParticipantFetcher to execute fetch.
     *
     * @param pathRoomSid The SID of the room with the Participant resource to fetch
     * @param pathSid The SID that identifies the resource to fetch
     * @return ParticipantFetcher capable of executing the fetch
     */
    public static ParticipantFetcher fetcher(final String pathRoomSid,
                                             final String pathSid) {
        return new ParticipantFetcher(pathRoomSid, pathSid);
    }

    /**
     * Create a ParticipantReader to execute read.
     *
     * @param pathRoomSid The SID of the room with the Participant resources to read
     * @return ParticipantReader capable of executing the read
     */
    public static ParticipantReader reader(final String pathRoomSid) {
        return new ParticipantReader(pathRoomSid);
    }

    /**
     * Create a ParticipantUpdater to execute update.
     *
     * @param pathRoomSid The SID of the room with the participant to update
     * @param pathSid The SID that identifies the resource to update
     * @return ParticipantUpdater capable of executing the update
     */
    public static ParticipantUpdater updater(final String pathRoomSid,
                                             final String pathSid) {
        return new ParticipantUpdater(pathRoomSid, pathSid);
    }

    /**
     * Converts a JSON String into a Participant object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Participant object represented by the provided JSON
     */
    public static Participant fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Participant.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Participant object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Participant object represented by the provided JSON
     */
    public static Participant fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Participant.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String roomSid;
    private final String accountSid;
    private final Participant.Status status;
    private final String identity;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final ZonedDateTime startTime;
    private final ZonedDateTime endTime;
    private final Integer duration;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Participant(@JsonProperty("sid")
                        final String sid,
                        @JsonProperty("room_sid")
                        final String roomSid,
                        @JsonProperty("account_sid")
                        final String accountSid,
                        @JsonProperty("status")
                        final Participant.Status status,
                        @JsonProperty("identity")
                        final String identity,
                        @JsonProperty("date_created")
                        final String dateCreated,
                        @JsonProperty("date_updated")
                        final String dateUpdated,
                        @JsonProperty("start_time")
                        final String startTime,
                        @JsonProperty("end_time")
                        final String endTime,
                        @JsonProperty("duration")
                        final Integer duration,
                        @JsonProperty("url")
                        final URI url,
                        @JsonProperty("links")
                        final Map<String, String> links) {
        this.sid = sid;
        this.roomSid = roomSid;
        this.accountSid = accountSid;
        this.status = status;
        this.identity = identity;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.startTime = DateConverter.iso8601DateTimeFromString(startTime);
        this.endTime = DateConverter.iso8601DateTimeFromString(endTime);
        this.duration = duration;
        this.url = url;
        this.links = links;
    }

    /**
     * Returns The unique string that identifies the resource.
     *
     * @return The unique string that identifies the resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The SID of the participant's room.
     *
     * @return The SID of the participant's room
     */
    public final String getRoomSid() {
        return this.roomSid;
    }

    /**
     * Returns The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The status of the Participant.
     *
     * @return The status of the Participant
     */
    public final Participant.Status getStatus() {
        return this.status;
    }

    /**
     * Returns The string that identifies the resource's User.
     *
     * @return The string that identifies the resource's User
     */
    public final String getIdentity() {
        return this.identity;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was created.
     *
     * @return The ISO 8601 date and time in GMT when the resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was last updated.
     *
     * @return The ISO 8601 date and time in GMT when the resource was last updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The time of participant connected to the room in ISO 8601 format.
     *
     * @return The time of participant connected to the room in ISO 8601 format
     */
    public final ZonedDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Returns The time when the participant disconnected from the room in ISO 8601
     * format.
     *
     * @return The time when the participant disconnected from the room in ISO 8601
     *         format
     */
    public final ZonedDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Returns Duration of time in seconds the participant was connected.
     *
     * @return Duration of time in seconds the participant was connected
     */
    public final Integer getDuration() {
        return this.duration;
    }

    /**
     * Returns The absolute URL of the resource.
     *
     * @return The absolute URL of the resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The URLs of related resources.
     *
     * @return The URLs of related resources
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Participant other = (Participant) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(roomSid, other.roomSid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(status, other.status) &&
               Objects.equals(identity, other.identity) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(startTime, other.startTime) &&
               Objects.equals(endTime, other.endTime) &&
               Objects.equals(duration, other.duration) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            roomSid,
                            accountSid,
                            status,
                            identity,
                            dateCreated,
                            dateUpdated,
                            startTime,
                            endTime,
                            duration,
                            url,
                            links);
    }
}