/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.deployedDevices.fleet;

import com.twilio.base.Creator;
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
public class KeyCreator extends Creator<Key> {
    private final String pathFleetSid;
    private String friendlyName;
    private String deviceSid;

    /**
     * Construct a new KeyCreator.
     *
     * @param pathFleetSid The fleet_sid
     */
    public KeyCreator(final String pathFleetSid) {
        this.pathFleetSid = pathFleetSid;
    }

    /**
     * Provides a human readable descriptive text for this Key credential, up to 256
     * characters long..
     *
     * @param friendlyName The human readable description for this Key.
     * @return this
     */
    public KeyCreator setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Provides the unique string identifier of an existing Device to become
     * authenticated with this Key credential..
     *
     * @param deviceSid The unique identifier of a Key to be authenticated.
     * @return this
     */
    public KeyCreator setDeviceSid(final String deviceSid) {
        this.deviceSid = deviceSid;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Key
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Key create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            "/DeployedDevices/Fleets/" + this.pathFleetSid + "/Keys"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Key creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Key.fromJson(response.getStream(), client.getObjectMapper());
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

        if (deviceSid != null) {
            request.addPostParam("DeviceSid", deviceSid);
        }
    }
}