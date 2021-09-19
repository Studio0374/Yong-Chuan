/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.voice.v1.dialingpermissions.country;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HighriskSpecialPrefix extends Resource {
    private static final long serialVersionUID = 211324910415647L;

    /**
     * Create a HighriskSpecialPrefixReader to execute read.
     *
     * @param pathIsoCode The ISO 3166-1 country code
     * @return HighriskSpecialPrefixReader capable of executing the read
     */
    public static HighriskSpecialPrefixReader reader(final String pathIsoCode) {
        return new HighriskSpecialPrefixReader(pathIsoCode);
    }

    /**
     * Converts a JSON String into a HighriskSpecialPrefix object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return HighriskSpecialPrefix object represented by the provided JSON
     */
    public static HighriskSpecialPrefix fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, HighriskSpecialPrefix.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a HighriskSpecialPrefix object using the
     * provided ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return HighriskSpecialPrefix object represented by the provided JSON
     */
    public static HighriskSpecialPrefix fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, HighriskSpecialPrefix.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String prefix;

    @JsonCreator
    private HighriskSpecialPrefix(@JsonProperty("prefix")
                                  final String prefix) {
        this.prefix = prefix;
    }

    /**
     * Returns A prefix that includes the E.164 assigned country code.
     *
     * @return A prefix that includes the E.164 assigned country code
     */
    public final String getPrefix() {
        return this.prefix;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        HighriskSpecialPrefix other = (HighriskSpecialPrefix) o;

        return Objects.equals(prefix, other.prefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix);
    }

  public String toString() {
    return "HighriskSpecialPrefix(prefix=" + this.getPrefix() + ")";
  }
}
