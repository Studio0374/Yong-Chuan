/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.video.v1.room;

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

public class RoomRecordingTest {
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
                                          Domains.VIDEO.toString(),
                                          "/v1/Rooms/RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Recordings/RTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            RoomRecording.fetcher("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "RTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"processing\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T21:00:00Z\",\"date_deleted\": \"2015-07-30T22:00:00Z\",\"sid\": \"RTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"source_sid\": \"MTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"size\": 0,\"type\": \"audio\",\"duration\": 0,\"container_format\": \"mka\",\"codec\": \"OPUS\",\"track_name\": \"A name\",\"offset\": 10,\"grouping_sids\": {\"room_sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},\"media_external_location\": \"https://www.twilio.com\",\"encryption_key\": \"public_key\",\"room_sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings/RTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"media\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings/RTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Media\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(RoomRecording.fetcher("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "RTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.VIDEO.toString(),
                                          "/v1/Rooms/RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Recordings");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            RoomRecording.reader("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"recordings\": [],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"recordings\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(RoomRecording.reader("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testReadResultsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"recordings\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"completed\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T21:00:00Z\",\"date_deleted\": \"2015-07-30T22:00:00Z\",\"sid\": \"RTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"source_sid\": \"MTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"size\": 23,\"type\": \"audio\",\"duration\": 10,\"container_format\": \"mka\",\"codec\": \"OPUS\",\"track_name\": \"A name\",\"offset\": 10,\"grouping_sids\": {\"room_sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"participant_sid\": \"PAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},\"media_external_location\": \"https://www.twilio.com\",\"encryption_key\": \"public_key\",\"room_sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings/RTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"media\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings/RTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Media\"}}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings?Status=completed&DateCreatedBefore=2017-12-31T23%3A59%3A59Z&DateCreatedAfter=2017-01-01T00%3A00%3A01Z&SourceSid=source_sid&PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://video.twilio.com/v1/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings?Status=completed&DateCreatedBefore=2017-12-31T23%3A59%3A59Z&DateCreatedAfter=2017-01-01T00%3A00%3A01Z&SourceSid=source_sid&PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"recordings\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(RoomRecording.reader("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.VIDEO.toString(),
                                          "/v1/Rooms/RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Recordings/RTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            RoomRecording.deleter("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "RTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
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

        RoomRecording.deleter("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "RTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
    }
}