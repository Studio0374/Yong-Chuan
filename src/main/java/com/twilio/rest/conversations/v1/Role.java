/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1;

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
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Role extends Resource {
    private static final long serialVersionUID = 19854929534813L;

    public enum RoleType {
        CONVERSATION("conversation"),
        SERVICE("service");

        private final String value;

        private RoleType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a RoleType from a string.
         * @param value string value
         * @return generated RoleType
         */
        @JsonCreator
        public static RoleType forValue(final String value) {
            return Promoter.enumFromString(value, RoleType.values());
        }
    }

    /**
     * Create a RoleCreator to execute create.
     *
     * @param friendlyName A string to describe the new resource
     * @param type The type of role
     * @param permission A permission the role should have
     * @return RoleCreator capable of executing the create
     */
    public static RoleCreator creator(final String friendlyName,
                                      final Role.RoleType type,
                                      final List<String> permission) {
        return new RoleCreator(friendlyName, type, permission);
    }

    /**
     * Create a RoleUpdater to execute update.
     *
     * @param pathSid The SID of the Role resource to update
     * @param permission A permission the role should have
     * @return RoleUpdater capable of executing the update
     */
    public static RoleUpdater updater(final String pathSid,
                                      final List<String> permission) {
        return new RoleUpdater(pathSid, permission);
    }

    /**
     * Create a RoleDeleter to execute delete.
     *
     * @param pathSid The SID of the Role resource to delete
     * @return RoleDeleter capable of executing the delete
     */
    public static RoleDeleter deleter(final String pathSid) {
        return new RoleDeleter(pathSid);
    }

    /**
     * Create a RoleFetcher to execute fetch.
     *
     * @param pathSid The SID of the Role resource to fetch
     * @return RoleFetcher capable of executing the fetch
     */
    public static RoleFetcher fetcher(final String pathSid) {
        return new RoleFetcher(pathSid);
    }

    /**
     * Create a RoleReader to execute read.
     *
     * @return RoleReader capable of executing the read
     */
    public static RoleReader reader() {
        return new RoleReader();
    }

    /**
     * Converts a JSON String into a Role object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Role object represented by the provided JSON
     */
    public static Role fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Role.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Role object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Role object represented by the provided JSON
     */
    public static Role fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Role.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String chatServiceSid;
    private final String friendlyName;
    private final Role.RoleType type;
    private final List<String> permissions;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private Role(@JsonProperty("sid")
                 final String sid,
                 @JsonProperty("account_sid")
                 final String accountSid,
                 @JsonProperty("chat_service_sid")
                 final String chatServiceSid,
                 @JsonProperty("friendly_name")
                 final String friendlyName,
                 @JsonProperty("type")
                 final Role.RoleType type,
                 @JsonProperty("permissions")
                 final List<String> permissions,
                 @JsonProperty("date_created")
                 final String dateCreated,
                 @JsonProperty("date_updated")
                 final String dateUpdated,
                 @JsonProperty("url")
                 final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.chatServiceSid = chatServiceSid;
        this.friendlyName = friendlyName;
        this.type = type;
        this.permissions = permissions;
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
     * Returns The SID of the Conversation Service that the resource is associated
     * with.
     *
     * @return The SID of the Conversation Service that the resource is associated
     *         with
     */
    public final String getChatServiceSid() {
        return this.chatServiceSid;
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
     * Returns The type of role.
     *
     * @return The type of role
     */
    public final Role.RoleType getType() {
        return this.type;
    }

    /**
     * Returns An array of the permissions the role has been granted.
     *
     * @return An array of the permissions the role has been granted
     */
    public final List<String> getPermissions() {
        return this.permissions;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was created.
     *
     * @return The ISO 8601 date and time in GMT when the resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was last updated.
     *
     * @return The ISO 8601 date and time in GMT when the resource was last updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns An absolute URL for this user role..
     *
     * @return An absolute URL for this user role.
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

        Role other = (Role) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(chatServiceSid, other.chatServiceSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(type, other.type) &&
               Objects.equals(permissions, other.permissions) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            chatServiceSid,
                            friendlyName,
                            type,
                            permissions,
                            dateCreated,
                            dateUpdated,
                            url);
    }
}