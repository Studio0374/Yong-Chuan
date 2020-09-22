/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.events.v1.schema;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
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

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class VersionTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.EVENTS.toString(),
                                          "/v1/Schemas/id/Versions");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Version.reader("id").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"schema_versions\": [],\"meta\": {\"page\": 0,\"page_size\": 10,\"first_page_url\": \"https://events.twilio.com/v1/Schemas/DataTaps.TestEventSchema/Versions?PageSize=10&Page=0\",\"previous_page_url\": null,\"url\": \"https://events.twilio.com/v1/Schemas/DataTaps.TestEventSchema/Versions?PageSize=10&Page=0\",\"next_page_url\": null,\"key\": \"schema_versions\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Version.reader("id").read());
    }

    @Test
    public void testReadResultsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"schema_versions\": [{\"id\": \"DataTaps.TestEventSchema\",\"schema_version\": 1,\"date_created\": \"2015-07-30T20:00:00Z\",\"url\": \"https://events.twilio.com/v1/Schemas/DataTaps.TestEventSchema/Versions/1\",\"raw\": \"https://events-schemas.twilio.com/DataTaps.TestEventSchema/1\"},{\"id\": \"DataTaps.TestEventSchema\",\"schema_version\": 2,\"date_created\": \"2015-07-30T20:00:00Z\",\"url\": \"https://events.twilio.com/v1/Schemas/DataTaps.TestEventSchema/Versions/2\",\"raw\": \"https://events-schemas.twilio.com/DataTaps.TestEventSchema/2\"}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://events.twilio.com/v1/Schemas/DataTaps.TestEventSchema/Versions?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://events.twilio.com/v1/Schemas/DataTaps.TestEventSchema/Versions?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"schema_versions\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Version.reader("id").read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.EVENTS.toString(),
                                          "/v1/Schemas/id/Versions/1");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Version.fetcher("id", 1).fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"id\": \"DataTaps.TestEventSchema\",\"schema_version\": 1,\"date_created\": \"2015-07-30T20:00:00Z\",\"url\": \"https://events.twilio.com/v1/Schemas/DataTaps.TestEventSchema/Versions/1\",\"raw\": \"https://events-schemas.twilio.com/DataTaps.TestEventSchema/1\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Version.fetcher("id", 1).fetch());
    }
}