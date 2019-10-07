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
import com.google.common.base.MoreObjects;
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
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompositionHook extends Resource {
    private static final long serialVersionUID = 281311376768009L;

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
     * Create a CompositionHookFetcher to execute fetch.
     *
     * @param pathSid The SID that identifies the resource to fetch
     * @return CompositionHookFetcher capable of executing the fetch
     */
    public static CompositionHookFetcher fetcher(final String pathSid) {
        return new CompositionHookFetcher(pathSid);
    }

    /**
     * Create a CompositionHookReader to execute read.
     *
     * @return CompositionHookReader capable of executing the read
     */
    public static CompositionHookReader reader() {
        return new CompositionHookReader();
    }

    /**
     * Create a CompositionHookDeleter to execute delete.
     *
     * @param pathSid The SID that identifies the resource to delete
     * @return CompositionHookDeleter capable of executing the delete
     */
    public static CompositionHookDeleter deleter(final String pathSid) {
        return new CompositionHookDeleter(pathSid);
    }

    /**
     * Create a CompositionHookCreator to execute create.
     *
     * @param friendlyName A unique string to describe the resource
     * @return CompositionHookCreator capable of executing the create
     */
    public static CompositionHookCreator creator(final String friendlyName) {
        return new CompositionHookCreator(friendlyName);
    }

    /**
     * Create a CompositionHookUpdater to execute update.
     *
     * @param pathSid The SID that identifies the resource to update
     * @param friendlyName A unique string to describe the resource
     * @return CompositionHookUpdater capable of executing the update
     */
    public static CompositionHookUpdater updater(final String pathSid,
                                                 final String friendlyName) {
        return new CompositionHookUpdater(pathSid, friendlyName);
    }

    /**
     * Converts a JSON String into a CompositionHook object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return CompositionHook object represented by the provided JSON
     */
    public static CompositionHook fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, CompositionHook.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a CompositionHook object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return CompositionHook object represented by the provided JSON
     */
    public static CompositionHook fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, CompositionHook.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String friendlyName;
    private final Boolean enabled;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String sid;
    private final List<String> audioSources;
    private final List<String> audioSourcesExcluded;
    private final Map<String, Object> videoLayout;
    private final String resolution;
    private final Boolean trim;
    private final CompositionHook.Format format;
    private final URI statusCallback;
    private final HttpMethod statusCallbackMethod;
    private final URI url;

    @JsonCreator
    private CompositionHook(@JsonProperty("account_sid")
                            final String accountSid,
                            @JsonProperty("friendly_name")
                            final String friendlyName,
                            @JsonProperty("enabled")
                            final Boolean enabled,
                            @JsonProperty("date_created")
                            final String dateCreated,
                            @JsonProperty("date_updated")
                            final String dateUpdated,
                            @JsonProperty("sid")
                            final String sid,
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
                            final CompositionHook.Format format,
                            @JsonProperty("status_callback")
                            final URI statusCallback,
                            @JsonProperty("status_callback_method")
                            final HttpMethod statusCallbackMethod,
                            @JsonProperty("url")
                            final URI url) {
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.enabled = enabled;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.sid = sid;
        this.audioSources = audioSources;
        this.audioSourcesExcluded = audioSourcesExcluded;
        this.videoLayout = videoLayout;
        this.resolution = resolution;
        this.trim = trim;
        this.format = format;
        this.statusCallback = statusCallback;
        this.statusCallbackMethod = statusCallbackMethod;
        this.url = url;
    }

    /**
     * Returns The The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The string that you assigned to describe the resource.
     *
     * @return The string that you assigned to describe the resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The Whether the CompositionHook is active.
     *
     * @return Whether the CompositionHook is active
     */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Returns The The ISO 8601 date and time in GMT when the resource was created.
     *
     * @return The ISO 8601 date and time in GMT when the resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The ISO 8601 date and time in GMT when the resource was last
     * updated.
     *
     * @return The ISO 8601 date and time in GMT when the resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The unique string that identifies the resource.
     *
     * @return The unique string that identifies the resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The array of track names to include in the compositions created
     * by the composition hook.
     *
     * @return The array of track names to include in the compositions created by
     *         the composition hook
     */
    public final List<String> getAudioSources() {
        return this.audioSources;
    }

    /**
     * Returns The The array of track names to exclude from the compositions created
     * by the composition hook.
     *
     * @return The array of track names to exclude from the compositions created by
     *         the composition hook
     */
    public final List<String> getAudioSourcesExcluded() {
        return this.audioSourcesExcluded;
    }

    /**
     * Returns The A JSON object that describes the video layout of the Composition.
     *
     * @return A JSON object that describes the video layout of the Composition
     */
    public final Map<String, Object> getVideoLayout() {
        return this.videoLayout;
    }

    /**
     * Returns The The dimensions of the video image in pixels expressed as columns
     * (width) and rows (height).
     *
     * @return The dimensions of the video image in pixels expressed as columns
     *         (width) and rows (height)
     */
    public final String getResolution() {
        return this.resolution;
    }

    /**
     * Returns The Whether intervals with no media are clipped.
     *
     * @return Whether intervals with no media are clipped
     */
    public final Boolean getTrim() {
        return this.trim;
    }

    /**
     * Returns The The container format of the media files used by the compositions
     * created by the composition hook.
     *
     * @return The container format of the media files used by the compositions
     *         created by the composition hook
     */
    public final CompositionHook.Format getFormat() {
        return this.format;
    }

    /**
     * Returns The The URL to send status information to your application.
     *
     * @return The URL to send status information to your application
     */
    public final URI getStatusCallback() {
        return this.statusCallback;
    }

    /**
     * Returns The The HTTP method we should use to call status_callback.
     *
     * @return The HTTP method we should use to call status_callback
     */
    public final HttpMethod getStatusCallbackMethod() {
        return this.statusCallbackMethod;
    }

    /**
     * Returns The The absolute URL of the resource.
     *
     * @return The absolute URL of the resource
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CompositionHook other = (CompositionHook) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(enabled, other.enabled) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(audioSources, other.audioSources) &&
               Objects.equals(audioSourcesExcluded, other.audioSourcesExcluded) &&
               Objects.equals(videoLayout, other.videoLayout) &&
               Objects.equals(resolution, other.resolution) &&
               Objects.equals(trim, other.trim) &&
               Objects.equals(format, other.format) &&
               Objects.equals(statusCallback, other.statusCallback) &&
               Objects.equals(statusCallbackMethod, other.statusCallbackMethod) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            friendlyName,
                            enabled,
                            dateCreated,
                            dateUpdated,
                            sid,
                            audioSources,
                            audioSourcesExcluded,
                            videoLayout,
                            resolution,
                            trim,
                            format,
                            statusCallback,
                            statusCallbackMethod,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("friendlyName", friendlyName)
                          .add("enabled", enabled)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("sid", sid)
                          .add("audioSources", audioSources)
                          .add("audioSourcesExcluded", audioSourcesExcluded)
                          .add("videoLayout", videoLayout)
                          .add("resolution", resolution)
                          .add("trim", trim)
                          .add("format", format)
                          .add("statusCallback", statusCallback)
                          .add("statusCallbackMethod", statusCallbackMethod)
                          .add("url", url)
                          .toString();
    }
}