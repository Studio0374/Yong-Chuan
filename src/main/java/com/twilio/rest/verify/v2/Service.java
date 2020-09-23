/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.verify.v2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
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
public class Service extends Resource {
    private static final long serialVersionUID = 64044796018507L;

    /**
     * Create a ServiceCreator to execute create.
     *
     * @param friendlyName A string to describe the verification service
     * @return ServiceCreator capable of executing the create
     */
    public static ServiceCreator creator(final String friendlyName) {
        return new ServiceCreator(friendlyName);
    }

    /**
     * Create a ServiceFetcher to execute fetch.
     *
     * @param pathSid The unique string that identifies the resource
     * @return ServiceFetcher capable of executing the fetch
     */
    public static ServiceFetcher fetcher(final String pathSid) {
        return new ServiceFetcher(pathSid);
    }

    /**
     * Create a ServiceDeleter to execute delete.
     *
     * @param pathSid The unique string that identifies the resource
     * @return ServiceDeleter capable of executing the delete
     */
    public static ServiceDeleter deleter(final String pathSid) {
        return new ServiceDeleter(pathSid);
    }

    /**
     * Create a ServiceReader to execute read.
     *
     * @return ServiceReader capable of executing the read
     */
    public static ServiceReader reader() {
        return new ServiceReader();
    }

    /**
     * Create a ServiceUpdater to execute update.
     *
     * @param pathSid The unique string that identifies the resource
     * @return ServiceUpdater capable of executing the update
     */
    public static ServiceUpdater updater(final String pathSid) {
        return new ServiceUpdater(pathSid);
    }

    /**
     * Converts a JSON String into a Service object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Service object represented by the provided JSON
     */
    public static Service fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Service.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Service object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Service object represented by the provided JSON
     */
    public static Service fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Service.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String friendlyName;
    private final Integer codeLength;
    private final Boolean lookupEnabled;
    private final Boolean psd2Enabled;
    private final Boolean skipSmsToLandlines;
    private final Boolean dtmfInputRequired;
    private final String ttsName;
    private final Boolean doNotShareWarningEnabled;
    private final Boolean customCodeEnabled;
    private final Map<String, Object> push;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Service(@JsonProperty("sid")
                    final String sid,
                    @JsonProperty("account_sid")
                    final String accountSid,
                    @JsonProperty("friendly_name")
                    final String friendlyName,
                    @JsonProperty("code_length")
                    final Integer codeLength,
                    @JsonProperty("lookup_enabled")
                    final Boolean lookupEnabled,
                    @JsonProperty("psd2_enabled")
                    final Boolean psd2Enabled,
                    @JsonProperty("skip_sms_to_landlines")
                    final Boolean skipSmsToLandlines,
                    @JsonProperty("dtmf_input_required")
                    final Boolean dtmfInputRequired,
                    @JsonProperty("tts_name")
                    final String ttsName,
                    @JsonProperty("do_not_share_warning_enabled")
                    final Boolean doNotShareWarningEnabled,
                    @JsonProperty("custom_code_enabled")
                    final Boolean customCodeEnabled,
                    @JsonProperty("push")
                    final Map<String, Object> push,
                    @JsonProperty("date_created")
                    final String dateCreated,
                    @JsonProperty("date_updated")
                    final String dateUpdated,
                    @JsonProperty("url")
                    final URI url,
                    @JsonProperty("links")
                    final Map<String, String> links) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.codeLength = codeLength;
        this.lookupEnabled = lookupEnabled;
        this.psd2Enabled = psd2Enabled;
        this.skipSmsToLandlines = skipSmsToLandlines;
        this.dtmfInputRequired = dtmfInputRequired;
        this.ttsName = ttsName;
        this.doNotShareWarningEnabled = doNotShareWarningEnabled;
        this.customCodeEnabled = customCodeEnabled;
        this.push = push;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.links = links;
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
     * Returns The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The string that you assigned to describe the verification service.
     *
     * @return The string that you assigned to describe the verification service
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The length of the verification code.
     *
     * @return The length of the verification code
     */
    public final Integer getCodeLength() {
        return this.codeLength;
    }

    /**
     * Returns Whether to perform a lookup with each verification.
     *
     * @return Whether to perform a lookup with each verification
     */
    public final Boolean getLookupEnabled() {
        return this.lookupEnabled;
    }

    /**
     * Returns Whether to pass PSD2 transaction parameters when starting a
     * verification.
     *
     * @return Whether to pass PSD2 transaction parameters when starting a
     *         verification
     */
    public final Boolean getPsd2Enabled() {
        return this.psd2Enabled;
    }

    /**
     * Returns Whether to skip sending SMS verifications to landlines.
     *
     * @return Whether to skip sending SMS verifications to landlines
     */
    public final Boolean getSkipSmsToLandlines() {
        return this.skipSmsToLandlines;
    }

    /**
     * Returns Whether to ask the user to press a number before delivering the
     * verify code in a phone call.
     *
     * @return Whether to ask the user to press a number before delivering the
     *         verify code in a phone call
     */
    public final Boolean getDtmfInputRequired() {
        return this.dtmfInputRequired;
    }

    /**
     * Returns The name of an alternative text-to-speech service to use in phone
     * calls.
     *
     * @return The name of an alternative text-to-speech service to use in phone
     *         calls
     */
    public final String getTtsName() {
        return this.ttsName;
    }

    /**
     * Returns Whether to add a security warning at the end of an SMS..
     *
     * @return Whether to add a security warning at the end of an SMS.
     */
    public final Boolean getDoNotShareWarningEnabled() {
        return this.doNotShareWarningEnabled;
    }

    /**
     * Returns Whether to allow sending verifications with a custom code..
     *
     * @return Whether to allow sending verifications with a custom code.
     */
    public final Boolean getCustomCodeEnabled() {
        return this.customCodeEnabled;
    }

    /**
     * Returns The service level configuration of factor push type..
     *
     * @return The service level configuration of factor push type.
     */
    public final Map<String, Object> getPush() {
        return this.push;
    }

    /**
     * Returns The RFC 2822 date and time in GMT when the resource was created.
     *
     * @return The RFC 2822 date and time in GMT when the resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The RFC 2822 date and time in GMT when the resource was last updated.
     *
     * @return The RFC 2822 date and time in GMT when the resource was last updated
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
     * Returns The URLs of related resources.
     *
     * @return The URLs of related resources
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

        Service other = (Service) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(codeLength, other.codeLength) &&
               Objects.equals(lookupEnabled, other.lookupEnabled) &&
               Objects.equals(psd2Enabled, other.psd2Enabled) &&
               Objects.equals(skipSmsToLandlines, other.skipSmsToLandlines) &&
               Objects.equals(dtmfInputRequired, other.dtmfInputRequired) &&
               Objects.equals(ttsName, other.ttsName) &&
               Objects.equals(doNotShareWarningEnabled, other.doNotShareWarningEnabled) &&
               Objects.equals(customCodeEnabled, other.customCodeEnabled) &&
               Objects.equals(push, other.push) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            friendlyName,
                            codeLength,
                            lookupEnabled,
                            psd2Enabled,
                            skipSmsToLandlines,
                            dtmfInputRequired,
                            ttsName,
                            doNotShareWarningEnabled,
                            customCodeEnabled,
                            push,
                            dateCreated,
                            dateUpdated,
                            url,
                            links);
    }
}
