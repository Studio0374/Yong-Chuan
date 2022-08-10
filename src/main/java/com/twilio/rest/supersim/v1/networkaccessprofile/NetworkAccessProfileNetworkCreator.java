/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Supersim
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.supersim.v1.networkaccessprofile;

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
    * Twilio - Supersim
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.33.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class NetworkAccessProfileNetworkCreator extends Creator<NetworkAccessProfileNetwork>{
    private String networkAccessProfileSid;
    private String network;

    public NetworkAccessProfileNetworkCreator(final String networkAccessProfileSid, final String network) {
        this.networkAccessProfileSid = networkAccessProfileSid;
        this.network = network;
    }

    public NetworkAccessProfileNetworkCreator setNetwork(final String network){
        this.network = network;
        return this;
    }

    @Override
    public NetworkAccessProfileNetwork create(final TwilioRestClient client){
        String path = "/v1/NetworkAccessProfiles/{NetworkAccessProfileSid}/Networks";

        path = path.replace("{"+"NetworkAccessProfileSid"+"}", this.networkAccessProfileSid.toString());
        path = path.replace("{"+"Network"+"}", this.network.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.SUPERSIM.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("NetworkAccessProfileNetwork creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return NetworkAccessProfileNetwork.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (network != null) {
            request.addPostParam("Network", network);
    
        }
    }
}
