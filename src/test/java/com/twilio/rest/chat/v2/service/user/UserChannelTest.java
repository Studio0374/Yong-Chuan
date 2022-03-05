/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.chat.v2.service.user;

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

public class UserChannelTest {
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
                                          Domains.CHAT.toString(),
                                          "/v2/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Users/USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Channels");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            UserChannel.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"channels\"},\"channels\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"user_sid\": \"USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"member_sid\": \"MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"joined\",\"last_consumed_message_index\": 5,\"unread_messages_count\": 5,\"notification_level\": \"default\",\"url\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"channel\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"member\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Members/MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(UserChannel.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"channels\"},\"channels\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(UserChannel.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.CHAT.toString(),
                                          "/v2/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Users/USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Channels/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            UserChannel.fetcher("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"user_sid\": \"USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"member_sid\": \"MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"joined\",\"last_consumed_message_index\": 5,\"unread_messages_count\": 5,\"notification_level\": \"default\",\"url\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"channel\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"member\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Members/MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(UserChannel.fetcher("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.CHAT.toString(),
                                          "/v2/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Users/USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Channels/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            UserChannel.deleter("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
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

        UserChannel.deleter("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.CHAT.toString(),
                                          "/v2/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Users/USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Channels/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            UserChannel.updater("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateNotificationLevelResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"user_sid\": \"USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"member_sid\": \"MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"joined\",\"last_consumed_message_index\": 5,\"unread_messages_count\": 5,\"notification_level\": \"muted\",\"url\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"channel\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"member\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Members/MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        UserChannel.updater("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }

    @Test
    public void testUpdateLastConsumedMessageIndexResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"user_sid\": \"USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"member_sid\": \"MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"joined\",\"last_consumed_message_index\": 10,\"unread_messages_count\": 5,\"notification_level\": \"muted\",\"url\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"channel\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"member\": \"https://chat.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Members/MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        UserChannel.updater("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }
}