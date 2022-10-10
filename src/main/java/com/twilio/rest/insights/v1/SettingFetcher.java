/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Insights
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.insights.v1;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class SettingFetcher extends Fetcher<Setting> {
    private String subaccountSid;

    public SettingFetcher(){
    }

    public SettingFetcher setSubaccountSid(final String subaccountSid){
        this.subaccountSid = subaccountSid;
        return this;
    }

    @Override
    public Setting fetch(final TwilioRestClient client) {
        String path = "/v1/Voice/Settings";


        Request request = new Request(
            HttpMethod.GET,
            Domains.INSIGHTS.toString(),
            path
        );
        addQueryParams(request);
        Response response = client.request(request);

        if (response == null) {
        throw new ApiConnectionException("Setting fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Setting.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addQueryParams(final Request request) {
        if (subaccountSid != null) {
    
            request.addQueryParam("SubaccountSid", subaccountSid);
        }
    }
}
