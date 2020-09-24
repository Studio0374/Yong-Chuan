/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.wireless;

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
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Sim extends Resource {
    private static final long serialVersionUID = 114188106016645L;

    /**
     * Create a SimFetcher to execute fetch.
     *
     * @param pathSid The sid
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
     * @param pathSid The sid
     * @return SimUpdater capable of executing the update
     */
    public static SimUpdater updater(final String pathSid) {
        return new SimUpdater(pathSid);
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
    private final String status;
    private final URI commandsCallbackUrl;
    private final String commandsCallbackMethod;
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
                final String status,
                @JsonProperty("commands_callback_url")
                final URI commandsCallbackUrl,
                @JsonProperty("commands_callback_method")
                final String commandsCallbackMethod,
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
                final Map<String, String> links) {
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.accountSid = accountSid;
        this.ratePlanSid = ratePlanSid;
        this.friendlyName = friendlyName;
        this.iccid = iccid;
        this.eId = eId;
        this.status = status;
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
    }

    /**
     * Returns The sid.
     *
     * @return The sid
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The unique_name.
     *
     * @return The unique_name
     */
    public final String getUniqueName() {
        return this.uniqueName;
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
     * Returns The rate_plan_sid.
     *
     * @return The rate_plan_sid
     */
    public final String getRatePlanSid() {
        return this.ratePlanSid;
    }

    /**
     * Returns The friendly_name.
     *
     * @return The friendly_name
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The iccid.
     *
     * @return The iccid
     */
    public final String getIccid() {
        return this.iccid;
    }

    /**
     * Returns The e_id.
     *
     * @return The e_id
     */
    public final String getEId() {
        return this.eId;
    }

    /**
     * Returns The status.
     *
     * @return The status
     */
    public final String getStatus() {
        return this.status;
    }

    /**
     * Returns The commands_callback_url.
     *
     * @return The commands_callback_url
     */
    public final URI getCommandsCallbackUrl() {
        return this.commandsCallbackUrl;
    }

    /**
     * Returns The commands_callback_method.
     *
     * @return The commands_callback_method
     */
    public final String getCommandsCallbackMethod() {
        return this.commandsCallbackMethod;
    }

    /**
     * Returns The sms_fallback_method.
     *
     * @return The sms_fallback_method
     */
    public final HttpMethod getSmsFallbackMethod() {
        return this.smsFallbackMethod;
    }

    /**
     * Returns The sms_fallback_url.
     *
     * @return The sms_fallback_url
     */
    public final URI getSmsFallbackUrl() {
        return this.smsFallbackUrl;
    }

    /**
     * Returns The sms_method.
     *
     * @return The sms_method
     */
    public final HttpMethod getSmsMethod() {
        return this.smsMethod;
    }

    /**
     * Returns The sms_url.
     *
     * @return The sms_url
     */
    public final URI getSmsUrl() {
        return this.smsUrl;
    }

    /**
     * Returns The voice_fallback_method.
     *
     * @return The voice_fallback_method
     */
    public final HttpMethod getVoiceFallbackMethod() {
        return this.voiceFallbackMethod;
    }

    /**
     * Returns The voice_fallback_url.
     *
     * @return The voice_fallback_url
     */
    public final URI getVoiceFallbackUrl() {
        return this.voiceFallbackUrl;
    }

    /**
     * Returns The voice_method.
     *
     * @return The voice_method
     */
    public final HttpMethod getVoiceMethod() {
        return this.voiceMethod;
    }

    /**
     * Returns The voice_url.
     *
     * @return The voice_url
     */
    public final URI getVoiceUrl() {
        return this.voiceUrl;
    }

    /**
     * Returns The date_created.
     *
     * @return The date_created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date_updated.
     *
     * @return The date_updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
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
     * Returns The links.
     *
     * @return The links
     */
    public final Map<String, String> getLinks() {
        return this.links;
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
               Objects.equals(links, other.links);
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
                            links);
    }
}
