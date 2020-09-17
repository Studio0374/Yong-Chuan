/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.ipmessaging.v1.service.channel;

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

import java.util.List;

public class InviteReader extends Reader<Invite> {
    private final String pathServiceSid;
    private final String pathChannelSid;
    private List<String> identity;

    /**
     * Construct a new InviteReader.
     *
     * @param pathServiceSid The SID of the Service to read the resources from
     * @param pathChannelSid The SID of the Channel the resources to read belong to
     */
    public InviteReader(final String pathServiceSid,
                        final String pathChannelSid) {
        this.pathServiceSid = pathServiceSid;
        this.pathChannelSid = pathChannelSid;
    }

    /**
     * The <a href="https://www.twilio.com/docs/api/chat/rest/v1/user">User</a>'s
     * `identity` value of the resources to read. See <a
     * href="https://www.twilio.com/docs/api/chat/guides/create-tokens">access
     * tokens</a> for more details..
     *
     * @param identity The `identity` value of the resources to read
     * @return this
     */
    public InviteReader setIdentity(final List<String> identity) {
        this.identity = identity;
        return this;
    }

    /**
     * The <a href="https://www.twilio.com/docs/api/chat/rest/v1/user">User</a>'s
     * `identity` value of the resources to read. See <a
     * href="https://www.twilio.com/docs/api/chat/guides/create-tokens">access
     * tokens</a> for more details..
     *
     * @param identity The `identity` value of the resources to read
     * @return this
     */
    public InviteReader setIdentity(final String identity) {
        return setIdentity(Promoter.listOfOne(identity));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Invite ResourceSet
     */
    @Override
    public ResourceSet<Invite> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Invite ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Invite> firstPage(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.IPMESSAGING.toString(),
            "/v1/Services/" + this.pathServiceSid + "/Channels/" + this.pathChannelSid + "/Invites"
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the target page from the Twilio API.
     *
     * @param targetUrl API-generated URL for the requested results page
     * @param client TwilioRestClient with which to make the request
     * @return Invite ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Invite> getPage(final String targetUrl, final TwilioRestClient client) {
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
    public Page<Invite> nextPage(final Page<Invite> page,
                                 final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.IPMESSAGING.toString())
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
    public Page<Invite> previousPage(final Page<Invite> page,
                                     final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.IPMESSAGING.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of Invite Resources for a given request.
     *
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<Invite> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Invite read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
           throw new ApiException(restException);
        }

        return Page.fromJson(
            "invites",
            response.getContent(),
            Invite.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (identity != null) {
            for (String prop : identity) {
                request.addQueryParam("Identity", prop);
            }
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}