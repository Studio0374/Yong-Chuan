/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.trusthub.v1;

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

public class EndUserTypeTest {
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
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/EndUserTypes");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            EndUserType.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"end_user_types\": [],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://trusthub.twilio.com/v1/EndUserTypes?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://trusthub.twilio.com/v1/EndUserTypes?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"end_user_types\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EndUserType.reader().read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://trusthub.twilio.com/v1/EndUserTypes?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://trusthub.twilio.com/v1/EndUserTypes?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"end_user_types\"},\"end_user_types\": [{\"url\": \"https://trusthub.twilio.com/v1/EndUserTypes/OYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"fields\": [{\"machine_name\": \"last_name\",\"friendly_name\": \"Last Name\",\"constraint\": \"String\"},{\"machine_name\": \"email\",\"friendly_name\": \"Email\",\"constraint\": \"String\"},{\"machine_name\": \"first_name\",\"friendly_name\": \"First Name\",\"constraint\": \"String\"},{\"machine_name\": \"business_title\",\"friendly_name\": \"Business Title\",\"constraint\": \"String\"},{\"machine_name\": \"phone_number\",\"friendly_name\": \"Phone Number\",\"constraint\": \"String\"},{\"machine_name\": \"job_position\",\"friendly_name\": \"Job Position\",\"constraint\": \"String\"}],\"machine_name\": \"authorized_representative_1\",\"friendly_name\": \"Authorized Representative one\",\"sid\": \"OYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EndUserType.reader().read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/EndUserTypes/OYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            EndUserType.fetcher("OYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"url\": \"https://trusthub.twilio.com/v1/EndUserTypes/OYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"fields\": [{\"machine_name\": \"last_name\",\"friendly_name\": \"Last Name\",\"constraint\": \"String\"},{\"machine_name\": \"email\",\"friendly_name\": \"Email\",\"constraint\": \"String\"},{\"machine_name\": \"first_name\",\"friendly_name\": \"First Name\",\"constraint\": \"String\"},{\"machine_name\": \"business_title\",\"friendly_name\": \"Business Title\",\"constraint\": \"String\"},{\"machine_name\": \"phone_number\",\"friendly_name\": \"Phone Number\",\"constraint\": \"String\"},{\"machine_name\": \"job_position\",\"friendly_name\": \"Job Position\",\"constraint\": \"String\"}],\"machine_name\": \"authorized_representative_1\",\"friendly_name\": \"Authorized Representative one\",\"sid\": \"OYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EndUserType.fetcher("OYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }
}