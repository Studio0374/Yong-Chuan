/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.numbers.v2.regulatorycompliance;

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
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SupportingDocument extends Resource {
    private static final long serialVersionUID = 164064096878384L;

  public String toString() {
    return "SupportingDocument(sid=" + this.getSid() + ", accountSid=" + this.getAccountSid() + ", friendlyName=" + this.getFriendlyName() + ", mimeType=" + this.getMimeType() + ", status=" + this.getStatus() + ", type=" + this.getType() + ", attributes=" + this.getAttributes() + ", dateCreated=" + this.getDateCreated() + ", dateUpdated=" + this.getDateUpdated() + ", url=" + this.getUrl() + ")";
  }

  public enum Status {
        DRAFT("draft"),
        PENDING_REVIEW("pending-review"),
        REJECTED("rejected"),
        APPROVED("approved"),
        EXPIRED("expired"),
        PROVISIONALLY_APPROVED("provisionally-approved");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Status from a string.
         * @param value string value
         * @return generated Status
         */
        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    /**
     * Create a SupportingDocumentCreator to execute create.
     *
     * @param friendlyName The string that you assigned to describe the resource
     * @param type The type of the Supporting Document
     * @return SupportingDocumentCreator capable of executing the create
     */
    public static SupportingDocumentCreator creator(final String friendlyName,
                                                    final String type) {
        return new SupportingDocumentCreator(friendlyName, type);
    }

    /**
     * Create a SupportingDocumentReader to execute read.
     *
     * @return SupportingDocumentReader capable of executing the read
     */
    public static SupportingDocumentReader reader() {
        return new SupportingDocumentReader();
    }

    /**
     * Create a SupportingDocumentFetcher to execute fetch.
     *
     * @param pathSid The unique string that identifies the resource
     * @return SupportingDocumentFetcher capable of executing the fetch
     */
    public static SupportingDocumentFetcher fetcher(final String pathSid) {
        return new SupportingDocumentFetcher(pathSid);
    }

    /**
     * Create a SupportingDocumentUpdater to execute update.
     *
     * @param pathSid The unique string that identifies the resource
     * @return SupportingDocumentUpdater capable of executing the update
     */
    public static SupportingDocumentUpdater updater(final String pathSid) {
        return new SupportingDocumentUpdater(pathSid);
    }

    /**
     * Create a SupportingDocumentDeleter to execute delete.
     *
     * @param pathSid The unique string that identifies the resource
     * @return SupportingDocumentDeleter capable of executing the delete
     */
    public static SupportingDocumentDeleter deleter(final String pathSid) {
        return new SupportingDocumentDeleter(pathSid);
    }

    /**
     * Converts a JSON String into a SupportingDocument object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return SupportingDocument object represented by the provided JSON
     */
    public static SupportingDocument fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SupportingDocument.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a SupportingDocument object using the
     * provided ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return SupportingDocument object represented by the provided JSON
     */
    public static SupportingDocument fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, SupportingDocument.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String friendlyName;
    private final String mimeType;
    private final SupportingDocument.Status status;
    private final String type;
    private final Map<String, Object> attributes;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private SupportingDocument(@JsonProperty("sid")
                               final String sid,
                               @JsonProperty("account_sid")
                               final String accountSid,
                               @JsonProperty("friendly_name")
                               final String friendlyName,
                               @JsonProperty("mime_type")
                               final String mimeType,
                               @JsonProperty("status")
                               final SupportingDocument.Status status,
                               @JsonProperty("type")
                               final String type,
                               @JsonProperty("attributes")
                               final Map<String, Object> attributes,
                               @JsonProperty("date_created")
                               final String dateCreated,
                               @JsonProperty("date_updated")
                               final String dateUpdated,
                               @JsonProperty("url")
                               final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.mimeType = mimeType;
        this.status = status;
        this.type = type;
        this.attributes = attributes;
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
     * Returns The string that you assigned to describe the resource.
     *
     * @return The string that you assigned to describe the resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The image type of the file.
     *
     * @return The image type of the file
     */
    public final String getMimeType() {
        return this.mimeType;
    }

    /**
     * Returns The verification status of the Supporting Document resource.
     *
     * @return The verification status of the Supporting Document resource
     */
    public final SupportingDocument.Status getStatus() {
        return this.status;
    }

    /**
     * Returns The type of the Supporting Document.
     *
     * @return The type of the Supporting Document
     */
    public final String getType() {
        return this.type;
    }

    /**
     * Returns The set of parameters that compose the Supporting Documents resource.
     *
     * @return The set of parameters that compose the Supporting Documents resource
     */
    public final Map<String, Object> getAttributes() {
        return this.attributes;
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
     * Returns The absolute URL of the Supporting Document resource.
     *
     * @return The absolute URL of the Supporting Document resource
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

        SupportingDocument other = (SupportingDocument) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(mimeType, other.mimeType) &&
               Objects.equals(status, other.status) &&
               Objects.equals(type, other.type) &&
               Objects.equals(attributes, other.attributes) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            friendlyName,
                            mimeType,
                            status,
                            type,
                            attributes,
                            dateCreated,
                            dateUpdated,
                            url);
    }
}
