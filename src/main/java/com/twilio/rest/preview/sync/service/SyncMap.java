/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.sync.service;

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
public class SyncMap extends Resource {
    private static final long serialVersionUID = 198331554255718L;

    /**
     * Create a SyncMapFetcher to execute fetch.
     *
     * @param pathServiceSid The service_sid
     * @param pathSid The sid
     * @return SyncMapFetcher capable of executing the fetch
     */
    public static SyncMapFetcher fetcher(final String pathServiceSid,
                                         final String pathSid) {
        return new SyncMapFetcher(pathServiceSid, pathSid);
    }

    /**
     * Create a SyncMapDeleter to execute delete.
     *
     * @param pathServiceSid The service_sid
     * @param pathSid The sid
     * @return SyncMapDeleter capable of executing the delete
     */
    public static SyncMapDeleter deleter(final String pathServiceSid,
                                         final String pathSid) {
        return new SyncMapDeleter(pathServiceSid, pathSid);
    }

    /**
     * Create a SyncMapCreator to execute create.
     *
     * @param pathServiceSid The service_sid
     * @return SyncMapCreator capable of executing the create
     */
    public static SyncMapCreator creator(final String pathServiceSid) {
        return new SyncMapCreator(pathServiceSid);
    }

    /**
     * Create a SyncMapReader to execute read.
     *
     * @param pathServiceSid The service_sid
     * @return SyncMapReader capable of executing the read
     */
    public static SyncMapReader reader(final String pathServiceSid) {
        return new SyncMapReader(pathServiceSid);
    }

    /**
     * Converts a JSON String into a SyncMap object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return SyncMap object represented by the provided JSON
     */
    public static SyncMap fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncMap.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a SyncMap object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return SyncMap object represented by the provided JSON
     */
    public static SyncMap fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SyncMap.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String uniqueName;
    private final String accountSid;
    private final String serviceSid;
    private final URI url;
    private final Map<String, String> links;
    private final String revision;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String createdBy;

    @JsonCreator
    private SyncMap(@JsonProperty("sid")
                    final String sid,
                    @JsonProperty("unique_name")
                    final String uniqueName,
                    @JsonProperty("account_sid")
                    final String accountSid,
                    @JsonProperty("service_sid")
                    final String serviceSid,
                    @JsonProperty("url")
                    final URI url,
                    @JsonProperty("links")
                    final Map<String, String> links,
                    @JsonProperty("revision")
                    final String revision,
                    @JsonProperty("date_created")
                    final String dateCreated,
                    @JsonProperty("date_updated")
                    final String dateUpdated,
                    @JsonProperty("created_by")
                    final String createdBy) {
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.url = url;
        this.links = links;
        this.revision = revision;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.createdBy = createdBy;
    }

    /**
     * Returns The sid.
     *
     * @return The sid
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The unique_name.
     *
     * @return The unique_name
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The account_sid.
     *
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The service_sid.
     *
     * @return The service_sid
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The url.
     *
     * @return The url
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

    /**
     * Returns The revision.
     *
     * @return The revision
     */
    public final String getRevision() {
        return this.revision;
    }

    /**
     * Returns The date_created.
     *
     * @return The date_created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date_updated.
     *
     * @return The date_updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The created_by.
     *
     * @return The created_by
     */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SyncMap other = (SyncMap) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(uniqueName, other.uniqueName) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(serviceSid, other.serviceSid) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links) &&
               Objects.equals(revision, other.revision) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(createdBy, other.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            uniqueName,
                            accountSid,
                            serviceSid,
                            url,
                            links,
                            revision,
                            dateCreated,
                            dateUpdated,
                            createdBy);
    }
}
