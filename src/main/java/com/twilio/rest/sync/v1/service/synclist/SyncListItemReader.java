/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Sync
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.sync.v1.service.synclist;

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





/*
    * Twilio - Sync
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.33.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class SyncListItemReader extends Reader<SyncListItem> {
    private String serviceSid;
    private String listSid;
    private SyncListItem.QueryResultOrder order;
    private String from;
    private SyncListItem.QueryFromBoundType bounds;
    private Integer pageSize;

    public SyncListItemReader(final String serviceSid, final String listSid){
        this.serviceSid = serviceSid;
        this.listSid = listSid;
    }

    public SyncListItemReader setOrder(final SyncListItem.QueryResultOrder order){
        this.order = order;
        return this;
    }
    public SyncListItemReader setFrom(final String from){
        this.from = from;
        return this;
    }
    public SyncListItemReader setBounds(final SyncListItem.QueryFromBoundType bounds){
        this.bounds = bounds;
        return this;
    }
    public SyncListItemReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<SyncListItem> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<SyncListItem> firstPage(final TwilioRestClient client) {
        String path = "/v1/Services/{ServiceSid}/Lists/{ListSid}/Items";
        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());
        path = path.replace("{"+"ListSid"+"}", this.listSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.SYNC.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<SyncListItem> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("SyncListItem read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "items",
            response.getContent(),
            SyncListItem.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<SyncListItem> previousPage(final Page<SyncListItem> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.SYNC.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<SyncListItem> nextPage(final Page<SyncListItem> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.SYNC.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<SyncListItem> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (order != null) {
    
            request.addQueryParam("Order", order.toString());
        }
        if (from != null) {
    
            request.addQueryParam("From", from);
        }
        if (bounds != null) {
    
            request.addQueryParam("Bounds", bounds.toString());
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }
    }
}

