/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.sync.v1;

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
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Service extends Resource {
    private static final long serialVersionUID = 2344628544363L;

    /**
     * Create a ServiceFetcher to execute fetch.
     *
     * @param pathSid The SID of the Service resource to fetch
     * @return ServiceFetcher capable of executing the fetch
     */
    public static ServiceFetcher fetcher(final String pathSid) {
        return new ServiceFetcher(pathSid);
    }

    /**
     * Create a ServiceDeleter to execute delete.
     *
     * @param pathSid The SID of the Service resource to delete
     * @return ServiceDeleter capable of executing the delete
     */
    public static ServiceDeleter deleter(final String pathSid) {
        return new ServiceDeleter(pathSid);
    }

    /**
     * Create a ServiceCreator to execute create.
     *
     * @return ServiceCreator capable of executing the create
     */
    public static ServiceCreator creator() {
        return new ServiceCreator();
    }

    /**
     * Create a ServiceReader to execute read.
     *
     * @return ServiceReader capable of executing the read
     */
    public static ServiceReader reader() {
        return new ServiceReader();
    }

    /**
     * Create a ServiceUpdater to execute update.
     *
     * @param pathSid The SID of the Service resource to update
     * @return ServiceUpdater capable of executing the update
     */
    public static ServiceUpdater updater(final String pathSid) {
        return new ServiceUpdater(pathSid);
    }

    /**
     * Converts a JSON String into a Service object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Service object represented by the provided JSON
     */
    public static Service fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Service.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Service object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Service object represented by the provided JSON
     */
    public static Service fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Service.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String uniqueName;
    private final String accountSid;
    private final String friendlyName;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;
    private final URI webhookUrl;
    private final Boolean webhooksFromRestEnabled;
    private final Boolean reachabilityWebhooksEnabled;
    private final Boolean aclEnabled;
    private final Boolean reachabilityDebouncingEnabled;
    private final Integer reachabilityDebouncingWindow;
    private final Map<String, String> links;

    @JsonCreator
    private Service(@JsonProperty("sid")
                    final String sid,
                    @JsonProperty("unique_name")
                    final String uniqueName,
                    @JsonProperty("account_sid")
                    final String accountSid,
                    @JsonProperty("friendly_name")
                    final String friendlyName,
                    @JsonProperty("date_created")
                    final String dateCreated,
                    @JsonProperty("date_updated")
                    final String dateUpdated,
                    @JsonProperty("url")
                    final URI url,
                    @JsonProperty("webhook_url")
                    final URI webhookUrl,
                    @JsonProperty("webhooks_from_rest_enabled")
                    final Boolean webhooksFromRestEnabled,
                    @JsonProperty("reachability_webhooks_enabled")
                    final Boolean reachabilityWebhooksEnabled,
                    @JsonProperty("acl_enabled")
                    final Boolean aclEnabled,
                    @JsonProperty("reachability_debouncing_enabled")
                    final Boolean reachabilityDebouncingEnabled,
                    @JsonProperty("reachability_debouncing_window")
                    final Integer reachabilityDebouncingWindow,
                    @JsonProperty("links")
                    final Map<String, String> links) {
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.webhookUrl = webhookUrl;
        this.webhooksFromRestEnabled = webhooksFromRestEnabled;
        this.reachabilityWebhooksEnabled = reachabilityWebhooksEnabled;
        this.aclEnabled = aclEnabled;
        this.reachabilityDebouncingEnabled = reachabilityDebouncingEnabled;
        this.reachabilityDebouncingWindow = reachabilityDebouncingWindow;
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
     * Returns An application-defined string that uniquely identifies the resource.
     *
     * @return An application-defined string that uniquely identifies the resource
     */
    public final String getUniqueName() {
        return this.uniqueName;
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
     * Returns The absolute URL of the Service resource.
     *
     * @return The absolute URL of the Service resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The URL we call when Sync objects are manipulated.
     *
     * @return The URL we call when Sync objects are manipulated
     */
    public final URI getWebhookUrl() {
        return this.webhookUrl;
    }

    /**
     * Returns Whether the Service instance should call webhook_url when the REST
     * API is used to update Sync objects.
     *
     * @return Whether the Service instance should call webhook_url when the REST
     *         API is used to update Sync objects
     */
    public final Boolean getWebhooksFromRestEnabled() {
        return this.webhooksFromRestEnabled;
    }

    /**
     * Returns Whether the service instance calls webhook_url when client endpoints
     * connect to Sync.
     *
     * @return Whether the service instance calls webhook_url when client endpoints
     *         connect to Sync
     */
    public final Boolean getReachabilityWebhooksEnabled() {
        return this.reachabilityWebhooksEnabled;
    }

    /**
     * Returns Whether token identities in the Service must be granted access to
     * Sync objects by using the Permissions resource.
     *
     * @return Whether token identities in the Service must be granted access to
     *         Sync objects by using the Permissions resource
     */
    public final Boolean getAclEnabled() {
        return this.aclEnabled;
    }

    /**
     * Returns Whether every endpoint_disconnected event occurs after a configurable
     * delay.
     *
     * @return Whether every endpoint_disconnected event occurs after a
     *         configurable delay
     */
    public final Boolean getReachabilityDebouncingEnabled() {
        return this.reachabilityDebouncingEnabled;
    }

    /**
     * Returns The reachability event delay in milliseconds.
     *
     * @return The reachability event delay in milliseconds
     */
    public final Integer getReachabilityDebouncingWindow() {
        return this.reachabilityDebouncingWindow;
    }

    /**
     * Returns The URLs of related resources.
     *
     * @return The URLs of related resources
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

        Service other = (Service) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(uniqueName, other.uniqueName) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url) &&
               Objects.equals(webhookUrl, other.webhookUrl) &&
               Objects.equals(webhooksFromRestEnabled, other.webhooksFromRestEnabled) &&
               Objects.equals(reachabilityWebhooksEnabled, other.reachabilityWebhooksEnabled) &&
               Objects.equals(aclEnabled, other.aclEnabled) &&
               Objects.equals(reachabilityDebouncingEnabled, other.reachabilityDebouncingEnabled) &&
               Objects.equals(reachabilityDebouncingWindow, other.reachabilityDebouncingWindow) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            uniqueName,
                            accountSid,
                            friendlyName,
                            dateCreated,
                            dateUpdated,
                            url,
                            webhookUrl,
                            webhooksFromRestEnabled,
                            reachabilityWebhooksEnabled,
                            aclEnabled,
                            reachabilityDebouncingEnabled,
                            reachabilityDebouncingWindow,
                            links);
    }

  public String toString() {
    return "Service(sid=" + this.getSid() + ", uniqueName=" + this.getUniqueName() + ", accountSid=" + this.getAccountSid() + ", friendlyName=" + this.getFriendlyName() + ", dateCreated=" + this.getDateCreated() + ", dateUpdated=" + this.getDateUpdated() + ", url=" + this.getUrl() + ", webhookUrl=" + this.getWebhookUrl() + ", webhooksFromRestEnabled=" + this.getWebhooksFromRestEnabled() + ", reachabilityWebhooksEnabled=" + this.getReachabilityWebhooksEnabled() + ", aclEnabled=" + this.getAclEnabled() + ", reachabilityDebouncingEnabled=" + this.getReachabilityDebouncingEnabled() + ", reachabilityDebouncingWindow=" + this.getReachabilityDebouncingWindow() + ", links=" + this.getLinks() + ")";
  }
}
