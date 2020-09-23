/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account;

import com.google.common.collect.Range;
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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NotificationReader extends Reader<Notification> {
    private String pathAccountSid;
    private Integer log;
    private LocalDate absoluteMessageDate;
    private Range<LocalDate> rangeMessageDate;

    /**
     * Construct a new NotificationReader.
     */
    public NotificationReader() {
    }

    /**
     * Construct a new NotificationReader.
     *
     * @param pathAccountSid The SID of the Account that created the resources to
     *                       read
     */
    public NotificationReader(final String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    /**
     * Only read notifications of the specified log level. Can be:  `0` to read only
     * ERROR notifications or `1` to read only WARNING notifications. By default,
     * all notifications are read..
     *
     * @param log Filter by log level
     * @return this
     */
    public NotificationReader setLog(final Integer log) {
        this.log = log;
        return this;
    }

    /**
     * Only show notifications for the specified date, formatted as `YYYY-MM-DD`.
     * You can also specify an inequality, such as `&lt;=YYYY-MM-DD` for messages
     * logged at or before midnight on a date, or `&gt;=YYYY-MM-DD` for messages
     * logged at or after midnight on a date..
     *
     * @param absoluteMessageDate Filter by date
     * @return this
     */
    public NotificationReader setMessageDate(final LocalDate absoluteMessageDate) {
        this.rangeMessageDate = null;
        this.absoluteMessageDate = absoluteMessageDate;
        return this;
    }

    /**
     * Only show notifications for the specified date, formatted as `YYYY-MM-DD`.
     * You can also specify an inequality, such as `&lt;=YYYY-MM-DD` for messages
     * logged at or before midnight on a date, or `&gt;=YYYY-MM-DD` for messages
     * logged at or after midnight on a date..
     *
     * @param rangeMessageDate Filter by date
     * @return this
     */
    public NotificationReader setMessageDate(final Range<LocalDate> rangeMessageDate) {
        this.absoluteMessageDate = null;
        this.rangeMessageDate = rangeMessageDate;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Notification ResourceSet
     */
    @Override
    public ResourceSet<Notification> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Notification ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Notification> firstPage(final TwilioRestClient client) {
        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
        Request request = new Request(
            HttpMethod.GET,
            Domains.API.toString(),
            "/2010-04-01/Accounts/" + this.pathAccountSid + "/Notifications.json"
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the target page from the Twilio API.
     *
     * @param targetUrl API-generated URL for the requested results page
     * @param client TwilioRestClient with which to make the request
     * @return Notification ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Notification> getPage(final String targetUrl, final TwilioRestClient client) {
        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
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
    public Page<Notification> nextPage(final Page<Notification> page,
                                       final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.API.toString())
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
    public Page<Notification> previousPage(final Page<Notification> page,
                                           final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of Notification Resources for a given request.
     *
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<Notification> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Notification read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
           throw new ApiException(restException);
        }

        return Page.fromJson(
            "notifications",
            response.getContent(),
            Notification.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (log != null) {
            request.addQueryParam("Log", log.toString());
        }

        if (absoluteMessageDate != null) {
            request.addQueryParam("MessageDate", absoluteMessageDate.format(DateTimeFormatter.ofPattern(Request.QUERY_STRING_DATE_FORMAT)));
        } else if (rangeMessageDate != null) {
            request.addQueryDateRange("MessageDate", rangeMessageDate);
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}