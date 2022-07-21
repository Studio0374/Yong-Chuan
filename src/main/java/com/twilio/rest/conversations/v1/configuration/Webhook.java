/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Conversations
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.conversations.v1.configuration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import java.util.List;
import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Webhook extends Resource {
    private static final long serialVersionUID = 64791700237770L;


    public static WebhookFetcher fetcher(){
        return new WebhookFetcher();
    }



    public static WebhookUpdater updater(){
        return new WebhookUpdater();
    }

    /**
    * Converts a JSON String into a Webhook object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return Webhook object represented by the provided JSON
    */
    public static Webhook fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Webhook.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a Webhook object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return Webhook object represented by the provided JSON
    */
    public static Webhook fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Webhook.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }
    public enum Method {
        GET("GET"),
        POST("POST");

        private final String value;

        private Method(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Method forValue(final String value) {
            return Promoter.enumFromString(value, Method.values());
        }
    }
    public enum Target {
        WEBHOOK("webhook"),
        FLEX("flex");

        private final String value;

        private Target(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Target forValue(final String value) {
            return Promoter.enumFromString(value, Target.values());
        }
    }

    private final String accountSid;
    private final Webhook.Method method;
    private final List<String> filters;
    private final String preWebhookUrl;
    private final String postWebhookUrl;
    private final Webhook.Target target;
    private final URI url;

    @JsonCreator
    private Webhook(
        @JsonProperty("account_sid")
        final String accountSid,

        @JsonProperty("method")
        final Webhook.Method method,

        @JsonProperty("filters")
        final List<String> filters,

        @JsonProperty("pre_webhook_url")
        final String preWebhookUrl,

        @JsonProperty("post_webhook_url")
        final String postWebhookUrl,

        @JsonProperty("target")
        final Webhook.Target target,

        @JsonProperty("url")
        final URI url
    ) {
        this.accountSid = accountSid;
        this.method = method;
        this.filters = filters;
        this.preWebhookUrl = preWebhookUrl;
        this.postWebhookUrl = postWebhookUrl;
        this.target = target;
        this.url = url;
    }

        public final String getAccountSid() {
            return this.accountSid;
        }
        public final Webhook.Method getMethod() {
            return this.method;
        }
        public final List<String> getFilters() {
            return this.filters;
        }
        public final String getPreWebhookUrl() {
            return this.preWebhookUrl;
        }
        public final String getPostWebhookUrl() {
            return this.postWebhookUrl;
        }
        public final Webhook.Target getTarget() {
            return this.target;
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

        Webhook other = (Webhook) o;

        return Objects.equals(accountSid, other.accountSid) &&  Objects.equals(method, other.method) &&  Objects.equals(filters, other.filters) &&  Objects.equals(preWebhookUrl, other.preWebhookUrl) &&  Objects.equals(postWebhookUrl, other.postWebhookUrl) &&  Objects.equals(target, other.target) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, method, filters, preWebhookUrl, postWebhookUrl, target, url);
    }

}

