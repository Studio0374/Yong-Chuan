/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

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

@JsonIgnoreProperties(ignoreUnknown = true)
public class Activity extends Resource {
    private static final long serialVersionUID = 66226006406843L;

    /**
     * Create a ActivityFetcher to execute fetch.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Activity resources
     *                         to fetch
     * @param pathSid The SID of the resource to fetch
     * @return ActivityFetcher capable of executing the fetch
     */
    public static ActivityFetcher fetcher(final String pathWorkspaceSid,
                                          final String pathSid) {
        return new ActivityFetcher(pathWorkspaceSid, pathSid);
    }

    /**
     * Create a ActivityUpdater to execute update.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Activity resources
     *                         to update
     * @param pathSid The SID of the Activity resource to update
     * @return ActivityUpdater capable of executing the update
     */
    public static ActivityUpdater updater(final String pathWorkspaceSid,
                                          final String pathSid) {
        return new ActivityUpdater(pathWorkspaceSid, pathSid);
    }

    /**
     * Create a ActivityDeleter to execute delete.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Activity resources
     *                         to delete
     * @param pathSid The SID of the Activity resource to delete
     * @return ActivityDeleter capable of executing the delete
     */
    public static ActivityDeleter deleter(final String pathWorkspaceSid,
                                          final String pathSid) {
        return new ActivityDeleter(pathWorkspaceSid, pathSid);
    }

    /**
     * Create a ActivityReader to execute read.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Activity resources
     *                         to read
     * @return ActivityReader capable of executing the read
     */
    public static ActivityReader reader(final String pathWorkspaceSid) {
        return new ActivityReader(pathWorkspaceSid);
    }

    /**
     * Create a ActivityCreator to execute create.
     *
     * @param pathWorkspaceSid The SID of the Workspace that the new Activity
     *                         belongs to
     * @param friendlyName A string to describe the Activity resource
     * @return ActivityCreator capable of executing the create
     */
    public static ActivityCreator creator(final String pathWorkspaceSid,
                                          final String friendlyName) {
        return new ActivityCreator(pathWorkspaceSid, friendlyName);
    }

    /**
     * Converts a JSON String into a Activity object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Activity object represented by the provided JSON
     */
    public static Activity fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Activity.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Activity object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Activity object represented by the provided JSON
     */
    public static Activity fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Activity.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final Boolean available;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String friendlyName;
    private final String sid;
    private final String workspaceSid;
    private final URI url;

    @JsonCreator
    private Activity(@JsonProperty("account_sid")
                     final String accountSid,
                     @JsonProperty("available")
                     final Boolean available,
                     @JsonProperty("date_created")
                     final String dateCreated,
                     @JsonProperty("date_updated")
                     final String dateUpdated,
                     @JsonProperty("friendly_name")
                     final String friendlyName,
                     @JsonProperty("sid")
                     final String sid,
                     @JsonProperty("workspace_sid")
                     final String workspaceSid,
                     @JsonProperty("url")
                     final URI url) {
        this.accountSid = accountSid;
        this.available = available;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.sid = sid;
        this.workspaceSid = workspaceSid;
        this.url = url;
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
     * Returns Whether the Worker should be eligible to receive a Task when it
     * occupies the Activity.
     *
     * @return Whether the Worker should be eligible to receive a Task when it
     *         occupies the Activity
     */
    public final Boolean getAvailable() {
        return this.available;
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
     * Returns The string that you assigned to describe the Activity resource.
     *
     * @return The string that you assigned to describe the Activity resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
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
     * Returns The SID of the Workspace that contains the Activity.
     *
     * @return The SID of the Workspace that contains the Activity
     */
    public final String getWorkspaceSid() {
        return this.workspaceSid;
    }

    /**
     * Returns The absolute URL of the Activity resource.
     *
     * @return The absolute URL of the Activity resource
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

        Activity other = (Activity) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(available, other.available) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(workspaceSid, other.workspaceSid) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            available,
                            dateCreated,
                            dateUpdated,
                            friendlyName,
                            sid,
                            workspaceSid,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("available", available)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("friendlyName", friendlyName)
                          .add("sid", sid)
                          .add("workspaceSid", workspaceSid)
                          .add("url", url)
                          .toString();
    }
}