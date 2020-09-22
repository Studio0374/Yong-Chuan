/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.events.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Subscription extends Resource {
    private static final long serialVersionUID = 270385027985111L;

    /**
     * Create a SubscriptionReader to execute read.
     *
     * @return SubscriptionReader capable of executing the read
     */
    public static SubscriptionReader reader() {
        return new SubscriptionReader();
    }

    /**
     * Create a SubscriptionFetcher to execute fetch.
     *
     * @param pathSid A string that uniquely identifies this Subscription.
     * @return SubscriptionFetcher capable of executing the fetch
     */
    public static SubscriptionFetcher fetcher(final String pathSid) {
        return new SubscriptionFetcher(pathSid);
    }

    /**
     * Create a SubscriptionCreator to execute create.
     *
     * @param description Subscription description
     * @param sinkSid Sink SID.
     * @param types Nested resource URLs.
     * @return SubscriptionCreator capable of executing the create
     */
    public static SubscriptionCreator creator(final String description,
                                              final String sinkSid,
                                              final List<Map<String, Object>> types) {
        return new SubscriptionCreator(description, sinkSid, types);
    }

    /**
     * Create a SubscriptionUpdater to execute update.
     *
     * @param pathSid The sid
     * @return SubscriptionUpdater capable of executing the update
     */
    public static SubscriptionUpdater updater(final String pathSid) {
        return new SubscriptionUpdater(pathSid);
    }

    /**
     * Create a SubscriptionDeleter to execute delete.
     *
     * @param pathSid A string that uniquely identifies this Subscription.
     * @return SubscriptionDeleter capable of executing the delete
     */
    public static SubscriptionDeleter deleter(final String pathSid) {
        return new SubscriptionDeleter(pathSid);
    }

    /**
     * Converts a JSON String into a Subscription object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Subscription object represented by the provided JSON
     */
    public static Subscription fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Subscription.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Subscription object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Subscription object represented by the provided JSON
     */
    public static Subscription fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Subscription.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String sid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String description;
    private final String sinkSid;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Subscription(@JsonProperty("account_sid")
                         final String accountSid,
                         @JsonProperty("sid")
                         final String sid,
                         @JsonProperty("date_created")
                         final String dateCreated,
                         @JsonProperty("date_updated")
                         final String dateUpdated,
                         @JsonProperty("description")
                         final String description,
                         @JsonProperty("sink_sid")
                         final String sinkSid,
                         @JsonProperty("url")
                         final URI url,
                         @JsonProperty("links")
                         final Map<String, String> links) {
        this.accountSid = accountSid;
        this.sid = sid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.description = description;
        this.sinkSid = sinkSid;
        this.url = url;
        this.links = links;
    }

    /**
     * Returns Account SID..
     *
     * @return Account SID.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns A string that uniquely identifies this Subscription..
     *
     * @return A string that uniquely identifies this Subscription.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The date this Subscription was created.
     *
     * @return The date this Subscription was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date this Subscription was updated.
     *
     * @return The date this Subscription was updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns Subscription description.
     *
     * @return Subscription description
     */
    public final String getDescription() {
        return this.description;
    }

    /**
     * Returns Sink SID..
     *
     * @return Sink SID.
     */
    public final String getSinkSid() {
        return this.sinkSid;
    }

    /**
     * Returns The URL of this resource..
     *
     * @return The URL of this resource.
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns Nested resource URLs..
     *
     * @return Nested resource URLs.
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

        Subscription other = (Subscription) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(description, other.description) &&
               Objects.equals(sinkSid, other.sinkSid) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            sid,
                            dateCreated,
                            dateUpdated,
                            description,
                            sinkSid,
                            url,
                            links);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("sid", sid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("description", description)
                          .add("sinkSid", sinkSid)
                          .add("url", url)
                          .add("links", links)
                          .toString();
    }
}