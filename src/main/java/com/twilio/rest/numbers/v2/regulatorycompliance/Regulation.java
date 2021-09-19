/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.numbers.v2.regulatorycompliance;

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
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Regulation extends Resource {
    private static final long serialVersionUID = 91152178992805L;

  public String toString() {
    return "Regulation(sid=" + this.getSid() + ", friendlyName=" + this.getFriendlyName() + ", isoCountry=" + this.getIsoCountry() + ", numberType=" + this.getNumberType() + ", endUserType=" + this.getEndUserType() + ", requirements=" + this.getRequirements() + ", url=" + this.getUrl() + ")";
  }

  public enum EndUserType {
        INDIVIDUAL("individual"),
        BUSINESS("business");

        private final String value;

        private EndUserType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a EndUserType from a string.
         * @param value string value
         * @return generated EndUserType
         */
        @JsonCreator
        public static EndUserType forValue(final String value) {
            return Promoter.enumFromString(value, EndUserType.values());
        }
    }

    /**
     * Create a RegulationReader to execute read.
     *
     * @return RegulationReader capable of executing the read
     */
    public static RegulationReader reader() {
        return new RegulationReader();
    }

    /**
     * Create a RegulationFetcher to execute fetch.
     *
     * @param pathSid The unique string that identifies the Regulation resource
     * @return RegulationFetcher capable of executing the fetch
     */
    public static RegulationFetcher fetcher(final String pathSid) {
        return new RegulationFetcher(pathSid);
    }

    /**
     * Converts a JSON String into a Regulation object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Regulation object represented by the provided JSON
     */
    public static Regulation fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Regulation.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Regulation object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Regulation object represented by the provided JSON
     */
    public static Regulation fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Regulation.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String friendlyName;
    private final String isoCountry;
    private final String numberType;
    private final Regulation.EndUserType endUserType;
    private final Map<String, Object> requirements;
    private final URI url;

    @JsonCreator
    private Regulation(@JsonProperty("sid")
                       final String sid,
                       @JsonProperty("friendly_name")
                       final String friendlyName,
                       @JsonProperty("iso_country")
                       final String isoCountry,
                       @JsonProperty("number_type")
                       final String numberType,
                       @JsonProperty("end_user_type")
                       final Regulation.EndUserType endUserType,
                       @JsonProperty("requirements")
                       final Map<String, Object> requirements,
                       @JsonProperty("url")
                       final URI url) {
        this.sid = sid;
        this.friendlyName = friendlyName;
        this.isoCountry = isoCountry;
        this.numberType = numberType;
        this.endUserType = endUserType;
        this.requirements = requirements;
        this.url = url;
    }

    /**
     * Returns The unique string that identifies the Regulation resource.
     *
     * @return The unique string that identifies the Regulation resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns A human-readable description of the Regulation resource.
     *
     * @return A human-readable description of the Regulation resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The ISO country code of the phone number's country.
     *
     * @return The ISO country code of the phone number's country
     */
    public final String getIsoCountry() {
        return this.isoCountry;
    }

    /**
     * Returns The type of phone number restricted by the regulatory requirement.
     *
     * @return The type of phone number restricted by the regulatory requirement
     */
    public final String getNumberType() {
        return this.numberType;
    }

    /**
     * Returns The type of End User of the Regulation resource.
     *
     * @return The type of End User of the Regulation resource
     */
    public final Regulation.EndUserType getEndUserType() {
        return this.endUserType;
    }

    /**
     * Returns The sid of a regulation object that dictates requirements.
     *
     * @return The sid of a regulation object that dictates requirements
     */
    public final Map<String, Object> getRequirements() {
        return this.requirements;
    }

    /**
     * Returns The absolute URL of the Regulation resource.
     *
     * @return The absolute URL of the Regulation resource
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

        Regulation other = (Regulation) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(isoCountry, other.isoCountry) &&
               Objects.equals(numberType, other.numberType) &&
               Objects.equals(endUserType, other.endUserType) &&
               Objects.equals(requirements, other.requirements) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            friendlyName,
                            isoCountry,
                            numberType,
                            endUserType,
                            requirements,
                            url);
    }
}
