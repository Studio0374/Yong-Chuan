/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.sync.service.syncmap;

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
public class SyncMapItemFetcher extends Fetcher<SyncMapItem> {
    private final String pathServiceSid;
    private final String pathMapSid;
    private final String pathKey;

    /**
     * Construct a new SyncMapItemFetcher.
     *
     * @param pathServiceSid The service_sid
     * @param pathMapSid The map_sid
     * @param pathKey The key
     */
    public SyncMapItemFetcher(final String pathServiceSid,
                              final String pathMapSid,
                              final String pathKey) {
        this.pathServiceSid = pathServiceSid;
        this.pathMapSid = pathMapSid;
        this.pathKey = pathKey;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched SyncMapItem
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public SyncMapItem fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.PREVIEW.toString(),
            "/Sync/Services/" + this.pathServiceSid + "/Maps/" + this.pathMapSid + "/Items/" + this.pathKey + ""
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("SyncMapItem fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return SyncMapItem.fromJson(response.getStream(), client.getObjectMapper());
    }
}