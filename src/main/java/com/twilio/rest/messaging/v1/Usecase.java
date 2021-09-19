/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.messaging.v1;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Usecase extends Resource {
    private static final long serialVersionUID = 35587373303298L;

    /**
     * Create a UsecaseFetcher to execute fetch.
     *
     * @return UsecaseFetcher capable of executing the fetch
     */
    public static UsecaseFetcher fetcher() {
        return new UsecaseFetcher();
    }

    /**
     * Converts a JSON String into a Usecase object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Usecase object represented by the provided JSON
     */
    public static Usecase fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Usecase.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Usecase object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Usecase object represented by the provided JSON
     */
    public static Usecase fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Usecase.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final List<Map<String, Object>> usecases;

    @JsonCreator
    private Usecase(@JsonProperty("usecases")
                    final List<Map<String, Object>> usecases) {
        this.usecases = usecases;
    }

    /**
     * Returns Human readable Messaging Service Use Case details.
     *
     * @return Human readable Messaging Service Use Case details
     */
    public final List<Map<String, Object>> getUsecases() {
        return this.usecases;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Usecase other = (Usecase) o;

        return Objects.equals(usecases, other.usecases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usecases);
    }

  public String toString() {
    return "Usecase(usecases=" + this.getUsecases() + ")";
  }
}
