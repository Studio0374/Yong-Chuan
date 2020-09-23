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
public class Workflow extends Resource {
    private static final long serialVersionUID = 205559746169581L;

    /**
     * Create a WorkflowFetcher to execute fetch.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Workflow to fetch
     * @param pathSid The SID of the resource
     * @return WorkflowFetcher capable of executing the fetch
     */
    public static WorkflowFetcher fetcher(final String pathWorkspaceSid,
                                          final String pathSid) {
        return new WorkflowFetcher(pathWorkspaceSid, pathSid);
    }

    /**
     * Create a WorkflowUpdater to execute update.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Workflow to update
     * @param pathSid The SID of the resource
     * @return WorkflowUpdater capable of executing the update
     */
    public static WorkflowUpdater updater(final String pathWorkspaceSid,
                                          final String pathSid) {
        return new WorkflowUpdater(pathWorkspaceSid, pathSid);
    }

    /**
     * Create a WorkflowDeleter to execute delete.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Workflow to delete
     * @param pathSid The SID of the Workflow resource to delete
     * @return WorkflowDeleter capable of executing the delete
     */
    public static WorkflowDeleter deleter(final String pathWorkspaceSid,
                                          final String pathSid) {
        return new WorkflowDeleter(pathWorkspaceSid, pathSid);
    }

    /**
     * Create a WorkflowReader to execute read.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Workflow to read
     * @return WorkflowReader capable of executing the read
     */
    public static WorkflowReader reader(final String pathWorkspaceSid) {
        return new WorkflowReader(pathWorkspaceSid);
    }

    /**
     * Create a WorkflowCreator to execute create.
     *
     * @param pathWorkspaceSid The SID of the Workspace that the new Workflow to
     *                         create belongs to
     * @param friendlyName  descriptive string that you create to describe the
     *                     Workflow resource
     * @param configuration A JSON string that contains the rules to apply to the
     *                      Workflow
     * @return WorkflowCreator capable of executing the create
     */
    public static WorkflowCreator creator(final String pathWorkspaceSid,
                                          final String friendlyName,
                                          final String configuration) {
        return new WorkflowCreator(pathWorkspaceSid, friendlyName, configuration);
    }

    /**
     * Converts a JSON String into a Workflow object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Workflow object represented by the provided JSON
     */
    public static Workflow fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Workflow.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Workflow object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Workflow object represented by the provided JSON
     */
    public static Workflow fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Workflow.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final URI assignmentCallbackUrl;
    private final String configuration;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String documentContentType;
    private final URI fallbackAssignmentCallbackUrl;
    private final String friendlyName;
    private final String sid;
    private final Integer taskReservationTimeout;
    private final String workspaceSid;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Workflow(@JsonProperty("account_sid")
                     final String accountSid,
                     @JsonProperty("assignment_callback_url")
                     final URI assignmentCallbackUrl,
                     @JsonProperty("configuration")
                     final String configuration,
                     @JsonProperty("date_created")
                     final String dateCreated,
                     @JsonProperty("date_updated")
                     final String dateUpdated,
                     @JsonProperty("document_content_type")
                     final String documentContentType,
                     @JsonProperty("fallback_assignment_callback_url")
                     final URI fallbackAssignmentCallbackUrl,
                     @JsonProperty("friendly_name")
                     final String friendlyName,
                     @JsonProperty("sid")
                     final String sid,
                     @JsonProperty("task_reservation_timeout")
                     final Integer taskReservationTimeout,
                     @JsonProperty("workspace_sid")
                     final String workspaceSid,
                     @JsonProperty("url")
                     final URI url,
                     @JsonProperty("links")
                     final Map<String, String> links) {
        this.accountSid = accountSid;
        this.assignmentCallbackUrl = assignmentCallbackUrl;
        this.configuration = configuration;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.documentContentType = documentContentType;
        this.fallbackAssignmentCallbackUrl = fallbackAssignmentCallbackUrl;
        this.friendlyName = friendlyName;
        this.sid = sid;
        this.taskReservationTimeout = taskReservationTimeout;
        this.workspaceSid = workspaceSid;
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
     * Returns The URL that we call when a task managed by the Workflow is assigned
     * to a Worker.
     *
     * @return The URL that we call when a task managed by the Workflow is assigned
     *         to a Worker
     */
    public final URI getAssignmentCallbackUrl() {
        return this.assignmentCallbackUrl;
    }

    /**
     * Returns A JSON string that contains the Workflow's configuration.
     *
     * @return A JSON string that contains the Workflow's configuration
     */
    public final String getConfiguration() {
        return this.configuration;
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
     * Returns The MIME type of the document.
     *
     * @return The MIME type of the document
     */
    public final String getDocumentContentType() {
        return this.documentContentType;
    }

    /**
     * Returns The URL that we call when a call to the `assignment_callback_url`
     * fails.
     *
     * @return The URL that we call when a call to the `assignment_callback_url`
     *         fails
     */
    public final URI getFallbackAssignmentCallbackUrl() {
        return this.fallbackAssignmentCallbackUrl;
    }

    /**
     * Returns The string that you assigned to describe the Workflow resource.
     *
     * @return The string that you assigned to describe the Workflow resource
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
     * Returns How long TaskRouter will wait for a confirmation response from your
     * application after it assigns a Task to a Worker.
     *
     * @return How long TaskRouter will wait for a confirmation response from your
     *         application after it assigns a Task to a Worker
     */
    public final Integer getTaskReservationTimeout() {
        return this.taskReservationTimeout;
    }

    /**
     * Returns The SID of the Workspace that contains the Workflow.
     *
     * @return The SID of the Workspace that contains the Workflow
     */
    public final String getWorkspaceSid() {
        return this.workspaceSid;
    }

    /**
     * Returns The absolute URL of the Workflow resource.
     *
     * @return The absolute URL of the Workflow resource
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

        Workflow other = (Workflow) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(assignmentCallbackUrl, other.assignmentCallbackUrl) &&
               Objects.equals(configuration, other.configuration) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(documentContentType, other.documentContentType) &&
               Objects.equals(fallbackAssignmentCallbackUrl, other.fallbackAssignmentCallbackUrl) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(taskReservationTimeout, other.taskReservationTimeout) &&
               Objects.equals(workspaceSid, other.workspaceSid) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            assignmentCallbackUrl,
                            configuration,
                            dateCreated,
                            dateUpdated,
                            documentContentType,
                            fallbackAssignmentCallbackUrl,
                            friendlyName,
                            sid,
                            taskReservationTimeout,
                            workspaceSid,
                            url,
                            links);
    }
}
