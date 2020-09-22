/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.events.v1.schema;

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
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Version extends Resource {
    private static final long serialVersionUID = 53241776075196L;

    /**
     * Create a VersionReader to execute read.
     *
     * @param pathId The unique identifier of the schema.
     * @return VersionReader capable of executing the read
     */
    public static VersionReader reader(final String pathId) {
        return new VersionReader(pathId);
    }

    /**
     * Create a VersionFetcher to execute fetch.
     *
     * @param pathId The unique identifier of the schema.
     * @param pathSchemaVersion The version of the schema
     * @return VersionFetcher capable of executing the fetch
     */
    public static VersionFetcher fetcher(final String pathId,
                                         final Integer pathSchemaVersion) {
        return new VersionFetcher(pathId, pathSchemaVersion);
    }

    /**
     * Converts a JSON String into a Version object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Version object represented by the provided JSON
     */
    public static Version fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Version.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Version object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Version object represented by the provided JSON
     */
    public static Version fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Version.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String id;
    private final Integer schemaVersion;
    private final DateTime dateCreated;
    private final URI url;
    private final URI raw;

    @JsonCreator
    private Version(@JsonProperty("id")
                    final String id,
                    @JsonProperty("schema_version")
                    final Integer schemaVersion,
                    @JsonProperty("date_created")
                    final String dateCreated,
                    @JsonProperty("url")
                    final URI url,
                    @JsonProperty("raw")
                    final URI raw) {
        this.id = id;
        this.schemaVersion = schemaVersion;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.url = url;
        this.raw = raw;
    }

    /**
     * Returns The unique identifier of the schema..
     *
     * @return The unique identifier of the schema.
     */
    public final String getId() {
        return this.id;
    }

    /**
     * Returns The version of this schema..
     *
     * @return The version of this schema.
     */
    public final Integer getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * Returns The date the schema version was created..
     *
     * @return The date the schema version was created.
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The URL of this resource..
     *
     * @return The URL of this resource.
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The raw.
     *
     * @return The raw
     */
    public final URI getRaw() {
        return this.raw;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Version other = (Version) o;

        return Objects.equals(id, other.id) &&
               Objects.equals(schemaVersion, other.schemaVersion) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(url, other.url) &&
               Objects.equals(raw, other.raw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
                            schemaVersion,
                            dateCreated,
                            url,
                            raw);
    }
}