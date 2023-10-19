/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Studio
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.studio.v2.flow.execution;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class ExecutionContextFetcher extends Fetcher<ExecutionContext> {

    private String pathFlowSid;
    private String pathExecutionSid;

    public ExecutionContextFetcher(
        final String pathFlowSid,
        final String pathExecutionSid
    ) {
        this.pathFlowSid = pathFlowSid;
        this.pathExecutionSid = pathExecutionSid;
    }

    @Override
    public ExecutionContext fetch(final TwilioRestClient client) {
        String path = "/v2/Flows/{FlowSid}/Executions/{ExecutionSid}/Context";

        path = path.replace("{" + "FlowSid" + "}", this.pathFlowSid.toString());
        path =
            path.replace(
                "{" + "ExecutionSid" + "}",
                this.pathExecutionSid.toString()
            );

        Request request = new Request(
            HttpMethod.GET,
            Domains.STUDIO.toString(),
            path
        );
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "ExecutionContext fetch failed: Unable to connect to server"
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

        return ExecutionContext.fromJson(
            response.getStream(),
            client.getObjectMapper()
        );
    }
}
