/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.supersim.v1.sim;

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
import java.io.IOException;
import java.io.InputStream;
import java.time.ZonedDateTime;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BillingPeriod extends Resource {
    private static final long serialVersionUID = 174789131937976L;

  public String toString() {
    return "BillingPeriod(sid=" + this.getSid() + ", accountSid=" + this.getAccountSid() + ", simSid=" + this.getSimSid() + ", startTime=" + this.getStartTime() + ", endTime=" + this.getEndTime() + ", periodType=" + this.getPeriodType() + ", dateCreated=" + this.getDateCreated() + ", dateUpdated=" + this.getDateUpdated() + ")";
  }

  public enum BpType {
        READY("ready"),
        ACTIVE("active");

        private final String value;

        private BpType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a BpType from a string.
         * @param value string value
         * @return generated BpType
         */
        @JsonCreator
        public static BpType forValue(final String value) {
            return Promoter.enumFromString(value, BpType.values());
        }
    }

    /**
     * Create a BillingPeriodReader to execute read.
     *
     * @param pathSimSid The SID of the Super SIM to list Billing Periods for.
     * @return BillingPeriodReader capable of executing the read
     */
    public static BillingPeriodReader reader(final String pathSimSid) {
        return new BillingPeriodReader(pathSimSid);
    }

    /**
     * Converts a JSON String into a BillingPeriod object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return BillingPeriod object represented by the provided JSON
     */
    public static BillingPeriod fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BillingPeriod.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a BillingPeriod object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return BillingPeriod object represented by the provided JSON
     */
    public static BillingPeriod fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BillingPeriod.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String simSid;
    private final ZonedDateTime startTime;
    private final ZonedDateTime endTime;
    private final BillingPeriod.BpType periodType;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;

    @JsonCreator
    private BillingPeriod(@JsonProperty("sid")
                          final String sid,
                          @JsonProperty("account_sid")
                          final String accountSid,
                          @JsonProperty("sim_sid")
                          final String simSid,
                          @JsonProperty("start_time")
                          final String startTime,
                          @JsonProperty("end_time")
                          final String endTime,
                          @JsonProperty("period_type")
                          final BillingPeriod.BpType periodType,
                          @JsonProperty("date_created")
                          final String dateCreated,
                          @JsonProperty("date_updated")
                          final String dateUpdated) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.simSid = simSid;
        this.startTime = DateConverter.iso8601DateTimeFromString(startTime);
        this.endTime = DateConverter.iso8601DateTimeFromString(endTime);
        this.periodType = periodType;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
    }

    /**
     * Returns The SID of the Billing Period.
     *
     * @return The SID of the Billing Period
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The SID of the Account the Super SIM belongs to.
     *
     * @return The SID of the Account the Super SIM belongs to
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The SID of the Super SIM the Billing Period belongs to.
     *
     * @return The SID of the Super SIM the Billing Period belongs to
     */
    public final String getSimSid() {
        return this.simSid;
    }

    /**
     * Returns The start time of the Billing Period.
     *
     * @return The start time of the Billing Period
     */
    public final ZonedDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Returns The end time of the Billing Period.
     *
     * @return The end time of the Billing Period
     */
    public final ZonedDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Returns The type of the Billing Period.
     *
     * @return The type of the Billing Period
     */
    public final BillingPeriod.BpType getPeriodType() {
        return this.periodType;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was created.
     *
     * @return The ISO 8601 date and time in GMT when the resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was last updated.
     *
     * @return The ISO 8601 date and time in GMT when the resource was last updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BillingPeriod other = (BillingPeriod) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(simSid, other.simSid) &&
               Objects.equals(startTime, other.startTime) &&
               Objects.equals(endTime, other.endTime) &&
               Objects.equals(periodType, other.periodType) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            simSid,
                            startTime,
                            endTime,
                            periodType,
                            dateCreated,
                            dateUpdated);
    }
}
