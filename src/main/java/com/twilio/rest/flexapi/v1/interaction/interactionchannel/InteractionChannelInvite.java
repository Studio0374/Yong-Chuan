/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1.interaction.interactionchannel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.Map;
import java.util.Objects;

import lombok.ToString;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class InteractionChannelInvite extends Resource {
    private static final long serialVersionUID = 96456011706810L;

    

    public static InteractionChannelInviteCreator creator(final String pathInteractionSid, final String pathChannelSid, final Map<String, Object> routing){
        return new InteractionChannelInviteCreator(pathInteractionSid, pathChannelSid, routing);
    }

    public static InteractionChannelInviteReader reader(final String pathInteractionSid, final String pathChannelSid){
        return new InteractionChannelInviteReader(pathInteractionSid, pathChannelSid);
    }

    /**
    * Converts a JSON String into a InteractionChannelInvite object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return InteractionChannelInvite object represented by the provided JSON
    */
    public static InteractionChannelInvite fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InteractionChannelInvite.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a InteractionChannelInvite object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return InteractionChannelInvite object represented by the provided JSON
    */
    public static InteractionChannelInvite fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InteractionChannelInvite.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }


    private final String sid;
    private final String interactionSid;
    private final String channelSid;
    private final Map<String, Object> routing;
    private final URI url;

    @JsonCreator
    private InteractionChannelInvite(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("interaction_sid")
        final String interactionSid,

        @JsonProperty("channel_sid")
        final String channelSid,

        @JsonProperty("routing")
        final Map<String, Object> routing,

        @JsonProperty("url")
        final URI url
    ) {
        this.sid = sid;
        this.interactionSid = interactionSid;
        this.channelSid = channelSid;
        this.routing = routing;
        this.url = url;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getInteractionSid() {
            return this.interactionSid;
        }
        public final String getChannelSid() {
            return this.channelSid;
        }
        public final Map<String, Object> getRouting() {
            return this.routing;
        }
        public final URI getUrl() {
            return this.url;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        InteractionChannelInvite other = (InteractionChannelInvite) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(interactionSid, other.interactionSid) &&  Objects.equals(channelSid, other.channelSid) &&  Objects.equals(routing, other.routing) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, interactionSid, channelSid, routing, url);
    }


}

