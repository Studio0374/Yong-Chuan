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

package com.twilio.rest.api.v2010.account.sip;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class IpAccessControlListUpdater extends Updater<IpAccessControlList>{
    private String sid;
    private String friendlyName;
    private String accountSid;

    public IpAccessControlListUpdater(final String sid, final String friendlyName){
        this.sid = sid;
        this.friendlyName = friendlyName;
    }
    public IpAccessControlListUpdater(final String accountSid, final String sid, final String friendlyName){
        this.accountSid = accountSid;
        this.sid = sid;
        this.friendlyName = friendlyName;
    }

    public IpAccessControlListUpdater setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }

    @Override
    public IpAccessControlList update(final TwilioRestClient client){
        String path = "/2010-04-01/Accounts/{AccountSid}/SIP/IpAccessControlLists/{Sid}.json";

        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        path = path.replace("{"+"AccountSid"+"}", this.accountSid.toString());
        path = path.replace("{"+"Sid"+"}", this.sid.toString());
        path = path.replace("{"+"FriendlyName"+"}", this.friendlyName.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("IpAccessControlList update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return IpAccessControlList.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
    }
}
