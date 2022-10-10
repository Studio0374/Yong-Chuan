/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Video
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.video.v1;

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
import java.time.ZonedDateTime;



public class CompositionReader extends Reader<Composition> {
    private Composition.Status status;
    private ZonedDateTime dateCreatedAfter;
    private ZonedDateTime dateCreatedBefore;
    private String roomSid;
    private Integer pageSize;

    public CompositionReader(){
    }

    public CompositionReader setStatus(final Composition.Status status){
        this.status = status;
        return this;
    }
    public CompositionReader setDateCreatedAfter(final ZonedDateTime dateCreatedAfter){
        this.dateCreatedAfter = dateCreatedAfter;
        return this;
    }
    public CompositionReader setDateCreatedBefore(final ZonedDateTime dateCreatedBefore){
        this.dateCreatedBefore = dateCreatedBefore;
        return this;
    }
    public CompositionReader setRoomSid(final String roomSid){
        this.roomSid = roomSid;
        return this;
    }
    public CompositionReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<Composition> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<Composition> firstPage(final TwilioRestClient client) {
        String path = "/v1/Compositions";

        Request request = new Request(
            HttpMethod.GET,
            Domains.VIDEO.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<Composition> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Composition read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "compositions",
            response.getContent(),
            Composition.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<Composition> previousPage(final Page<Composition> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.VIDEO.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<Composition> nextPage(final Page<Composition> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.VIDEO.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Composition> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (status != null) {
    
            request.addQueryParam("Status", status.toString());
        }
        if (dateCreatedAfter != null) {
            request.addQueryParam("DateCreatedAfter", dateCreatedAfter.toInstant().toString());
        }

        if (dateCreatedBefore != null) {
            request.addQueryParam("DateCreatedBefore", dateCreatedBefore.toInstant().toString());
        }

        if (roomSid != null) {
    
            request.addQueryParam("RoomSid", roomSid);
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }
    }
}
