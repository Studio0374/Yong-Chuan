/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.messaging.v1.service;

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
public class ShortCodeFetcher extends Fetcher<ShortCode> {
    private final String pathServiceSid;
    private final String pathSid;

    /**
     * Construct a new ShortCodeFetcher.
     *
     * @param pathServiceSid The SID of the Service to fetch the resource from
     * @param pathSid The SID that identifies the resource to fetch
     */
    public ShortCodeFetcher(final String pathServiceSid,
                            final String pathSid) {
        this.pathServiceSid = pathServiceSid;
        this.pathSid = pathSid;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched ShortCode
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public ShortCode fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.MESSAGING.toString(),
            "/v1/Services/" + this.pathServiceSid + "/ShortCodes/" + this.pathSid + ""
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("ShortCode fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return ShortCode.fromJson(response.getStream(), client.getObjectMapper());
    }
}