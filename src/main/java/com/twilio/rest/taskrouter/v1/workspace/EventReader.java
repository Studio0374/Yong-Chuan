/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.twilio.base.Page;
import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.time.ZonedDateTime;

public class EventReader extends Reader<Event> {
    private final String pathWorkspaceSid;
    private ZonedDateTime endDate;
    private String eventType;
    private Integer minutes;
    private String reservationSid;
    private ZonedDateTime startDate;
    private String taskQueueSid;
    private String taskSid;
    private String workerSid;
    private String workflowSid;
    private String taskChannel;
    private String sid;

    /**
     * Construct a new EventReader.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Events to read
     */
    public EventReader(final String pathWorkspaceSid) {
        this.pathWorkspaceSid = pathWorkspaceSid;
    }

    /**
     * Only include Events that occurred on or before this date, specified in GMT as
     * an [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date-time..
     *
     * @param endDate Only include usage that occurred on or before this date
     * @return this
     */
    public EventReader setEndDate(final ZonedDateTime endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * The type of Events to read. Returns only Events of the type specified..
     *
     * @param eventType The type of Events to read
     * @return this
     */
    public EventReader setEventType(final String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * The period of events to read in minutes. Returns only Events that occurred
     * since this many minutes in the past. The default is `15` minutes. Task
     * Attributes for Events occuring more 43,200 minutes ago will be redacted..
     *
     * @param minutes The period of events to read in minutes
     * @return this
     */
    public EventReader setMinutes(final Integer minutes) {
        this.minutes = minutes;
        return this;
    }

    /**
     * The SID of the Reservation with the Events to read. Returns only Events that
     * pertain to the specified Reservation..
     *
     * @param reservationSid The SID of the Reservation with the Events to read
     * @return this
     */
    public EventReader setReservationSid(final String reservationSid) {
        this.reservationSid = reservationSid;
        return this;
    }

    /**
     * Only include Events from on or after this date and time, specified in [ISO
     * 8601](https://en.wikipedia.org/wiki/ISO_8601) format. Task Attributes for
     * Events older than 30 days will be redacted..
     *
     * @param startDate Only include Events from on or after this date
     * @return this
     */
    public EventReader setStartDate(final ZonedDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * The SID of the TaskQueue with the Events to read. Returns only the Events
     * that pertain to the specified TaskQueue..
     *
     * @param taskQueueSid The SID of the TaskQueue with the Events to read
     * @return this
     */
    public EventReader setTaskQueueSid(final String taskQueueSid) {
        this.taskQueueSid = taskQueueSid;
        return this;
    }

    /**
     * The SID of the Task with the Events to read. Returns only the Events that
     * pertain to the specified Task..
     *
     * @param taskSid The SID of the Task with the Events to read
     * @return this
     */
    public EventReader setTaskSid(final String taskSid) {
        this.taskSid = taskSid;
        return this;
    }

    /**
     * The SID of the Worker with the Events to read. Returns only the Events that
     * pertain to the specified Worker..
     *
     * @param workerSid The SID of the Worker with the Events to read
     * @return this
     */
    public EventReader setWorkerSid(final String workerSid) {
        this.workerSid = workerSid;
        return this;
    }

    /**
     * The SID of the Workflow with the Events to read. Returns only the Events that
     * pertain to the specified Workflow..
     *
     * @param workflowSid The SID of the Worker with the Events to read
     * @return this
     */
    public EventReader setWorkflowSid(final String workflowSid) {
        this.workflowSid = workflowSid;
        return this;
    }

    /**
     * The TaskChannel with the Events to read. Returns only the Events that pertain
     * to the specified TaskChannel..
     *
     * @param taskChannel The TaskChannel with the Events to read
     * @return this
     */
    public EventReader setTaskChannel(final String taskChannel) {
        this.taskChannel = taskChannel;
        return this;
    }

    /**
     * The SID of the Event resource to read..
     *
     * @param sid The unique string that identifies the resource
     * @return this
     */
    public EventReader setSid(final String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Event ResourceSet
     */
    @Override
    public ResourceSet<Event> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Event ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Event> firstPage(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.TASKROUTER.toString(),
            "/v1/Workspaces/" + this.pathWorkspaceSid + "/Events"
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the target page from the Twilio API.
     *
     * @param targetUrl API-generated URL for the requested results page
     * @param client TwilioRestClient with which to make the request
     * @return Event ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Event> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }

    /**
     * Retrieve the next page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Next Page
     */
    @Override
    public Page<Event> nextPage(final Page<Event> page,
                                final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.TASKROUTER.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the previous page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Previous Page
     */
    @Override
    public Page<Event> previousPage(final Page<Event> page,
                                    final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.TASKROUTER.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of Event Resources for a given request.
     *
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<Event> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Event read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
           throw new ApiException(restException);
        }

        return Page.fromJson(
            "events",
            response.getContent(),
            Event.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (endDate != null) {
            request.addQueryParam("EndDate", endDate.toString());
        }

        if (eventType != null) {
            request.addQueryParam("EventType", eventType);
        }

        if (minutes != null) {
            request.addQueryParam("Minutes", minutes.toString());
        }

        if (reservationSid != null) {
            request.addQueryParam("ReservationSid", reservationSid);
        }

        if (startDate != null) {
            request.addQueryParam("StartDate", startDate.toString());
        }

        if (taskQueueSid != null) {
            request.addQueryParam("TaskQueueSid", taskQueueSid);
        }

        if (taskSid != null) {
            request.addQueryParam("TaskSid", taskSid);
        }

        if (workerSid != null) {
            request.addQueryParam("WorkerSid", workerSid);
        }

        if (workflowSid != null) {
            request.addQueryParam("WorkflowSid", workflowSid);
        }

        if (taskChannel != null) {
            request.addQueryParam("TaskChannel", taskChannel);
        }

        if (sid != null) {
            request.addQueryParam("Sid", sid);
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}