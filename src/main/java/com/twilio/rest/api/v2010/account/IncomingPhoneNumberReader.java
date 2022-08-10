/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account;

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





/*
    * Twilio - Api
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.33.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class IncomingPhoneNumberReader extends Reader<IncomingPhoneNumber> {
    private String accountSid;
    private Boolean beta;
    private String friendlyName;
    private com.twilio.type.PhoneNumber phoneNumber;
    private String origin;
    private Integer pageSize;

    public IncomingPhoneNumberReader(){
    }
    public IncomingPhoneNumberReader(final String accountSid){
        this.accountSid = accountSid;
    }

    public IncomingPhoneNumberReader setBeta(final Boolean beta){
        this.beta = beta;
        return this;
    }
    public IncomingPhoneNumberReader setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public IncomingPhoneNumberReader setPhoneNumber(final com.twilio.type.PhoneNumber phoneNumber){
        this.phoneNumber = phoneNumber;
        return this;
    }

    public IncomingPhoneNumberReader setPhoneNumber(final String phoneNumber){
    this.phoneNumber = Promoter.phoneNumberFromString(phoneNumber);
    return this;
    }
    public IncomingPhoneNumberReader setOrigin(final String origin){
        this.origin = origin;
        return this;
    }
    public IncomingPhoneNumberReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<IncomingPhoneNumber> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<IncomingPhoneNumber> firstPage(final TwilioRestClient client) {
        String path = "/2010-04-01/Accounts/{AccountSid}/IncomingPhoneNumbers.json";
        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        path = path.replace("{"+"AccountSid"+"}", this.accountSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.API.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<IncomingPhoneNumber> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("IncomingPhoneNumber read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "incoming_phone_numbers",
            response.getContent(),
            IncomingPhoneNumber.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<IncomingPhoneNumber> previousPage(final Page<IncomingPhoneNumber> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<IncomingPhoneNumber> nextPage(final Page<IncomingPhoneNumber> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.API.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<IncomingPhoneNumber> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (beta != null) {
    
            request.addQueryParam("Beta", beta.toString());
        }
        if (friendlyName != null) {
    
            request.addQueryParam("FriendlyName", friendlyName);
        }
        if (phoneNumber != null) {
    
            request.addQueryParam("PhoneNumber", phoneNumber.toString());
        }
        if (origin != null) {
    
            request.addQueryParam("Origin", origin);
        }
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }
    }
}

