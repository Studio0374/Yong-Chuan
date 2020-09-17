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
import com.twilio.base.Resource;
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
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Configuration extends Resource {
    private static final long serialVersionUID = 20772202953081L;

    /**
     * Create a ConfigurationFetcher to execute fetch.
     *
     * @param pathChatServiceSid The SID of the Service configuration resource to
     *                           fetch
     * @return ConfigurationFetcher capable of executing the fetch
     */
    public static ConfigurationFetcher fetcher(final String pathChatServiceSid) {
        return new ConfigurationFetcher(pathChatServiceSid);
    }

    /**
     * Create a ConfigurationUpdater to execute update.
     *
     * @param pathChatServiceSid The SID of the Service configuration resource to
     *                           update
     * @return ConfigurationUpdater capable of executing the update
     */
    public static ConfigurationUpdater updater(final String pathChatServiceSid) {
        return new ConfigurationUpdater(pathChatServiceSid);
    }

    /**
     * Converts a JSON String into a Configuration object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Configuration object represented by the provided JSON
     */
    public static Configuration fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Configuration.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Configuration object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Configuration object represented by the provided JSON
     */
    public static Configuration fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Configuration.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String chatServiceSid;
    private final String defaultConversationCreatorRoleSid;
    private final String defaultConversationRoleSid;
    private final String defaultChatServiceRoleSid;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Configuration(@JsonProperty("chat_service_sid")
                          final String chatServiceSid,
                          @JsonProperty("default_conversation_creator_role_sid")
                          final String defaultConversationCreatorRoleSid,
                          @JsonProperty("default_conversation_role_sid")
                          final String defaultConversationRoleSid,
                          @JsonProperty("default_chat_service_role_sid")
                          final String defaultChatServiceRoleSid,
                          @JsonProperty("url")
                          final URI url,
                          @JsonProperty("links")
                          final Map<String, String> links) {
        this.chatServiceSid = chatServiceSid;
        this.defaultConversationCreatorRoleSid = defaultConversationCreatorRoleSid;
        this.defaultConversationRoleSid = defaultConversationRoleSid;
        this.defaultChatServiceRoleSid = defaultChatServiceRoleSid;
        this.url = url;
        this.links = links;
    }

    /**
     * Returns The unique string that identifies the resource.
     *
     * @return The unique string that identifies the resource
     */
    public final String getChatServiceSid() {
        return this.chatServiceSid;
    }

    /**
     * Returns The role assigned to a conversation creator user when they join a new
     * conversation.
     *
     * @return The role assigned to a conversation creator user when they join a
     *         new conversation
     */
    public final String getDefaultConversationCreatorRoleSid() {
        return this.defaultConversationCreatorRoleSid;
    }

    /**
     * Returns The role assigned to users when they are added to a conversation.
     *
     * @return The role assigned to users when they are added to a conversation
     */
    public final String getDefaultConversationRoleSid() {
        return this.defaultConversationRoleSid;
    }

    /**
     * Returns The service role assigned to users when they are added to the
     * service.
     *
     * @return The service role assigned to users when they are added to the service
     */
    public final String getDefaultChatServiceRoleSid() {
        return this.defaultChatServiceRoleSid;
    }

    /**
     * Returns The absolute URL of the Service configuration resource.
     *
     * @return The absolute URL of the Service configuration resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns Absolute URL to access the Push Notifications configuration of this
     * Service..
     *
     * @return Absolute URL to access the Push Notifications configuration of this
     *         Service.
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

        Configuration other = (Configuration) o;

        return Objects.equals(chatServiceSid, other.chatServiceSid) &&
               Objects.equals(defaultConversationCreatorRoleSid, other.defaultConversationCreatorRoleSid) &&
               Objects.equals(defaultConversationRoleSid, other.defaultConversationRoleSid) &&
               Objects.equals(defaultChatServiceRoleSid, other.defaultChatServiceRoleSid) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chatServiceSid,
                            defaultConversationCreatorRoleSid,
                            defaultConversationRoleSid,
                            defaultChatServiceRoleSid,
                            url,
                            links);
    }
}