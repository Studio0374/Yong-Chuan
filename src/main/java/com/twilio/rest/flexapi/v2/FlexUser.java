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

package com.twilio.rest.flexapi.v2;

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
public class FlexUser extends Resource {

    private static final long serialVersionUID = 256615130966532L;

    public static FlexUserFetcher fetcher(
        final String pathInstanceSid,
        final String pathFlexUserSid
    ) {
        return new FlexUserFetcher(pathInstanceSid, pathFlexUserSid);
    }

    /**
     * Converts a JSON String into a FlexUser object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return FlexUser object represented by the provided JSON
     */
    public static FlexUser fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FlexUser.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a FlexUser object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return FlexUser object represented by the provided JSON
     */
    public static FlexUser fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FlexUser.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String instanceSid;
    private final String userSid;
    private final String flexUserSid;
    private final String workerSid;
    private final String workspaceSid;
    private final String flexTeamSid;
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String email;
    private final String friendlyName;
    private final ZonedDateTime createdDate;
    private final ZonedDateTime updatedDate;
    private final Integer version;
    private final URI url;

    @JsonCreator
    private FlexUser(
        @JsonProperty("account_sid") final String accountSid,
        @JsonProperty("instance_sid") final String instanceSid,
        @JsonProperty("user_sid") final String userSid,
        @JsonProperty("flex_user_sid") final String flexUserSid,
        @JsonProperty("worker_sid") final String workerSid,
        @JsonProperty("workspace_sid") final String workspaceSid,
        @JsonProperty("flex_team_sid") final String flexTeamSid,
        @JsonProperty("first_name") final String firstName,
        @JsonProperty("last_name") final String lastName,
        @JsonProperty("username") final String username,
        @JsonProperty("email") final String email,
        @JsonProperty("friendly_name") final String friendlyName,
        @JsonProperty("created_date") final String createdDate,
        @JsonProperty("updated_date") final String updatedDate,
        @JsonProperty("version") final Integer version,
        @JsonProperty("url") final URI url
    ) {
        this.accountSid = accountSid;
        this.instanceSid = instanceSid;
        this.userSid = userSid;
        this.flexUserSid = flexUserSid;
        this.workerSid = workerSid;
        this.workspaceSid = workspaceSid;
        this.flexTeamSid = flexTeamSid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.friendlyName = friendlyName;
        this.createdDate = DateConverter.iso8601DateTimeFromString(createdDate);
        this.updatedDate = DateConverter.iso8601DateTimeFromString(updatedDate);
        this.version = version;
        this.url = url;
    }

    public final String getAccountSid() {
        return this.accountSid;
    }

    public final String getInstanceSid() {
        return this.instanceSid;
    }

    public final String getUserSid() {
        return this.userSid;
    }

    public final String getFlexUserSid() {
        return this.flexUserSid;
    }

    public final String getWorkerSid() {
        return this.workerSid;
    }

    public final String getWorkspaceSid() {
        return this.workspaceSid;
    }

    public final String getFlexTeamSid() {
        return this.flexTeamSid;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFriendlyName() {
        return this.friendlyName;
    }

    public final ZonedDateTime getCreatedDate() {
        return this.createdDate;
    }

    public final ZonedDateTime getUpdatedDate() {
        return this.updatedDate;
    }

    public final Integer getVersion() {
        return this.version;
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

        FlexUser other = (FlexUser) o;

        return (
            Objects.equals(accountSid, other.accountSid) &&
            Objects.equals(instanceSid, other.instanceSid) &&
            Objects.equals(userSid, other.userSid) &&
            Objects.equals(flexUserSid, other.flexUserSid) &&
            Objects.equals(workerSid, other.workerSid) &&
            Objects.equals(workspaceSid, other.workspaceSid) &&
            Objects.equals(flexTeamSid, other.flexTeamSid) &&
            Objects.equals(firstName, other.firstName) &&
            Objects.equals(lastName, other.lastName) &&
            Objects.equals(username, other.username) &&
            Objects.equals(email, other.email) &&
            Objects.equals(friendlyName, other.friendlyName) &&
            Objects.equals(createdDate, other.createdDate) &&
            Objects.equals(updatedDate, other.updatedDate) &&
            Objects.equals(version, other.version) &&
            Objects.equals(url, other.url)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            accountSid,
            instanceSid,
            userSid,
            flexUserSid,
            workerSid,
            workspaceSid,
            flexTeamSid,
            firstName,
            lastName,
            username,
            email,
            friendlyName,
            createdDate,
            updatedDate,
            version,
            url
        );
    }
}