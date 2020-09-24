/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.verify.v2.service;

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
public class RateLimit extends Resource {
    private static final long serialVersionUID = 110366061579267L;

    /**
     * Create a RateLimitCreator to execute create.
     *
     * @param pathServiceSid The SID of the Service that the resource is associated
     *                       with
     * @param uniqueName A unique, developer assigned name of this Rate Limit.
     * @return RateLimitCreator capable of executing the create
     */
    public static RateLimitCreator creator(final String pathServiceSid,
                                           final String uniqueName) {
        return new RateLimitCreator(pathServiceSid, uniqueName);
    }

    /**
     * Create a RateLimitUpdater to execute update.
     *
     * @param pathServiceSid The SID of the Service that the resource is associated
     *                       with
     * @param pathSid The unique string that identifies the resource
     * @return RateLimitUpdater capable of executing the update
     */
    public static RateLimitUpdater updater(final String pathServiceSid,
                                           final String pathSid) {
        return new RateLimitUpdater(pathServiceSid, pathSid);
    }

    /**
     * Create a RateLimitFetcher to execute fetch.
     *
     * @param pathServiceSid The SID of the Service that the resource is associated
     *                       with
     * @param pathSid The unique string that identifies the resource
     * @return RateLimitFetcher capable of executing the fetch
     */
    public static RateLimitFetcher fetcher(final String pathServiceSid,
                                           final String pathSid) {
        return new RateLimitFetcher(pathServiceSid, pathSid);
    }

    /**
     * Create a RateLimitReader to execute read.
     *
     * @param pathServiceSid The SID of the Service that the resource is associated
     *                       with
     * @return RateLimitReader capable of executing the read
     */
    public static RateLimitReader reader(final String pathServiceSid) {
        return new RateLimitReader(pathServiceSid);
    }

    /**
     * Create a RateLimitDeleter to execute delete.
     *
     * @param pathServiceSid The SID of the Service that the resource is associated
     *                       with
     * @param pathSid The unique string that identifies the resource
     * @return RateLimitDeleter capable of executing the delete
     */
    public static RateLimitDeleter deleter(final String pathServiceSid,
                                           final String pathSid) {
        return new RateLimitDeleter(pathServiceSid, pathSid);
    }

    /**
     * Converts a JSON String into a RateLimit object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return RateLimit object represented by the provided JSON
     */
    public static RateLimit fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, RateLimit.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a RateLimit object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return RateLimit object represented by the provided JSON
     */
    public static RateLimit fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, RateLimit.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String serviceSid;
    private final String accountSid;
    private final String uniqueName;
    private final String description;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private RateLimit(@JsonProperty("sid")
                      final String sid,
                      @JsonProperty("service_sid")
                      final String serviceSid,
                      @JsonProperty("account_sid")
                      final String accountSid,
                      @JsonProperty("unique_name")
                      final String uniqueName,
                      @JsonProperty("description")
                      final String description,
                      @JsonProperty("date_created")
                      final String dateCreated,
                      @JsonProperty("date_updated")
                      final String dateUpdated,
                      @JsonProperty("url")
                      final URI url,
                      @JsonProperty("links")
                      final Map<String, String> links) {
        this.sid = sid;
        this.serviceSid = serviceSid;
        this.accountSid = accountSid;
        this.uniqueName = uniqueName;
        this.description = description;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.links = links;
    }

    /**
     * Returns A string that uniquely identifies this Rate Limit..
     *
     * @return A string that uniquely identifies this Rate Limit.
     */
    public final String getSid() {
        return this.sid;
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
     * Returns The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns A unique, developer assigned name of this Rate Limit..
     *
     * @return A unique, developer assigned name of this Rate Limit.
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns Description of this Rate Limit.
     *
     * @return Description of this Rate Limit
     */
    public final String getDescription() {
        return this.description;
    }

    /**
     * Returns The RFC 2822 date and time in GMT when the resource was created.
     *
     * @return The RFC 2822 date and time in GMT when the resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The RFC 2822 date and time in GMT when the resource was last updated.
     *
     * @return The RFC 2822 date and time in GMT when the resource was last updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
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

        RateLimit other = (RateLimit) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(serviceSid, other.serviceSid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(uniqueName, other.uniqueName) &&
               Objects.equals(description, other.description) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            serviceSid,
                            accountSid,
                            uniqueName,
                            description,
                            dateCreated,
                            dateUpdated,
                            url,
                            links);
    }
}
