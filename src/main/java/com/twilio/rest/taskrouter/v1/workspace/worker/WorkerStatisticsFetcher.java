/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace.worker;

import com.twilio.base.Fetcher;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

public class WorkerStatisticsFetcher extends Fetcher<WorkerStatistics> {
    private final String pathWorkspaceSid;
    private final String pathWorkerSid;
    private Integer minutes;
    private DateTime startDate;
    private DateTime endDate;
    private String taskChannel;

    /**
     * Construct a new WorkerStatisticsFetcher.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the WorkerChannel to
     *                         fetch
     * @param pathWorkerSid The SID of the Worker with the WorkerChannel to fetch
     */
    public WorkerStatisticsFetcher(final String pathWorkspaceSid,
                                   final String pathWorkerSid) {
        this.pathWorkspaceSid = pathWorkspaceSid;
        this.pathWorkerSid = pathWorkerSid;
    }

    /**
     * Only calculate statistics since this many minutes in the past. The default 15
     * minutes. This is helpful for displaying statistics for the last 15 minutes,
     * 240 minutes (4 hours), and 480 minutes (8 hours) to see trends..
     *
     * @param minutes Only calculate statistics since this many minutes in the past
     * @return this
     */
    public WorkerStatisticsFetcher setMinutes(final Integer minutes) {
        this.minutes = minutes;
        return this;
    }

    /**
     * Only calculate statistics from this date and time and later, specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> format..
     *
     * @param startDate Only calculate statistics from on or after this date
     * @return this
     */
    public WorkerStatisticsFetcher setStartDate(final DateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Only include usage that occurred on or before this date, specified in GMT as
     * an <a href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> date-time..
     *
     * @param endDate Only include usage that occurred on or before this date
     * @return this
     */
    public WorkerStatisticsFetcher setEndDate(final DateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Only calculate statistics on this TaskChannel. Can be the TaskChannel's SID
     * or its `unique_name`, such as `voice`, `sms`, or `default`..
     *
     * @param taskChannel Only calculate statistics on this TaskChannel
     * @return this
     */
    public WorkerStatisticsFetcher setTaskChannel(final String taskChannel) {
        this.taskChannel = taskChannel;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched WorkerStatistics
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public WorkerStatistics fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.TASKROUTER.toString(),
            "/v1/Workspaces/" + this.pathWorkspaceSid + "/Workers/" + this.pathWorkerSid + "/Statistics"
        );

        addQueryParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("WorkerStatistics fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return WorkerStatistics.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (minutes != null) {
            request.addQueryParam("Minutes", minutes.toString());
        }

        if (startDate != null) {
            request.addQueryParam("StartDate", startDate.toString());
        }

        if (endDate != null) {
            request.addQueryParam("EndDate", endDate.toString());
        }

        if (taskChannel != null) {
            request.addQueryParam("TaskChannel", taskChannel);
        }
    }
}