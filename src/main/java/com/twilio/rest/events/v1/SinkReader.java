/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Events
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.events.v1;

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



public class SinkReader extends Reader<Sink> {
    private Boolean inUse;
    private String status;
    private Integer pageSize;

    public SinkReader(){
    }

    public SinkReader setInUse(final Boolean inUse){
        this.inUse = inUse;
        return this;
    }
    public SinkReader setStatus(final String status){
        this.status = status;
        return this;
    }
    public SinkReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<Sink> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<Sink> firstPage(final TwilioRestClient client) {
        String path = "/v1/Sinks";

        Request request = new Request(
            HttpMethod.GET,
            Domains.EVENTS.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<Sink> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Sink read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "sinks",
            response.getContent(),
            Sink.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<Sink> previousPage(final Page<Sink> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.EVENTS.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<Sink> nextPage(final Page<Sink> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.EVENTS.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Sink> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (inUse != null) {
    
            request.addQueryParam("InUse", inUse.toString());
        }
        if (status != null) {
    
            request.addQueryParam("Status", status);
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }

        if(getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
