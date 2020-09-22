/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.chat.v2;

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
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Credential extends Resource {
    private static final long serialVersionUID = 133884911230690L;

    public enum PushService {
        GCM("gcm"),
        APN("apn"),
        FCM("fcm");

        private final String value;

        private PushService(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a PushService from a string.
         * @param value string value
         * @return generated PushService
         */
        @JsonCreator
        public static PushService forValue(final String value) {
            return Promoter.enumFromString(value, PushService.values());
        }
    }

    /**
     * Create a CredentialReader to execute read.
     *
     * @return CredentialReader capable of executing the read
     */
    public static CredentialReader reader() {
        return new CredentialReader();
    }

    /**
     * Create a CredentialCreator to execute create.
     *
     * @param type The type of push-notification service the credential is for
     * @return CredentialCreator capable of executing the create
     */
    public static CredentialCreator creator(final Credential.PushService type) {
        return new CredentialCreator(type);
    }

    /**
     * Create a CredentialFetcher to execute fetch.
     *
     * @param pathSid The SID of the Credential resource to fetch
     * @return CredentialFetcher capable of executing the fetch
     */
    public static CredentialFetcher fetcher(final String pathSid) {
        return new CredentialFetcher(pathSid);
    }

    /**
     * Create a CredentialUpdater to execute update.
     *
     * @param pathSid The SID of the Credential resource to update
     * @return CredentialUpdater capable of executing the update
     */
    public static CredentialUpdater updater(final String pathSid) {
        return new CredentialUpdater(pathSid);
    }

    /**
     * Create a CredentialDeleter to execute delete.
     *
     * @param pathSid The SID of the Credential resource to delete
     * @return CredentialDeleter capable of executing the delete
     */
    public static CredentialDeleter deleter(final String pathSid) {
        return new CredentialDeleter(pathSid);
    }

    /**
     * Converts a JSON String into a Credential object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Credential object represented by the provided JSON
     */
    public static Credential fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Credential.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Credential object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Credential object represented by the provided JSON
     */
    public static Credential fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Credential.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String friendlyName;
    private final Credential.PushService type;
    private final String sandbox;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private Credential(@JsonProperty("sid")
                       final String sid,
                       @JsonProperty("account_sid")
                       final String accountSid,
                       @JsonProperty("friendly_name")
                       final String friendlyName,
                       @JsonProperty("type")
                       final Credential.PushService type,
                       @JsonProperty("sandbox")
                       final String sandbox,
                       @JsonProperty("date_created")
                       final String dateCreated,
                       @JsonProperty("date_updated")
                       final String dateUpdated,
                       @JsonProperty("url")
                       final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.type = type;
        this.sandbox = sandbox;
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
     * Returns The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
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
     * Returns The type of push-notification service the credential is for.
     *
     * @return The type of push-notification service the credential is for
     */
    public final Credential.PushService getType() {
        return this.type;
    }

    /**
     * Returns [APN only] Whether to send the credential to sandbox APNs.
     *
     * @return [APN only] Whether to send the credential to sandbox APNs
     */
    public final String getSandbox() {
        return this.sandbox;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was created.
     *
     * @return The ISO 8601 date and time in GMT when the resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was last updated.
     *
     * @return The ISO 8601 date and time in GMT when the resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The absolute URL of the Credential resource.
     *
     * @return The absolute URL of the Credential resource
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

        Credential other = (Credential) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(type, other.type) &&
               Objects.equals(sandbox, other.sandbox) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            friendlyName,
                            type,
                            sandbox,
                            dateCreated,
                            dateUpdated,
                            url);
    }
}