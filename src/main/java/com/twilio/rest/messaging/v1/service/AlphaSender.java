/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.messaging.v1.service;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class AlphaSender extends Resource {
    private static final long serialVersionUID = 153057609894951L;

    /**
     * Create a AlphaSenderCreator to execute create.
     *
     * @param pathServiceSid The SID of the Service to create the resource under
     * @param alphaSender The Alphanumeric Sender ID string
     * @return AlphaSenderCreator capable of executing the create
     */
    public static AlphaSenderCreator creator(final String pathServiceSid,
                                             final String alphaSender) {
        return new AlphaSenderCreator(pathServiceSid, alphaSender);
    }

    /**
     * Create a AlphaSenderReader to execute read.
     *
     * @param pathServiceSid The SID of the Service to read the resources from
     * @return AlphaSenderReader capable of executing the read
     */
    public static AlphaSenderReader reader(final String pathServiceSid) {
        return new AlphaSenderReader(pathServiceSid);
    }

    /**
     * Create a AlphaSenderFetcher to execute fetch.
     *
     * @param pathServiceSid The SID of the Messaging Service to fetch the resource
     *                       from
     * @param pathSid The SID that identifies the resource to fetch
     * @return AlphaSenderFetcher capable of executing the fetch
     */
    public static AlphaSenderFetcher fetcher(final String pathServiceSid,
                                             final String pathSid) {
        return new AlphaSenderFetcher(pathServiceSid, pathSid);
    }

    /**
     * Create a AlphaSenderDeleter to execute delete.
     *
     * @param pathServiceSid The SID of the Service to delete the resource from
     * @param pathSid The SID that identifies the resource to delete
     * @return AlphaSenderDeleter capable of executing the delete
     */
    public static AlphaSenderDeleter deleter(final String pathServiceSid,
                                             final String pathSid) {
        return new AlphaSenderDeleter(pathServiceSid, pathSid);
    }

    /**
     * Converts a JSON String into a AlphaSender object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return AlphaSender object represented by the provided JSON
     */
    public static AlphaSender fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AlphaSender.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a AlphaSender object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return AlphaSender object represented by the provided JSON
     */
    public static AlphaSender fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AlphaSender.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String alphaSender;
    private final List<String> capabilities;
    private final URI url;

    @JsonCreator
    private AlphaSender(@JsonProperty("sid")
                        final String sid,
                        @JsonProperty("account_sid")
                        final String accountSid,
                        @JsonProperty("service_sid")
                        final String serviceSid,
                        @JsonProperty("date_created")
                        final String dateCreated,
                        @JsonProperty("date_updated")
                        final String dateUpdated,
                        @JsonProperty("alpha_sender")
                        final String alphaSender,
                        @JsonProperty("capabilities")
                        final List<String> capabilities,
                        @JsonProperty("url")
                        final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.alphaSender = alphaSender;
        this.capabilities = capabilities;
        this.url = url;
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
     * Returns The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The SID of the Service that the resource is associated with.
     *
     * @return The SID of the Service that the resource is associated with
     */
    public final String getServiceSid() {
        return this.serviceSid;
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
     * Returns The Alphanumeric Sender ID string.
     *
     * @return The Alphanumeric Sender ID string
     */
    public final String getAlphaSender() {
        return this.alphaSender;
    }

    /**
     * Returns An array of values that describe whether the number can receive calls
     * or messages.
     *
     * @return An array of values that describe whether the number can receive
     *         calls or messages
     */
    public final List<String> getCapabilities() {
        return this.capabilities;
    }

    /**
     * Returns The absolute URL of the AlphaSender resource.
     *
     * @return The absolute URL of the AlphaSender resource
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

        AlphaSender other = (AlphaSender) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(serviceSid, other.serviceSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(alphaSender, other.alphaSender) &&
               Objects.equals(capabilities, other.capabilities) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            serviceSid,
                            dateCreated,
                            dateUpdated,
                            alphaSender,
                            capabilities,
                            url);
    }
}
