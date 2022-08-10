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

package com.twilio.rest.preview.trustedComms.brandedchannel;

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
    * Twilio - Preview
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.33.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class ChannelCreator extends Creator<Channel>{
    private String brandedChannelSid;
    private String phoneNumberSid;

    public ChannelCreator(final String brandedChannelSid, final String phoneNumberSid) {
        this.brandedChannelSid = brandedChannelSid;
        this.phoneNumberSid = phoneNumberSid;
    }

    public ChannelCreator setPhoneNumberSid(final String phoneNumberSid){
        this.phoneNumberSid = phoneNumberSid;
        return this;
    }

    @Override
    public Channel create(final TwilioRestClient client){
        String path = "/TrustedComms/BrandedChannels/{BrandedChannelSid}/Channels";

        path = path.replace("{"+"BrandedChannelSid"+"}", this.brandedChannelSid.toString());
        path = path.replace("{"+"PhoneNumberSid"+"}", this.phoneNumberSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Channel creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Channel.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (phoneNumberSid != null) {
            request.addPostParam("PhoneNumberSid", phoneNumberSid);
    
        }
    }
}
