/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1.service.conversation;

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

import java.time.ZonedDateTime;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class ParticipantCreator extends Creator<Participant> {
    private final String pathChatServiceSid;
    private final String pathConversationSid;
    private String identity;
    private String messagingBindingAddress;
    private String messagingBindingProxyAddress;
    private ZonedDateTime dateCreated;
    private ZonedDateTime dateUpdated;
    private String attributes;
    private String messagingBindingProjectedAddress;
    private String roleSid;
    private Participant.WebhookEnabledType xTwilioWebhookEnabled;

    /**
     * Construct a new ParticipantCreator.
     *
     * @param pathChatServiceSid The SID of the Chat Service that the resource is
     *                           associated with.
     * @param pathConversationSid The unique id of the Conversation for this
     *                            participant.
     */
    public ParticipantCreator(final String pathChatServiceSid,
                              final String pathConversationSid) {
        this.pathChatServiceSid = pathChatServiceSid;
        this.pathConversationSid = pathConversationSid;
    }

    /**
     * A unique string identifier for the conversation participant as [Chat
     * User](https://www.twilio.com/docs/chat/rest/user-resource). This parameter is
     * non-null if (and only if) the participant is using the Programmable Chat SDK
     * to communicate. Limited to 256 characters..
     *
     * @param identity A unique string identifier for the conversation participant
     *                 as Chat User.
     * @return this
     */
    public ParticipantCreator setIdentity(final String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * The address of the participant's device, e.g. a phone number or Messenger ID.
     * Together with the Proxy address, this determines a participant uniquely. This
     * field (with proxy_address) is only null when the participant is interacting
     * from a Chat endpoint (see the 'identity' field)..
     *
     * @param messagingBindingAddress The address of the participant's device.
     * @return this
     */
    public ParticipantCreator setMessagingBindingAddress(final String messagingBindingAddress) {
        this.messagingBindingAddress = messagingBindingAddress;
        return this;
    }

    /**
     * The address of the Twilio phone number (or WhatsApp number, or Messenger Page
     * ID) that the participant is in contact with. This field, together with
     * participant address, is only null when the participant is interacting from a
     * Chat endpoint (see the 'identity' field)..
     *
     * @param messagingBindingProxyAddress The address of the Twilio phone number
     *                                     that the participant is in contact with.
     * @return this
     */
    public ParticipantCreator setMessagingBindingProxyAddress(final String messagingBindingProxyAddress) {
        this.messagingBindingProxyAddress = messagingBindingProxyAddress;
        return this;
    }

    /**
     * The date that this resource was created..
     *
     * @param dateCreated The date that this resource was created.
     * @return this
     */
    public ParticipantCreator setDateCreated(final ZonedDateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * The date that this resource was last updated..
     *
     * @param dateUpdated The date that this resource was last updated.
     * @return this
     */
    public ParticipantCreator setDateUpdated(final ZonedDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
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
    public ParticipantCreator setAttributes(final String attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * The address of the Twilio phone number that is used in Group MMS.
     * Communication mask for the Chat participant with Identity..
     *
     * @param messagingBindingProjectedAddress The address of the Twilio phone
     *                                         number that is used in Group MMS.
     * @return this
     */
    public ParticipantCreator setMessagingBindingProjectedAddress(final String messagingBindingProjectedAddress) {
        this.messagingBindingProjectedAddress = messagingBindingProjectedAddress;
        return this;
    }

    /**
     * The SID of the [Role](https://www.twilio.com/docs/chat/rest/role-resource) to
     * assign to the participant..
     *
     * @param roleSid The SID of the Role to assign to the participant
     * @return this
     */
    public ParticipantCreator setRoleSid(final String roleSid) {
        this.roleSid = roleSid;
        return this;
    }

    /**
     * The X-Twilio-Webhook-Enabled HTTP request header.
     *
     * @param xTwilioWebhookEnabled The X-Twilio-Webhook-Enabled HTTP request header
     * @return this
     */
    public ParticipantCreator setXTwilioWebhookEnabled(final Participant.WebhookEnabledType xTwilioWebhookEnabled) {
        this.xTwilioWebhookEnabled = xTwilioWebhookEnabled;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Participant
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Participant create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.CONVERSATIONS.toString(),
            "/v1/Services/" + this.pathChatServiceSid + "/Conversations/" + this.pathConversationSid + "/Participants"
        );

        addPostParams(request);
        addHeaderParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Participant creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Participant.fromJson(response.getStream(), client.getObjectMapper());
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
        if (identity != null) {
            request.addPostParam("Identity", identity);
        }

        if (messagingBindingAddress != null) {
            request.addPostParam("MessagingBinding.Address", messagingBindingAddress);
        }

        if (messagingBindingProxyAddress != null) {
            request.addPostParam("MessagingBinding.ProxyAddress", messagingBindingProxyAddress);
        }

        if (dateCreated != null) {
            request.addPostParam("DateCreated", dateCreated.toString());
        }

        if (dateUpdated != null) {
            request.addPostParam("DateUpdated", dateUpdated.toString());
        }

        if (attributes != null) {
            request.addPostParam("Attributes", attributes);
        }

        if (messagingBindingProjectedAddress != null) {
            request.addPostParam("MessagingBinding.ProjectedAddress", messagingBindingProjectedAddress);
        }

        if (roleSid != null) {
            request.addPostParam("RoleSid", roleSid);
        }
    }
}