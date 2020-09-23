/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
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
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Workspace extends Resource {
    private static final long serialVersionUID = 173419493907327L;

    public enum QueueOrder {
        FIFO("FIFO"),
        LIFO("LIFO");

        private final String value;

        private QueueOrder(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a QueueOrder from a string.
         * @param value string value
         * @return generated QueueOrder
         */
        @JsonCreator
        public static QueueOrder forValue(final String value) {
            return Promoter.enumFromString(value, QueueOrder.values());
        }
    }

    /**
     * Create a WorkspaceFetcher to execute fetch.
     *
     * @param pathSid The SID of the resource to fetch
     * @return WorkspaceFetcher capable of executing the fetch
     */
    public static WorkspaceFetcher fetcher(final String pathSid) {
        return new WorkspaceFetcher(pathSid);
    }

    /**
     * Create a WorkspaceUpdater to execute update.
     *
     * @param pathSid The SID of the resource to update
     * @return WorkspaceUpdater capable of executing the update
     */
    public static WorkspaceUpdater updater(final String pathSid) {
        return new WorkspaceUpdater(pathSid);
    }

    /**
     * Create a WorkspaceReader to execute read.
     *
     * @return WorkspaceReader capable of executing the read
     */
    public static WorkspaceReader reader() {
        return new WorkspaceReader();
    }

    /**
     * Create a WorkspaceCreator to execute create.
     *
     * @param friendlyName A string to describe the Workspace resource
     * @return WorkspaceCreator capable of executing the create
     */
    public static WorkspaceCreator creator(final String friendlyName) {
        return new WorkspaceCreator(friendlyName);
    }

    /**
     * Create a WorkspaceDeleter to execute delete.
     *
     * @param pathSid The SID of the resource to delete
     * @return WorkspaceDeleter capable of executing the delete
     */
    public static WorkspaceDeleter deleter(final String pathSid) {
        return new WorkspaceDeleter(pathSid);
    }

    /**
     * Converts a JSON String into a Workspace object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Workspace object represented by the provided JSON
     */
    public static Workspace fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Workspace.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Workspace object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Workspace object represented by the provided JSON
     */
    public static Workspace fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Workspace.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String defaultActivityName;
    private final String defaultActivitySid;
    private final URI eventCallbackUrl;
    private final String eventsFilter;
    private final String friendlyName;
    private final Boolean multiTaskEnabled;
    private final String sid;
    private final String timeoutActivityName;
    private final String timeoutActivitySid;
    private final Workspace.QueueOrder prioritizeQueueOrder;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Workspace(@JsonProperty("account_sid")
                      final String accountSid,
                      @JsonProperty("date_created")
                      final String dateCreated,
                      @JsonProperty("date_updated")
                      final String dateUpdated,
                      @JsonProperty("default_activity_name")
                      final String defaultActivityName,
                      @JsonProperty("default_activity_sid")
                      final String defaultActivitySid,
                      @JsonProperty("event_callback_url")
                      final URI eventCallbackUrl,
                      @JsonProperty("events_filter")
                      final String eventsFilter,
                      @JsonProperty("friendly_name")
                      final String friendlyName,
                      @JsonProperty("multi_task_enabled")
                      final Boolean multiTaskEnabled,
                      @JsonProperty("sid")
                      final String sid,
                      @JsonProperty("timeout_activity_name")
                      final String timeoutActivityName,
                      @JsonProperty("timeout_activity_sid")
                      final String timeoutActivitySid,
                      @JsonProperty("prioritize_queue_order")
                      final Workspace.QueueOrder prioritizeQueueOrder,
                      @JsonProperty("url")
                      final URI url,
                      @JsonProperty("links")
                      final Map<String, String> links) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.defaultActivityName = defaultActivityName;
        this.defaultActivitySid = defaultActivitySid;
        this.eventCallbackUrl = eventCallbackUrl;
        this.eventsFilter = eventsFilter;
        this.friendlyName = friendlyName;
        this.multiTaskEnabled = multiTaskEnabled;
        this.sid = sid;
        this.timeoutActivityName = timeoutActivityName;
        this.timeoutActivitySid = timeoutActivitySid;
        this.prioritizeQueueOrder = prioritizeQueueOrder;
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
     * Returns The name of the default activity.
     *
     * @return The name of the default activity
     */
    public final String getDefaultActivityName() {
        return this.defaultActivityName;
    }

    /**
     * Returns The SID of the Activity that will be used when new Workers are
     * created in the Workspace.
     *
     * @return The SID of the Activity that will be used when new Workers are
     *         created in the Workspace
     */
    public final String getDefaultActivitySid() {
        return this.defaultActivitySid;
    }

    /**
     * Returns The URL we call when an event occurs.
     *
     * @return The URL we call when an event occurs
     */
    public final URI getEventCallbackUrl() {
        return this.eventCallbackUrl;
    }

    /**
     * Returns The list of Workspace events for which to call event_callback_url.
     *
     * @return The list of Workspace events for which to call event_callback_url
     */
    public final String getEventsFilter() {
        return this.eventsFilter;
    }

    /**
     * Returns The string that you assigned to describe the Workspace resource.
     *
     * @return The string that you assigned to describe the Workspace resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns Whether multi-tasking is enabled.
     *
     * @return Whether multi-tasking is enabled
     */
    public final Boolean getMultiTaskEnabled() {
        return this.multiTaskEnabled;
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
     * Returns The name of the timeout activity.
     *
     * @return The name of the timeout activity
     */
    public final String getTimeoutActivityName() {
        return this.timeoutActivityName;
    }

    /**
     * Returns The SID of the Activity that will be assigned to a Worker when a Task
     * reservation times out without a response.
     *
     * @return The SID of the Activity that will be assigned to a Worker when a
     *         Task reservation times out without a response
     */
    public final String getTimeoutActivitySid() {
        return this.timeoutActivitySid;
    }

    /**
     * Returns The type of TaskQueue to prioritize when Workers are receiving Tasks
     * from both types of TaskQueues.
     *
     * @return The type of TaskQueue to prioritize when Workers are receiving Tasks
     *         from both types of TaskQueues
     */
    public final Workspace.QueueOrder getPrioritizeQueueOrder() {
        return this.prioritizeQueueOrder;
    }

    /**
     * Returns The absolute URL of the Workspace resource.
     *
     * @return The absolute URL of the Workspace resource
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

        Workspace other = (Workspace) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(defaultActivityName, other.defaultActivityName) &&
               Objects.equals(defaultActivitySid, other.defaultActivitySid) &&
               Objects.equals(eventCallbackUrl, other.eventCallbackUrl) &&
               Objects.equals(eventsFilter, other.eventsFilter) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(multiTaskEnabled, other.multiTaskEnabled) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(timeoutActivityName, other.timeoutActivityName) &&
               Objects.equals(timeoutActivitySid, other.timeoutActivitySid) &&
               Objects.equals(prioritizeQueueOrder, other.prioritizeQueueOrder) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            defaultActivityName,
                            defaultActivitySid,
                            eventCallbackUrl,
                            eventsFilter,
                            friendlyName,
                            multiTaskEnabled,
                            sid,
                            timeoutActivityName,
                            timeoutActivitySid,
                            prioritizeQueueOrder,
                            url,
                            links);
    }
}
