/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account;

import com.twilio.base.Page;
import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.time.ZonedDateTime;

public class CallReader extends Reader<Call> {

    private String pathAccountSid;
    private com.twilio.type.PhoneNumber to;
    private com.twilio.type.PhoneNumber from;
    private String parentCallSid;
    private Call.Status status;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private Integer pageSize;

    public CallReader() {}

    public CallReader(final String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public CallReader setTo(final com.twilio.type.PhoneNumber to) {
        this.to = to;
        return this;
    }

    public CallReader setTo(final String to) {
        return setTo(Promoter.phoneNumberFromString(to));
    }

    public CallReader setFrom(final com.twilio.type.PhoneNumber from) {
        this.from = from;
        return this;
    }

    public CallReader setFrom(final String from) {
        return setFrom(Promoter.phoneNumberFromString(from));
    }

    public CallReader setParentCallSid(final String parentCallSid) {
        this.parentCallSid = parentCallSid;
        return this;
    }

    public CallReader setStatus(final Call.Status status) {
        this.status = status;
        return this;
    }

    public CallReader setStartTime(final ZonedDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public CallReader setEndTime(final ZonedDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public CallReader setPageSize(final Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<Call> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<Call> firstPage(final TwilioRestClient client) {
        String path = "/2010-04-01/Accounts/{AccountSid}/Calls.json";
        this.pathAccountSid =
            this.pathAccountSid == null
                ? client.getAccountSid()
                : this.pathAccountSid;
        path =
            path.replace(
                "{" + "AccountSid" + "}",
                this.pathAccountSid.toString()
            );

        Request request = new Request(
            HttpMethod.GET,
            Domains.API.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<Call> pageForRequest(
        final TwilioRestClient client,
        final Request request
    ) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "Call read failed: Unable to connect to server"
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

        return Page.fromJson(
            "calls",
            response.getContent(),
            Call.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<Call> previousPage(
        final Page<Call> page,
        final TwilioRestClient client
    ) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Call> nextPage(
        final Page<Call> page,
        final TwilioRestClient client
    ) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Call> getPage(
        final String targetUrl,
        final TwilioRestClient client
    ) {
        Request request = new Request(HttpMethod.GET, targetUrl);

        return pageForRequest(client, request);
    }

    private void addQueryParams(final Request request) {
        if (to != null) {
            request.addQueryParam("To", to.toString());
        }
        if (from != null) {
            request.addQueryParam("From", from.toString());
        }
        if (parentCallSid != null) {
            request.addQueryParam("ParentCallSid", parentCallSid);
        }
        if (status != null) {
            request.addQueryParam("Status", status.toString());
        }
        if (startTime != null) {
            request.addQueryParam(
                "StartTime",
                startTime.toInstant().toString()
            );
        }

        if (endTime != null) {
            request.addQueryParam("EndTime", endTime.toInstant().toString());
        }

        if (pageSize != null) {
            request.addQueryParam("PageSize", pageSize.toString());
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
