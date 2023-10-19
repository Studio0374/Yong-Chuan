/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account.message;

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
import java.time.ZonedDateTime;

import java.util.Objects;

import lombok.ToString;


@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Feedback extends Resource {
    private static final long serialVersionUID = 229414222116486L;

    

    public static FeedbackCreator creator(final String pathMessageSid){
        return new FeedbackCreator(pathMessageSid);
    }
    public static FeedbackCreator creator(final String pathAccountSid, final String pathMessageSid){
        return new FeedbackCreator(pathAccountSid, pathMessageSid);
    }

    /**
    * Converts a JSON String into a Feedback object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Feedback object represented by the provided JSON
    */
    public static Feedback fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Feedback.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Feedback object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Feedback object represented by the provided JSON
    */
    public static Feedback fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Feedback.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    public enum Outcome {
        CONFIRMED("confirmed"),
        UNCONFIRMED("unconfirmed");

        private final String value;

        private Outcome(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Outcome forValue(final String value) {
            return Promoter.enumFromString(value, Outcome.values());
        }
    }

    private final String accountSid;
    private final String messageSid;
    private final Feedback.Outcome outcome;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String uri;

    @JsonCreator
    private Feedback(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("message_sid")
        final String messageSid,

        @JsonProperty("outcome")
        final Feedback.Outcome outcome,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("uri")
        final String uri
    ) {
        this.accountSid = accountSid;
        this.messageSid = messageSid;
        this.outcome = outcome;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.uri = uri;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getMessageSid() {
            return this.messageSid;
        }
        public final Feedback.Outcome getOutcome() {
            return this.outcome;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getUri() {
            return this.uri;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Feedback other = (Feedback) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(messageSid, other.messageSid) &&  Objects.equals(outcome, other.outcome) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(uri, other.uri)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, messageSid, outcome, dateCreated, dateUpdated, uri);
    }


}

