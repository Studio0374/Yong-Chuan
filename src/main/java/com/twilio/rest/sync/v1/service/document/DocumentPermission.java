/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.sync.v1.service.document;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentPermission extends Resource {
    private static final long serialVersionUID = 172715793000822L;

    /**
     * Create a DocumentPermissionFetcher to execute fetch.
     *
     * @param pathServiceSid The SID of the Sync Service with the Document
     *                       Permission resource to fetch
     * @param pathDocumentSid The SID of the Sync Document with the Document
     *                        Permission resource to fetch
     * @param pathIdentity The application-defined string that uniquely identifies
     *                     the User's Document Permission resource to fetch
     * @return DocumentPermissionFetcher capable of executing the fetch
     */
    public static DocumentPermissionFetcher fetcher(final String pathServiceSid,
                                                    final String pathDocumentSid,
                                                    final String pathIdentity) {
        return new DocumentPermissionFetcher(pathServiceSid, pathDocumentSid, pathIdentity);
    }

    /**
     * Create a DocumentPermissionDeleter to execute delete.
     *
     * @param pathServiceSid The SID of the Sync Service with the Document
     *                       Permission resource to delete
     * @param pathDocumentSid The SID of the Sync Document with the Document
     *                        Permission resource to delete
     * @param pathIdentity The application-defined string that uniquely identifies
     *                     the User's Document Permission resource to delete
     * @return DocumentPermissionDeleter capable of executing the delete
     */
    public static DocumentPermissionDeleter deleter(final String pathServiceSid,
                                                    final String pathDocumentSid,
                                                    final String pathIdentity) {
        return new DocumentPermissionDeleter(pathServiceSid, pathDocumentSid, pathIdentity);
    }

    /**
     * Create a DocumentPermissionReader to execute read.
     *
     * @param pathServiceSid The SID of the Sync Service with the Document
     *                       Permission resources to read
     * @param pathDocumentSid The SID of the Sync Document with the Document
     *                        Permission resources to read
     * @return DocumentPermissionReader capable of executing the read
     */
    public static DocumentPermissionReader reader(final String pathServiceSid,
                                                  final String pathDocumentSid) {
        return new DocumentPermissionReader(pathServiceSid, pathDocumentSid);
    }

    /**
     * Create a DocumentPermissionUpdater to execute update.
     *
     * @param pathServiceSid The SID of the Sync Service with the Document
     *                       Permission resource to update
     * @param pathDocumentSid The SID of the Sync Document with the Document
     *                        Permission resource to update
     * @param pathIdentity The application-defined string that uniquely identifies
     *                     the User's Document Permission resource to update
     * @param read Read access
     * @param write Write access
     * @param manage Manage access
     * @return DocumentPermissionUpdater capable of executing the update
     */
    public static DocumentPermissionUpdater updater(final String pathServiceSid,
                                                    final String pathDocumentSid,
                                                    final String pathIdentity,
                                                    final Boolean read,
                                                    final Boolean write,
                                                    final Boolean manage) {
        return new DocumentPermissionUpdater(pathServiceSid, pathDocumentSid, pathIdentity, read, write, manage);
    }

    /**
     * Converts a JSON String into a DocumentPermission object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return DocumentPermission object represented by the provided JSON
     */
    public static DocumentPermission fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, DocumentPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a DocumentPermission object using the
     * provided ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return DocumentPermission object represented by the provided JSON
     */
    public static DocumentPermission fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, DocumentPermission.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String serviceSid;
    private final String documentSid;
    private final String identity;
    private final Boolean read;
    private final Boolean write;
    private final Boolean manage;
    private final URI url;

    @JsonCreator
    private DocumentPermission(@JsonProperty("account_sid")
                               final String accountSid,
                               @JsonProperty("service_sid")
                               final String serviceSid,
                               @JsonProperty("document_sid")
                               final String documentSid,
                               @JsonProperty("identity")
                               final String identity,
                               @JsonProperty("read")
                               final Boolean read,
                               @JsonProperty("write")
                               final Boolean write,
                               @JsonProperty("manage")
                               final Boolean manage,
                               @JsonProperty("url")
                               final URI url) {
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.documentSid = documentSid;
        this.identity = identity;
        this.read = read;
        this.write = write;
        this.manage = manage;
        this.url = url;
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
     * Returns The SID of the Sync Service that the resource is associated with.
     *
     * @return The SID of the Sync Service that the resource is associated with
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The Sync Document SID.
     *
     * @return The Sync Document SID
     */
    public final String getDocumentSid() {
        return this.documentSid;
    }

    /**
     * Returns The identity of the user to whom the Sync Document Permission
     * applies.
     *
     * @return The identity of the user to whom the Sync Document Permission applies
     */
    public final String getIdentity() {
        return this.identity;
    }

    /**
     * Returns Read access.
     *
     * @return Read access
     */
    public final Boolean getRead() {
        return this.read;
    }

    /**
     * Returns Write access.
     *
     * @return Write access
     */
    public final Boolean getWrite() {
        return this.write;
    }

    /**
     * Returns Manage access.
     *
     * @return Manage access
     */
    public final Boolean getManage() {
        return this.manage;
    }

    /**
     * Returns The absolute URL of the Sync Document Permission resource.
     *
     * @return The absolute URL of the Sync Document Permission resource
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

        DocumentPermission other = (DocumentPermission) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(serviceSid, other.serviceSid) &&
               Objects.equals(documentSid, other.documentSid) &&
               Objects.equals(identity, other.identity) &&
               Objects.equals(read, other.read) &&
               Objects.equals(write, other.write) &&
               Objects.equals(manage, other.manage) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            serviceSid,
                            documentSid,
                            identity,
                            read,
                            write,
                            manage,
                            url);
    }

  public String toString() {
    return "DocumentPermission(accountSid=" + this.getAccountSid() + ", serviceSid=" + this.getServiceSid() + ", documentSid=" + this.getDocumentSid() + ", identity=" + this.getIdentity() + ", read=" + this.getRead() + ", write=" + this.getWrite() + ", manage=" + this.getManage() + ", url=" + this.getUrl() + ")";
  }
}
