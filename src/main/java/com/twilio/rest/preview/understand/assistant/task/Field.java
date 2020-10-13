/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.understand.assistant.task;

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
public class Field extends Resource {
    private static final long serialVersionUID = 236424306351624L;

    /**
     * Create a FieldFetcher to execute fetch.
     *
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathTaskSid The unique ID of the Task associated with this Field.
     * @param pathSid A 34 character string that uniquely identifies this resource.
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
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathTaskSid The unique ID of the Task associated with this Field.
     * @return FieldReader capable of executing the read
     */
    public static FieldReader reader(final String pathAssistantSid,
                                     final String pathTaskSid) {
        return new FieldReader(pathAssistantSid, pathTaskSid);
    }

    /**
     * Create a FieldCreator to execute create.
     *
     * @param pathAssistantSid The unique ID of the parent Assistant.
     * @param pathTaskSid The unique ID of the Task associated with this Field.
     * @param fieldType The unique name or sid of the FieldType. It can be any
     *                  Built-in Field Type or the unique_name or sid of a custom
     *                  Field Type.
     * @param uniqueName A user-provided string that uniquely identifies this
     *                   resource as an alternative to the sid. Unique up to 64
     *                   characters long.
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
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathTaskSid The unique ID of the Task associated with this Field.
     * @param pathSid A 34 character string that uniquely identifies this resource.
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
     * Returns The unique ID of the Account that created this Field..
     *
     * @return The unique ID of the Account that created this Field.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The date that this resource was created.
     *
     * @return The date that this resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date that this resource was last updated.
     *
     * @return The date that this resource was last updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The Field Type of this field. It can be any Built-in Field Type or
     * unique_name or the Field Type sid of a custom Field Type..
     *
     * @return The Field Type of this field. It can be any Built-in Field Type or
     *         unique_name or the Field Type sid of a custom Field Type.
     */
    public final String getFieldType() {
        return this.fieldType;
    }

    /**
     * Returns The unique ID of the Task associated with this Field..
     *
     * @return The unique ID of the Task associated with this Field.
     */
    public final String getTaskSid() {
        return this.taskSid;
    }

    /**
     * Returns The unique ID of the parent Assistant..
     *
     * @return The unique ID of the parent Assistant.
     */
    public final String getAssistantSid() {
        return this.assistantSid;
    }

    /**
     * Returns A 34 character string that uniquely identifies this resource..
     *
     * @return A 34 character string that uniquely identifies this resource.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns A user-provided string that uniquely identifies this resource as an
     * alternative to the sid. Unique up to 64 characters long..
     *
     * @return A user-provided string that uniquely identifies this resource as an
     *         alternative to the sid. Unique up to 64 characters long.
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The url.
     *
     * @return The url
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
}