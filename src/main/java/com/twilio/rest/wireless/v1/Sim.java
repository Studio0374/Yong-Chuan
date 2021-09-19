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
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.http.HttpMethod;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sim extends Resource {
    private static final long serialVersionUID = 225971057340770L;

  public String toString() {
    return "Sim(sid=" + this.getSid() + ", uniqueName=" + this.getUniqueName() + ", accountSid=" + this.getAccountSid() + ", ratePlanSid=" + this.getRatePlanSid() + ", friendlyName=" + this.getFriendlyName() + ", iccid=" + this.getIccid() + ", eId=" + this.getEId() + ", status=" + this.getStatus() + ", resetStatus=" + this.getResetStatus() + ", commandsCallbackUrl=" + this.getCommandsCallbackUrl() + ", commandsCallbackMethod=" + this.getCommandsCallbackMethod() + ", smsFallbackMethod=" + this.getSmsFallbackMethod() + ", smsFallbackUrl=" + this.getSmsFallbackUrl() + ", smsMethod=" + this.getSmsMethod() + ", smsUrl=" + this.getSmsUrl() + ", voiceFallbackMethod=" + this.getVoiceFallbackMethod() + ", voiceFallbackUrl=" + this.getVoiceFallbackUrl() + ", voiceMethod=" + this.getVoiceMethod() + ", voiceUrl=" + this.getVoiceUrl() + ", dateCreated=" + this.getDateCreated() + ", dateUpdated=" + this.getDateUpdated() + ", url=" + this.getUrl() + ", links=" + this.getLinks() + ", ipAddress="
        + this.getIpAddress() + ")";
  }

  public enum Status {
        NEW("new"),
        READY("ready"),
        ACTIVE("active"),
        SUSPENDED("suspended"),
        DEACTIVATED("deactivated"),
        CANCELED("canceled"),
        SCHEDULED("scheduled"),
        UPDATING("updating");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Status from a string.
         * @param value string value
         * @return generated Status
         */
        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    public enum ResetStatus {
        RESETTING("resetting");

        private final String value;

        private ResetStatus(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a ResetStatus from a string.
         * @param value string value
         * @return generated ResetStatus
         */
        @JsonCreator
        public static ResetStatus forValue(final String value) {
            return Promoter.enumFromString(value, ResetStatus.values());
        }
    }

    /**
     * Create a SimFetcher to execute fetch.
     *
     * @param pathSid The SID of the Sim resource to fetch
     * @return SimFetcher capable of executing the fetch
     */
    public static SimFetcher fetcher(final String pathSid) {
        return new SimFetcher(pathSid);
    }

    /**
     * Create a SimReader to execute read.
     *
     * @return SimReader capable of executing the read
     */
    public static SimReader reader() {
        return new SimReader();
    }

    /**
     * Create a SimUpdater to execute update.
     *
     * @param pathSid The SID of the Sim resource to update
     * @return SimUpdater capable of executing the update
     */
    public static SimUpdater updater(final String pathSid) {
        return new SimUpdater(pathSid);
    }

    /**
     * Create a SimDeleter to execute delete.
     *
     * @param pathSid The SID of the Sim Resource to delete
     * @return SimDeleter capable of executing the delete
     */
    public static SimDeleter deleter(final String pathSid) {
        return new SimDeleter(pathSid);
    }

    /**
     * Converts a JSON String into a Sim object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Sim object represented by the provided JSON
     */
    public static Sim fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sim.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Sim object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Sim object represented by the provided JSON
     */
    public static Sim fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sim.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String uniqueName;
    private final String accountSid;
    private final String ratePlanSid;
    private final String friendlyName;
    private final String iccid;
    private final String eId;
    private final Sim.Status status;
    private final Sim.ResetStatus resetStatus;
    private final URI commandsCallbackUrl;
    private final HttpMethod commandsCallbackMethod;
    private final HttpMethod smsFallbackMethod;
    private final URI smsFallbackUrl;
    private final HttpMethod smsMethod;
    private final URI smsUrl;
    private final HttpMethod voiceFallbackMethod;
    private final URI voiceFallbackUrl;
    private final HttpMethod voiceMethod;
    private final URI voiceUrl;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;
    private final Map<String, String> links;
    private final String ipAddress;

    @JsonCreator
    private Sim(@JsonProperty("sid")
                final String sid,
                @JsonProperty("unique_name")
                final String uniqueName,
                @JsonProperty("account_sid")
                final String accountSid,
                @JsonProperty("rate_plan_sid")
                final String ratePlanSid,
                @JsonProperty("friendly_name")
                final String friendlyName,
                @JsonProperty("iccid")
                final String iccid,
                @JsonProperty("e_id")
                final String eId,
                @JsonProperty("status")
                final Sim.Status status,
                @JsonProperty("reset_status")
                final Sim.ResetStatus resetStatus,
                @JsonProperty("commands_callback_url")
                final URI commandsCallbackUrl,
                @JsonProperty("commands_callback_method")
                final HttpMethod commandsCallbackMethod,
                @JsonProperty("sms_fallback_method")
                final HttpMethod smsFallbackMethod,
                @JsonProperty("sms_fallback_url")
                final URI smsFallbackUrl,
                @JsonProperty("sms_method")
                final HttpMethod smsMethod,
                @JsonProperty("sms_url")
                final URI smsUrl,
                @JsonProperty("voice_fallback_method")
                final HttpMethod voiceFallbackMethod,
                @JsonProperty("voice_fallback_url")
                final URI voiceFallbackUrl,
                @JsonProperty("voice_method")
                final HttpMethod voiceMethod,
                @JsonProperty("voice_url")
                final URI voiceUrl,
                @JsonProperty("date_created")
                final String dateCreated,
                @JsonProperty("date_updated")
                final String dateUpdated,
                @JsonProperty("url")
                final URI url,
                @JsonProperty("links")
                final Map<String, String> links,
                @JsonProperty("ip_address")
                final String ipAddress) {
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.accountSid = accountSid;
        this.ratePlanSid = ratePlanSid;
        this.friendlyName = friendlyName;
        this.iccid = iccid;
        this.eId = eId;
        this.status = status;
        this.resetStatus = resetStatus;
        this.commandsCallbackUrl = commandsCallbackUrl;
        this.commandsCallbackMethod = commandsCallbackMethod;
        this.smsFallbackMethod = smsFallbackMethod;
        this.smsFallbackUrl = smsFallbackUrl;
        this.smsMethod = smsMethod;
        this.smsUrl = smsUrl;
        this.voiceFallbackMethod = voiceFallbackMethod;
        this.voiceFallbackUrl = voiceFallbackUrl;
        this.voiceMethod = voiceMethod;
        this.voiceUrl = voiceUrl;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.links = links;
        this.ipAddress = ipAddress;
    }

    /**
     * Returns The unique string that identifies the Sim resource.
     *
     * @return The unique string that identifies the Sim resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns An application-defined string that uniquely identifies the resource.
     *
     * @return An application-defined string that uniquely identifies the resource
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The SID of the Account to which the Sim resource belongs.
     *
     * @return The SID of the Account to which the Sim resource belongs
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The SID of the RatePlan resource to which the Sim resource is
     * assigned..
     *
     * @return The SID of the RatePlan resource to which the Sim resource is
     *         assigned.
     */
    public final String getRatePlanSid() {
        return this.ratePlanSid;
    }

    /**
     * Returns The string that you assigned to describe the Sim resource.
     *
     * @return The string that you assigned to describe the Sim resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The ICCID associated with the SIM.
     *
     * @return The ICCID associated with the SIM
     */
    public final String getIccid() {
        return this.iccid;
    }

    /**
     * Returns Deprecated.
     *
     * @return Deprecated
     */
    public final String getEId() {
        return this.eId;
    }

    /**
     * Returns The status of the Sim resource.
     *
     * @return The status of the Sim resource
     */
    public final Sim.Status getStatus() {
        return this.status;
    }

    /**
     * Returns The connectivity reset status of the SIM.
     *
     * @return The connectivity reset status of the SIM
     */
    public final Sim.ResetStatus getResetStatus() {
        return this.resetStatus;
    }

    /**
     * Returns The URL we call when the SIM originates a machine-to-machine Command.
     *
     * @return The URL we call when the SIM originates a machine-to-machine Command
     */
    public final URI getCommandsCallbackUrl() {
        return this.commandsCallbackUrl;
    }

    /**
     * Returns The HTTP method we use to call commands_callback_url.
     *
     * @return The HTTP method we use to call commands_callback_url
     */
    public final HttpMethod getCommandsCallbackMethod() {
        return this.commandsCallbackMethod;
    }

    /**
     * Returns The HTTP method we use to call sms_fallback_url.
     *
     * @return The HTTP method we use to call sms_fallback_url
     */
    public final HttpMethod getSmsFallbackMethod() {
        return this.smsFallbackMethod;
    }

    /**
     * Returns The URL we call when an error occurs while retrieving or executing
     * the TwiML requested from the sms_url.
     *
     * @return The URL we call when an error occurs while retrieving or executing
     *         the TwiML requested from the sms_url
     */
    public final URI getSmsFallbackUrl() {
        return this.smsFallbackUrl;
    }

    /**
     * Returns The HTTP method we use to call sms_url.
     *
     * @return The HTTP method we use to call sms_url
     */
    public final HttpMethod getSmsMethod() {
        return this.smsMethod;
    }

    /**
     * Returns The URL we call when the SIM-connected device sends an SMS message
     * that is not a Command.
     *
     * @return The URL we call when the SIM-connected device sends an SMS message
     *         that is not a Command
     */
    public final URI getSmsUrl() {
        return this.smsUrl;
    }

    /**
     * Returns The HTTP method we use to call voice_fallback_url.
     *
     * @return The HTTP method we use to call voice_fallback_url
     */
    public final HttpMethod getVoiceFallbackMethod() {
        return this.voiceFallbackMethod;
    }

    /**
     * Returns The URL we call when an error occurs while retrieving or executing
     * the TwiML requested from voice_url.
     *
     * @return The URL we call when an error occurs while retrieving or executing
     *         the TwiML requested from voice_url
     */
    public final URI getVoiceFallbackUrl() {
        return this.voiceFallbackUrl;
    }

    /**
     * Returns The HTTP method we use to call voice_url.
     *
     * @return The HTTP method we use to call voice_url
     */
    public final HttpMethod getVoiceMethod() {
        return this.voiceMethod;
    }

    /**
     * Returns The URL we call when the SIM-connected device makes a voice call.
     *
     * @return The URL we call when the SIM-connected device makes a voice call
     */
    public final URI getVoiceUrl() {
        return this.voiceUrl;
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
     * Returns The ISO 8601 date and time in GMT when the Sim resource was last
     * updated.
     *
     * @return The ISO 8601 date and time in GMT when the Sim resource was last
     *         updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The absolute URL of the resource.
     *
     * @return The absolute URL of the resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The URLs of related subresources.
     *
     * @return The URLs of related subresources
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    /**
     * Returns Deprecated.
     *
     * @return Deprecated
     */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Sim other = (Sim) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(uniqueName, other.uniqueName) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(ratePlanSid, other.ratePlanSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(iccid, other.iccid) &&
               Objects.equals(eId, other.eId) &&
               Objects.equals(status, other.status) &&
               Objects.equals(resetStatus, other.resetStatus) &&
               Objects.equals(commandsCallbackUrl, other.commandsCallbackUrl) &&
               Objects.equals(commandsCallbackMethod, other.commandsCallbackMethod) &&
               Objects.equals(smsFallbackMethod, other.smsFallbackMethod) &&
               Objects.equals(smsFallbackUrl, other.smsFallbackUrl) &&
               Objects.equals(smsMethod, other.smsMethod) &&
               Objects.equals(smsUrl, other.smsUrl) &&
               Objects.equals(voiceFallbackMethod, other.voiceFallbackMethod) &&
               Objects.equals(voiceFallbackUrl, other.voiceFallbackUrl) &&
               Objects.equals(voiceMethod, other.voiceMethod) &&
               Objects.equals(voiceUrl, other.voiceUrl) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links) &&
               Objects.equals(ipAddress, other.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            uniqueName,
                            accountSid,
                            ratePlanSid,
                            friendlyName,
                            iccid,
                            eId,
                            status,
                            resetStatus,
                            commandsCallbackUrl,
                            commandsCallbackMethod,
                            smsFallbackMethod,
                            smsFallbackUrl,
                            smsMethod,
                            smsUrl,
                            voiceFallbackMethod,
                            voiceFallbackUrl,
                            voiceMethod,
                            voiceUrl,
                            dateCreated,
                            dateUpdated,
                            url,
                            links,
                            ipAddress);
    }
}
