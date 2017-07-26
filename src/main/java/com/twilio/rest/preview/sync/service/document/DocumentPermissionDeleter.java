/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.sync.service.document;

import com.twilio.annotations.Preview;
import com.twilio.base.Deleter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

@Preview
public class DocumentPermissionDeleter extends Deleter<DocumentPermission> {
    private final String pathServiceSid;
    private final String pathDocumentSid;
    private final String pathIdentity;

    /**
     * Construct a new DocumentPermissionDeleter.
     * 
     * @param pathServiceSid The service_sid
     * @param pathDocumentSid Sync Document SID or unique name.
     * @param pathIdentity Identity of the user to whom the Sync Document
     *                     Permission applies.
     */
    public DocumentPermissionDeleter(final String pathServiceSid, 
                                     final String pathDocumentSid, 
                                     final String pathIdentity) {
        this.pathServiceSid = pathServiceSid;
        this.pathDocumentSid = pathDocumentSid;
        this.pathIdentity = pathIdentity;
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
            Domains.PREVIEW.toString(),
            "/Sync/Services/" + this.pathServiceSid + "/Documents/" + this.pathDocumentSid + "/Permissions/" + this.pathIdentity + "",
            client.getRegion()
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("DocumentPermission delete failed: Unable to connect to server");
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

        return response.getStatusCode() == 204;
    }
}