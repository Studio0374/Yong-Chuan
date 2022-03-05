/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.proxy.v1.service.session;

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

public class InteractionTest {
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
                                          Domains.PROXY.toString(),
                                          "/v1/Services/KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Sessions/KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Interactions/KIXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Interaction.fetcher("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KIXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"service_sid\": \"KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"data\": \"{\\\"body\\\":\\\"some message\\\"}\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"inbound_participant_sid\": \"KPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"inbound_resource_sid\": \"SMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"inbound_resource_status\": \"sent\",\"inbound_resource_type\": \"Message\",\"inbound_resource_url\": null,\"outbound_participant_sid\": \"KPbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"outbound_resource_sid\": \"SMbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"outbound_resource_status\": \"sent\",\"outbound_resource_type\": \"Message\",\"outbound_resource_url\": null,\"sid\": \"KIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"type\": \"message\",\"url\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Interactions/KIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"session_sid\": \"KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Interaction.fetcher("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KIXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.PROXY.toString(),
                                          "/v1/Services/KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Sessions/KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Interactions");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Interaction.reader("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"interactions\": [],\"meta\": {\"previous_page_url\": null,\"next_page_url\": null,\"url\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Interactions?PageSize=50&Page=0\",\"page\": 0,\"first_page_url\": \"https://proxy.twilio.com/v1/Services/KSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Sessions/KCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Interactions?PageSize=50&Page=0\",\"page_size\": 50,\"key\": \"interactions\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Interaction.reader("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.PROXY.toString(),
                                          "/v1/Services/KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Sessions/KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Interactions/KIXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Interaction.deleter("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KIXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
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

        Interaction.deleter("KSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KCXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "KIXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }
}