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
import com.google.common.base.MoreObjects;
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
public class Entity extends Resource {
    private static final long serialVersionUID = 16297251253048L;

    /**
     * Create a EntityCreator to execute create.
     *
     * @param pathServiceSid Service Sid.
     * @param identity Unique external identifier of the Entity
     * @return EntityCreator capable of executing the create
     */
    public static EntityCreator creator(final String pathServiceSid,
                                        final String identity) {
        return new EntityCreator(pathServiceSid, identity);
    }

    /**
     * Create a EntityDeleter to execute delete.
     *
     * @param pathServiceSid Service Sid.
     * @param pathIdentity Unique external identifier of the Entity
     * @return EntityDeleter capable of executing the delete
     */
    public static EntityDeleter deleter(final String pathServiceSid,
                                        final String pathIdentity) {
        return new EntityDeleter(pathServiceSid, pathIdentity);
    }

    /**
     * Create a EntityFetcher to execute fetch.
     *
     * @param pathServiceSid Service Sid.
     * @param pathIdentity Unique external identifier of the Entity
     * @return EntityFetcher capable of executing the fetch
     */
    public static EntityFetcher fetcher(final String pathServiceSid,
                                        final String pathIdentity) {
        return new EntityFetcher(pathServiceSid, pathIdentity);
    }

    /**
     * Create a EntityReader to execute read.
     *
     * @param pathServiceSid Service Sid.
     * @return EntityReader capable of executing the read
     */
    public static EntityReader reader(final String pathServiceSid) {
        return new EntityReader(pathServiceSid);
    }

    /**
     * Converts a JSON String into a Entity object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Entity object represented by the provided JSON
     */
    public static Entity fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Entity.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Entity object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Entity object represented by the provided JSON
     */
    public static Entity fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Entity.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String identity;
    private final String accountSid;
    private final String serviceSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Entity(@JsonProperty("sid")
                   final String sid,
                   @JsonProperty("identity")
                   final String identity,
                   @JsonProperty("account_sid")
                   final String accountSid,
                   @JsonProperty("service_sid")
                   final String serviceSid,
                   @JsonProperty("date_created")
                   final String dateCreated,
                   @JsonProperty("date_updated")
                   final String dateUpdated,
                   @JsonProperty("url")
                   final URI url,
                   @JsonProperty("links")
                   final Map<String, String> links) {
        this.sid = sid;
        this.identity = identity;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.links = links;
    }

    /**
     * Returns A string that uniquely identifies this Entity..
     *
     * @return A string that uniquely identifies this Entity.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns Unique external identifier of the Entity.
     *
     * @return Unique external identifier of the Entity
     */
    public final String getIdentity() {
        return this.identity;
    }

    /**
     * Returns Account Sid..
     *
     * @return Account Sid.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns Service Sid..
     *
     * @return Service Sid.
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The date this Entity was created.
     *
     * @return The date this Entity was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date this Entity was updated.
     *
     * @return The date this Entity was updated
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
     * Returns Nested resource URLs..
     *
     * @return Nested resource URLs.
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

        Entity other = (Entity) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(identity, other.identity) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(serviceSid, other.serviceSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            identity,
                            accountSid,
                            serviceSid,
                            dateCreated,
                            dateUpdated,
                            url,
                            links);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("identity", identity)
                          .add("accountSid", accountSid)
                          .add("serviceSid", serviceSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("url", url)
                          .add("links", links)
                          .toString();
    }
}