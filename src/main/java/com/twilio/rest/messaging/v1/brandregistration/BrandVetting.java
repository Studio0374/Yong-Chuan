/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.messaging.v1.brandregistration;

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
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Objects;

import lombok.ToString;


@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class BrandVetting extends Resource {
    private static final long serialVersionUID = 122020517475795L;

    

    public static BrandVettingCreator creator(final String pathBrandSid, final BrandVetting.VettingProvider vettingProvider){
        return new BrandVettingCreator(pathBrandSid, vettingProvider);
    }

    public static BrandVettingFetcher fetcher(final String pathBrandSid, final String pathBrandVettingSid){
        return new BrandVettingFetcher(pathBrandSid, pathBrandVettingSid);
    }

    public static BrandVettingReader reader(final String pathBrandSid){
        return new BrandVettingReader(pathBrandSid);
    }

    /**
    * Converts a JSON String into a BrandVetting object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return BrandVetting object represented by the provided JSON
    */
    public static BrandVetting fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BrandVetting.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a BrandVetting object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return BrandVetting object represented by the provided JSON
    */
    public static BrandVetting fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BrandVetting.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    public enum VettingProvider {
        CAMPAIGN_VERIFY("campaign-verify");

        private final String value;

        private VettingProvider(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static VettingProvider forValue(final String value) {
            return Promoter.enumFromString(value, VettingProvider.values());
        }
    }

    private final String accountSid;
    private final String brandSid;
    private final String brandVettingSid;
    private final ZonedDateTime dateUpdated;
    private final ZonedDateTime dateCreated;
    private final String vettingId;
    private final String vettingClass;
    private final String vettingStatus;
    private final BrandVetting.VettingProvider vettingProvider;
    private final URI url;

    @JsonCreator
    private BrandVetting(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("brand_sid")
        final String brandSid,

        @JsonProperty("brand_vetting_sid")
        final String brandVettingSid,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("vetting_id")
        final String vettingId,

        @JsonProperty("vetting_class")
        final String vettingClass,

        @JsonProperty("vetting_status")
        final String vettingStatus,

        @JsonProperty("vetting_provider")
        final BrandVetting.VettingProvider vettingProvider,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.brandSid = brandSid;
        this.brandVettingSid = brandVettingSid;
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.vettingId = vettingId;
        this.vettingClass = vettingClass;
        this.vettingStatus = vettingStatus;
        this.vettingProvider = vettingProvider;
        this.url = url;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getBrandSid() {
            return this.brandSid;
        }
        public final String getBrandVettingSid() {
            return this.brandVettingSid;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final String getVettingId() {
            return this.vettingId;
        }
        public final String getVettingClass() {
            return this.vettingClass;
        }
        public final String getVettingStatus() {
            return this.vettingStatus;
        }
        public final BrandVetting.VettingProvider getVettingProvider() {
            return this.vettingProvider;
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

        BrandVetting other = (BrandVetting) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(brandSid, other.brandSid) &&  Objects.equals(brandVettingSid, other.brandVettingSid) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(vettingId, other.vettingId) &&  Objects.equals(vettingClass, other.vettingClass) &&  Objects.equals(vettingStatus, other.vettingStatus) &&  Objects.equals(vettingProvider, other.vettingProvider) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, brandSid, brandVettingSid, dateUpdated, dateCreated, vettingId, vettingClass, vettingStatus, vettingProvider, url);
    }


}

