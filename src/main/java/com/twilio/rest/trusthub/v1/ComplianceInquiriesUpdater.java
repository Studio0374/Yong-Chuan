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

package com.twilio.rest.trusthub.v1;

import com.twilio.base.Updater;
import com.twilio.constant.EnumConstants;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class ComplianceInquiriesUpdater extends Updater<ComplianceInquiries>{
    private String pathCustomerId;
    private String primaryProfileSid;

    public ComplianceInquiriesUpdater(final String pathCustomerId, final String primaryProfileSid){
        this.pathCustomerId = pathCustomerId;
        this.primaryProfileSid = primaryProfileSid;
    }

    public ComplianceInquiriesUpdater setPrimaryProfileSid(final String primaryProfileSid){
        this.primaryProfileSid = primaryProfileSid;
        return this;
    }

    @Override
    public ComplianceInquiries update(final TwilioRestClient client){
        String path = "/v1/ComplianceInquiries/Customers/{CustomerId}/Initialize";

        path = path.replace("{"+"CustomerId"+"}", this.pathCustomerId.toString());
        path = path.replace("{"+"PrimaryProfileSid"+"}", this.primaryProfileSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.TRUSTHUB.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("ComplianceInquiries update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return ComplianceInquiries.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (primaryProfileSid != null) {
            request.addPostParam("PrimaryProfileSid", primaryProfileSid);
    
        }
    }
}
