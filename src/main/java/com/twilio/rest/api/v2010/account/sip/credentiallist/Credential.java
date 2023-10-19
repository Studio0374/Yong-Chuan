/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account.sip.credentiallist;

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

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.time.ZonedDateTime;

import java.util.Objects;

import lombok.ToString;


@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Credential extends Resource {
    private static final long serialVersionUID = 238688210273177L;

    

    public static CredentialCreator creator(final String pathCredentialListSid, final String username, final String password){
        return new CredentialCreator(pathCredentialListSid, username, password);
    }
    public static CredentialCreator creator(final String pathAccountSid, final String pathCredentialListSid, final String username, final String password){
        return new CredentialCreator(pathAccountSid, pathCredentialListSid, username, password);
    }

    public static CredentialDeleter deleter(final String pathCredentialListSid, final String pathSid){
        return new CredentialDeleter(pathCredentialListSid, pathSid);
    }
    public static CredentialDeleter deleter(final String pathAccountSid, final String pathCredentialListSid, final String pathSid){
        return new CredentialDeleter(pathAccountSid, pathCredentialListSid, pathSid);
    }

    public static CredentialFetcher fetcher(final String pathCredentialListSid, final String pathSid){
        return new CredentialFetcher(pathCredentialListSid, pathSid);
    }
    public static CredentialFetcher fetcher(final String pathAccountSid, final String pathCredentialListSid, final String pathSid){
        return new CredentialFetcher(pathAccountSid, pathCredentialListSid, pathSid);
    }

    public static CredentialReader reader(final String pathCredentialListSid){
        return new CredentialReader(pathCredentialListSid);
    }
    public static CredentialReader reader(final String pathAccountSid, final String pathCredentialListSid){
        return new CredentialReader(pathAccountSid, pathCredentialListSid);
    }

    public static CredentialUpdater updater(final String pathCredentialListSid, final String pathSid){
        return new CredentialUpdater(pathCredentialListSid, pathSid);
    }
    public static CredentialUpdater updater(final String pathAccountSid, final String pathCredentialListSid, final String pathSid){
        return new CredentialUpdater(pathAccountSid, pathCredentialListSid, pathSid);
    }

    /**
    * Converts a JSON String into a Credential object using the provided ObjectMapper.
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
    private final String credentialListSid;
    private final String username;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String uri;

    @JsonCreator
    private Credential(
        @JsonProperty("sid")
        final String sid,

        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("credential_list_sid")
        final String credentialListSid,

        @JsonProperty("username")
        final String username,

        @JsonProperty("date_created")
        final String dateCreated,

        @JsonProperty("date_updated")
        final String dateUpdated,

        @JsonProperty("uri")
        final String uri
    ) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.credentialListSid = credentialListSid;
        this.username = username;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.uri = uri;
    }

        public final String getSid() {
            return this.sid;
        }
        public final String getAccountSid() {
            return this.accountSid;
        }
        public final String getCredentialListSid() {
            return this.credentialListSid;
        }
        public final String getUsername() {
            return this.username;
        }
        public final ZonedDateTime getDateCreated() {
            return this.dateCreated;
        }
        public final ZonedDateTime getDateUpdated() {
            return this.dateUpdated;
        }
        public final String getUri() {
            return this.uri;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Credential other = (Credential) o;

        return Objects.equals(sid, other.sid) &&  Objects.equals(accountSid, other.accountSid) &&  Objects.equals(credentialListSid, other.credentialListSid) &&  Objects.equals(username, other.username) &&  Objects.equals(dateCreated, other.dateCreated) &&  Objects.equals(dateUpdated, other.dateUpdated) &&  Objects.equals(uri, other.uri)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, accountSid, credentialListSid, username, dateCreated, dateUpdated, uri);
    }


}

