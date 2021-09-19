/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.accounts.v1.credential;

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
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PublicKey extends Resource {
    private static final long serialVersionUID = 108884981918794L;

    /**
     * Create a PublicKeyReader to execute read.
     *
     * @return PublicKeyReader capable of executing the read
     */
    public static PublicKeyReader reader() {
        return new PublicKeyReader();
    }

    /**
     * Create a PublicKeyCreator to execute create.
     *
     * @param publicKey A URL encoded representation of the public key
     * @return PublicKeyCreator capable of executing the create
     */
    public static PublicKeyCreator creator(final String publicKey) {
        return new PublicKeyCreator(publicKey);
    }

    /**
     * Create a PublicKeyFetcher to execute fetch.
     *
     * @param pathSid The unique string that identifies the resource
     * @return PublicKeyFetcher capable of executing the fetch
     */
    public static PublicKeyFetcher fetcher(final String pathSid) {
        return new PublicKeyFetcher(pathSid);
    }

    /**
     * Create a PublicKeyUpdater to execute update.
     *
     * @param pathSid The unique string that identifies the resource
     * @return PublicKeyUpdater capable of executing the update
     */
    public static PublicKeyUpdater updater(final String pathSid) {
        return new PublicKeyUpdater(pathSid);
    }

    /**
     * Create a PublicKeyDeleter to execute delete.
     *
     * @param pathSid The unique string that identifies the resource
     * @return PublicKeyDeleter capable of executing the delete
     */
    public static PublicKeyDeleter deleter(final String pathSid) {
        return new PublicKeyDeleter(pathSid);
    }

    /**
     * Converts a JSON String into a PublicKey object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return PublicKey object represented by the provided JSON
     */
    public static PublicKey fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PublicKey.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a PublicKey object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return PublicKey object represented by the provided JSON
     */
    public static PublicKey fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, PublicKey.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String friendlyName;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private PublicKey(@JsonProperty("sid")
                      final String sid,
                      @JsonProperty("account_sid")
                      final String accountSid,
                      @JsonProperty("friendly_name")
                      final String friendlyName,
                      @JsonProperty("date_created")
                      final String dateCreated,
                      @JsonProperty("date_updated")
                      final String dateUpdated,
                      @JsonProperty("url")
                      final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
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
     * Returns The SID of the Account that created the Credential that the PublicKey
     * resource belongs to.
     *
     * @return The SID of the Account that created the Credential that the
     *         PublicKey resource belongs to
     */
    public final String getAccountSid() {
        return this.accountSid;
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
     * Returns The URI for this resource, relative to `https://accounts.twilio.com`.
     *
     * @return The URI for this resource, relative to `https://accounts.twilio.com`
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

        PublicKey other = (PublicKey) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            friendlyName,
                            dateCreated,
                            dateUpdated,
                            url);
    }

  public String toString() {
    return "PublicKey(sid=" + this.getSid() + ", accountSid=" + this.getAccountSid() + ", friendlyName=" + this.getFriendlyName() + ", dateCreated=" + this.getDateCreated() + ", dateUpdated=" + this.getDateUpdated() + ", url=" + this.getUrl() + ")";
  }
}
