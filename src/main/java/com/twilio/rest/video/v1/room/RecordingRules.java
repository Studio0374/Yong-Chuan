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
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import com.twilio.type.RecordingRule;
import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class RecordingRules extends Resource {
    private static final long serialVersionUID = 132882728526196L;

    /**
     * Create a RecordingRulesFetcher to execute fetch.
     *
     * @param pathRoomSid The SID of the Room resource where the recording rules to
     *                    fetch apply
     * @return RecordingRulesFetcher capable of executing the fetch
     */
    public static RecordingRulesFetcher fetcher(final String pathRoomSid) {
        return new RecordingRulesFetcher(pathRoomSid);
    }

    /**
     * Create a RecordingRulesUpdater to execute update.
     *
     * @param pathRoomSid The SID of the Room resource where the recording rules to
     *                    update apply
     * @return RecordingRulesUpdater capable of executing the update
     */
    public static RecordingRulesUpdater updater(final String pathRoomSid) {
        return new RecordingRulesUpdater(pathRoomSid);
    }

    /**
     * Converts a JSON String into a RecordingRules object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return RecordingRules object represented by the provided JSON
     */
    public static RecordingRules fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, RecordingRules.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a RecordingRules object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return RecordingRules object represented by the provided JSON
     */
    public static RecordingRules fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, RecordingRules.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String roomSid;
    private final List<RecordingRule> rules;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;

    @JsonCreator
    private RecordingRules(@JsonProperty("room_sid")
                           final String roomSid,
                           @JsonProperty("rules")
                           final List<RecordingRule> rules,
                           @JsonProperty("date_created")
                           final String dateCreated,
                           @JsonProperty("date_updated")
                           final String dateUpdated) {
        this.roomSid = roomSid;
        this.rules = rules;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
    }

    /**
     * Returns The SID of the Room resource for the Recording Rules.
     *
     * @return The SID of the Room resource for the Recording Rules
     */
    public final String getRoomSid() {
        return this.roomSid;
    }

    /**
     * Returns A collection of recording Rules that describe how to include or
     * exclude matching tracks for recording.
     *
     * @return A collection of recording Rules that describe how to include or
     *         exclude matching tracks for recording
     */
    public final List<RecordingRule> getRules() {
        return this.rules;
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        RecordingRules other = (RecordingRules) o;

        return Objects.equals(roomSid, other.roomSid) &&
               Objects.equals(rules, other.rules) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomSid,
                            rules,
                            dateCreated,
                            dateUpdated);
    }
}