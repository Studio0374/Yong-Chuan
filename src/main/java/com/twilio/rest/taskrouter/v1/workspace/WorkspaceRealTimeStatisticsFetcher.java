/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class WorkspaceRealTimeStatisticsFetcher extends Fetcher<WorkspaceRealTimeStatistics> {
    private final String pathWorkspaceSid;
    private String taskChannel;

    /**
     * Construct a new WorkspaceRealTimeStatisticsFetcher.
     *
     * @param pathWorkspaceSid The SID of the Workspace to fetch
     */
    public WorkspaceRealTimeStatisticsFetcher(final String pathWorkspaceSid) {
        this.pathWorkspaceSid = pathWorkspaceSid;
    }

    /**
     * Only calculate real-time statistics on this TaskChannel. Can be the
     * TaskChannel's SID or its `unique_name`, such as `voice`, `sms`, or
     * `default`..
     *
     * @param taskChannel Only calculate real-time statistics on this TaskChannel
     * @return this
     */
    public WorkspaceRealTimeStatisticsFetcher setTaskChannel(final String taskChannel) {
        this.taskChannel = taskChannel;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched WorkspaceRealTimeStatistics
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public WorkspaceRealTimeStatistics fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.TASKROUTER.toString(),
            "/v1/Workspaces/" + this.pathWorkspaceSid + "/RealTimeStatistics"
        );

        addQueryParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("WorkspaceRealTimeStatistics fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return WorkspaceRealTimeStatistics.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (taskChannel != null) {
            request.addQueryParam("TaskChannel", taskChannel);
        }
    }
}