/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.routes.v2;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class PhoneNumberCreator extends Creator<PhoneNumber> {
    private final String pathPhoneNumber;
    private String voiceRegion;
    private String friendlyName;

    /**
     * Construct a new PhoneNumberCreator.
     *
     * @param pathPhoneNumber The phone number
     */
    public PhoneNumberCreator(final String pathPhoneNumber) {
        this.pathPhoneNumber = pathPhoneNumber;
    }

    /**
     * The Inbound Processing Region used for this phone number for voice.
     *
     * @param voiceRegion The Inbound Processing Region used for this phone number
     *                    for voice
     * @return this
     */
    public PhoneNumberCreator setVoiceRegion(final String voiceRegion) {
        this.voiceRegion = voiceRegion;
        return this;
    }

    /**
     * A human readable description of this resource, up to 64 characters..
     *
     * @param friendlyName A human readable description of this resource.
     * @return this
     */
    public PhoneNumberCreator setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created PhoneNumber
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public PhoneNumber create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.ROUTES.toString(),
            "/v2/PhoneNumbers/" + this.pathPhoneNumber + ""
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("PhoneNumber creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return PhoneNumber.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (voiceRegion != null) {
            request.addPostParam("VoiceRegion", voiceRegion);
        }

        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }
    }
}