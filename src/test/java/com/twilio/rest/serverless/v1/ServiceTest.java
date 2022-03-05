/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.serverless.v1;

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

public class ServiceTest {
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
                                          Domains.SERVERLESS.toString(),
                                          "/v1/Services");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Service.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"services\": [],\"meta\": {\"first_page_url\": \"https://serverless.twilio.com/v1/Services?PageSize=50&Page=0\",\"key\": \"services\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://serverless.twilio.com/v1/Services?PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Service.reader().read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.SERVERLESS.toString(),
                                          "/v1/Services/ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Service.fetcher("ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"ZS00000000000000000000000000000000\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"test-service\",\"unique_name\": \"test-service-1\",\"include_credentials\": true,\"ui_editable\": false,\"domain_base\": \"test-service-1-1234\",\"date_created\": \"2018-11-10T20:00:00Z\",\"date_updated\": \"2018-11-10T20:00:00Z\",\"url\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000\",\"links\": {\"environments\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Environments\",\"functions\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Functions\",\"assets\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Assets\",\"builds\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Builds\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Service.fetcher("ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.SERVERLESS.toString(),
                                          "/v1/Services/ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Service.deleter("ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
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

        Service.deleter("ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.SERVERLESS.toString(),
                                          "/v1/Services");
            request.addPostParam("UniqueName", serialize("unique_name"));
            request.addPostParam("FriendlyName", serialize("friendly_name"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Service.creator("unique_name", "friendly_name").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"ZS00000000000000000000000000000000\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"service-friendly\",\"unique_name\": \"service-unique\",\"include_credentials\": true,\"ui_editable\": false,\"domain_base\": \"service-unique-1234\",\"date_created\": \"2018-11-10T20:00:00Z\",\"date_updated\": \"2018-11-10T20:00:00Z\",\"url\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000\",\"links\": {\"environments\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Environments\",\"functions\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Functions\",\"assets\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Assets\",\"builds\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Builds\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Service.creator("unique_name", "friendly_name").create(tw);
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.SERVERLESS.toString(),
                                          "/v1/Services/ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Service.updater("ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"ZS00000000000000000000000000000000\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"service-friendly-update\",\"unique_name\": \"service-unique-update\",\"include_credentials\": true,\"ui_editable\": true,\"domain_base\": \"service-unique-update-1234\",\"date_created\": \"2018-11-10T20:00:00Z\",\"date_updated\": \"2018-11-10T20:00:00Z\",\"url\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000\",\"links\": {\"environments\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Environments\",\"functions\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Functions\",\"assets\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Assets\",\"builds\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Builds\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Service.updater("ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }
}