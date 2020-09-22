/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.sip.credentiallist;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class CredentialFetcher extends Fetcher<Credential> {
    private String pathAccountSid;
    private final String pathCredentialListSid;
    private final String pathSid;

    /**
     * Construct a new CredentialFetcher.
     *
     * @param pathCredentialListSid The unique id that identifies the credential
     *                              list that contains the desired credential
     * @param pathSid The unique id that identifies the resource to fetch.
     */
    public CredentialFetcher(final String pathCredentialListSid,
                             final String pathSid) {
        this.pathCredentialListSid = pathCredentialListSid;
        this.pathSid = pathSid;
    }

    /**
     * Construct a new CredentialFetcher.
     *
     * @param pathAccountSid The unique id of the Account that is responsible for
     *                       this resource.
     * @param pathCredentialListSid The unique id that identifies the credential
     *                              list that contains the desired credential
     * @param pathSid The unique id that identifies the resource to fetch.
     */
    public CredentialFetcher(final String pathAccountSid,
                             final String pathCredentialListSid,
                             final String pathSid) {
        this.pathAccountSid = pathAccountSid;
        this.pathCredentialListSid = pathCredentialListSid;
        this.pathSid = pathSid;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched Credential
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Credential fetch(final TwilioRestClient client) {
        this.pathAccountSid = this.pathAccountSid == null ? client.getAccountSid() : this.pathAccountSid;
        Request request = new Request(
            HttpMethod.GET,
            Domains.API.toString(),
            "/2010-04-01/Accounts/" + this.pathAccountSid + "/SIP/CredentialLists/" + this.pathCredentialListSid + "/Credentials/" + this.pathSid + ".json"
        );

        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Credential fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Credential.fromJson(response.getStream(), client.getObjectMapper());
    }
}