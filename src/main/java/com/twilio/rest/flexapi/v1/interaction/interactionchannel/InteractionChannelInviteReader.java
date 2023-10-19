/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1.interaction.interactionchannel;

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
import com.twilio.base.Page;



public class InteractionChannelInviteReader extends Reader<InteractionChannelInvite> {
    private String pathInteractionSid;
    private String pathChannelSid;
    private Integer pageSize;

    public InteractionChannelInviteReader(final String pathInteractionSid, final String pathChannelSid){
        this.pathInteractionSid = pathInteractionSid;
        this.pathChannelSid = pathChannelSid;
    }

    public InteractionChannelInviteReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<InteractionChannelInvite> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<InteractionChannelInvite> firstPage(final TwilioRestClient client) {
        String path = "/v1/Interactions/{InteractionSid}/Channels/{ChannelSid}/Invites";
        path = path.replace("{"+"InteractionSid"+"}", this.pathInteractionSid.toString());
        path = path.replace("{"+"ChannelSid"+"}", this.pathChannelSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.FLEXAPI.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<InteractionChannelInvite> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("InteractionChannelInvite read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "invites",
            response.getContent(),
            InteractionChannelInvite.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<InteractionChannelInvite> previousPage(final Page<InteractionChannelInvite> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.FLEXAPI.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<InteractionChannelInvite> nextPage(final Page<InteractionChannelInvite> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.FLEXAPI.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<InteractionChannelInvite> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }

        if(getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
