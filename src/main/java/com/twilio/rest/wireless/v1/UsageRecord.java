/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.wireless.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsageRecord extends Resource {
    private static final long serialVersionUID = 225669332725872L;

  public String toString() {
    return "UsageRecord(accountSid=" + this.getAccountSid() + ", period=" + this.getPeriod() + ", commands=" + this.getCommands() + ", data=" + this.getData() + ")";
  }

  public enum Granularity {
        HOURLY("hourly"),
        DAILY("daily"),
        ALL("all");

        private final String value;

        private Granularity(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Granularity from a string.
         * @param value string value
         * @return generated Granularity
         */
        @JsonCreator
        public static Granularity forValue(final String value) {
            return Promoter.enumFromString(value, Granularity.values());
        }
    }

    /**
     * Create a UsageRecordReader to execute read.
     *
     * @return UsageRecordReader capable of executing the read
     */
    public static UsageRecordReader reader() {
        return new UsageRecordReader();
    }

    /**
     * Converts a JSON String into a UsageRecord object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return UsageRecord object represented by the provided JSON
     */
    public static UsageRecord fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, UsageRecord.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a UsageRecord object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return UsageRecord object represented by the provided JSON
     */
    public static UsageRecord fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, UsageRecord.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final Map<String, Object> period;
    private final Map<String, Object> commands;
    private final Map<String, Object> data;

    @JsonCreator
    private UsageRecord(@JsonProperty("account_sid")
                        final String accountSid,
                        @JsonProperty("period")
                        final Map<String, Object> period,
                        @JsonProperty("commands")
                        final Map<String, Object> commands,
                        @JsonProperty("data")
                        final Map<String, Object> data) {
        this.accountSid = accountSid;
        this.period = period;
        this.commands = commands;
        this.data = data;
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
     * Returns The time period for which usage is reported.
     *
     * @return The time period for which usage is reported
     */
    public final Map<String, Object> getPeriod() {
        return this.period;
    }

    /**
     * Returns An object that describes the aggregated Commands usage for all SIMs
     * during the specified period.
     *
     * @return An object that describes the aggregated Commands usage for all SIMs
     *         during the specified period
     */
    public final Map<String, Object> getCommands() {
        return this.commands;
    }

    /**
     * Returns An object that describes the aggregated Data usage for all SIMs over
     * the period.
     *
     * @return An object that describes the aggregated Data usage for all SIMs over
     *         the period
     */
    public final Map<String, Object> getData() {
        return this.data;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UsageRecord other = (UsageRecord) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(period, other.period) &&
               Objects.equals(commands, other.commands) &&
               Objects.equals(data, other.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            period,
                            commands,
                            data);
    }
}
