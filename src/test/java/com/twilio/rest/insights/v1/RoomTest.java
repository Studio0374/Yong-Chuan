/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.insights.v1;

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

public class RoomTest {
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
                                          Domains.INSIGHTS.toString(),
                                          "/v1/Video/Rooms/RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Room.fetcher("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"room_type\": \"go\",\"unique_participant_identities\": 0,\"codecs\": [\"VP8\"],\"max_participants\": 0,\"room_sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"create_time\": \"2015-07-30T20:00:00Z\",\"end_reason\": \"room_ended_via_api\",\"duration_sec\": 50000000,\"room_status\": \"in_progress\",\"media_region\": \"us1\",\"recording_enabled\": false,\"edge_location\": \"ashburn\",\"max_concurrent_participants\": 0,\"unique_participants\": 0,\"room_name\": \"room_name\",\"created_method\": \"sdk\",\"total_participant_duration_sec\": 50000000,\"status_callback_method\": \"GET\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"end_time\": \"2015-07-30T20:00:00Z\",\"total_recording_duration_sec\": 50000000,\"processing_state\": \"complete\",\"concurrent_participants\": 0,\"status_callback\": \"http://www.example.com\",\"url\": \"https://insights.twilio.com/v1/Video/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://insights.twilio.com/v1/Video/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Room.fetcher("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.INSIGHTS.toString(),
                                          "/v1/Video/Rooms");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Room.reader().read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"first_page_url\": \"https://insights.twilio.com/v1/Video/Rooms?PageSize=50&Page=0\",\"url\": \"https://insights.twilio.com/v1/Video/Rooms?PageSize=50&Page=0\",\"page_size\": 50,\"next_page_url\": null,\"key\": \"rooms\",\"page\": 0,\"previous_page_url\": null},\"rooms\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Room.reader().read(tw));
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"first_page_url\": \"https://insights.twilio.com/v1/Video/Rooms?PageSize=50&Page=0\",\"url\": \"https://insights.twilio.com/v1/Video/Rooms?PageSize=50&Page=0\",\"page_size\": 50,\"next_page_url\": null,\"key\": \"rooms\",\"page\": 0,\"previous_page_url\": null},\"rooms\": [{\"room_type\": \"go\",\"unique_participant_identities\": 0,\"codecs\": [\"VP8\"],\"max_participants\": 0,\"room_sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"create_time\": \"2015-07-30T20:00:00Z\",\"end_reason\": \"room_ended_via_api\",\"duration_sec\": 50000000,\"room_status\": \"in_progress\",\"media_region\": \"us1\",\"recording_enabled\": false,\"edge_location\": \"ashburn\",\"max_concurrent_participants\": 0,\"unique_participants\": 0,\"room_name\": \"room_name\",\"created_method\": \"sdk\",\"total_participant_duration_sec\": 50000000,\"status_callback_method\": \"GET\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"end_time\": \"2015-07-30T20:00:00Z\",\"total_recording_duration_sec\": 50000000,\"processing_state\": \"complete\",\"concurrent_participants\": 0,\"status_callback\": \"http://www.example.com\",\"url\": \"https://insights.twilio.com/v1/Video/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participants\": \"https://insights.twilio.com/v1/Video/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\"}}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Room.reader().read(tw));
    }
}