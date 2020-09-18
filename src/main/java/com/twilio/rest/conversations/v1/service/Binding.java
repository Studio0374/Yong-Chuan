/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
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

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Binding extends Resource {
    private static final long serialVersionUID = 252683481132009L;

    public enum BindingType {
        APN("apn"),
        GCM("gcm"),
        FCM("fcm");

        private final String value;

        private BindingType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a BindingType from a string.
         * @param value string value
         * @return generated BindingType
         */
        @JsonCreator
        public static BindingType forValue(final String value) {
            return Promoter.enumFromString(value, BindingType.values());
        }
    }

    /**
     * Create a BindingDeleter to execute delete.
     *
     * @param pathChatServiceSid The chat_service_sid
     * @param pathSid The SID of the resource to delete
     * @return BindingDeleter capable of executing the delete
     */
    public static BindingDeleter deleter(final String pathChatServiceSid,
                                         final String pathSid) {
        return new BindingDeleter(pathChatServiceSid, pathSid);
    }

    /**
     * Create a BindingFetcher to execute fetch.
     *
     * @param pathChatServiceSid The SID of the Chat Service that the resource is
     *                           associated with.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     * @return BindingFetcher capable of executing the fetch
     */
    public static BindingFetcher fetcher(final String pathChatServiceSid,
                                         final String pathSid) {
        return new BindingFetcher(pathChatServiceSid, pathSid);
    }

    /**
     * Create a BindingReader to execute read.
     *
     * @param pathChatServiceSid The SID of the Chat Service that the resource is
     *                           associated with.
     * @return BindingReader capable of executing the read
     */
    public static BindingReader reader(final String pathChatServiceSid) {
        return new BindingReader(pathChatServiceSid);
    }

    /**
     * Converts a JSON String into a Binding object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Binding object represented by the provided JSON
     */
    public static Binding fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Binding.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Binding object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Binding object represented by the provided JSON
     */
    public static Binding fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Binding.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String chatServiceSid;
    private final String credentialSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String endpoint;
    private final String identity;
    private final Binding.BindingType bindingType;
    private final List<String> messageTypes;
    private final URI url;

    @JsonCreator
    private Binding(@JsonProperty("sid")
                    final String sid,
                    @JsonProperty("account_sid")
                    final String accountSid,
                    @JsonProperty("chat_service_sid")
                    final String chatServiceSid,
                    @JsonProperty("credential_sid")
                    final String credentialSid,
                    @JsonProperty("date_created")
                    final String dateCreated,
                    @JsonProperty("date_updated")
                    final String dateUpdated,
                    @JsonProperty("endpoint")
                    final String endpoint,
                    @JsonProperty("identity")
                    final String identity,
                    @JsonProperty("binding_type")
                    final Binding.BindingType bindingType,
                    @JsonProperty("message_types")
                    final List<String> messageTypes,
                    @JsonProperty("url")
                    final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.chatServiceSid = chatServiceSid;
        this.credentialSid = credentialSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.endpoint = endpoint;
        this.identity = identity;
        this.bindingType = bindingType;
        this.messageTypes = messageTypes;
        this.url = url;
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
     * Returns The unique id of the Account responsible for this binding..
     *
     * @return The unique id of the Account responsible for this binding.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The SID of the Chat Service that the resource is associated with..
     *
     * @return The SID of the Chat Service that the resource is associated with.
     */
    public final String getChatServiceSid() {
        return this.chatServiceSid;
    }

    /**
     * Returns The SID of the Credential for the binding..
     *
     * @return The SID of the Credential for the binding.
     */
    public final String getCredentialSid() {
        return this.credentialSid;
    }

    /**
     * Returns The date that this resource was created..
     *
     * @return The date that this resource was created.
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date that this resource was last updated..
     *
     * @return The date that this resource was last updated.
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The unique endpoint identifier for the Binding..
     *
     * @return The unique endpoint identifier for the Binding.
     */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Returns The string that identifies the resource's User..
     *
     * @return The string that identifies the resource's User.
     */
    public final String getIdentity() {
        return this.identity;
    }

    /**
     * Returns The push technology to use for the binding..
     *
     * @return The push technology to use for the binding.
     */
    public final Binding.BindingType getBindingType() {
        return this.bindingType;
    }

    /**
     * Returns The Chat message types the binding is subscribed to..
     *
     * @return The Chat message types the binding is subscribed to.
     */
    public final List<String> getMessageTypes() {
        return this.messageTypes;
    }

    /**
     * Returns An absolute URL for this binding..
     *
     * @return An absolute URL for this binding.
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

        Binding other = (Binding) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(chatServiceSid, other.chatServiceSid) &&
               Objects.equals(credentialSid, other.credentialSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(endpoint, other.endpoint) &&
               Objects.equals(identity, other.identity) &&
               Objects.equals(bindingType, other.bindingType) &&
               Objects.equals(messageTypes, other.messageTypes) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            chatServiceSid,
                            credentialSid,
                            dateCreated,
                            dateUpdated,
                            endpoint,
                            identity,
                            bindingType,
                            messageTypes,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("chatServiceSid", chatServiceSid)
                          .add("credentialSid", credentialSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("endpoint", endpoint)
                          .add("identity", identity)
                          .add("bindingType", bindingType)
                          .add("messageTypes", messageTypes)
                          .add("url", url)
                          .toString();
    }
}