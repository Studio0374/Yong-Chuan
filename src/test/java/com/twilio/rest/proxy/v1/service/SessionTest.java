/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.proxy.v1.service;

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

public class SessionTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    private Twilio tw;

    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.PROXY.toString(),
                                          "/v1/Services/KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Sessions/KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Session.fetcher("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"service_sid\": \"KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"open\",\"unique_name\": \"Order #1234\",\"date_started\": \"2015-07-30T20:00:00Z\",\"date_ended\": \"2015-07-30T20:00:00Z\",\"date_last_interaction\": \"2015-07-30T20:00:00Z\",\"date_expiry\": \"2015-07-30T20:00:00Z\",\"ttl\": 3600,\"mode\": \"voice-and-message\",\"closed_reason\": \"\",\"sid\": \"KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"date_created\": \"2015-07-30T20:00:00Z\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"url\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"interactions\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Interactions\",\"participants\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Session.fetcher("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.PROXY.toString(),
                                          "/v1/Services/KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Sessions");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Session.reader("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sessions\": [],\"meta\": {\"previous_page_url\": null,\"next_page_url\": null,\"url\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions?PageSize=50&Page=0\",\"page\": 0,\"first_page_url\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions?PageSize=50&Page=0\",\"page_size\": 50,\"key\": \"sessions\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Session.reader("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.PROXY.toString(),
                                          "/v1/Services/KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Sessions");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Session.creator("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"service_sid\": \"KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"open\",\"unique_name\": \"Order #1234\",\"date_started\": \"2015-07-30T20:00:00Z\",\"date_ended\": \"2015-07-30T20:00:00Z\",\"date_last_interaction\": \"2015-07-30T20:00:00Z\",\"date_expiry\": \"2015-07-30T20:00:00Z\",\"ttl\": 3600,\"mode\": \"voice-and-message\",\"closed_reason\": \"\",\"sid\": \"KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"date_created\": \"2015-07-30T20:00:00Z\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"url\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"interactions\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Interactions\",\"participants\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Session.creator("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.PROXY.toString(),
                                          "/v1/Services/KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Sessions/KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Session.deleter("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
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

        Session.deleter("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.PROXY.toString(),
                                          "/v1/Services/KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Sessions/KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Session.updater("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"service_sid\": \"KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"in-progress\",\"unique_name\": \"Order #1234\",\"date_started\": \"2015-07-30T20:00:00Z\",\"date_ended\": \"2015-07-30T20:00:00Z\",\"date_last_interaction\": \"2015-07-30T20:00:00Z\",\"date_expiry\": \"2015-07-30T20:00:00Z\",\"ttl\": 3600,\"mode\": \"voice-and-message\",\"closed_reason\": \"\",\"sid\": \"KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"date_created\": \"2015-07-30T20:00:00Z\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"url\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"interactions\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Interactions\",\"participants\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Session.updater("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }
}