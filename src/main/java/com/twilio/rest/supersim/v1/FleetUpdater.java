/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.supersim.v1;

import com.twilio.base.Updater;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class FleetUpdater extends Updater<Fleet> {
    private final String pathSid;
    private String uniqueName;
    private String networkAccessProfile;
    private URI commandsUrl;
    private HttpMethod commandsMethod;
    private URI smsCommandsUrl;
    private HttpMethod smsCommandsMethod;

    /**
     * Construct a new FleetUpdater.
     *
     * @param pathSid The SID that identifies the resource to update
     */
    public FleetUpdater(final String pathSid) {
        this.pathSid = pathSid;
    }

    /**
     * An application-defined string that uniquely identifies the resource. It can
     * be used in place of the resource's `sid` in the URL to address the resource..
     *
     * @param uniqueName An application-defined string that uniquely identifies the
     *                   resource
     * @return this
     */
    public FleetUpdater setUniqueName(final String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * The SID or unique name of the Network Access Profile that will control which
     * cellular networks the Fleet's SIMs can connect to..
     *
     * @param networkAccessProfile The SID or unique name of the Network Access
     *                             Profile of the Fleet
     * @return this
     */
    public FleetUpdater setNetworkAccessProfile(final String networkAccessProfile) {
        this.networkAccessProfile = networkAccessProfile;
        return this;
    }

    /**
     * The URL that will receive a webhook when a Super SIM in the Fleet is used to
     * send an SMS from your device to the Commands number. Your server should
     * respond with an HTTP status code in the 200 range; any response body will be
     * ignored..
     *
     * @param commandsUrl The URL that will receive a webhook when a Super SIM in
     *                    the Fleet is used to send an SMS from your device to the
     *                    Commands number
     * @return this
     */
    public FleetUpdater setCommandsUrl(final URI commandsUrl) {
        this.commandsUrl = commandsUrl;
        return this;
    }

    /**
     * The URL that will receive a webhook when a Super SIM in the Fleet is used to
     * send an SMS from your device to the Commands number. Your server should
     * respond with an HTTP status code in the 200 range; any response body will be
     * ignored..
     *
     * @param commandsUrl The URL that will receive a webhook when a Super SIM in
     *                    the Fleet is used to send an SMS from your device to the
     *                    Commands number
     * @return this
     */
    public FleetUpdater setCommandsUrl(final String commandsUrl) {
        return setCommandsUrl(Promoter.uriFromString(commandsUrl));
    }

    /**
     * A string representing the HTTP method to use when making a request to
     * `commands_url`. Can be one of `POST` or `GET`. Defaults to `POST`..
     *
     * @param commandsMethod A string representing the HTTP method to use when
     *                       making a request to `commands_url`
     * @return this
     */
    public FleetUpdater setCommandsMethod(final HttpMethod commandsMethod) {
        this.commandsMethod = commandsMethod;
        return this;
    }

    /**
     * The URL that will receive a webhook when a Super SIM in the Fleet is used to
     * send an SMS from your device to the SMS Commands number. Your server should
     * respond with an HTTP status code in the 200 range; any response body will be
     * ignored..
     *
     * @param smsCommandsUrl The URL that will receive a webhook when a Super SIM
     *                       in the Fleet is used to send an SMS from your device to
     *                       the SMS Commands number
     * @return this
     */
    public FleetUpdater setSmsCommandsUrl(final URI smsCommandsUrl) {
        this.smsCommandsUrl = smsCommandsUrl;
        return this;
    }

    /**
     * The URL that will receive a webhook when a Super SIM in the Fleet is used to
     * send an SMS from your device to the SMS Commands number. Your server should
     * respond with an HTTP status code in the 200 range; any response body will be
     * ignored..
     *
     * @param smsCommandsUrl The URL that will receive a webhook when a Super SIM
     *                       in the Fleet is used to send an SMS from your device to
     *                       the SMS Commands number
     * @return this
     */
    public FleetUpdater setSmsCommandsUrl(final String smsCommandsUrl) {
        return setSmsCommandsUrl(Promoter.uriFromString(smsCommandsUrl));
    }

    /**
     * A string representing the HTTP method to use when making a request to
     * `sms_commands_url`. Can be one of `POST` or `GET`. Defaults to `POST`..
     *
     * @param smsCommandsMethod A string representing the HTTP method to use when
     *                          making a request to `sms_commands_url`
     * @return this
     */
    public FleetUpdater setSmsCommandsMethod(final HttpMethod smsCommandsMethod) {
        this.smsCommandsMethod = smsCommandsMethod;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated Fleet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Fleet update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.SUPERSIM.toString(),
            "/v1/Fleets/" + this.pathSid + ""
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Fleet update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Fleet.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (uniqueName != null) {
            request.addPostParam("UniqueName", uniqueName);
        }

        if (networkAccessProfile != null) {
            request.addPostParam("NetworkAccessProfile", networkAccessProfile.toString());
        }

        if (commandsUrl != null) {
            request.addPostParam("CommandsUrl", commandsUrl.toString());
        }

        if (commandsMethod != null) {
            request.addPostParam("CommandsMethod", commandsMethod.toString());
        }

        if (smsCommandsUrl != null) {
            request.addPostParam("SmsCommandsUrl", smsCommandsUrl.toString());
        }

        if (smsCommandsMethod != null) {
            request.addPostParam("SmsCommandsMethod", smsCommandsMethod.toString());
        }
    }
}