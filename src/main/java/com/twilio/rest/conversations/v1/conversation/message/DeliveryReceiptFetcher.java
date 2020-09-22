/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1.conversation.message;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class DeliveryReceiptFetcher extends Fetcher<DeliveryReceipt> {
    private final String pathConversationSid;
    private final String pathMessageSid;
    private final String pathSid;

    /**
     * Construct a new DeliveryReceiptFetcher.
     *
     * @param pathConversationSid The unique ID of the Conversation for this
     *                            delivery receipt.
     * @param pathMessageSid The SID of the message the delivery receipt belongs to.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     */
    public DeliveryReceiptFetcher(final String pathConversationSid,
                                  final String pathMessageSid,
                                  final String pathSid) {
        this.pathConversationSid = pathConversationSid;
        this.pathMessageSid = pathMessageSid;
        this.pathSid = pathSid;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched DeliveryReceipt
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public DeliveryReceipt fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.CONVERSATIONS.toString(),
            "/v1/Conversations/" + this.pathConversationSid + "/Messages/" + this.pathMessageSid + "/Receipts/" + this.pathSid + ""
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("DeliveryReceipt fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return DeliveryReceipt.fromJson(response.getStream(), client.getObjectMapper());
    }
}