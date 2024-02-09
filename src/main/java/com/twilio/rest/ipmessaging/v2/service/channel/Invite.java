/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Ip_messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.ipmessaging.v2.service.channel;

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
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Invite extends Resource {

    private static final long serialVersionUID = 148273166902210L;

    public static InviteCreator creator(
        final String pathServiceSid,
        final String pathChannelSid,
        final String identity
    ) {
        return new InviteCreator(pathServiceSid, pathChannelSid, identity);
    }

    public static InviteDeleter deleter(
        final String pathServiceSid,
        final String pathChannelSid,
        final String pathSid
    ) {
        return new InviteDeleter(pathServiceSid, pathChannelSid, pathSid);
    }

    public static InviteFetcher fetcher(
        final String pathServiceSid,
        final String pathChannelSid,
        final String pathSid
    ) {
        return new InviteFetcher(pathServiceSid, pathChannelSid, pathSid);
    }

    public static InviteReader reader(
        final String pathServiceSid,
        final String pathChannelSid
    ) {
        return new InviteReader(pathServiceSid, pathChannelSid);
    }

    /**
     * Converts a JSON String into a Invite object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Invite object represented by the provided JSON
     */
    public static Invite fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Invite.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Invite object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Invite object represented by the provided JSON
     */
    public static Invite fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Invite.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String channelSid;
    private final String serviceSid;
    private final String identity;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String roleSid;
    private final String createdBy;
    private final URI url;

    @JsonCreator
    private Invite(
        @JsonProperty("sid") final String sid,
        @JsonProperty("account_sid") final String accountSid,
        @JsonProperty("channel_sid") final String channelSid,
        @JsonProperty("service_sid") final String serviceSid,
        @JsonProperty("identity") final String identity,
        @JsonProperty("date_created") final String dateCreated,
        @JsonProperty("date_updated") final String dateUpdated,
        @JsonProperty("role_sid") final String roleSid,
        @JsonProperty("created_by") final String createdBy,
        @JsonProperty("url") final URI url
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.channelSid = channelSid;
        this.serviceSid = serviceSid;
        this.identity = identity;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.roleSid = roleSid;
        this.createdBy = createdBy;
        this.url = url;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getAccountSid() {
        return this.accountSid;
    }

    public final String getChannelSid() {
        return this.channelSid;
    }

    public final String getServiceSid() {
        return this.serviceSid;
    }

    public final String getIdentity() {
        return this.identity;
    }

    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    public final String getRoleSid() {
        return this.roleSid;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

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

        Invite other = (Invite) o;

        return (
            Objects.equals(sid, other.sid) &&
            Objects.equals(accountSid, other.accountSid) &&
            Objects.equals(channelSid, other.channelSid) &&
            Objects.equals(serviceSid, other.serviceSid) &&
            Objects.equals(identity, other.identity) &&
            Objects.equals(dateCreated, other.dateCreated) &&
            Objects.equals(dateUpdated, other.dateUpdated) &&
            Objects.equals(roleSid, other.roleSid) &&
            Objects.equals(createdBy, other.createdBy) &&
            Objects.equals(url, other.url)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            sid,
            accountSid,
            channelSid,
            serviceSid,
            identity,
            dateCreated,
            dateUpdated,
            roleSid,
            createdBy,
            url
        );
    }
}
