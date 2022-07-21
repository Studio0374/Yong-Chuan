/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Autopilot
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.autopilot.v1.assistant;

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

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class ModelBuild extends Resource {
    private static final long serialVersionUID = 226055418389205L;

    public static ModelBuildCreator creator(final String assistantSid){
        return new ModelBuildCreator(assistantSid);
    }

    public static ModelBuildFetcher fetcher(final String assistantSid, final String sid){
        return new ModelBuildFetcher(assistantSid, sid);
    }

    public static ModelBuildDeleter deleter(final String assistantSid, final String sid){
        return new ModelBuildDeleter(assistantSid, sid);
    }

    public static ModelBuildReader reader(final String assistantSid){
        return new ModelBuildReader(assistantSid);
    }

    public static ModelBuildUpdater updater(final String assistantSid, final String sid){
        return new ModelBuildUpdater(assistantSid, sid);
    }

    /**
    * Converts a JSON String into a ModelBuild object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return ModelBuild object represented by the provided JSON
    */
    public static ModelBuild fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ModelBuild.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a ModelBuild object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return ModelBuild object represented by the provided JSON
    */
    public static ModelBuild fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ModelBuild.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Status {
        ENQUEUED("enqueued"),
        BUILDING("building"),
        COMPLETED("completed"),
        FAILED("failed"),
        CANCELED("canceled");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String assistantSid;
    private final String sid;
    private final ModelBuild.Status status;
    private final String uniqueName;
    private final URI url;
    private final Integer buildDuration;
    private final Integer errorCode;

    @JsonCreator
    private ModelBuild(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("assistant_sid")
        final String assistantSid,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("status")
        final ModelBuild.Status status,

        @JsonProperty("unique_name")
        final String uniqueName,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("build_duration")
        final Integer buildDuration,

        @JsonProperty("error_code")
        final Integer errorCode
    ) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.assistantSid = assistantSid;
        this.sid = sid;
        this.status = status;
        this.uniqueName = uniqueName;
        this.url = url;
        this.buildDuration = buildDuration;
        this.errorCode = errorCode;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getAssistantSid() {
            return this.assistantSid;
        }
        public final String getSid() {
            return this.sid;
        }
        public final ModelBuild.Status getStatus() {
            return this.status;
        }
        public final String getUniqueName() {
            return this.uniqueName;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Integer getBuildDuration() {
            return this.buildDuration;
        }
        public final Integer getErrorCode() {
            return this.errorCode;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ModelBuild other = (ModelBuild) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(assistantSid, other.assistantSid) &&  Objects.equals(sid, other.sid) &&  Objects.equals(status, other.status) &&  Objects.equals(uniqueName, other.uniqueName) &&  Objects.equals(url, other.url) &&  Objects.equals(buildDuration, other.buildDuration) &&  Objects.equals(errorCode, other.errorCode)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, dateCreated, dateUpdated, assistantSid, sid, status, uniqueName, url, buildDuration, errorCode);
    }

}

