/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.messaging.v1;

import com.twilio.base.Updater;
import com.twilio.constant.EnumConstants;
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

public class DomainConfigUpdater extends Updater<DomainConfig> {

    private String pathDomainSid;
    private URI fallbackUrl;
    private URI callbackUrl;
    private Boolean continueOnFailure;
    private Boolean disableHttps;

    public DomainConfigUpdater(final String pathDomainSid) {
        this.pathDomainSid = pathDomainSid;
    }

    public DomainConfigUpdater setFallbackUrl(final URI fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
        return this;
    }

    public DomainConfigUpdater setFallbackUrl(final String fallbackUrl) {
        return setFallbackUrl(Promoter.uriFromString(fallbackUrl));
    }

    public DomainConfigUpdater setCallbackUrl(final URI callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    public DomainConfigUpdater setCallbackUrl(final String callbackUrl) {
        return setCallbackUrl(Promoter.uriFromString(callbackUrl));
    }

    public DomainConfigUpdater setContinueOnFailure(
        final Boolean continueOnFailure
    ) {
        this.continueOnFailure = continueOnFailure;
        return this;
    }

    public DomainConfigUpdater setDisableHttps(final Boolean disableHttps) {
        this.disableHttps = disableHttps;
        return this;
    }

    @Override
    public DomainConfig update(final TwilioRestClient client) {
        String path = "/v1/LinkShortening/Domains/{DomainSid}/Config";

        path =
            path.replace(
                "{" + "DomainSid" + "}",
                this.pathDomainSid.toString()
            );

        Request request = new Request(
            HttpMethod.POST,
            Domains.MESSAGING.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException(
                "DomainConfig update failed: Unable to connect to server"
            );
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(
                response.getStream(),
                client.getObjectMapper()
            );
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return DomainConfig.fromJson(
            response.getStream(),
            client.getObjectMapper()
        );
    }

    private void addPostParams(final Request request) {
        if (fallbackUrl != null) {
            request.addPostParam("FallbackUrl", fallbackUrl.toString());
        }
        if (callbackUrl != null) {
            request.addPostParam("CallbackUrl", callbackUrl.toString());
        }
        if (continueOnFailure != null) {
            request.addPostParam(
                "ContinueOnFailure",
                continueOnFailure.toString()
            );
        }
        if (disableHttps != null) {
            request.addPostParam("DisableHttps", disableHttps.toString());
        }
    }
}
