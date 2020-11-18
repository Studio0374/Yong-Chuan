/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.insights.v1.call;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
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
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class CallSummary extends Resource {
    private static final long serialVersionUID = 88369247708461L;

    public enum CallType {
        CARRIER("carrier"),
        SIP("sip"),
        TRUNKING("trunking"),
        CLIENT("client");

        private final String value;

        private CallType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a CallType from a string.
         * @param value string value
         * @return generated CallType
         */
        @JsonCreator
        public static CallType forValue(final String value) {
            return Promoter.enumFromString(value, CallType.values());
        }
    }

    public enum CallState {
        RINGING("ringing"),
        COMPLETED("completed"),
        BUSY("busy"),
        FAIL("fail"),
        NOANSWER("noanswer"),
        CANCELED("canceled"),
        ANSWERED("answered"),
        UNDIALED("undialed");

        private final String value;

        private CallState(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a CallState from a string.
         * @param value string value
         * @return generated CallState
         */
        @JsonCreator
        public static CallState forValue(final String value) {
            return Promoter.enumFromString(value, CallState.values());
        }
    }

    public enum ProcessingState {
        COMPLETE("complete"),
        PARTIAL("partial");

        private final String value;

        private ProcessingState(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a ProcessingState from a string.
         * @param value string value
         * @return generated ProcessingState
         */
        @JsonCreator
        public static ProcessingState forValue(final String value) {
            return Promoter.enumFromString(value, ProcessingState.values());
        }
    }

    /**
     * Create a CallSummaryFetcher to execute fetch.
     *
     * @param pathCallSid The call_sid
     * @return CallSummaryFetcher capable of executing the fetch
     */
    public static CallSummaryFetcher fetcher(final String pathCallSid) {
        return new CallSummaryFetcher(pathCallSid);
    }

    /**
     * Converts a JSON String into a CallSummary object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return CallSummary object represented by the provided JSON
     */
    public static CallSummary fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, CallSummary.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a CallSummary object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return CallSummary object represented by the provided JSON
     */
    public static CallSummary fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, CallSummary.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String callSid;
    private final CallSummary.CallType callType;
    private final CallSummary.CallState callState;
    private final CallSummary.ProcessingState processingState;
    private final ZonedDateTime startTime;
    private final ZonedDateTime endTime;
    private final Integer duration;
    private final Integer connectDuration;
    private final Map<String, Object> from;
    private final Map<String, Object> to;
    private final Map<String, Object> carrierEdge;
    private final Map<String, Object> clientEdge;
    private final Map<String, Object> sdkEdge;
    private final Map<String, Object> sipEdge;
    private final List<String> tags;
    private final URI url;
    private final Map<String, Object> attributes;
    private final Map<String, Object> properties;
    private final Map<String, Object> trust;

    @JsonCreator
    private CallSummary(@JsonProperty("account_sid")
                        final String accountSid,
                        @JsonProperty("call_sid")
                        final String callSid,
                        @JsonProperty("call_type")
                        final CallSummary.CallType callType,
                        @JsonProperty("call_state")
                        final CallSummary.CallState callState,
                        @JsonProperty("processing_state")
                        final CallSummary.ProcessingState processingState,
                        @JsonProperty("start_time")
                        final String startTime,
                        @JsonProperty("end_time")
                        final String endTime,
                        @JsonProperty("duration")
                        final Integer duration,
                        @JsonProperty("connect_duration")
                        final Integer connectDuration,
                        @JsonProperty("from")
                        final Map<String, Object> from,
                        @JsonProperty("to")
                        final Map<String, Object> to,
                        @JsonProperty("carrier_edge")
                        final Map<String, Object> carrierEdge,
                        @JsonProperty("client_edge")
                        final Map<String, Object> clientEdge,
                        @JsonProperty("sdk_edge")
                        final Map<String, Object> sdkEdge,
                        @JsonProperty("sip_edge")
                        final Map<String, Object> sipEdge,
                        @JsonProperty("tags")
                        final List<String> tags,
                        @JsonProperty("url")
                        final URI url,
                        @JsonProperty("attributes")
                        final Map<String, Object> attributes,
                        @JsonProperty("properties")
                        final Map<String, Object> properties,
                        @JsonProperty("trust")
                        final Map<String, Object> trust) {
        this.accountSid = accountSid;
        this.callSid = callSid;
        this.callType = callType;
        this.callState = callState;
        this.processingState = processingState;
        this.startTime = DateConverter.iso8601DateTimeFromString(startTime);
        this.endTime = DateConverter.iso8601DateTimeFromString(endTime);
        this.duration = duration;
        this.connectDuration = connectDuration;
        this.from = from;
        this.to = to;
        this.carrierEdge = carrierEdge;
        this.clientEdge = clientEdge;
        this.sdkEdge = sdkEdge;
        this.sipEdge = sipEdge;
        this.tags = tags;
        this.url = url;
        this.attributes = attributes;
        this.properties = properties;
        this.trust = trust;
    }

    /**
     * Returns The account_sid.
     *
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The call_sid.
     *
     * @return The call_sid
     */
    public final String getCallSid() {
        return this.callSid;
    }

    /**
     * Returns The call_type.
     *
     * @return The call_type
     */
    public final CallSummary.CallType getCallType() {
        return this.callType;
    }

    /**
     * Returns The call_state.
     *
     * @return The call_state
     */
    public final CallSummary.CallState getCallState() {
        return this.callState;
    }

    /**
     * Returns The processing_state.
     *
     * @return The processing_state
     */
    public final CallSummary.ProcessingState getProcessingState() {
        return this.processingState;
    }

    /**
     * Returns The start_time.
     *
     * @return The start_time
     */
    public final ZonedDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Returns The end_time.
     *
     * @return The end_time
     */
    public final ZonedDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Returns The duration.
     *
     * @return The duration
     */
    public final Integer getDuration() {
        return this.duration;
    }

    /**
     * Returns The connect_duration.
     *
     * @return The connect_duration
     */
    public final Integer getConnectDuration() {
        return this.connectDuration;
    }

    /**
     * Returns The from.
     *
     * @return The from
     */
    public final Map<String, Object> getFrom() {
        return this.from;
    }

    /**
     * Returns The to.
     *
     * @return The to
     */
    public final Map<String, Object> getTo() {
        return this.to;
    }

    /**
     * Returns The carrier_edge.
     *
     * @return The carrier_edge
     */
    public final Map<String, Object> getCarrierEdge() {
        return this.carrierEdge;
    }

    /**
     * Returns The client_edge.
     *
     * @return The client_edge
     */
    public final Map<String, Object> getClientEdge() {
        return this.clientEdge;
    }

    /**
     * Returns The sdk_edge.
     *
     * @return The sdk_edge
     */
    public final Map<String, Object> getSdkEdge() {
        return this.sdkEdge;
    }

    /**
     * Returns The sip_edge.
     *
     * @return The sip_edge
     */
    public final Map<String, Object> getSipEdge() {
        return this.sipEdge;
    }

    /**
     * Returns The tags.
     *
     * @return The tags
     */
    public final List<String> getTags() {
        return this.tags;
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
     * Returns The attributes.
     *
     * @return The attributes
     */
    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    /**
     * Returns The properties.
     *
     * @return The properties
     */
    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    /**
     * Returns The trust.
     *
     * @return The trust
     */
    public final Map<String, Object> getTrust() {
        return this.trust;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CallSummary other = (CallSummary) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(callSid, other.callSid) &&
               Objects.equals(callType, other.callType) &&
               Objects.equals(callState, other.callState) &&
               Objects.equals(processingState, other.processingState) &&
               Objects.equals(startTime, other.startTime) &&
               Objects.equals(endTime, other.endTime) &&
               Objects.equals(duration, other.duration) &&
               Objects.equals(connectDuration, other.connectDuration) &&
               Objects.equals(from, other.from) &&
               Objects.equals(to, other.to) &&
               Objects.equals(carrierEdge, other.carrierEdge) &&
               Objects.equals(clientEdge, other.clientEdge) &&
               Objects.equals(sdkEdge, other.sdkEdge) &&
               Objects.equals(sipEdge, other.sipEdge) &&
               Objects.equals(tags, other.tags) &&
               Objects.equals(url, other.url) &&
               Objects.equals(attributes, other.attributes) &&
               Objects.equals(properties, other.properties) &&
               Objects.equals(trust, other.trust);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            callSid,
                            callType,
                            callState,
                            processingState,
                            startTime,
                            endTime,
                            duration,
                            connectDuration,
                            from,
                            to,
                            carrierEdge,
                            clientEdge,
                            sdkEdge,
                            sipEdge,
                            tags,
                            url,
                            attributes,
                            properties,
                            trust);
    }
}