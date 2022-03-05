/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.sync.v1.service;

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

public class SyncStreamTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Mocked
    private Twilio tw;

    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.SYNC.toString(),
                                          "/v1/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Streams/TOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SyncStream.fetcher("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "TOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"created_by\": \"created_by\",\"date_expires\": \"2015-07-30T21:00:00Z\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"links\": {\"messages\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams/TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\"},\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"unique_name\": \"unique_name\",\"url\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams/TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(SyncStream.fetcher("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "TOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.SYNC.toString(),
                                          "/v1/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Streams/TOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SyncStream.deleter("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "TOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
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

        SyncStream.deleter("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "TOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.SYNC.toString(),
                                          "/v1/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Streams");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SyncStream.creator("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"created_by\": \"created_by\",\"date_expires\": \"2015-07-30T21:00:00Z\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"links\": {\"messages\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams/TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\"},\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"unique_name\": \"unique_name\",\"url\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams/TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        SyncStream.creator("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.SYNC.toString(),
                                          "/v1/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Streams/TOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SyncStream.updater("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "TOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"created_by\": \"created_by\",\"date_expires\": \"2015-07-30T21:00:00Z\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"links\": {\"messages\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams/TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\"},\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"unique_name\": \"unique_name\",\"url\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams/TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        SyncStream.updater("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "TOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.SYNC.toString(),
                                          "/v1/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Streams");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SyncStream.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"streams\": [],\"meta\": {\"first_page_url\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams?PageSize=50&Page=0\",\"key\": \"streams\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams?PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(SyncStream.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"streams\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"created_by\": \"created_by\",\"date_expires\": \"2015-07-30T21:00:00Z\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"links\": {\"messages\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams/TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\"},\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"unique_name\": \"unique_name\",\"url\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams/TOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"meta\": {\"first_page_url\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams?PageSize=50&Page=0\",\"key\": \"streams\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://sync.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Streams?PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(SyncStream.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }
}