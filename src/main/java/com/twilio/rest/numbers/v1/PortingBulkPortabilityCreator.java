/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Numbers
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.numbers.v1;

import com.twilio.base.Creator;
import com.twilio.constant.EnumConstants;
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

import java.util.List;



public class PortingBulkPortabilityCreator extends Creator<PortingBulkPortability>{
    private List<String> phoneNumbers;

    public PortingBulkPortabilityCreator(final List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public PortingBulkPortabilityCreator setPhoneNumbers(final List<String> phoneNumbers){
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public PortingBulkPortabilityCreator setPhoneNumbers(final String phoneNumbers){
        return setPhoneNumbers(Promoter.listOfOne(phoneNumbers));
    }

    @Override
    public PortingBulkPortability create(final TwilioRestClient client){
        String path = "/v1/Porting/Portability";

        path = path.replace("{"+"PhoneNumbers"+"}", this.phoneNumbers.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.NUMBERS.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("PortingBulkPortability creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return PortingBulkPortability.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (phoneNumbers != null) {
            for (String prop : phoneNumbers) {
                request.addPostParam("PhoneNumbers", prop);
            }
    
        }
    }
}