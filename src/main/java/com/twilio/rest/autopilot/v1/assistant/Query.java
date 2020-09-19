/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.autopilot.v1.assistant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
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
public class Query extends Resource {
    private static final long serialVersionUID = 161972386699881L;

    /**
     * Create a QueryFetcher to execute fetch.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         resource to fetch
     * @param pathSid The unique string that identifies the resource
     * @return QueryFetcher capable of executing the fetch
     */
    public static QueryFetcher fetcher(final String pathAssistantSid,
                                       final String pathSid) {
        return new QueryFetcher(pathAssistantSid, pathSid);
    }

    /**
     * Create a QueryReader to execute read.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         resources to read
     * @return QueryReader capable of executing the read
     */
    public static QueryReader reader(final String pathAssistantSid) {
        return new QueryReader(pathAssistantSid);
    }

    /**
     * Create a QueryCreator to execute create.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         new resource
     * @param language The ISO language-country string that specifies the language
     *                 used for the new query
     * @param query The end-user's natural language input
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
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         resource to update
     * @param pathSid The unique string that identifies the resource to update
     * @return QueryUpdater capable of executing the update
     */
    public static QueryUpdater updater(final String pathAssistantSid,
                                       final String pathSid) {
        return new QueryUpdater(pathAssistantSid, pathSid);
    }

    /**
     * Create a QueryDeleter to execute delete.
     *
     * @param pathAssistantSid The SID of the Assistant that is the parent of the
     *                         resources to delete
     * @param pathSid The unique string that identifies the resource
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
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
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
    private final String dialogueSid;

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
                  final String sourceChannel,
                  @JsonProperty("dialogue_sid")
                  final String dialogueSid) {
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
        this.dialogueSid = dialogueSid;
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
     * Returns The natural language analysis results that include the Task
     * recognized and a list of identified Fields.
     *
     * @return The natural language analysis results that include the Task
     *         recognized and a list of identified Fields
     */
    public final Map<String, Object> getResults() {
        return this.results;
    }

    /**
     * Returns The ISO language-country string that specifies the language used by
     * the Query.
     *
     * @return The ISO language-country string that specifies the language used by
     *         the Query
     */
    public final String getLanguage() {
        return this.language;
    }

    /**
     * Returns The SID of the <a
     * href="https://www.twilio.com/docs/autopilot/api/model-build">Model Build</a>
     * queried.
     *
     * @return The SID of the <a
     *         href="https://www.twilio.com/docs/autopilot/api/model-build">Model
     *         Build</a> queried
     */
    public final String getModelBuildSid() {
        return this.modelBuildSid;
    }

    /**
     * Returns The end-user's natural language input.
     *
     * @return The end-user's natural language input
     */
    public final String getQuery() {
        return this.query;
    }

    /**
     * Returns The SID of an optional reference to the Sample created from the
     * query.
     *
     * @return The SID of an optional reference to the Sample created from the query
     */
    public final String getSampleSid() {
        return this.sampleSid;
    }

    /**
     * Returns The SID of the Assistant that is the parent of the resource.
     *
     * @return The SID of the Assistant that is the parent of the resource
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
     * Returns The status of the Query.
     *
     * @return The status of the Query
     */
    public final String getStatus() {
        return this.status;
    }

    /**
     * Returns The absolute URL of the Query resource.
     *
     * @return The absolute URL of the Query resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The communication channel from where the end-user input came.
     *
     * @return The communication channel from where the end-user input came
     */
    public final String getSourceChannel() {
        return this.sourceChannel;
    }

    /**
     * Returns The SID of the <a
     * href="https://www.twilio.com/docs/autopilot/api/dialogue">Dialogue</a>..
     *
     * @return The SID of the <a
     *         href="https://www.twilio.com/docs/autopilot/api/dialogue">Dialogue</a>.
     */
    public final String getDialogueSid() {
        return this.dialogueSid;
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
               Objects.equals(sourceChannel, other.sourceChannel) &&
               Objects.equals(dialogueSid, other.dialogueSid);
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
                            sourceChannel,
                            dialogueSid);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("results", results)
                          .add("language", language)
                          .add("modelBuildSid", modelBuildSid)
                          .add("query", query)
                          .add("sampleSid", sampleSid)
                          .add("assistantSid", assistantSid)
                          .add("sid", sid)
                          .add("status", status)
                          .add("url", url)
                          .add("sourceChannel", sourceChannel)
                          .add("dialogueSid", dialogueSid)
                          .toString();
    }
}