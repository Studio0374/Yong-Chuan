/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010;

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
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import lombok.ToString;


import java.io.IOException;
import java.io.InputStream;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Account extends Resource {
    private static final long serialVersionUID = 82837000699633L;

    public enum Status {
        ACTIVE("active"),
        SUSPENDED("suspended"),
        CLOSED("closed");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Status from a string.
         * @param value string value
         * @return generated Status
         */
        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    public enum Type {
        TRIAL("Trial"),
        FULL("Full");

        private final String value;

        private Type(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Type from a string.
         * @param value string value
         * @return generated Type
         */
        @JsonCreator
        public static Type forValue(final String value) {
            return Promoter.enumFromString(value, Type.values());
        }
    }

    /**
     * Create a AccountCreator to execute create.
     *
     * @return AccountCreator capable of executing the create
     */
    public static AccountCreator creator() {
        return new AccountCreator();
    }

    /**
     * Create a AccountFetcher to execute fetch.
     *
     * @param pathSid Fetch by unique Account Sid
     * @return AccountFetcher capable of executing the fetch
     */
    public static AccountFetcher fetcher(final String pathSid) {
        return new AccountFetcher(pathSid);
    }

    /**
     * Create a AccountFetcher to execute fetch.
     *
     * @return AccountFetcher capable of executing the fetch
     */
    public static AccountFetcher fetcher() {
        return new AccountFetcher();
    }

    /**
     * Create a AccountReader to execute read.
     *
     * @return AccountReader capable of executing the read
     */
    public static AccountReader reader() {
        return new AccountReader();
    }

    /**
     * Create a AccountUpdater to execute update.
     *
     * @param pathSid Update by unique Account Sid
     * @return AccountUpdater capable of executing the update
     */
    public static AccountUpdater updater(final String pathSid) {
        return new AccountUpdater(pathSid);
    }

    /**
     * Create a AccountUpdater to execute update.
     *
     * @return AccountUpdater capable of executing the update
     */
    public static AccountUpdater updater() {
        return new AccountUpdater();
    }

    /**
     * Converts a JSON String into a Account object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Account object represented by the provided JSON
     */
    public static Account fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Account.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Account object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Account object represented by the provided JSON
     */
    public static Account fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Account.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String authToken;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String friendlyName;
    private final String ownerAccountSid;
    private final String sid;
    private final Account.Status status;
    private final Map<String, String> subresourceUris;
    private final Account.Type type;
    private final String uri;

    @JsonCreator
    private Account(@JsonProperty("auth_token")
                    final String authToken,
                    @JsonProperty("date_created")
                    final String dateCreated,
                    @JsonProperty("date_updated")
                    final String dateUpdated,
                    @JsonProperty("friendly_name")
                    final String friendlyName,
                    @JsonProperty("owner_account_sid")
                    final String ownerAccountSid,
                    @JsonProperty("sid")
                    final String sid,
                    @JsonProperty("status")
                    final Account.Status status,
                    @JsonProperty("subresource_uris")
                    final Map<String, String> subresourceUris,
                    @JsonProperty("type")
                    final Account.Type type,
                    @JsonProperty("uri")
                    final String uri) {
        this.authToken = authToken;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.ownerAccountSid = ownerAccountSid;
        this.sid = sid;
        this.status = status;
        this.subresourceUris = subresourceUris;
        this.type = type;
        this.uri = uri;
    }

    /**
     * Returns The authorization token for this account.
     *
     * @return The authorization token for this account
     */
    public final String getAuthToken() {
        return this.authToken;
    }

    /**
     * Returns The date this account was created.
     *
     * @return The date this account was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date this account was last updated.
     *
     * @return The date this account was last updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns A human readable description of this account.
     *
     * @return A human readable description of this account
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The unique 34 character id representing the parent of this account.
     *
     * @return The unique 34 character id representing the parent of this account
     */
    public final String getOwnerAccountSid() {
        return this.ownerAccountSid;
    }

    /**
     * Returns A 34 character string that uniquely identifies this resource..
     *
     * @return A 34 character string that uniquely identifies this resource.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The status of this account.
     *
     * @return The status of this account
     */
    public final Account.Status getStatus() {
        return this.status;
    }

    /**
     * Returns Account Instance Subresources.
     *
     * @return Account Instance Subresources
     */
    public final Map<String, String> getSubresourceUris() {
        return this.subresourceUris;
    }

    /**
     * Returns The type of this account.
     *
     * @return The type of this account
     */
    public final Account.Type getType() {
        return this.type;
    }

    /**
     * Returns The URI for this resource, relative to `https://api.twilio.com`.
     *
     * @return The URI for this resource, relative to `https://api.twilio.com`
     */
    public final String getUri() {
        return this.uri;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account other = (Account) o;

        return Objects.equals(authToken, other.authToken) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(ownerAccountSid, other.ownerAccountSid) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(status, other.status) &&
               Objects.equals(subresourceUris, other.subresourceUris) &&
               Objects.equals(type, other.type) &&
               Objects.equals(uri, other.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authToken,
                            dateCreated,
                            dateUpdated,
                            friendlyName,
                            ownerAccountSid,
                            sid,
                            status,
                            subresourceUris,
                            type,
                            uri);
    }
}
