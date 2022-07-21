/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Taskrouter
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.taskrouter.v1.workspace.worker;

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

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.List;
import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class WorkersCumulativeStatistics extends Resource {
    private static final long serialVersionUID = 68159864681377L;


    public static WorkersCumulativeStatisticsFetcher fetcher(final String workspaceSid){
        return new WorkersCumulativeStatisticsFetcher(workspaceSid);
    }




    /**
    * Converts a JSON String into a WorkersCumulativeStatistics object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return WorkersCumulativeStatistics object represented by the provided JSON
    */
    public static WorkersCumulativeStatistics fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkersCumulativeStatistics.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a WorkersCumulativeStatistics object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return WorkersCumulativeStatistics object represented by the provided JSON
    */
    public static WorkersCumulativeStatistics fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, WorkersCumulativeStatistics.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final ZonedDateTime startTime;
    private final ZonedDateTime endTime;
    private final List<Map<String, Object>> activityDurations;
    private final Integer reservationsCreated;
    private final Integer reservationsAccepted;
    private final Integer reservationsRejected;
    private final Integer reservationsTimedOut;
    private final Integer reservationsCanceled;
    private final Integer reservationsRescinded;
    private final String workspaceSid;
    private final URI url;

    @JsonCreator
    private WorkersCumulativeStatistics(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("start_time")
        final String startTime,

        @JsonProperty("end_time")
        final String endTime,

        @JsonProperty("activity_durations")
        final List<Map<String, Object>> activityDurations,

        @JsonProperty("reservations_created")
        final Integer reservationsCreated,

        @JsonProperty("reservations_accepted")
        final Integer reservationsAccepted,

        @JsonProperty("reservations_rejected")
        final Integer reservationsRejected,

        @JsonProperty("reservations_timed_out")
        final Integer reservationsTimedOut,

        @JsonProperty("reservations_canceled")
        final Integer reservationsCanceled,

        @JsonProperty("reservations_rescinded")
        final Integer reservationsRescinded,

        @JsonProperty("workspace_sid")
        final String workspaceSid,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.startTime = DateConverter.iso8601DateTimeFromString(startTime);
        this.endTime = DateConverter.iso8601DateTimeFromString(endTime);
        this.activityDurations = activityDurations;
        this.reservationsCreated = reservationsCreated;
        this.reservationsAccepted = reservationsAccepted;
        this.reservationsRejected = reservationsRejected;
        this.reservationsTimedOut = reservationsTimedOut;
        this.reservationsCanceled = reservationsCanceled;
        this.reservationsRescinded = reservationsRescinded;
        this.workspaceSid = workspaceSid;
        this.url = url;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final ZonedDateTime getStartTime() {
            return this.startTime;
        }
        public final ZonedDateTime getEndTime() {
            return this.endTime;
        }
        public final List<Map<String, Object>> getActivityDurations() {
            return this.activityDurations;
        }
        public final Integer getReservationsCreated() {
            return this.reservationsCreated;
        }
        public final Integer getReservationsAccepted() {
            return this.reservationsAccepted;
        }
        public final Integer getReservationsRejected() {
            return this.reservationsRejected;
        }
        public final Integer getReservationsTimedOut() {
            return this.reservationsTimedOut;
        }
        public final Integer getReservationsCanceled() {
            return this.reservationsCanceled;
        }
        public final Integer getReservationsRescinded() {
            return this.reservationsRescinded;
        }
        public final String getWorkspaceSid() {
            return this.workspaceSid;
        }
        public final URI getUrl() {
            return this.url;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        WorkersCumulativeStatistics other = (WorkersCumulativeStatistics) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(startTime, other.startTime) &&  Objects.equals(endTime, other.endTime) &&  Objects.equals(activityDurations, other.activityDurations) &&  Objects.equals(reservationsCreated, other.reservationsCreated) &&  Objects.equals(reservationsAccepted, other.reservationsAccepted) &&  Objects.equals(reservationsRejected, other.reservationsRejected) &&  Objects.equals(reservationsTimedOut, other.reservationsTimedOut) &&  Objects.equals(reservationsCanceled, other.reservationsCanceled) &&  Objects.equals(reservationsRescinded, other.reservationsRescinded) &&  Objects.equals(workspaceSid, other.workspaceSid) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, startTime, endTime, activityDurations, reservationsCreated, reservationsAccepted, reservationsRejected, reservationsTimedOut, reservationsCanceled, reservationsRescinded, workspaceSid, url);
    }

}

