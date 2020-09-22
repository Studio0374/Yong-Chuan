/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.understand.assistant.fieldtype;

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
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class FieldValue extends Resource {
    private static final long serialVersionUID = 196387084273361L;

    /**
     * Create a FieldValueFetcher to execute fetch.
     *
     * @param pathAssistantSid The assistant_sid
     * @param pathFieldTypeSid The field_type_sid
     * @param pathSid The sid
     * @return FieldValueFetcher capable of executing the fetch
     */
    public static FieldValueFetcher fetcher(final String pathAssistantSid,
                                            final String pathFieldTypeSid,
                                            final String pathSid) {
        return new FieldValueFetcher(pathAssistantSid, pathFieldTypeSid, pathSid);
    }

    /**
     * Create a FieldValueReader to execute read.
     *
     * @param pathAssistantSid The assistant_sid
     * @param pathFieldTypeSid The field_type_sid
     * @return FieldValueReader capable of executing the read
     */
    public static FieldValueReader reader(final String pathAssistantSid,
                                          final String pathFieldTypeSid) {
        return new FieldValueReader(pathAssistantSid, pathFieldTypeSid);
    }

    /**
     * Create a FieldValueCreator to execute create.
     *
     * @param pathAssistantSid The assistant_sid
     * @param pathFieldTypeSid The field_type_sid
     * @param language An ISO language-country string of the value.
     * @param value A user-provided string that uniquely identifies this resource
     *              as an alternative to the sid. Unique up to 64 characters long.
     * @return FieldValueCreator capable of executing the create
     */
    public static FieldValueCreator creator(final String pathAssistantSid,
                                            final String pathFieldTypeSid,
                                            final String language,
                                            final String value) {
        return new FieldValueCreator(pathAssistantSid, pathFieldTypeSid, language, value);
    }

    /**
     * Create a FieldValueDeleter to execute delete.
     *
     * @param pathAssistantSid The assistant_sid
     * @param pathFieldTypeSid The field_type_sid
     * @param pathSid The sid
     * @return FieldValueDeleter capable of executing the delete
     */
    public static FieldValueDeleter deleter(final String pathAssistantSid,
                                            final String pathFieldTypeSid,
                                            final String pathSid) {
        return new FieldValueDeleter(pathAssistantSid, pathFieldTypeSid, pathSid);
    }

    /**
     * Converts a JSON String into a FieldValue object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return FieldValue object represented by the provided JSON
     */
    public static FieldValue fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FieldValue.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a FieldValue object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return FieldValue object represented by the provided JSON
     */
    public static FieldValue fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FieldValue.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String fieldTypeSid;
    private final String language;
    private final String assistantSid;
    private final String sid;
    private final String value;
    private final URI url;
    private final String synonymOf;

    @JsonCreator
    private FieldValue(@JsonProperty("account_sid")
                       final String accountSid,
                       @JsonProperty("date_created")
                       final String dateCreated,
                       @JsonProperty("date_updated")
                       final String dateUpdated,
                       @JsonProperty("field_type_sid")
                       final String fieldTypeSid,
                       @JsonProperty("language")
                       final String language,
                       @JsonProperty("assistant_sid")
                       final String assistantSid,
                       @JsonProperty("sid")
                       final String sid,
                       @JsonProperty("value")
                       final String value,
                       @JsonProperty("url")
                       final URI url,
                       @JsonProperty("synonym_of")
                       final String synonymOf) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.fieldTypeSid = fieldTypeSid;
        this.language = language;
        this.assistantSid = assistantSid;
        this.sid = sid;
        this.value = value;
        this.url = url;
        this.synonymOf = synonymOf;
    }

    /**
     * Returns The unique ID of the Account that created this Field Value..
     *
     * @return The unique ID of the Account that created this Field Value.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The date that this resource was created.
     *
     * @return The date that this resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date that this resource was last updated.
     *
     * @return The date that this resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The unique ID of the Field Type associated with this Field Value..
     *
     * @return The unique ID of the Field Type associated with this Field Value.
     */
    public final String getFieldTypeSid() {
        return this.fieldTypeSid;
    }

    /**
     * Returns An ISO language-country string of the value..
     *
     * @return An ISO language-country string of the value.
     */
    public final String getLanguage() {
        return this.language;
    }

    /**
     * Returns The unique ID of the Assistant..
     *
     * @return The unique ID of the Assistant.
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
     * Returns The Field Value itself..
     *
     * @return The Field Value itself.
     */
    public final String getValue() {
        return this.value;
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
     * Returns A value that indicates this field value is a synonym of. Empty if the
     * value is not a synonym..
     *
     * @return A value that indicates this field value is a synonym of. Empty if
     *         the value is not a synonym.
     */
    public final String getSynonymOf() {
        return this.synonymOf;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FieldValue other = (FieldValue) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(fieldTypeSid, other.fieldTypeSid) &&
               Objects.equals(language, other.language) &&
               Objects.equals(assistantSid, other.assistantSid) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(value, other.value) &&
               Objects.equals(url, other.url) &&
               Objects.equals(synonymOf, other.synonymOf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            fieldTypeSid,
                            language,
                            assistantSid,
                            sid,
                            value,
                            url,
                            synonymOf);
    }
}