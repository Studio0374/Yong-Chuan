/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.video.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Composition extends Resource {
    private static final long serialVersionUID = 61658716109908L;

    public enum Status {
        ENQUEUED("enqueued"),
        PROCESSING("processing"),
        COMPLETED("completed"),
        DELETED("deleted"),
        FAILED("failed");

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

    public enum Format {
        MP4("mp4"),
        WEBM("webm");

        private final String value;

        private Format(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Format from a string.
         * @param value string value
         * @return generated Format
         */
        @JsonCreator
        public static Format forValue(final String value) {
            return Promoter.enumFromString(value, Format.values());
        }
    }

    /**
     * Create a CompositionFetcher to execute fetch.
     *
     * @param pathSid The SID that identifies the resource to fetch
     * @return CompositionFetcher capable of executing the fetch
     */
    public static CompositionFetcher fetcher(final String pathSid) {
        return new CompositionFetcher(pathSid);
    }

    /**
     * Create a CompositionReader to execute read.
     *
     * @return CompositionReader capable of executing the read
     */
    public static CompositionReader reader() {
        return new CompositionReader();
    }

    /**
     * Create a CompositionDeleter to execute delete.
     *
     * @param pathSid The SID that identifies the resource to delete
     * @return CompositionDeleter capable of executing the delete
     */
    public static CompositionDeleter deleter(final String pathSid) {
        return new CompositionDeleter(pathSid);
    }

    /**
     * Create a CompositionCreator to execute create.
     *
     * @param roomSid The SID of the Group Room with the media tracks to be used as
     *                composition sources
     * @return CompositionCreator capable of executing the create
     */
    public static CompositionCreator creator(final String roomSid) {
        return new CompositionCreator(roomSid);
    }

    /**
     * Converts a JSON String into a Composition object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Composition object represented by the provided JSON
     */
    public static Composition fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Composition.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Composition object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Composition object represented by the provided JSON
     */
    public static Composition fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Composition.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final Composition.Status status;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateCompleted;
    private final ZonedDateTime dateDeleted;
    private final String sid;
    private final String roomSid;
    private final List<String> audioSources;
    private final List<String> audioSourcesExcluded;
    private final Map<String, Object> videoLayout;
    private final String resolution;
    private final Boolean trim;
    private final Composition.Format format;
    private final Integer bitrate;
    private final Long size;
    private final Integer duration;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Composition(@JsonProperty("account_sid")
                        final String accountSid,
                        @JsonProperty("status")
                        final Composition.Status status,
                        @JsonProperty("date_created")
                        final String dateCreated,
                        @JsonProperty("date_completed")
                        final String dateCompleted,
                        @JsonProperty("date_deleted")
                        final String dateDeleted,
                        @JsonProperty("sid")
                        final String sid,
                        @JsonProperty("room_sid")
                        final String roomSid,
                        @JsonProperty("audio_sources")
                        final List<String> audioSources,
                        @JsonProperty("audio_sources_excluded")
                        final List<String> audioSourcesExcluded,
                        @JsonProperty("video_layout")
                        final Map<String, Object> videoLayout,
                        @JsonProperty("resolution")
                        final String resolution,
                        @JsonProperty("trim")
                        final Boolean trim,
                        @JsonProperty("format")
                        final Composition.Format format,
                        @JsonProperty("bitrate")
                        final Integer bitrate,
                        @JsonProperty("size")
                        final Long size,
                        @JsonProperty("duration")
                        final Integer duration,
                        @JsonProperty("url")
                        final URI url,
                        @JsonProperty("links")
                        final Map<String, String> links) {
        this.accountSid = accountSid;
        this.status = status;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateCompleted = DateConverter.iso8601DateTimeFromString(dateCompleted);
        this.dateDeleted = DateConverter.iso8601DateTimeFromString(dateDeleted);
        this.sid = sid;
        this.roomSid = roomSid;
        this.audioSources = audioSources;
        this.audioSourcesExcluded = audioSourcesExcluded;
        this.videoLayout = videoLayout;
        this.resolution = resolution;
        this.trim = trim;
        this.format = format;
        this.bitrate = bitrate;
        this.size = size;
        this.duration = duration;
        this.url = url;
        this.links = links;
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
     * Returns The status of the composition.
     *
     * @return The status of the composition
     */
    public final Composition.Status getStatus() {
        return this.status;
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
     * Returns Date when the media processing task finished.
     *
     * @return Date when the media processing task finished
     */
    public final ZonedDateTime getDateCompleted() {
        return this.dateCompleted;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the composition generated
     * media was deleted.
     *
     * @return The ISO 8601 date and time in GMT when the composition generated
     *         media was deleted
     */
    public final ZonedDateTime getDateDeleted() {
        return this.dateDeleted;
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
     * Returns The SID of the Group Room that generated the audio and video tracks
     * used in the composition.
     *
     * @return The SID of the Group Room that generated the audio and video tracks
     *         used in the composition
     */
    public final String getRoomSid() {
        return this.roomSid;
    }

    /**
     * Returns The array of track names to include in the composition.
     *
     * @return The array of track names to include in the composition
     */
    public final List<String> getAudioSources() {
        return this.audioSources;
    }

    /**
     * Returns The array of track names to exclude from the composition.
     *
     * @return The array of track names to exclude from the composition
     */
    public final List<String> getAudioSourcesExcluded() {
        return this.audioSourcesExcluded;
    }

    /**
     * Returns An object that describes the video layout of the composition.
     *
     * @return An object that describes the video layout of the composition
     */
    public final Map<String, Object> getVideoLayout() {
        return this.videoLayout;
    }

    /**
     * Returns The dimensions of the video image in pixels expressed as columns
     * (width) and rows (height).
     *
     * @return The dimensions of the video image in pixels expressed as columns
     *         (width) and rows (height)
     */
    public final String getResolution() {
        return this.resolution;
    }

    /**
     * Returns Whether to remove intervals with no media.
     *
     * @return Whether to remove intervals with no media
     */
    public final Boolean getTrim() {
        return this.trim;
    }

    /**
     * Returns The container format of the composition's media files as specified in
     * the POST request that created the Composition resource.
     *
     * @return The container format of the composition's media files as specified
     *         in the POST request that created the Composition resource
     */
    public final Composition.Format getFormat() {
        return this.format;
    }

    /**
     * Returns The average bit rate of the composition's media.
     *
     * @return The average bit rate of the composition's media
     */
    public final Integer getBitrate() {
        return this.bitrate;
    }

    /**
     * Returns The size of the composed media file in bytes.
     *
     * @return The size of the composed media file in bytes
     */
    public final Long getSize() {
        return this.size;
    }

    /**
     * Returns The duration of the composition's media file in seconds.
     *
     * @return The duration of the composition's media file in seconds
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
     * Returns The URL of the media file associated with the composition.
     *
     * @return The URL of the media file associated with the composition
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

        Composition other = (Composition) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(status, other.status) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateCompleted, other.dateCompleted) &&
               Objects.equals(dateDeleted, other.dateDeleted) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(roomSid, other.roomSid) &&
               Objects.equals(audioSources, other.audioSources) &&
               Objects.equals(audioSourcesExcluded, other.audioSourcesExcluded) &&
               Objects.equals(videoLayout, other.videoLayout) &&
               Objects.equals(resolution, other.resolution) &&
               Objects.equals(trim, other.trim) &&
               Objects.equals(format, other.format) &&
               Objects.equals(bitrate, other.bitrate) &&
               Objects.equals(size, other.size) &&
               Objects.equals(duration, other.duration) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            status,
                            dateCreated,
                            dateCompleted,
                            dateDeleted,
                            sid,
                            roomSid,
                            audioSources,
                            audioSourcesExcluded,
                            videoLayout,
                            resolution,
                            trim,
                            format,
                            bitrate,
                            size,
                            duration,
                            url,
                            links);
    }
}
