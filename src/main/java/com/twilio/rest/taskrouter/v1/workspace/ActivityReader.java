/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Taskrouter
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.twilio.base.Page;
import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class ActivityReader extends Reader<Activity> {

    private String pathWorkspaceSid;
    private String friendlyName;
    private String available;
    private Integer pageSize;

    public ActivityReader(final String pathWorkspaceSid) {
        this.pathWorkspaceSid = pathWorkspaceSid;
    }

    public ActivityReader setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    public ActivityReader setAvailable(final String available) {
        this.available = available;
        return this;
    }

    public ActivityReader setPageSize(final Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<Activity> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<Activity> firstPage(final TwilioRestClient client) {
        String path = "/v1/Workspaces/{WorkspaceSid}/Activities";
        path =
            path.replace(
                "{" + "WorkspaceSid" + "}",
                this.pathWorkspaceSid.toString()
            );

        Request request = new Request(
            HttpMethod.GET,
            Domains.TASKROUTER.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<Activity> pageForRequest(
        final TwilioRestClient client,
        final Request request
    ) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "Activity read failed: Unable to connect to server"
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

        return Page.fromJson(
            "activities",
            response.getContent(),
            Activity.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<Activity> previousPage(
        final Page<Activity> page,
        final TwilioRestClient client
    ) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.TASKROUTER.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Activity> nextPage(
        final Page<Activity> page,
        final TwilioRestClient client
    ) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.TASKROUTER.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Activity> getPage(
        final String targetUrl,
        final TwilioRestClient client
    ) {
        Request request = new Request(HttpMethod.GET, targetUrl);

        return pageForRequest(client, request);
    }

    private void addQueryParams(final Request request) {
        if (friendlyName != null) {
            request.addQueryParam("FriendlyName", friendlyName);
        }
        if (available != null) {
            request.addQueryParam("Available", available);
        }
        if (pageSize != null) {
            request.addQueryParam("PageSize", pageSize.toString());
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
