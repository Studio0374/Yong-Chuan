/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.trustedComms;

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
public class BrandedCall extends Resource {
    private static final long serialVersionUID = 3046006266217L;

    /**
     * Create a BrandedCallCreator to execute create.
     *
     * @param from Twilio number from which to brand the call
     * @param to The terminating Phone Number
     * @param reason The business reason for this phone call
     * @return BrandedCallCreator capable of executing the create
     */
    public static BrandedCallCreator creator(final String from,
                                             final String to,
                                             final String reason) {
        return new BrandedCallCreator(from, to, reason);
    }

    /**
     * Converts a JSON String into a BrandedCall object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return BrandedCall object represented by the provided JSON
     */
    public static BrandedCall fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BrandedCall.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a BrandedCall object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return BrandedCall object represented by the provided JSON
     */
    public static BrandedCall fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BrandedCall.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String bgColor;
    private final String brandSid;
    private final String brandedChannelSid;
    private final String businessSid;
    private final String callSid;
    private final String caller;
    private final ZonedDateTime createdAt;
    private final String fontColor;
    private final String from;
    private final String logo;
    private final String phoneNumberSid;
    private final String reason;
    private final String sid;
    private final String status;
    private final String to;
    private final URI url;
    private final String useCase;

    @JsonCreator
    private BrandedCall(@JsonProperty("account_sid")
                        final String accountSid,
                        @JsonProperty("bg_color")
                        final String bgColor,
                        @JsonProperty("brand_sid")
                        final String brandSid,
                        @JsonProperty("branded_channel_sid")
                        final String brandedChannelSid,
                        @JsonProperty("business_sid")
                        final String businessSid,
                        @JsonProperty("call_sid")
                        final String callSid,
                        @JsonProperty("caller")
                        final String caller,
                        @JsonProperty("created_at")
                        final String createdAt,
                        @JsonProperty("font_color")
                        final String fontColor,
                        @JsonProperty("from")
                        final String from,
                        @JsonProperty("logo")
                        final String logo,
                        @JsonProperty("phone_number_sid")
                        final String phoneNumberSid,
                        @JsonProperty("reason")
                        final String reason,
                        @JsonProperty("sid")
                        final String sid,
                        @JsonProperty("status")
                        final String status,
                        @JsonProperty("to")
                        final String to,
                        @JsonProperty("url")
                        final URI url,
                        @JsonProperty("use_case")
                        final String useCase) {
        this.accountSid = accountSid;
        this.bgColor = bgColor;
        this.brandSid = brandSid;
        this.brandedChannelSid = brandedChannelSid;
        this.businessSid = businessSid;
        this.callSid = callSid;
        this.caller = caller;
        this.createdAt = DateConverter.iso8601DateTimeFromString(createdAt);
        this.fontColor = fontColor;
        this.from = from;
        this.logo = logo;
        this.phoneNumberSid = phoneNumberSid;
        this.reason = reason;
        this.sid = sid;
        this.status = status;
        this.to = to;
        this.url = url;
        this.useCase = useCase;
    }

    /**
     * Returns Account Sid..
     *
     * @return Account Sid.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns Background color of the current phone call.
     *
     * @return Background color of the current phone call
     */
    public final String getBgColor() {
        return this.bgColor;
    }

    /**
     * Returns Brand Sid..
     *
     * @return Brand Sid.
     */
    public final String getBrandSid() {
        return this.brandSid;
    }

    /**
     * Returns Branded Channel Sid..
     *
     * @return Branded Channel Sid.
     */
    public final String getBrandedChannelSid() {
        return this.brandedChannelSid;
    }

    /**
     * Returns Business Sid..
     *
     * @return Business Sid.
     */
    public final String getBusinessSid() {
        return this.businessSid;
    }

    /**
     * Returns A string that uniquely identifies this phone call..
     *
     * @return A string that uniquely identifies this phone call.
     */
    public final String getCallSid() {
        return this.callSid;
    }

    /**
     * Returns Caller name of the current phone call.
     *
     * @return Caller name of the current phone call
     */
    public final String getCaller() {
        return this.caller;
    }

    /**
     * Returns The date this current phone call was created.
     *
     * @return The date this current phone call was created
     */
    public final ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Returns Font color of the current phone call.
     *
     * @return Font color of the current phone call
     */
    public final String getFontColor() {
        return this.fontColor;
    }

    /**
     * Returns The originating phone number.
     *
     * @return The originating phone number
     */
    public final String getFrom() {
        return this.from;
    }

    /**
     * Returns Logo URL of the caller.
     *
     * @return Logo URL of the caller
     */
    public final String getLogo() {
        return this.logo;
    }

    /**
     * Returns Phone Number Sid..
     *
     * @return Phone Number Sid.
     */
    public final String getPhoneNumberSid() {
        return this.phoneNumberSid;
    }

    /**
     * Returns The business reason for this current phone call.
     *
     * @return The business reason for this current phone call
     */
    public final String getReason() {
        return this.reason;
    }

    /**
     * Returns A string that uniquely identifies this current branded phone call..
     *
     * @return A string that uniquely identifies this current branded phone call.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The status of the current phone call.
     *
     * @return The status of the current phone call
     */
    public final String getStatus() {
        return this.status;
    }

    /**
     * Returns The terminating phone number.
     *
     * @return The terminating phone number
     */
    public final String getTo() {
        return this.to;
    }

    /**
     * Returns The URL of this resource..
     *
     * @return The URL of this resource.
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The use case for the current phone call.
     *
     * @return The use case for the current phone call
     */
    public final String getUseCase() {
        return this.useCase;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BrandedCall other = (BrandedCall) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(bgColor, other.bgColor) &&
               Objects.equals(brandSid, other.brandSid) &&
               Objects.equals(brandedChannelSid, other.brandedChannelSid) &&
               Objects.equals(businessSid, other.businessSid) &&
               Objects.equals(callSid, other.callSid) &&
               Objects.equals(caller, other.caller) &&
               Objects.equals(createdAt, other.createdAt) &&
               Objects.equals(fontColor, other.fontColor) &&
               Objects.equals(from, other.from) &&
               Objects.equals(logo, other.logo) &&
               Objects.equals(phoneNumberSid, other.phoneNumberSid) &&
               Objects.equals(reason, other.reason) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(status, other.status) &&
               Objects.equals(to, other.to) &&
               Objects.equals(url, other.url) &&
               Objects.equals(useCase, other.useCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            bgColor,
                            brandSid,
                            brandedChannelSid,
                            businessSid,
                            callSid,
                            caller,
                            createdAt,
                            fontColor,
                            from,
                            logo,
                            phoneNumberSid,
                            reason,
                            sid,
                            status,
                            to,
                            url,
                            useCase);
    }
}