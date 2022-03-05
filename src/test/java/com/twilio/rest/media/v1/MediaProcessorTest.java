/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.media.v1;

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

public class MediaProcessorTest {
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
                                          Domains.MEDIA.toString(),
                                          "/v1/MediaProcessors");
            request.addPostParam("Extension", serialize("extension"));
            request.addPostParam("ExtensionContext", serialize("extension_context"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            MediaProcessor.creator("extension", "extension_context").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"extension\": \"video-composer-v1\",\"extension_context\": \"{}\",\"sid\": \"ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"status\": \"started\",\"status_callback\": \"http://www.example.com\",\"status_callback_method\": \"POST\",\"ended_reason\": null,\"url\": \"https://media.twilio.com/v1/MediaProcessors/ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"max_duration\": 300}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        MediaProcessor.creator("extension", "extension_context").create(tw);
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.MEDIA.toString(),
                                          "/v1/MediaProcessors/ZXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            MediaProcessor.fetcher("ZXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"extension\": \"video-composer-v1\",\"extension_context\": \"{}\",\"sid\": \"ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"status\": \"started\",\"status_callback\": \"http://www.example.com\",\"status_callback_method\": \"POST\",\"ended_reason\": null,\"url\": \"https://media.twilio.com/v1/MediaProcessors/ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"max_duration\": 300}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(MediaProcessor.fetcher("ZXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.MEDIA.toString(),
                                          "/v1/MediaProcessors/ZXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            request.addPostParam("Status", serialize(MediaProcessor.UpdateStatus.ENDED));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            MediaProcessor.updater("ZXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", MediaProcessor.UpdateStatus.ENDED).update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateEndedResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:01:00Z\",\"extension\": \"video-composer-v1\",\"extension_context\": \"{}\",\"sid\": \"ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"status\": \"ended\",\"status_callback\": \"http://www.example.com\",\"status_callback_method\": \"POST\",\"ended_reason\": \"ended-via-api\",\"url\": \"https://media.twilio.com/v1/MediaProcessors/ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"max_duration\": 300}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        MediaProcessor.updater("ZXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", MediaProcessor.UpdateStatus.ENDED).update(tw);
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.MEDIA.toString(),
                                          "/v1/MediaProcessors");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            MediaProcessor.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 10,\"first_page_url\": \"https://media.twilio.com/v1/MediaProcessors?Status=started&Order=asc&PageSize=10&Page=0\",\"previous_page_url\": null,\"url\": \"https://media.twilio.com/v1/MediaProcessors?Status=started&Order=asc&PageSize=10&Page=0\",\"next_page_url\": null,\"key\": \"media_processors\"},\"media_processors\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(MediaProcessor.reader().read());
    }

    @Test
    public void testReadItemsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 10,\"first_page_url\": \"https://media.twilio.com/v1/MediaProcessors?Status=ended&Order=desc&PageSize=10&Page=0\",\"previous_page_url\": null,\"url\": \"https://media.twilio.com/v1/MediaProcessors?Status=ended&Order=desc&PageSize=10&Page=0\",\"next_page_url\": null,\"key\": \"media_processors\"},\"media_processors\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:01:00Z\",\"extension\": \"video-composer-v1\",\"extension_context\": \"{}\",\"sid\": \"ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"status\": \"ended\",\"status_callback\": \"http://www.example.com\",\"status_callback_method\": \"POST\",\"ended_reason\": \"ended-via-api\",\"url\": \"https://media.twilio.com/v1/MediaProcessors/ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"max_duration\": 300}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(MediaProcessor.reader().read());
    }

    @Test
    public void testReadItemsUsingPageTokenResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 10,\"first_page_url\": \"https://media.twilio.com/v1/MediaProcessors?Status=ended&Order=desc&PageSize=10&Page=0\",\"previous_page_url\": null,\"url\": \"https://media.twilio.com/v1/MediaProcessors?Status=ended&Order=desc&PageSize=10&Page=0&PageToken=PTTUszYTgyOGFhNDIzZWExNzA0OTkwODNlMDlkZTg3M2NiNDoxOjI%253D\",\"next_page_url\": null,\"key\": \"media_processors\"},\"media_processors\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:01:00Z\",\"extension\": \"video-composer-v1\",\"extension_context\": \"{}\",\"sid\": \"ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"status\": \"ended\",\"status_callback\": \"http://www.example.com\",\"status_callback_method\": \"POST\",\"ended_reason\": \"ended-via-api\",\"url\": \"https://media.twilio.com/v1/MediaProcessors/ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"max_duration\": 300}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(MediaProcessor.reader().read());
    }

    @Test
    public void testReadItemsPageLargerThanMaxResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 100,\"first_page_url\": \"https://media.twilio.com/v1/MediaProcessors?Status=ended&Order=desc&PageSize=100&Page=0\",\"previous_page_url\": null,\"url\": \"https://media.twilio.com/v1/MediaProcessors?Status=ended&Order=desc&PageSize=100&Page=0\",\"next_page_url\": null,\"key\": \"media_processors\"},\"media_processors\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:01:00Z\",\"extension\": \"video-composer-v1\",\"extension_context\": \"{}\",\"sid\": \"ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"status\": \"ended\",\"status_callback\": \"http://www.example.com\",\"status_callback_method\": \"POST\",\"ended_reason\": \"ended-via-api\",\"url\": \"https://media.twilio.com/v1/MediaProcessors/ZXdeadbeefdeadbeefdeadbeefdeadbeef\",\"max_duration\": 300}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(MediaProcessor.reader().read());
    }
}