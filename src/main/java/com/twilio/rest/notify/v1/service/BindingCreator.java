/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.notify.v1.service;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.util.List;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class BindingCreator extends Creator<Binding> {
    private final String pathServiceSid;
    private final String identity;
    private final Binding.BindingType bindingType;
    private final String address;
    private List<String> tag;
    private String notificationProtocolVersion;
    private String credentialSid;
    private String endpoint;

    /**
     * Construct a new BindingCreator.
     *
     * @param pathServiceSid The SID of the Service to create the resource under
     * @param identity The `identity` value that identifies the new resource's User
     * @param bindingType The type of the Binding
     * @param address The channel-specific address
     */
    public BindingCreator(final String pathServiceSid,
                          final String identity,
                          final Binding.BindingType bindingType,
                          final String address) {
        this.pathServiceSid = pathServiceSid;
        this.identity = identity;
        this.bindingType = bindingType;
        this.address = address;
    }

    /**
     * A tag that can be used to select the Bindings to notify. Repeat this
     * parameter to specify more than one tag, up to a total of 20 tags..
     *
     * @param tag A tag that can be used to select the Bindings to notify
     * @return this
     */
    public BindingCreator setTag(final List<String> tag) {
        this.tag = tag;
        return this;
    }

    /**
     * A tag that can be used to select the Bindings to notify. Repeat this
     * parameter to specify more than one tag, up to a total of 20 tags..
     *
     * @param tag A tag that can be used to select the Bindings to notify
     * @return this
     */
    public BindingCreator setTag(final String tag) {
        return setTag(Promoter.listOfOne(tag));
    }

    /**
     * The protocol version to use to send the notification. This defaults to the
     * value of `default_xxxx_notification_protocol_version` for the protocol in the
     * <a
     * href="https://www.twilio.com/docs/notify/api/service-resource">Service</a>.
     * The current version is `"3"` for `apn`, `fcm`, and `gcm` type Bindings. The
     * parameter is not applicable to `sms` and `facebook-messenger` type Bindings
     * as the data format is fixed..
     *
     * @param notificationProtocolVersion The protocol version to use to send the
     *                                    notification
     * @return this
     */
    public BindingCreator setNotificationProtocolVersion(final String notificationProtocolVersion) {
        this.notificationProtocolVersion = notificationProtocolVersion;
        return this;
    }

    /**
     * The SID of the <a
     * href="https://www.twilio.com/docs/notify/api/credential-resource">Credential</a> resource to be used to send notifications to this Binding. If present, this overrides the Credential specified in the Service resource. Applies to only `apn`, `fcm`, and `gcm` type Bindings..
     *
     * @param credentialSid The SID of the Credential resource to be used to send
     *                      notifications to this Binding
     * @return this
     */
    public BindingCreator setCredentialSid(final String credentialSid) {
        this.credentialSid = credentialSid;
        return this;
    }

    /**
     * Deprecated..
     *
     * @param endpoint Deprecated
     * @return this
     */
    public BindingCreator setEndpoint(final String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Binding
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Binding create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.NOTIFY.toString(),
            "/v1/Services/" + this.pathServiceSid + "/Bindings"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Binding creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Binding.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (identity != null) {
            request.addPostParam("Identity", identity);
        }

        if (bindingType != null) {
            request.addPostParam("BindingType", bindingType.toString());
        }

        if (address != null) {
            request.addPostParam("Address", address);
        }

        if (tag != null) {
            for (String prop : tag) {
                request.addPostParam("Tag", prop);
            }
        }

        if (notificationProtocolVersion != null) {
            request.addPostParam("NotificationProtocolVersion", notificationProtocolVersion);
        }

        if (credentialSid != null) {
            request.addPostParam("CredentialSid", credentialSid);
        }

        if (endpoint != null) {
            request.addPostParam("Endpoint", endpoint);
        }
    }
}