/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.chat.v2.service;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Binding extends Resource {
    private static final long serialVersionUID = 102481637129176L;

    public enum BindingType {
        GCM("gcm"),
        APN("apn"),
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
     * Create a BindingReader to execute read.
     *
     * @param pathServiceSid The SID of the Service to read the resources from
     * @return BindingReader capable of executing the read
     */
    public static BindingReader reader(final String pathServiceSid) {
        return new BindingReader(pathServiceSid);
    }

    /**
     * Create a BindingFetcher to execute fetch.
     *
     * @param pathServiceSid The SID of the Service to fetch the resource from
     * @param pathSid The SID of the resource to fetch
     * @return BindingFetcher capable of executing the fetch
     */
    public static BindingFetcher fetcher(final String pathServiceSid,
                                         final String pathSid) {
        return new BindingFetcher(pathServiceSid, pathSid);
    }

    /**
     * Create a BindingDeleter to execute delete.
     *
     * @param pathServiceSid The SID of the Service to delete the resource from
     * @param pathSid The SID of the resource to delete
     * @return BindingDeleter capable of executing the delete
     */
    public static BindingDeleter deleter(final String pathServiceSid,
                                         final String pathSid) {
        return new BindingDeleter(pathServiceSid, pathSid);
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
    private final String serviceSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String endpoint;
    private final String identity;
    private final String credentialSid;
    private final Binding.BindingType bindingType;
    private final List<String> messageTypes;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Binding(@JsonProperty("sid")
                    final String sid,
                    @JsonProperty("account_sid")
                    final String accountSid,
                    @JsonProperty("service_sid")
                    final String serviceSid,
                    @JsonProperty("date_created")
                    final String dateCreated,
                    @JsonProperty("date_updated")
                    final String dateUpdated,
                    @JsonProperty("endpoint")
                    final String endpoint,
                    @JsonProperty("identity")
                    final String identity,
                    @JsonProperty("credential_sid")
                    final String credentialSid,
                    @JsonProperty("binding_type")
                    final Binding.BindingType bindingType,
                    @JsonProperty("message_types")
                    final List<String> messageTypes,
                    @JsonProperty("url")
                    final URI url,
                    @JsonProperty("links")
                    final Map<String, String> links) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.endpoint = endpoint;
        this.identity = identity;
        this.credentialSid = credentialSid;
        this.bindingType = bindingType;
        this.messageTypes = messageTypes;
        this.url = url;
        this.links = links;
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
     * Returns The SID of the Service that the Binding resource is associated with.
     *
     * @return The SID of the Service that the Binding resource is associated with
     */
    public final String getServiceSid() {
        return this.serviceSid;
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
     * Returns The unique endpoint identifier for the Binding.
     *
     * @return The unique endpoint identifier for the Binding
     */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Returns The string that identifies the resource's User.
     *
     * @return The string that identifies the resource's User
     */
    public final String getIdentity() {
        return this.identity;
    }

    /**
     * Returns The SID of the Credential for the binding.
     *
     * @return The SID of the Credential for the binding
     */
    public final String getCredentialSid() {
        return this.credentialSid;
    }

    /**
     * Returns The push technology to use for the binding.
     *
     * @return The push technology to use for the binding
     */
    public final Binding.BindingType getBindingType() {
        return this.bindingType;
    }

    /**
     * Returns The Programmable Chat message types the binding is subscribed to.
     *
     * @return The Programmable Chat message types the binding is subscribed to
     */
    public final List<String> getMessageTypes() {
        return this.messageTypes;
    }

    /**
     * Returns The absolute URL of the Binding resource.
     *
     * @return The absolute URL of the Binding resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The absolute URLs of the Binding's User.
     *
     * @return The absolute URLs of the Binding's User
     */
    public final Map<String, String> getLinks() {
        return this.links;
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
               Objects.equals(serviceSid, other.serviceSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(endpoint, other.endpoint) &&
               Objects.equals(identity, other.identity) &&
               Objects.equals(credentialSid, other.credentialSid) &&
               Objects.equals(bindingType, other.bindingType) &&
               Objects.equals(messageTypes, other.messageTypes) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            serviceSid,
                            dateCreated,
                            dateUpdated,
                            endpoint,
                            identity,
                            credentialSid,
                            bindingType,
                            messageTypes,
                            url,
                            links);
    }
}