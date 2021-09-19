/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.sip.domain;

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
import java.time.ZonedDateTime;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IpAccessControlListMapping extends Resource {
    private static final long serialVersionUID = 124631283719595L;

    /**
     * Create a IpAccessControlListMappingFetcher to execute fetch.
     *
     * @param pathAccountSid The unique id of the Account that is responsible for
     *                       this resource.
     * @param pathDomainSid A string that uniquely identifies the SIP Domain
     * @param pathSid A 34 character string that uniquely identifies the resource
     *                to fetch.
     * @return IpAccessControlListMappingFetcher capable of executing the fetch
     */
    public static IpAccessControlListMappingFetcher fetcher(final String pathAccountSid,
                                                            final String pathDomainSid,
                                                            final String pathSid) {
        return new IpAccessControlListMappingFetcher(pathAccountSid, pathDomainSid, pathSid);
    }

    /**
     * Create a IpAccessControlListMappingFetcher to execute fetch.
     *
     * @param pathDomainSid A string that uniquely identifies the SIP Domain
     * @param pathSid A 34 character string that uniquely identifies the resource
     *                to fetch.
     * @return IpAccessControlListMappingFetcher capable of executing the fetch
     */
    public static IpAccessControlListMappingFetcher fetcher(final String pathDomainSid,
                                                            final String pathSid) {
        return new IpAccessControlListMappingFetcher(pathDomainSid, pathSid);
    }

    /**
     * Create a IpAccessControlListMappingCreator to execute create.
     *
     * @param pathAccountSid The unique id of the Account that is responsible for
     *                       this resource.
     * @param pathDomainSid A string that uniquely identifies the SIP Domain
     * @param ipAccessControlListSid The unique id of the IP access control list to
     *                               map to the SIP domain
     * @return IpAccessControlListMappingCreator capable of executing the create
     */
    public static IpAccessControlListMappingCreator creator(final String pathAccountSid,
                                                            final String pathDomainSid,
                                                            final String ipAccessControlListSid) {
        return new IpAccessControlListMappingCreator(pathAccountSid, pathDomainSid, ipAccessControlListSid);
    }

    /**
     * Create a IpAccessControlListMappingCreator to execute create.
     *
     * @param pathDomainSid A string that uniquely identifies the SIP Domain
     * @param ipAccessControlListSid The unique id of the IP access control list to
     *                               map to the SIP domain
     * @return IpAccessControlListMappingCreator capable of executing the create
     */
    public static IpAccessControlListMappingCreator creator(final String pathDomainSid,
                                                            final String ipAccessControlListSid) {
        return new IpAccessControlListMappingCreator(pathDomainSid, ipAccessControlListSid);
    }

    /**
     * Create a IpAccessControlListMappingReader to execute read.
     *
     * @param pathAccountSid The unique id of the Account that is responsible for
     *                       this resource.
     * @param pathDomainSid A string that uniquely identifies the SIP Domain
     * @return IpAccessControlListMappingReader capable of executing the read
     */
    public static IpAccessControlListMappingReader reader(final String pathAccountSid,
                                                          final String pathDomainSid) {
        return new IpAccessControlListMappingReader(pathAccountSid, pathDomainSid);
    }

    /**
     * Create a IpAccessControlListMappingReader to execute read.
     *
     * @param pathDomainSid A string that uniquely identifies the SIP Domain
     * @return IpAccessControlListMappingReader capable of executing the read
     */
    public static IpAccessControlListMappingReader reader(final String pathDomainSid) {
        return new IpAccessControlListMappingReader(pathDomainSid);
    }

    /**
     * Create a IpAccessControlListMappingDeleter to execute delete.
     *
     * @param pathAccountSid The unique id of the Account that is responsible for
     *                       this resource.
     * @param pathDomainSid A string that uniquely identifies the SIP Domain
     * @param pathSid A 34 character string that uniquely identifies the resource
     *                to delete.
     * @return IpAccessControlListMappingDeleter capable of executing the delete
     */
    public static IpAccessControlListMappingDeleter deleter(final String pathAccountSid,
                                                            final String pathDomainSid,
                                                            final String pathSid) {
        return new IpAccessControlListMappingDeleter(pathAccountSid, pathDomainSid, pathSid);
    }

    /**
     * Create a IpAccessControlListMappingDeleter to execute delete.
     *
     * @param pathDomainSid A string that uniquely identifies the SIP Domain
     * @param pathSid A 34 character string that uniquely identifies the resource
     *                to delete.
     * @return IpAccessControlListMappingDeleter capable of executing the delete
     */
    public static IpAccessControlListMappingDeleter deleter(final String pathDomainSid,
                                                            final String pathSid) {
        return new IpAccessControlListMappingDeleter(pathDomainSid, pathSid);
    }

    /**
     * Converts a JSON String into a IpAccessControlListMapping object using the
     * provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return IpAccessControlListMapping object represented by the provided JSON
     */
    public static IpAccessControlListMapping fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, IpAccessControlListMapping.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a IpAccessControlListMapping object using
     * the provided ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return IpAccessControlListMapping object represented by the provided JSON
     */
    public static IpAccessControlListMapping fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, IpAccessControlListMapping.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String domainSid;
    private final String friendlyName;
    private final String sid;
    private final String uri;

    @JsonCreator
    private IpAccessControlListMapping(@JsonProperty("account_sid")
                                       final String accountSid,
                                       @JsonProperty("date_created")
                                       final String dateCreated,
                                       @JsonProperty("date_updated")
                                       final String dateUpdated,
                                       @JsonProperty("domain_sid")
                                       final String domainSid,
                                       @JsonProperty("friendly_name")
                                       final String friendlyName,
                                       @JsonProperty("sid")
                                       final String sid,
                                       @JsonProperty("uri")
                                       final String uri) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.domainSid = domainSid;
        this.friendlyName = friendlyName;
        this.sid = sid;
        this.uri = uri;
    }

    /**
     * Returns The unique id of the Account that is responsible for this resource..
     *
     * @return The unique id of the Account that is responsible for this resource.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The date that this resource was created, given as GMT in RFC 2822
     * format..
     *
     * @return The date that this resource was created, given as GMT in RFC 2822
     *         format.
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date that this resource was last updated, given as GMT in RFC
     * 2822 format..
     *
     * @return The date that this resource was last updated, given as GMT in RFC
     *         2822 format.
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The unique string that identifies the SipDomain resource..
     *
     * @return The unique string that identifies the SipDomain resource.
     */
    public final String getDomainSid() {
        return this.domainSid;
    }

    /**
     * Returns A human readable descriptive text for this resource, up to 64
     * characters long..
     *
     * @return A human readable descriptive text for this resource, up to 64
     *         characters long.
     */
    public final String getFriendlyName() {
        return this.friendlyName;
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
     * Returns The URI for this resource, relative to https://api.twilio.com.
     *
     * @return The URI for this resource, relative to https://api.twilio.com
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

        IpAccessControlListMapping other = (IpAccessControlListMapping) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(domainSid, other.domainSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(uri, other.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            domainSid,
                            friendlyName,
                            sid,
                            uri);
    }

  public String toString() {
    return "IpAccessControlListMapping(accountSid=" + this.getAccountSid() + ", dateCreated=" + this.getDateCreated() + ", dateUpdated=" + this.getDateUpdated() + ", domainSid=" + this.getDomainSid() + ", friendlyName=" + this.getFriendlyName() + ", sid=" + this.getSid() + ", uri=" + this.getUri() + ")";
  }
}
