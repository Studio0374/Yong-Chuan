/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1.conversation;

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
public class MessageCreator extends Creator<Message> {
    private final String pathConversationSid;
    private String author;
    private String body;
    private DateTime dateCreated;
    private DateTime dateUpdated;
    private String attributes;
    private String mediaSid;
    private Message.WebhookEnabledType xTwilioWebhookEnabled;

    /**
     * Construct a new MessageCreator.
     *
     * @param pathConversationSid The unique id of the Conversation for this
     *                            message.
     */
    public MessageCreator(final String pathConversationSid) {
        this.pathConversationSid = pathConversationSid;
    }

    /**
     * The channel specific identifier of the message's author. Defaults to
     * `system`..
     *
     * @param author The channel specific identifier of the message's author.
     * @return this
     */
    public MessageCreator setAuthor(final String author) {
        this.author = author;
        return this;
    }

    /**
     * The content of the message, can be up to 1,600 characters long..
     *
     * @param body The content of the message.
     * @return this
     */
    public MessageCreator setBody(final String body) {
        this.body = body;
        return this;
    }

    /**
     * The date that this resource was created..
     *
     * @param dateCreated The date that this resource was created.
     * @return this
     */
    public MessageCreator setDateCreated(final DateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * The date that this resource was last updated. `null` if the message has not
     * been edited..
     *
     * @param dateUpdated The date that this resource was last updated.
     * @return this
     */
    public MessageCreator setDateUpdated(final DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * A string metadata field you can use to store any data you wish. The string
     * value must contain structurally valid JSON if specified.  **Note** that if
     * the attributes are not set "{}" will be returned..
     *
     * @param attributes A string metadata field you can use to store any data you
     *                   wish.
     * @return this
     */
    public MessageCreator setAttributes(final String attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * The Media Sid to be attached to the new Message..
     *
     * @param mediaSid The Media Sid to be attached to the new Message.
     * @return this
     */
    public MessageCreator setMediaSid(final String mediaSid) {
        this.mediaSid = mediaSid;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Message
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Message create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.CONVERSATIONS.toString(),
            "/v1/Conversations/" + this.pathConversationSid + "/Messages",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Message creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }

            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }

        return Message.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (author != null) {
            request.addPostParam("Author", author);
        }

        if (body != null) {
            request.addPostParam("Body", body);
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

        if (mediaSid != null) {
            request.addPostParam("MediaSid", mediaSid);
        }
    }
}