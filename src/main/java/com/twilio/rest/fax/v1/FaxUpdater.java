/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.fax.v1;

import com.twilio.annotations.Beta;
import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

@Beta
public class FaxUpdater extends Updater<Fax> {
    private final String pathSid;
    private Fax.UpdateStatus status;

    /**
     * Construct a new FaxUpdater.
     * 
     * @param pathSid A string that uniquely identifies this fax.
     */
    public FaxUpdater(final String pathSid) {
        this.pathSid = pathSid;
    }

    /**
     * The updated status of this fax. The only valid option is `canceled`. This may
     * fail if the status has already started transmission..
     * 
     * @param status The updated status of this fax
     * @return this
     */
    public FaxUpdater setStatus(final Fax.UpdateStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Updated Fax
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Fax update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.FAX.toString(),
            "/v1/Faxes/" + this.pathSid + "",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Fax update failed: Unable to connect to server");
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

        return Fax.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (status != null) {
            request.addPostParam("Status", status.toString());
        }
    }
}