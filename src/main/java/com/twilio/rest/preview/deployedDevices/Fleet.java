/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.deployedDevices;

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
public class Fleet extends Resource {
    private static final long serialVersionUID = 61125886588992L;

    /**
     * Create a FleetFetcher to execute fetch.
     *
     * @param pathSid A string that uniquely identifies the Fleet.
     * @return FleetFetcher capable of executing the fetch
     */
    public static FleetFetcher fetcher(final String pathSid) {
        return new FleetFetcher(pathSid);
    }

    /**
     * Create a FleetDeleter to execute delete.
     *
     * @param pathSid A string that uniquely identifies the Fleet.
     * @return FleetDeleter capable of executing the delete
     */
    public static FleetDeleter deleter(final String pathSid) {
        return new FleetDeleter(pathSid);
    }

    /**
     * Create a FleetCreator to execute create.
     *
     * @return FleetCreator capable of executing the create
     */
    public static FleetCreator creator() {
        return new FleetCreator();
    }

    /**
     * Create a FleetReader to execute read.
     *
     * @return FleetReader capable of executing the read
     */
    public static FleetReader reader() {
        return new FleetReader();
    }

    /**
     * Create a FleetUpdater to execute update.
     *
     * @param pathSid A string that uniquely identifies the Fleet.
     * @return FleetUpdater capable of executing the update
     */
    public static FleetUpdater updater(final String pathSid) {
        return new FleetUpdater(pathSid);
    }

    /**
     * Converts a JSON String into a Fleet object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Fleet object represented by the provided JSON
     */
    public static Fleet fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Fleet.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Fleet object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Fleet object represented by the provided JSON
     */
    public static Fleet fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Fleet.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final URI url;
    private final String uniqueName;
    private final String friendlyName;
    private final String accountSid;
    private final String defaultDeploymentSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final Map<String, String> links;

    @JsonCreator
    private Fleet(@JsonProperty("sid")
                  final String sid,
                  @JsonProperty("url")
                  final URI url,
                  @JsonProperty("unique_name")
                  final String uniqueName,
                  @JsonProperty("friendly_name")
                  final String friendlyName,
                  @JsonProperty("account_sid")
                  final String accountSid,
                  @JsonProperty("default_deployment_sid")
                  final String defaultDeploymentSid,
                  @JsonProperty("date_created")
                  final String dateCreated,
                  @JsonProperty("date_updated")
                  final String dateUpdated,
                  @JsonProperty("links")
                  final Map<String, String> links) {
        this.sid = sid;
        this.url = url;
        this.uniqueName = uniqueName;
        this.friendlyName = friendlyName;
        this.accountSid = accountSid;
        this.defaultDeploymentSid = defaultDeploymentSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.links = links;
    }

    /**
     * Returns A string that uniquely identifies this Fleet..
     *
     * @return A string that uniquely identifies this Fleet.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns URL of this Fleet..
     *
     * @return URL of this Fleet.
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns A unique, addressable name of this Fleet..
     *
     * @return A unique, addressable name of this Fleet.
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns A human readable description for this Fleet..
     *
     * @return A human readable description for this Fleet.
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The unique SID that identifies this Account..
     *
     * @return The unique SID that identifies this Account.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The unique SID that identifies this Fleet's default Deployment..
     *
     * @return The unique SID that identifies this Fleet's default Deployment.
     */
    public final String getDefaultDeploymentSid() {
        return this.defaultDeploymentSid;
    }

    /**
     * Returns The date this Fleet was created..
     *
     * @return The date this Fleet was created.
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date this Fleet was updated..
     *
     * @return The date this Fleet was updated.
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
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

        Fleet other = (Fleet) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(url, other.url) &&
               Objects.equals(uniqueName, other.uniqueName) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(defaultDeploymentSid, other.defaultDeploymentSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            url,
                            uniqueName,
                            friendlyName,
                            accountSid,
                            defaultDeploymentSid,
                            dateCreated,
                            dateUpdated,
                            links);
    }
}
