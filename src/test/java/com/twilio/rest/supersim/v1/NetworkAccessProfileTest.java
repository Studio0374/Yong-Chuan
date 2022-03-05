/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.supersim.v1;

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

public class NetworkAccessProfileTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Mocked
    private Twilio tw;

    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.SUPERSIM.toString(),
                                          "/v1/NetworkAccessProfiles");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            NetworkAccessProfile.creator().create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateMinimalResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"unique_name\": null,\"sid\": \"HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2020-05-01T20:00:00Z\",\"date_updated\": \"2020-05-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"networks\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Networks\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        NetworkAccessProfile.creator().create(tw);
    }

    @Test
    public void testCreateWithNameAndNetworksResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"unique_name\": \"My Network Access Profile\",\"sid\": \"HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2020-05-01T20:00:00Z\",\"date_updated\": \"2020-05-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"networks\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Networks\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        NetworkAccessProfile.creator().create(tw);
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.SUPERSIM.toString(),
                                          "/v1/NetworkAccessProfiles/HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            NetworkAccessProfile.fetcher("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"unique_name\": \"My Network Access Profile\",\"sid\": \"HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2020-05-01T20:00:00Z\",\"date_updated\": \"2020-05-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"networks\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Networks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(NetworkAccessProfile.fetcher("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.SUPERSIM.toString(),
                                          "/v1/NetworkAccessProfiles/HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            NetworkAccessProfile.updater("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateUniqueNameResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"unique_name\": \"My Network Access Profile\",\"sid\": \"HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2020-05-01T20:00:00Z\",\"date_updated\": \"2020-05-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"networks\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Networks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        NetworkAccessProfile.updater("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.SUPERSIM.toString(),
                                          "/v1/NetworkAccessProfiles");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            NetworkAccessProfile.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"network_access_profiles\": [],\"meta\": {\"first_page_url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles?PageSize=50&Page=0\",\"key\": \"network_access_profiles\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles?PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(NetworkAccessProfile.reader().read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"first_page_url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles?PageSize=50&Page=0\",\"key\": \"network_access_profiles\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles?PageSize=50&Page=0\"},\"network_access_profiles\": [{\"unique_name\": \"My Network Access Profile\",\"sid\": \"HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2020-05-01T20:00:00Z\",\"date_updated\": \"2020-05-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"networks\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Networks\"}}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(NetworkAccessProfile.reader().read());
    }
}