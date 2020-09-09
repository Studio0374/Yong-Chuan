/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.sync.v1.service.syncmap;

import com.twilio.base.Deleter;
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
public class SyncMapItemDeleter extends Deleter<SyncMapItem> {
    private final String pathServiceSid;
    private final String pathMapSid;
    private final String pathKey;
    private String ifMatch;

    /**
     * Construct a new SyncMapItemDeleter.
     *
     * @param pathServiceSid The SID of the Sync Service with the Sync Map Item
     *                       resource to delete
     * @param pathMapSid The SID of the Sync Map with the Sync Map Item resource to
     *                   delete
     * @param pathKey The key value of the Sync Map Item resource to delete
     */
    public SyncMapItemDeleter(final String pathServiceSid,
                              final String pathMapSid,
                              final String pathKey) {
        this.pathServiceSid = pathServiceSid;
        this.pathMapSid = pathMapSid;
        this.pathKey = pathKey;
    }

    /**
     * The If-Match HTTP request header.
     *
     * @param ifMatch The If-Match HTTP request header
     * @return this
     */
    public SyncMapItemDeleter setIfMatch(final String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the delete.
     *
     * @param client TwilioRestClient with which to make the request
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public boolean delete(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.DELETE,
            Domains.SYNC.toString(),
            "/v1/Services/" + this.pathServiceSid + "/Maps/" + this.pathMapSid + "/Items/" + this.pathKey + ""
        );

        addHeaderParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("SyncMapItem delete failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return response.getStatusCode() == 204;
    }

    /**
     * Add the requested header parameters to the Request.
     *
     * @param request Request to add header params to
     */
    private void addHeaderParams(final Request request) {
        if (ifMatch != null) {
            request.addHeaderParam("If-Match", ifMatch);
        }
    }
}