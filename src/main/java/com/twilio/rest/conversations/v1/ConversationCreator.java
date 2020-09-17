/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1;

import com.twilio.base.Creator;
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

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class ConversationCreator extends Creator<Conversation> {
    private String friendlyName;
    private String uniqueName;
    private DateTime dateCreated;
    private DateTime dateUpdated;
    private String messagingServiceSid;
    private String attributes;
    private Conversation.State state;
    private String timersInactive;
    private String timersClosed;
    private Conversation.WebhookEnabledType xTwilioWebhookEnabled;

    /**
     * The human-readable name of this conversation, limited to 256 characters.
     * Optional..
     *
     * @param friendlyName The human-readable name of this conversation.
     * @return this
     */
    public ConversationCreator setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * An application-defined string that uniquely identifies the resource. It can
     * be used to address the resource in place of the resource's `sid` in the URL..
     *
     * @param uniqueName An application-defined string that uniquely identifies the
     *                   resource
     * @return this
     */
    public ConversationCreator setUniqueName(final String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * The date that this resource was created..
     *
     * @param dateCreated The date that this resource was created.
     * @return this
     */
    public ConversationCreator setDateCreated(final DateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * The date that this resource was last updated..
     *
     * @param dateUpdated The date that this resource was last updated.
     * @return this
     */
    public ConversationCreator setDateUpdated(final DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * The unique id of the [SMS
     * Service](https://www.twilio.com/docs/sms/services/api) this conversation
     * belongs to..
     *
     * @param messagingServiceSid The unique id of the SMS Service this
     *                            conversation belongs to.
     * @return this
     */
    public ConversationCreator setMessagingServiceSid(final String messagingServiceSid) {
        this.messagingServiceSid = messagingServiceSid;
        return this;
    }

    /**
     * An optional string metadata field you can use to store any data you wish. The
     * string value must contain structurally valid JSON if specified.  **Note**
     * that if the attributes are not set "{}" will be returned..
     *
     * @param attributes An optional string metadata field you can use to store any
     *                   data you wish.
     * @return this
     */
    public ConversationCreator setAttributes(final String attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Current state of this conversation. Can be either `active`, `inactive` or
     * `closed` and defaults to `active`.
     *
     * @param state Current state of this conversation.
     * @return this
     */
    public ConversationCreator setState(final Conversation.State state) {
        this.state = state;
        return this;
    }

    /**
     * ISO8601 duration when conversation will be switched to `inactive` state.
     * Minimum value for this timer is 1 minute..
     *
     * @param timersInactive ISO8601 duration when conversation will be switched to
     *                       `inactive` state.
     * @return this
     */
    public ConversationCreator setTimersInactive(final String timersInactive) {
        this.timersInactive = timersInactive;
        return this;
    }

    /**
     * ISO8601 duration when conversation will be switched to `closed` state.
     * Minimum value for this timer is 10 minutes..
     *
     * @param timersClosed ISO8601 duration when conversation will be switched to
     *                     `closed` state.
     * @return this
     */
    public ConversationCreator setTimersClosed(final String timersClosed) {
        this.timersClosed = timersClosed;
        return this;
    }

    /**
     * The X-Twilio-Webhook-Enabled HTTP request header.
     *
     * @param xTwilioWebhookEnabled The X-Twilio-Webhook-Enabled HTTP request header
     * @return this
     */
    public ConversationCreator setXTwilioWebhookEnabled(final Conversation.WebhookEnabledType xTwilioWebhookEnabled) {
        this.xTwilioWebhookEnabled = xTwilioWebhookEnabled;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Conversation
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Conversation create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.CONVERSATIONS.toString(),
            "/v1/Conversations"
        );

        addPostParams(request);
        addHeaderParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Conversation creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Conversation.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested header parameters to the Request.
     *
     * @param request Request to add header params to
     */
    private void addHeaderParams(final Request request) {
        if (xTwilioWebhookEnabled != null) {
            request.addHeaderParam("X-Twilio-Webhook-Enabled", xTwilioWebhookEnabled.toString());
        }
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

        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
        }

        if (dateCreated != null) {
            request.addPostParam("DateCreated", dateCreated.toString());
        }

        if (dateUpdated != null) {
            request.addPostParam("DateUpdated", dateUpdated.toString());
        }

        if (messagingServiceSid != null) {
            request.addPostParam("MessagingServiceSid", messagingServiceSid);
        }

        if (attributes != null) {
            request.addPostParam("Attributes", attributes);
        }

        if (state != null) {
            request.addPostParam("State", state.toString());
        }

        if (timersInactive != null) {
            request.addPostParam("Timers.Inactive", timersInactive);
        }

        if (timersClosed != null) {
            request.addPostParam("Timers.Closed", timersClosed);
        }
    }
}