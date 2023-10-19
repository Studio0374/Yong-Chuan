/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Media
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.media.v1;

import com.twilio.base.Creator;
import com.twilio.constant.EnumConstants;
import com.twilio.converter.Converter;
import com.twilio.converter.Converter;
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
import java.net.URI;
import java.util.Map;
import java.util.Map;

public class MediaProcessorCreator extends Creator<MediaProcessor> {

    private String extension;
    private String extensionContext;
    private Map<String, Object> extensionEnvironment;
    private URI statusCallback;
    private HttpMethod statusCallbackMethod;
    private Integer maxDuration;

    public MediaProcessorCreator(
        final String extension,
        final String extensionContext
    ) {
        this.extension = extension;
        this.extensionContext = extensionContext;
    }

    public MediaProcessorCreator setExtension(final String extension) {
        this.extension = extension;
        return this;
    }

    public MediaProcessorCreator setExtensionContext(
        final String extensionContext
    ) {
        this.extensionContext = extensionContext;
        return this;
    }

    public MediaProcessorCreator setExtensionEnvironment(
        final Map<String, Object> extensionEnvironment
    ) {
        this.extensionEnvironment = extensionEnvironment;
        return this;
    }

    public MediaProcessorCreator setStatusCallback(final URI statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }

    public MediaProcessorCreator setStatusCallback(
        final String statusCallback
    ) {
        return setStatusCallback(Promoter.uriFromString(statusCallback));
    }

    public MediaProcessorCreator setStatusCallbackMethod(
        final HttpMethod statusCallbackMethod
    ) {
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }

    public MediaProcessorCreator setMaxDuration(final Integer maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }

    @Override
    public MediaProcessor create(final TwilioRestClient client) {
        String path = "/v1/MediaProcessors";

        path = path.replace("{" + "Extension" + "}", this.extension.toString());
        path =
            path.replace(
                "{" + "ExtensionContext" + "}",
                this.extensionContext.toString()
            );

        Request request = new Request(
            HttpMethod.POST,
            Domains.MEDIA.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException(
                "MediaProcessor creation failed: Unable to connect to server"
            );
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(
                response.getStream(),
                client.getObjectMapper()
            );
            if (restException == null) {
                throw new ApiException(
                    "Server Error, no content",
                    response.getStatusCode()
                );
            }
            throw new ApiException(restException);
        }

        return MediaProcessor.fromJson(
            response.getStream(),
            client.getObjectMapper()
        );
    }

    private void addPostParams(final Request request) {
        if (extension != null) {
            request.addPostParam("Extension", extension);
        }
        if (extensionContext != null) {
            request.addPostParam("ExtensionContext", extensionContext);
        }
        if (extensionEnvironment != null) {
            request.addPostParam(
                "ExtensionEnvironment",
                Converter.mapToJson(extensionEnvironment)
            );
        }
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
        }
        if (statusCallbackMethod != null) {
            request.addPostParam(
                "StatusCallbackMethod",
                statusCallbackMethod.toString()
            );
        }
        if (maxDuration != null) {
            request.addPostParam("MaxDuration", maxDuration.toString());
        }
    }
}
