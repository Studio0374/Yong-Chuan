/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.understand.assistant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
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
public class Query extends Resource {
    private static final long serialVersionUID = 54679602157752L;

    /**
     * Create a QueryFetcher to execute fetch.
     *
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     * @return QueryFetcher capable of executing the fetch
     */
    public static QueryFetcher fetcher(final String pathAssistantSid,
                                       final String pathSid) {
        return new QueryFetcher(pathAssistantSid, pathSid);
    }

    /**
     * Create a QueryReader to execute read.
     *
     * @param pathAssistantSid The unique ID of the parent Assistant.
     * @return QueryReader capable of executing the read
     */
    public static QueryReader reader(final String pathAssistantSid) {
        return new QueryReader(pathAssistantSid);
    }

    /**
     * Create a QueryCreator to execute create.
     *
     * @param pathAssistantSid The unique ID of the parent Assistant.
     * @param language An ISO language-country string of the sample.
     * @param query A user-provided string that uniquely identifies this resource
     *              as an alternative to the sid. It can be up to 2048 characters
     *              long.
     * @return QueryCreator capable of executing the create
     */
    public static QueryCreator creator(final String pathAssistantSid,
                                       final String language,
                                       final String query) {
        return new QueryCreator(pathAssistantSid, language, query);
    }

    /**
     * Create a QueryUpdater to execute update.
     *
     * @param pathAssistantSid The unique ID of the parent Assistant.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     * @return QueryUpdater capable of executing the update
     */
    public static QueryUpdater updater(final String pathAssistantSid,
                                       final String pathSid) {
        return new QueryUpdater(pathAssistantSid, pathSid);
    }

    /**
     * Create a QueryDeleter to execute delete.
     *
     * @param pathAssistantSid The unique ID of the Assistant.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     * @return QueryDeleter capable of executing the delete
     */
    public static QueryDeleter deleter(final String pathAssistantSid,
                                       final String pathSid) {
        return new QueryDeleter(pathAssistantSid, pathSid);
    }

    /**
     * Converts a JSON String into a Query object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Query object represented by the provided JSON
     */
    public static Query fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Query.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Query object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Query object represented by the provided JSON
     */
    public static Query fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Query.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final Map<String, Object> results;
    private final String language;
    private final String modelBuildSid;
    private final String query;
    private final String sampleSid;
    private final String assistantSid;
    private final String sid;
    private final String status;
    private final URI url;
    private final String sourceChannel;

    @JsonCreator
    private Query(@JsonProperty("account_sid")
                  final String accountSid,
                  @JsonProperty("date_created")
                  final String dateCreated,
                  @JsonProperty("date_updated")
                  final String dateUpdated,
                  @JsonProperty("results")
                  final Map<String, Object> results,
                  @JsonProperty("language")
                  final String language,
                  @JsonProperty("model_build_sid")
                  final String modelBuildSid,
                  @JsonProperty("query")
                  final String query,
                  @JsonProperty("sample_sid")
                  final String sampleSid,
                  @JsonProperty("assistant_sid")
                  final String assistantSid,
                  @JsonProperty("sid")
                  final String sid,
                  @JsonProperty("status")
                  final String status,
                  @JsonProperty("url")
                  final URI url,
                  @JsonProperty("source_channel")
                  final String sourceChannel) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.results = results;
        this.language = language;
        this.modelBuildSid = modelBuildSid;
        this.query = query;
        this.sampleSid = sampleSid;
        this.assistantSid = assistantSid;
        this.sid = sid;
        this.status = status;
        this.url = url;
        this.sourceChannel = sourceChannel;
    }

    /**
     * Returns The unique ID of the Account that created this Query..
     *
     * @return The unique ID of the Account that created this Query.
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
     * Returns The natural language analysis results which include the Task
     * recognized, the confidence score and a list of identified Fields..
     *
     * @return The natural language analysis results which include the Task
     *         recognized, the confidence score and a list of identified Fields.
     */
    public final Map<String, Object> getResults() {
        return this.results;
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
     * Returns The unique ID of the Model Build queried..
     *
     * @return The unique ID of the Model Build queried.
     */
    public final String getModelBuildSid() {
        return this.modelBuildSid;
    }

    /**
     * Returns The end-user's natural language input..
     *
     * @return The end-user's natural language input.
     */
    public final String getQuery() {
        return this.query;
    }

    /**
     * Returns An optional reference to the Sample created from this query..
     *
     * @return An optional reference to the Sample created from this query.
     */
    public final String getSampleSid() {
        return this.sampleSid;
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
     * Returns A string that described the query status. The values can be:
     * pending_review, reviewed, discarded.
     *
     * @return A string that described the query status. The values can be:
     *         pending_review, reviewed, discarded
     */
    public final String getStatus() {
        return this.status;
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
     * Returns The communication channel where this end-user input came from.
     *
     * @return The communication channel where this end-user input came from
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

        Query other = (Query) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(results, other.results) &&
               Objects.equals(language, other.language) &&
               Objects.equals(modelBuildSid, other.modelBuildSid) &&
               Objects.equals(query, other.query) &&
               Objects.equals(sampleSid, other.sampleSid) &&
               Objects.equals(assistantSid, other.assistantSid) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(status, other.status) &&
               Objects.equals(url, other.url) &&
               Objects.equals(sourceChannel, other.sourceChannel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            results,
                            language,
                            modelBuildSid,
                            query,
                            sampleSid,
                            assistantSid,
                            sid,
                            status,
                            url,
                            sourceChannel);
    }
}