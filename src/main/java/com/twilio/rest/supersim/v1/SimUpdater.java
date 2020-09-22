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
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class SimUpdater extends Updater<Sim> {
    private final String pathSid;
    private String uniqueName;
    private Sim.StatusUpdate status;
    private String fleet;
    private URI callbackUrl;
    private HttpMethod callbackMethod;
    private String accountSid;

    /**
     * Construct a new SimUpdater.
     *
     * @param pathSid The SID that identifies the resource to update
     */
    public SimUpdater(final String pathSid) {
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
    public SimUpdater setUniqueName(final String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * The new status of the resource. Can be: `ready`, `active`, or `inactive`. See
     * the <a
     * href="https://www.twilio.com/docs/iot/supersim/api/sim-resource#status-values">Super
     * SIM Status Values</a> for more info..
     *
     * @param status The new status of the Super SIM
     * @return this
     */
    public SimUpdater setStatus(final Sim.StatusUpdate status) {
        this.status = status;
        return this;
    }

    /**
     * The SID or unique name of the Fleet to which the SIM resource should be
     * assigned..
     *
     * @param fleet The SID or unique name of the Fleet to which the SIM resource
     *              should be assigned
     * @return this
     */
    public SimUpdater setFleet(final String fleet) {
        this.fleet = fleet;
        return this;
    }

    /**
     * The URL we should call using the `callback_method` after an asynchronous
     * update has finished..
     *
     * @param callbackUrl The URL we should call after the update has finished
     * @return this
     */
    public SimUpdater setCallbackUrl(final URI callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * The URL we should call using the `callback_method` after an asynchronous
     * update has finished..
     *
     * @param callbackUrl The URL we should call after the update has finished
     * @return this
     */
    public SimUpdater setCallbackUrl(final String callbackUrl) {
        return setCallbackUrl(Promoter.uriFromString(callbackUrl));
    }

    /**
     * The HTTP method we should use to call `callback_url`. Can be: `GET` or `POST`
     * and the default is POST..
     *
     * @param callbackMethod The HTTP method we should use to call callback_url
     * @return this
     */
    public SimUpdater setCallbackMethod(final HttpMethod callbackMethod) {
        this.callbackMethod = callbackMethod;
        return this;
    }

    /**
     * The SID of the Account to which the Sim resource should belong. The Account
     * SID can only be that of the requesting Account or that of a Subaccount of the
     * requesting Account. Only valid when the Sim resource's status is new..
     *
     * @param accountSid The SID of the Account to which the Sim resource should
     *                   belong
     * @return this
     */
    public SimUpdater setAccountSid(final String accountSid) {
        this.accountSid = accountSid;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated Sim
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Sim update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.SUPERSIM.toString(),
            "/v1/Sims/" + this.pathSid + ""
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Sim update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Sim.fromJson(response.getStream(), client.getObjectMapper());
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

        if (status != null) {
            request.addPostParam("Status", status.toString());
        }

        if (fleet != null) {
            request.addPostParam("Fleet", fleet.toString());
        }

        if (callbackUrl != null) {
            request.addPostParam("CallbackUrl", callbackUrl.toString());
        }

        if (callbackMethod != null) {
            request.addPostParam("CallbackMethod", callbackMethod.toString());
        }

        if (accountSid != null) {
            request.addPostParam("AccountSid", accountSid.toString());
        }
    }
}