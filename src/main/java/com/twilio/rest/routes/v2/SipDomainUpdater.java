/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Routes
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.routes.v2;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Routes
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.33.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class SipDomainUpdater extends Updater<SipDomain>{
    private String sipDomain;
    private String voiceRegion;
    private String friendlyName;

    public SipDomainUpdater(final String sipDomain){
        this.sipDomain = sipDomain;
    }

    public SipDomainUpdater setVoiceRegion(final String voiceRegion){
        this.voiceRegion = voiceRegion;
        return this;
    }
    public SipDomainUpdater setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }

    @Override
    public SipDomain update(final TwilioRestClient client){
        String path = "/v2/SipDomains/{SipDomain}";

        path = path.replace("{"+"SipDomain"+"}", this.sipDomain.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.ROUTES.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("SipDomain update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return SipDomain.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (voiceRegion != null) {
            request.addPostParam("VoiceRegion", voiceRegion);
    
        }
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
    }
}
