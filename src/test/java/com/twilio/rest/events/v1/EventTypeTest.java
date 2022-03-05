/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.events.v1;

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

public class EventTypeTest {
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
                                          Domains.EVENTS.toString(),
                                          "/v1/Types");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            EventType.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"types\": [],\"meta\": {\"page\": 0,\"page_size\": 10,\"first_page_url\": \"https://events.twilio.com/v1/Types?PageSize=10&Page=0\",\"previous_page_url\": null,\"url\": \"https://events.twilio.com/v1/Types?PageSize=10&Page=0\",\"next_page_url\": null,\"key\": \"types\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EventType.reader().read());
    }

    @Test
    public void testReadResultsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"types\": [{\"date_created\": \"2020-08-13T13:28:20Z\",\"date_updated\": \"2020-08-13T13:28:20Z\",\"type\": \"com.twilio.messaging.message.delivered\",\"schema_id\": \"Messaging.MessageStatus\",\"public\": true,\"description\": \"Messaging- delivered message\",\"url\": \"https://events.twilio.com/v1/Types/com.twilio.messaging.message.delivered\",\"links\": {\"schema\": \"https://events.twilio.com/v1/Schemas/Messaging.MessageStatus/Versions\"}},{\"date_created\": \"2020-08-13T13:28:19Z\",\"date_updated\": \"2020-08-13T13:28:19Z\",\"type\": \"com.twilio.messaging.message.failed\",\"schema_id\": \"Messaging.MessageStatus\",\"public\": true,\"description\": \"Messaging- failed message\",\"url\": \"https://events.twilio.com/v1/Types/com.twilio.messaging.message.failed\",\"links\": {\"schema\": \"https://events.twilio.com/v1/Schemas/Messaging.MessageStatus/Versions\"}}],\"meta\": {\"page\": 0,\"page_size\": 20,\"first_page_url\": \"https://events.twilio.com/v1/Types?PageSize=20&Page=0\",\"previous_page_url\": null,\"url\": \"https://events.twilio.com/v1/Types?PageSize=20&Page=0\",\"next_page_url\": null,\"key\": \"types\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EventType.reader().read());
    }

    @Test
    public void testReadResultsWithSchemaIdResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"types\": [{\"date_created\": \"2020-08-13T13:28:20Z\",\"date_updated\": \"2020-08-13T13:28:20Z\",\"type\": \"com.twilio.messaging.message.delivered\",\"schema_id\": \"Messaging.MessageStatus\",\"public\": true,\"description\": \"Messaging- delivered message\",\"url\": \"https://events.twilio.com/v1/Types/com.twilio.messaging.message.delivered\",\"links\": {\"schema\": \"https://events.twilio.com/v1/Schemas/Messaging.MessageStatus/Versions\"}},{\"date_created\": \"2020-08-13T13:28:19Z\",\"date_updated\": \"2020-08-13T13:28:19Z\",\"type\": \"com.twilio.messaging.message.failed\",\"schema_id\": \"Messaging.MessageStatus\",\"public\": true,\"description\": \"Messaging- failed message\",\"url\": \"https://events.twilio.com/v1/Types/com.twilio.messaging.message.failed\",\"links\": {\"schema\": \"https://events.twilio.com/v1/Schemas/Messaging.MessageStatus/Versions\"}}],\"meta\": {\"page\": 0,\"page_size\": 20,\"first_page_url\": \"https://events.twilio.com/v1/Types?SchemaId=Messaging.MessageStatus&PageSize=20&Page=0\",\"previous_page_url\": null,\"url\": \"https://events.twilio.com/v1/Types?SchemaId=Messaging.MessageStatus&PageSize=20&Page=0\",\"next_page_url\": null,\"key\": \"types\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EventType.reader().read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.EVENTS.toString(),
                                          "/v1/Types/type");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            EventType.fetcher("type").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"date_created\": \"2020-08-13T13:28:20Z\",\"date_updated\": \"2020-08-13T13:28:20Z\",\"type\": \"com.twilio.messaging.message.delivered\",\"schema_id\": \"Messaging.MessageStatus\",\"public\": true,\"description\": \"Messaging- delivered message\",\"url\": \"https://events.twilio.com/v1/Types/com.twilio.messaging.message.delivered\",\"links\": {\"schema\": \"https://events.twilio.com/v1/Schemas/Messaging.MessageStatus/Versions\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EventType.fetcher("type").fetch(tw));
    }
}