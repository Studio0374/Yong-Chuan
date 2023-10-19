/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Events
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.events.v1;

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

import java.util.Map;
import java.util.Objects;

import lombok.ToString;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Sink extends Resource {
    private static final long serialVersionUID = 81524362005938L;

    

    public static SinkCreator creator(final String description, final Map<String, Object> sinkConfiguration, final Sink.SinkType sinkType){
        return new SinkCreator(description, sinkConfiguration, sinkType);
    }

    public static SinkDeleter deleter(final String pathSid){
        return new SinkDeleter(pathSid);
    }

    public static SinkFetcher fetcher(final String pathSid){
        return new SinkFetcher(pathSid);
    }

    public static SinkReader reader(){
        return new SinkReader();
    }

    public static SinkUpdater updater(final String pathSid, final String description){
        return new SinkUpdater(pathSid, description);
    }

    /**
    * Converts a JSON String into a Sink object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Sink object represented by the provided JSON
    */
    public static Sink fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sink.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Sink object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Sink object represented by the provided JSON
    */
    public static Sink fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sink.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    public enum SinkType {
        KINESIS("kinesis"),
        WEBHOOK("webhook"),
        SEGMENT("segment");

        private final String value;

        private SinkType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static SinkType forValue(final String value) {
            return Promoter.enumFromString(value, SinkType.values());
        }
    }
    public enum Status {
        INITIALIZED("initialized"),
        VALIDATING("validating"),
        ACTIVE("active"),
        FAILED("failed");

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

    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String description;
    private final String sid;
    private final Map<String, Object> sinkConfiguration;
    private final Sink.SinkType sinkType;
    private final Sink.Status status;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Sink(
        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("description")
        final String description,

        @JsonProperty("sid")
        final String sid,

        @JsonProperty("sink_configuration")
        final Map<String, Object> sinkConfiguration,

        @JsonProperty("sink_type")
        final Sink.SinkType sinkType,

        @JsonProperty("status")
        final Sink.Status status,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links
    ) {
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.description = description;
        this.sid = sid;
        this.sinkConfiguration = sinkConfiguration;
        this.sinkType = sinkType;
        this.status = status;
        this.url = url;
        this.links = links;
    }

        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getDescription() {
            return this.description;
        }
        public final String getSid() {
            return this.sid;
        }
        public final Map<String, Object> getSinkConfiguration() {
            return this.sinkConfiguration;
        }
        public final Sink.SinkType getSinkType() {
            return this.sinkType;
        }
        public final Sink.Status getStatus() {
            return this.status;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Sink other = (Sink) o;

        return Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(description, other.description) &&  Objects.equals(sid, other.sid) &&  Objects.equals(sinkConfiguration, other.sinkConfiguration) &&  Objects.equals(sinkType, other.sinkType) &&  Objects.equals(status, other.status) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateCreated, dateUpdated, description, sid, sinkConfiguration, sinkType, status, url, links);
    }


}

