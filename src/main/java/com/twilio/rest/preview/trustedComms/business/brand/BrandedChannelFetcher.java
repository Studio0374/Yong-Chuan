/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.trustedComms.business.brand;

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
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class BrandedChannelFetcher extends Fetcher<BrandedChannel> {
    private final String pathBusinessSid;
    private final String pathBrandSid;
    private final String pathSid;

    /**
     * Construct a new BrandedChannelFetcher.
     *
     * @param pathBusinessSid Business Sid.
     * @param pathBrandSid Brand Sid.
     * @param pathSid Branded Channel Sid.
     */
    public BrandedChannelFetcher(final String pathBusinessSid,
                                 final String pathBrandSid,
                                 final String pathSid) {
        this.pathBusinessSid = pathBusinessSid;
        this.pathBrandSid = pathBrandSid;
        this.pathSid = pathSid;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched BrandedChannel
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public BrandedChannel fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.PREVIEW.toString(),
            "/TrustedComms/Businesses/" + this.pathBusinessSid + "/Brands/" + this.pathBrandSid + "/BrandedChannels/" + this.pathSid + ""
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("BrandedChannel fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return BrandedChannel.fromJson(response.getStream(), client.getObjectMapper());
    }
}