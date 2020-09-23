/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.events.v1;

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

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class EventType extends Resource {
    private static final long serialVersionUID = 245530278393343L;

    /**
     * Create a EventTypeReader to execute read.
     *
     * @return EventTypeReader capable of executing the read
     */
    public static EventTypeReader reader() {
        return new EventTypeReader();
    }

    /**
     * Create a EventTypeFetcher to execute fetch.
     *
     * @param pathType A string that uniquely identifies this Event Type.
     * @return EventTypeFetcher capable of executing the fetch
     */
    public static EventTypeFetcher fetcher(final String pathType) {
        return new EventTypeFetcher(pathType);
    }

    /**
     * Converts a JSON String into a EventType object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return EventType object represented by the provided JSON
     */
    public static EventType fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, EventType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a EventType object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return EventType object represented by the provided JSON
     */
    public static EventType fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, EventType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String type;
    private final String schemaId;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String description;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private EventType(@JsonProperty("type")
                      final String type,
                      @JsonProperty("schema_id")
                      final String schemaId,
                      @JsonProperty("date_created")
                      final String dateCreated,
                      @JsonProperty("date_updated")
                      final String dateUpdated,
                      @JsonProperty("description")
                      final String description,
                      @JsonProperty("url")
                      final URI url,
                      @JsonProperty("links")
                      final Map<String, String> links) {
        this.type = type;
        this.schemaId = schemaId;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.description = description;
        this.url = url;
        this.links = links;
    }

    /**
     * Returns The Event Type identifier..
     *
     * @return The Event Type identifier.
     */
    public final String getType() {
        return this.type;
    }

    /**
     * Returns The Schema identifier for this Event Type..
     *
     * @return The Schema identifier for this Event Type.
     */
    public final String getSchemaId() {
        return this.schemaId;
    }

    /**
     * Returns The date this Event Type was created..
     *
     * @return The date this Event Type was created.
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date this Event Type was updated..
     *
     * @return The date this Event Type was updated.
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns Event Type description..
     *
     * @return Event Type description.
     */
    public final String getDescription() {
        return this.description;
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
     * Returns The links.
     *
     * @return The links
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

        EventType other = (EventType) o;

        return Objects.equals(type, other.type) &&
               Objects.equals(schemaId, other.schemaId) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(description, other.description) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
                            schemaId,
                            dateCreated,
                            dateUpdated,
                            description,
                            url,
                            links);
    }
}
