/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Voice
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.voice.v1.dialingpermissions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.List;
import java.util.Map;
import java.util.Objects;


import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Country extends Resource {
    private static final long serialVersionUID = 221375218243466L;


    public static CountryFetcher fetcher(final String isoCode){
        return new CountryFetcher(isoCode);
    }


    public static CountryReader reader(){
        return new CountryReader();
    }


    /**
    * Converts a JSON String into a Country object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Country object represented by the provided JSON
    */
    public static Country fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Country.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Country object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Country object represented by the provided JSON
    */
    public static Country fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Country.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String isoCode;
    private final String name;
    private final String continent;
    private final List<String> countryCodes;
    private final Boolean lowRiskNumbersEnabled;
    private final Boolean highRiskSpecialNumbersEnabled;
    private final Boolean highRiskTollfraudNumbersEnabled;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Country(
        @JsonProperty("iso_code")
        final String isoCode,

        @JsonProperty("name")
        final String name,

        @JsonProperty("continent")
        final String continent,

        @JsonProperty("country_codes")
        final List<String> countryCodes,

        @JsonProperty("low_risk_numbers_enabled")
        final Boolean lowRiskNumbersEnabled,

        @JsonProperty("high_risk_special_numbers_enabled")
        final Boolean highRiskSpecialNumbersEnabled,

        @JsonProperty("high_risk_tollfraud_numbers_enabled")
        final Boolean highRiskTollfraudNumbersEnabled,

        @JsonProperty("url")
        final URI url,

        @JsonProperty("links")
        final Map<String, String> links
    ) {
        this.isoCode = isoCode;
        this.name = name;
        this.continent = continent;
        this.countryCodes = countryCodes;
        this.lowRiskNumbersEnabled = lowRiskNumbersEnabled;
        this.highRiskSpecialNumbersEnabled = highRiskSpecialNumbersEnabled;
        this.highRiskTollfraudNumbersEnabled = highRiskTollfraudNumbersEnabled;
        this.url = url;
        this.links = links;
    }

        public final String getIsoCode() {
            return this.isoCode;
        }
        public final String getName() {
            return this.name;
        }
        public final String getContinent() {
            return this.continent;
        }
        public final List<String> getCountryCodes() {
            return this.countryCodes;
        }
        public final Boolean getLowRiskNumbersEnabled() {
            return this.lowRiskNumbersEnabled;
        }
        public final Boolean getHighRiskSpecialNumbersEnabled() {
            return this.highRiskSpecialNumbersEnabled;
        }
        public final Boolean getHighRiskTollfraudNumbersEnabled() {
            return this.highRiskTollfraudNumbersEnabled;
        }
        public final URI getUrl() {
            return this.url;
        }
        public final Map<String, String> getLinks() {
            return this.links;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Country other = (Country) o;

        return Objects.equals(isoCode, other.isoCode) &&  Objects.equals(name, other.name) &&  Objects.equals(continent, other.continent) &&  Objects.equals(countryCodes, other.countryCodes) &&  Objects.equals(lowRiskNumbersEnabled, other.lowRiskNumbersEnabled) &&  Objects.equals(highRiskSpecialNumbersEnabled, other.highRiskSpecialNumbersEnabled) &&  Objects.equals(highRiskTollfraudNumbersEnabled, other.highRiskTollfraudNumbersEnabled) &&  Objects.equals(url, other.url) &&  Objects.equals(links, other.links)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isoCode, name, continent, countryCodes, lowRiskNumbersEnabled, highRiskSpecialNumbersEnabled, highRiskTollfraudNumbersEnabled, url, links);
    }

}

