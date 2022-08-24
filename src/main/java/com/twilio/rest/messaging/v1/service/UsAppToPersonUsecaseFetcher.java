/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.messaging.v1.service;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Messaging
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class UsAppToPersonUsecaseFetcher extends Fetcher<UsAppToPersonUsecase> {
    private String messagingServiceSid;
    private String brandRegistrationSid;

    public UsAppToPersonUsecaseFetcher(final String messagingServiceSid){
        this.messagingServiceSid = messagingServiceSid;
    }

    public UsAppToPersonUsecaseFetcher setBrandRegistrationSid(final String brandRegistrationSid){
    this.brandRegistrationSid = brandRegistrationSid;
    return this;
    }

    @Override
    public UsAppToPersonUsecase fetch(final TwilioRestClient client) {
        String path = "/v1/Services/{MessagingServiceSid}/Compliance/Usa2p/Usecases";

        path = path.replace("{"+"MessagingServiceSid"+"}", this.messagingServiceSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.MESSAGING.toString(),
            path
        );
        addQueryParams(request);
        Response response = client.request(request);

        if (response == null) {
        throw new ApiConnectionException("UsAppToPersonUsecase fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return UsAppToPersonUsecase.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addQueryParams(final Request request) {
        if (brandRegistrationSid != null) {
    
            request.addQueryParam("BrandRegistrationSid", brandRegistrationSid);
        }
    }
}

