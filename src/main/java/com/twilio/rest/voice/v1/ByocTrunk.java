/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.voice.v1;

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

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class ByocTrunk extends Resource {
    private static final long serialVersionUID = 155966179208903L;

    /**
     * Create a ByocTrunkCreator to execute create.
     *
     * @return ByocTrunkCreator capable of executing the create
     */
    public static ByocTrunkCreator creator() {
        return new ByocTrunkCreator();
    }

    /**
     * Create a ByocTrunkFetcher to execute fetch.
     *
     * @param pathSid The unique string that identifies the resource
     * @return ByocTrunkFetcher capable of executing the fetch
     */
    public static ByocTrunkFetcher fetcher(final String pathSid) {
        return new ByocTrunkFetcher(pathSid);
    }

    /**
     * Create a ByocTrunkReader to execute read.
     *
     * @return ByocTrunkReader capable of executing the read
     */
    public static ByocTrunkReader reader() {
        return new ByocTrunkReader();
    }

    /**
     * Create a ByocTrunkUpdater to execute update.
     *
     * @param pathSid The unique string that identifies the resource
     * @return ByocTrunkUpdater capable of executing the update
     */
    public static ByocTrunkUpdater updater(final String pathSid) {
        return new ByocTrunkUpdater(pathSid);
    }

    /**
     * Create a ByocTrunkDeleter to execute delete.
     *
     * @param pathSid The unique string that identifies the resource
     * @return ByocTrunkDeleter capable of executing the delete
     */
    public static ByocTrunkDeleter deleter(final String pathSid) {
        return new ByocTrunkDeleter(pathSid);
    }

    /**
     * Converts a JSON String into a ByocTrunk object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return ByocTrunk object represented by the provided JSON
     */
    public static ByocTrunk fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ByocTrunk.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a ByocTrunk object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return ByocTrunk object represented by the provided JSON
     */
    public static ByocTrunk fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ByocTrunk.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String sid;
    private final String friendlyName;
    private final URI voiceUrl;
    private final HttpMethod voiceMethod;
    private final URI voiceFallbackUrl;
    private final HttpMethod voiceFallbackMethod;
    private final URI statusCallbackUrl;
    private final HttpMethod statusCallbackMethod;
    private final Boolean cnamLookupEnabled;
    private final String connectionPolicySid;
    private final String fromDomainSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private ByocTrunk(@JsonProperty("account_sid")
                      final String accountSid,
                      @JsonProperty("sid")
                      final String sid,
                      @JsonProperty("friendly_name")
                      final String friendlyName,
                      @JsonProperty("voice_url")
                      final URI voiceUrl,
                      @JsonProperty("voice_method")
                      final HttpMethod voiceMethod,
                      @JsonProperty("voice_fallback_url")
                      final URI voiceFallbackUrl,
                      @JsonProperty("voice_fallback_method")
                      final HttpMethod voiceFallbackMethod,
                      @JsonProperty("status_callback_url")
                      final URI statusCallbackUrl,
                      @JsonProperty("status_callback_method")
                      final HttpMethod statusCallbackMethod,
                      @JsonProperty("cnam_lookup_enabled")
                      final Boolean cnamLookupEnabled,
                      @JsonProperty("connection_policy_sid")
                      final String connectionPolicySid,
                      @JsonProperty("from_domain_sid")
                      final String fromDomainSid,
                      @JsonProperty("date_created")
                      final String dateCreated,
                      @JsonProperty("date_updated")
                      final String dateUpdated,
                      @JsonProperty("url")
                      final URI url) {
        this.accountSid = accountSid;
        this.sid = sid;
        this.friendlyName = friendlyName;
        this.voiceUrl = voiceUrl;
        this.voiceMethod = voiceMethod;
        this.voiceFallbackUrl = voiceFallbackUrl;
        this.voiceFallbackMethod = voiceFallbackMethod;
        this.statusCallbackUrl = statusCallbackUrl;
        this.statusCallbackMethod = statusCallbackMethod;
        this.cnamLookupEnabled = cnamLookupEnabled;
        this.connectionPolicySid = connectionPolicySid;
        this.fromDomainSid = fromDomainSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
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
     * Returns The unique string that identifies the resource.
     *
     * @return The unique string that identifies the resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The string that you assigned to describe the resource.
     *
     * @return The string that you assigned to describe the resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The URL we call when receiving a call.
     *
     * @return The URL we call when receiving a call
     */
    public final URI getVoiceUrl() {
        return this.voiceUrl;
    }

    /**
     * Returns The HTTP method to use with voice_url.
     *
     * @return The HTTP method to use with voice_url
     */
    public final HttpMethod getVoiceMethod() {
        return this.voiceMethod;
    }

    /**
     * Returns The URL we call when an error occurs while executing TwiML.
     *
     * @return The URL we call when an error occurs while executing TwiML
     */
    public final URI getVoiceFallbackUrl() {
        return this.voiceFallbackUrl;
    }

    /**
     * Returns The HTTP method used with voice_fallback_url.
     *
     * @return The HTTP method used with voice_fallback_url
     */
    public final HttpMethod getVoiceFallbackMethod() {
        return this.voiceFallbackMethod;
    }

    /**
     * Returns The URL that we call with status updates.
     *
     * @return The URL that we call with status updates
     */
    public final URI getStatusCallbackUrl() {
        return this.statusCallbackUrl;
    }

    /**
     * Returns The HTTP method we use to call status_callback_url.
     *
     * @return The HTTP method we use to call status_callback_url
     */
    public final HttpMethod getStatusCallbackMethod() {
        return this.statusCallbackMethod;
    }

    /**
     * Returns Whether Caller ID Name (CNAM) lookup is enabled for the trunk.
     *
     * @return Whether Caller ID Name (CNAM) lookup is enabled for the trunk
     */
    public final Boolean getCnamLookupEnabled() {
        return this.cnamLookupEnabled;
    }

    /**
     * Returns Origination Connection Policy (to your Carrier).
     *
     * @return Origination Connection Policy (to your Carrier)
     */
    public final String getConnectionPolicySid() {
        return this.connectionPolicySid;
    }

    /**
     * Returns The SID of the SIP Domain that should be used in the `From` header of
     * originating calls.
     *
     * @return The SID of the SIP Domain that should be used in the `From` header
     *         of originating calls
     */
    public final String getFromDomainSid() {
        return this.fromDomainSid;
    }

    /**
     * Returns The RFC 2822 date and time in GMT that the resource was created.
     *
     * @return The RFC 2822 date and time in GMT that the resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The RFC 2822 date and time in GMT that the resource was last updated.
     *
     * @return The RFC 2822 date and time in GMT that the resource was last updated
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ByocTrunk other = (ByocTrunk) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(voiceUrl, other.voiceUrl) &&
               Objects.equals(voiceMethod, other.voiceMethod) &&
               Objects.equals(voiceFallbackUrl, other.voiceFallbackUrl) &&
               Objects.equals(voiceFallbackMethod, other.voiceFallbackMethod) &&
               Objects.equals(statusCallbackUrl, other.statusCallbackUrl) &&
               Objects.equals(statusCallbackMethod, other.statusCallbackMethod) &&
               Objects.equals(cnamLookupEnabled, other.cnamLookupEnabled) &&
               Objects.equals(connectionPolicySid, other.connectionPolicySid) &&
               Objects.equals(fromDomainSid, other.fromDomainSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            sid,
                            friendlyName,
                            voiceUrl,
                            voiceMethod,
                            voiceFallbackUrl,
                            voiceFallbackMethod,
                            statusCallbackUrl,
                            statusCallbackMethod,
                            cnamLookupEnabled,
                            connectionPolicySid,
                            fromDomainSid,
                            dateCreated,
                            dateUpdated,
                            url);
    }
}
