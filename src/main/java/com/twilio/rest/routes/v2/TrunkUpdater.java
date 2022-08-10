/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.routes.v2;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class TrunkUpdater extends Updater<Trunk> {
    private final String pathSipTrunkDomain;
    private String voiceRegion;
    private String friendlyName;

    /**
     * Construct a new TrunkUpdater.
     *
     * @param pathSipTrunkDomain The SIP Trunk
     */
    public TrunkUpdater(final String pathSipTrunkDomain) {
        this.pathSipTrunkDomain = pathSipTrunkDomain;
    }

    /**
     * The Inbound Processing Region used for this SIP Trunk for voice.
     *
     * @param voiceRegion The Inbound Processing Region used for this SIP Trunk for
     *                    voice
     * @return this
     */
    public TrunkUpdater setVoiceRegion(final String voiceRegion) {
        this.voiceRegion = voiceRegion;
        return this;
    }

    /**
     * A human readable description of this resource, up to 64 characters..
     *
     * @param friendlyName A human readable description of this resource.
     * @return this
     */
    public TrunkUpdater setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated Trunk
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Trunk update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.ROUTES.toString(),
            "/v2/Trunks/" + this.pathSipTrunkDomain + ""
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Trunk update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Trunk.fromJson(response.getStream(), client.getObjectMapper());
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