/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Trusthub
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.trusthub.v1.trustproducts;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Trusthub
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.33.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class TrustProductsEntityAssignmentsCreator extends Creator<TrustProductsEntityAssignments>{
    private String trustProductSid;
    private String objectSid;

    public TrustProductsEntityAssignmentsCreator(final String trustProductSid, final String objectSid) {
        this.trustProductSid = trustProductSid;
        this.objectSid = objectSid;
    }

    public TrustProductsEntityAssignmentsCreator setObjectSid(final String objectSid){
        this.objectSid = objectSid;
        return this;
    }

    @Override
    public TrustProductsEntityAssignments create(final TwilioRestClient client){
        String path = "/v1/TrustProducts/{TrustProductSid}/EntityAssignments";

        path = path.replace("{"+"TrustProductSid"+"}", this.trustProductSid.toString());
        path = path.replace("{"+"ObjectSid"+"}", this.objectSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.TRUSTHUB.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("TrustProductsEntityAssignments creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return TrustProductsEntityAssignments.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (objectSid != null) {
            request.addPostParam("ObjectSid", objectSid);
    
        }
    }
}
