/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.autopilot.v1.assistant.task;

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
public class Field extends Resource {
    private static final long serialVersionUID = 236424306351624L;

    /**
     * Create a FieldFetcher to execute fetch.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         Task associated with the resource to fetch
     * @param pathTaskSid The SID of the
     *                    <a href="https://www.twilio.com/docs/autopilot/api/task">Task</a>
     *                    resource associated with the Field resource to fetch
     * @param pathSid The unique string that identifies the resource
     * @return FieldFetcher capable of executing the fetch
     */
    public static FieldFetcher fetcher(final String pathAssistantSid,
                                       final String pathTaskSid,
                                       final String pathSid) {
        return new FieldFetcher(pathAssistantSid, pathTaskSid, pathSid);
    }

    /**
     * Create a FieldReader to execute read.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         Task associated with the resources to read.
     * @param pathTaskSid The SID of the
     *                    <a href="https://www.twilio.com/docs/autopilot/api/task">Task</a>
     *                    resource associated with the Field resources to read
     * @return FieldReader capable of executing the read
     */
    public static FieldReader reader(final String pathAssistantSid,
                                     final String pathTaskSid) {
        return new FieldReader(pathAssistantSid, pathTaskSid);
    }

    /**
     * Create a FieldCreator to execute create.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         Task associated with the new resource
     * @param pathTaskSid The SID of the
     *                    <a href="https://www.twilio.com/docs/autopilot/api/task">Task</a>
     *                    resource associated with the new Field resource
     * @param fieldType The Field Type of this field
     * @param uniqueName An application-defined string that uniquely identifies the
     *                   new resource
     * @return FieldCreator capable of executing the create
     */
    public static FieldCreator creator(final String pathAssistantSid,
                                       final String pathTaskSid,
                                       final String fieldType,
                                       final String uniqueName) {
        return new FieldCreator(pathAssistantSid, pathTaskSid, fieldType, uniqueName);
    }

    /**
     * Create a FieldDeleter to execute delete.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         Task associated with the resources to delete
     * @param pathTaskSid The SID of the
     *                    <a href="https://www.twilio.com/docs/autopilot/api/task">Task</a>
     *                    resource associated with the Field resource to delete
     * @param pathSid The unique string that identifies the resource
     * @return FieldDeleter capable of executing the delete
     */
    public static FieldDeleter deleter(final String pathAssistantSid,
                                       final String pathTaskSid,
                                       final String pathSid) {
        return new FieldDeleter(pathAssistantSid, pathTaskSid, pathSid);
    }

    /**
     * Converts a JSON String into a Field object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Field object represented by the provided JSON
     */
    public static Field fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Field.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Field object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Field object represented by the provided JSON
     */
    public static Field fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Field.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String fieldType;
    private final String taskSid;
    private final String assistantSid;
    private final String sid;
    private final String uniqueName;
    private final URI url;

    @JsonCreator
    private Field(@JsonProperty("account_sid")
                  final String accountSid,
                  @JsonProperty("date_created")
                  final String dateCreated,
                  @JsonProperty("date_updated")
                  final String dateUpdated,
                  @JsonProperty("field_type")
                  final String fieldType,
                  @JsonProperty("task_sid")
                  final String taskSid,
                  @JsonProperty("assistant_sid")
                  final String assistantSid,
                  @JsonProperty("sid")
                  final String sid,
                  @JsonProperty("unique_name")
                  final String uniqueName,
                  @JsonProperty("url")
                  final URI url) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.fieldType = fieldType;
        this.taskSid = taskSid;
        this.assistantSid = assistantSid;
        this.sid = sid;
        this.uniqueName = uniqueName;
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
     * Returns The Field Type of the field.
     *
     * @return The Field Type of the field
     */
    public final String getFieldType() {
        return this.fieldType;
    }

    /**
     * Returns The SID of the <a
     * href="https://www.twilio.com/docs/autopilot/api/task">Task</a> resource
     * associated with this Field.
     *
     * @return The SID of the <a
     *         href="https://www.twilio.com/docs/autopilot/api/task">Task</a>
     *         resource associated with this Field
     */
    public final String getTaskSid() {
        return this.taskSid;
    }

    /**
     * Returns The SID of the Assistant that is the parent of the Task associated
     * with the resource.
     *
     * @return The SID of the Assistant that is the parent of the Task associated
     *         with the resource
     */
    public final String getAssistantSid() {
        return this.assistantSid;
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
     * Returns An application-defined string that uniquely identifies the resource.
     *
     * @return An application-defined string that uniquely identifies the resource
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The absolute URL of the Field resource.
     *
     * @return The absolute URL of the Field resource
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

        Field other = (Field) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(fieldType, other.fieldType) &&
               Objects.equals(taskSid, other.taskSid) &&
               Objects.equals(assistantSid, other.assistantSid) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(uniqueName, other.uniqueName) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            fieldType,
                            taskSid,
                            assistantSid,
                            sid,
                            uniqueName,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("fieldType", fieldType)
                          .add("taskSid", taskSid)
                          .add("assistantSid", assistantSid)
                          .add("sid", sid)
                          .add("uniqueName", uniqueName)
                          .add("url", url)
                          .toString();
    }
}