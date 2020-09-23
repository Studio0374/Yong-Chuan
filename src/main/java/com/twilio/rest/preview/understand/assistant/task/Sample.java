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
public class Sample extends Resource {
    private static final long serialVersionUID = 250546054765914L;

    /**
     * Create a SampleFetcher to execute fetch.
     *
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathTaskSid The unique ID of the Task associated with this Sample.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     * @return SampleFetcher capable of executing the fetch
     */
    public static SampleFetcher fetcher(final String pathAssistantSid,
                                        final String pathTaskSid,
                                        final String pathSid) {
        return new SampleFetcher(pathAssistantSid, pathTaskSid, pathSid);
    }

    /**
     * Create a SampleReader to execute read.
     *
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathTaskSid The unique ID of the Task associated with this Sample.
     * @return SampleReader capable of executing the read
     */
    public static SampleReader reader(final String pathAssistantSid,
                                      final String pathTaskSid) {
        return new SampleReader(pathAssistantSid, pathTaskSid);
    }

    /**
     * Create a SampleCreator to execute create.
     *
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathTaskSid The unique ID of the Task associated with this Sample.
     * @param language An ISO language-country string of the sample.
     * @param taggedText The text example of how end-users may express this task.
     *                   The sample may contain Field tag blocks.
     * @return SampleCreator capable of executing the create
     */
    public static SampleCreator creator(final String pathAssistantSid,
                                        final String pathTaskSid,
                                        final String language,
                                        final String taggedText) {
        return new SampleCreator(pathAssistantSid, pathTaskSid, language, taggedText);
    }

    /**
     * Create a SampleUpdater to execute update.
     *
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathTaskSid The unique ID of the Task associated with this Sample.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     * @return SampleUpdater capable of executing the update
     */
    public static SampleUpdater updater(final String pathAssistantSid,
                                        final String pathTaskSid,
                                        final String pathSid) {
        return new SampleUpdater(pathAssistantSid, pathTaskSid, pathSid);
    }

    /**
     * Create a SampleDeleter to execute delete.
     *
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathTaskSid The unique ID of the Task associated with this Sample.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     * @return SampleDeleter capable of executing the delete
     */
    public static SampleDeleter deleter(final String pathAssistantSid,
                                        final String pathTaskSid,
                                        final String pathSid) {
        return new SampleDeleter(pathAssistantSid, pathTaskSid, pathSid);
    }

    /**
     * Converts a JSON String into a Sample object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Sample object represented by the provided JSON
     */
    public static Sample fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sample.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Sample object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Sample object represented by the provided JSON
     */
    public static Sample fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sample.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String taskSid;
    private final String language;
    private final String assistantSid;
    private final String sid;
    private final String taggedText;
    private final URI url;
    private final String sourceChannel;

    @JsonCreator
    private Sample(@JsonProperty("account_sid")
                   final String accountSid,
                   @JsonProperty("date_created")
                   final String dateCreated,
                   @JsonProperty("date_updated")
                   final String dateUpdated,
                   @JsonProperty("task_sid")
                   final String taskSid,
                   @JsonProperty("language")
                   final String language,
                   @JsonProperty("assistant_sid")
                   final String assistantSid,
                   @JsonProperty("sid")
                   final String sid,
                   @JsonProperty("tagged_text")
                   final String taggedText,
                   @JsonProperty("url")
                   final URI url,
                   @JsonProperty("source_channel")
                   final String sourceChannel) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.taskSid = taskSid;
        this.language = language;
        this.assistantSid = assistantSid;
        this.sid = sid;
        this.taggedText = taggedText;
        this.url = url;
        this.sourceChannel = sourceChannel;
    }

    /**
     * Returns The unique ID of the Account that created this Sample..
     *
     * @return The unique ID of the Account that created this Sample.
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
     * Returns The unique ID of the Task associated with this Sample..
     *
     * @return The unique ID of the Task associated with this Sample.
     */
    public final String getTaskSid() {
        return this.taskSid;
    }

    /**
     * Returns An ISO language-country string of the sample..
     *
     * @return An ISO language-country string of the sample.
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
     * Returns The text example of how end-users may express this task. The sample
     * may contain Field tag blocks..
     *
     * @return The text example of how end-users may express this task. The sample
     *         may contain Field tag blocks.
     */
    public final String getTaggedText() {
        return this.taggedText;
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
     * Returns The communication channel the sample was captured. It can be: voice,
     * sms, chat, alexa, google-assistant, or slack. If not included the value will
     * be null.
     *
     * @return The communication channel the sample was captured. It can be: voice,
     *         sms, chat, alexa, google-assistant, or slack. If not included the
     *         value will be null
     */
    public final String getSourceChannel() {
        return this.sourceChannel;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Sample other = (Sample) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(taskSid, other.taskSid) &&
               Objects.equals(language, other.language) &&
               Objects.equals(assistantSid, other.assistantSid) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(taggedText, other.taggedText) &&
               Objects.equals(url, other.url) &&
               Objects.equals(sourceChannel, other.sourceChannel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            taskSid,
                            language,
                            assistantSid,
                            sid,
                            taggedText,
                            url,
                            sourceChannel);
    }
}
