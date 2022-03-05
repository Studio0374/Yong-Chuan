/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.sip.credentiallist;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class CredentialTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Mocked
    private Twilio tw;

    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/SIP/CredentialLists/CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Credentials.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Credential.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"credentials\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"credential_list_sid\": \"CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Wed, 19 Aug 2015 19:48:45 +0000\",\"date_updated\": \"Wed, 19 Aug 2015 19:48:45 +0000\",\"sid\": \"CRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/CredentialLists/CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Credentials/CRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"username\": \"1440013725.28\"}],\"end\": 0,\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/CredentialLists/CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Credentials.json?PageSize=50&Page=0\",\"next_page_uri\": null,\"page\": 0,\"page_size\": 50,\"previous_page_uri\": null,\"start\": 0,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/CredentialLists/CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Credentials.json?PageSize=50&Page=0\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Credential.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"credentials\": [],\"end\": 0,\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/CredentialLists/CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Credentials.json?PageSize=50&Page=0\",\"next_page_uri\": null,\"page\": 0,\"page_size\": 50,\"previous_page_uri\": null,\"start\": 0,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/CredentialLists/CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Credentials.json?PageSize=50&Page=0\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Credential.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/SIP/CredentialLists/CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Credentials.json");
            request.addPostParam("Username", serialize("username"));
            request.addPostParam("Password", serialize("password"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Credential.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "username", "password").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"credential_list_sid\": \"CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Wed, 19 Aug 2015 19:48:45 +0000\",\"date_updated\": \"Wed, 19 Aug 2015 19:48:45 +0000\",\"sid\": \"CRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/CredentialLists/CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Credentials/CRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"username\": \"1440013725.28\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Credential.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "username", "password").create(tw);
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/SIP/CredentialLists/CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Credentials/CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Credential.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"credential_list_sid\": \"CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Wed, 19 Aug 2015 19:48:45 +0000\",\"date_updated\": \"Wed, 19 Aug 2015 19:48:45 +0000\",\"sid\": \"CRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/CredentialLists/CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Credentials/CRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"username\": \"1440013725.28\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Credential.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/SIP/CredentialLists/CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Credentials/CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Credential.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"credential_list_sid\": \"CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Wed, 19 Aug 2015 19:48:45 +0000\",\"date_updated\": \"Wed, 19 Aug 2015 19:48:45 +0000\",\"sid\": \"CRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/CredentialLists/CLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Credentials/CRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"username\": \"username\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Credential.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/SIP/CredentialLists/CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Credentials/CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Credential.deleter("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testDeleteResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("null", TwilioRestClient.HTTP_STATUS_CODE_NO_CONTENT);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Credential.deleter("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }
}