/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Preview
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.preview.hostedNumbers;

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
import com.twilio.base.Page;



public class HostedNumberOrderReader extends Reader<HostedNumberOrder> {
    private HostedNumberOrder.Status status;
    private com.twilio.type.PhoneNumber phoneNumber;
    private String incomingPhoneNumberSid;
    private String friendlyName;
    private String uniqueName;
    private Integer pageSize;

    public HostedNumberOrderReader(){
    }

    public HostedNumberOrderReader setStatus(final HostedNumberOrder.Status status){
        this.status = status;
        return this;
    }
    public HostedNumberOrderReader setPhoneNumber(final com.twilio.type.PhoneNumber phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public HostedNumberOrderReader setPhoneNumber(final String phoneNumber){
        return setPhoneNumber(Promoter.phoneNumberFromString(phoneNumber));
    }
    public HostedNumberOrderReader setIncomingPhoneNumberSid(final String incomingPhoneNumberSid){
        this.incomingPhoneNumberSid = incomingPhoneNumberSid;
        return this;
    }
    public HostedNumberOrderReader setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public HostedNumberOrderReader setUniqueName(final String uniqueName){
        this.uniqueName = uniqueName;
        return this;
    }
    public HostedNumberOrderReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<HostedNumberOrder> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<HostedNumberOrder> firstPage(final TwilioRestClient client) {
        String path = "/HostedNumbers/HostedNumberOrders";

        Request request = new Request(
            HttpMethod.GET,
            Domains.PREVIEW.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<HostedNumberOrder> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("HostedNumberOrder read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "items",
            response.getContent(),
            HostedNumberOrder.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<HostedNumberOrder> previousPage(final Page<HostedNumberOrder> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.PREVIEW.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<HostedNumberOrder> nextPage(final Page<HostedNumberOrder> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.PREVIEW.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<HostedNumberOrder> getPage(final String targetUrl, final TwilioRestClient client) {
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
        if (phoneNumber != null) {
    
            request.addQueryParam("PhoneNumber", phoneNumber.toString());
        }
        if (incomingPhoneNumberSid != null) {
    
            request.addQueryParam("IncomingPhoneNumberSid", incomingPhoneNumberSid);
        }
        if (friendlyName != null) {
    
            request.addQueryParam("FriendlyName", friendlyName);
        }
        if (uniqueName != null) {
    
            request.addQueryParam("UniqueName", uniqueName);
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }

        if(getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
