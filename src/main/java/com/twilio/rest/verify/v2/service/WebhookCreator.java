/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.verify.v2.service;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.util.List;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class WebhookCreator extends Creator<Webhook> {
    private final String pathServiceSid;
    private final String friendlyName;
    private final List<String> eventTypes;
    private final String webhookUrl;
    private Webhook.Status status;

    /**
     * Construct a new WebhookCreator.
     *
     * @param pathServiceSid Service Sid.
     * @param friendlyName The string that you assigned to describe the webhook
     * @param eventTypes The array of events that this Webhook is subscribed to.
     * @param webhookUrl The URL associated with this Webhook.
     */
    public WebhookCreator(final String pathServiceSid,
                          final String friendlyName,
                          final List<String> eventTypes,
                          final String webhookUrl) {
        this.pathServiceSid = pathServiceSid;
        this.friendlyName = friendlyName;
        this.eventTypes = eventTypes;
        this.webhookUrl = webhookUrl;
    }

    /**
     * The webhook status. Default value is `enabled`. One of: `enabled` or
     * `disabled`.
     *
     * @param status The webhook status
     * @return this
     */
    public WebhookCreator setStatus(final Webhook.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Webhook
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Webhook create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.VERIFY.toString(),
            "/v2/Services/" + this.pathServiceSid + "/Webhooks"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Webhook creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Webhook.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (eventTypes != null) {
            for (String prop : eventTypes) {
                request.addPostParam("EventTypes", prop);
            }
        }

        if (webhookUrl != null) {
            request.addPostParam("WebhookUrl", webhookUrl);
        }

        if (status != null) {
            request.addPostParam("Status", status.toString());
        }
    }
}