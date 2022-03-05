/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1.user;

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

public class UserConversationTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Mocked
    private Twilio tw;
    
    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Users/USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conversations/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            UserConversation.updater("USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"chat_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"conversation_sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"unread_messages_count\": 100,\"last_read_message_index\": 100,\"participant_sid\": \"MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"user_sid\": \"USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"conversation_state\": \"inactive\",\"timers\": {\"date_inactive\": \"2015-12-16T22:19:38Z\",\"date_closed\": \"2015-12-16T22:28:38Z\"},\"attributes\": \"{}\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"created_by\": \"created_by\",\"notification_level\": \"default\",\"unique_name\": \"unique_name\",\"url\": \"https://conversations.twilio.com/v1/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participant\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"conversation\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        UserConversation.updater("USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Users/USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conversations/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            UserConversation.deleter("USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
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

        UserConversation.deleter("USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Users/USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conversations/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            UserConversation.fetcher("USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"chat_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"conversation_sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"unread_messages_count\": 100,\"last_read_message_index\": 100,\"participant_sid\": \"MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"user_sid\": \"USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"conversation_state\": \"inactive\",\"timers\": {\"date_inactive\": \"2015-12-16T22:19:38Z\",\"date_closed\": \"2015-12-16T22:28:38Z\"},\"attributes\": \"{}\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"created_by\": \"created_by\",\"notification_level\": \"default\",\"unique_name\": \"unique_name\",\"url\": \"https://conversations.twilio.com/v1/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participant\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"conversation\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(UserConversation.fetcher("USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Users/USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conversations");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            UserConversation.reader("USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"conversations\": [],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://conversations.twilio.com/v1/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conversations?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://conversations.twilio.com/v1/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conversations?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"conversations\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(UserConversation.reader("USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"conversations\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"chat_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"conversation_sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"unread_messages_count\": 100,\"last_read_message_index\": 100,\"participant_sid\": \"MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"user_sid\": \"USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"conversation_state\": \"inactive\",\"timers\": {\"date_inactive\": \"2015-12-16T22:19:38Z\",\"date_closed\": \"2015-12-16T22:28:38Z\"},\"attributes\": \"{}\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"created_by\": \"created_by\",\"notification_level\": \"default\",\"unique_name\": \"unique_name\",\"url\": \"https://conversations.twilio.com/v1/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"participant\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/MBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"conversation\": \"https://conversations.twilio.com/v1/Conversations/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://conversations.twilio.com/v1/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conversations?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://conversations.twilio.com/v1/Users/USaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conversations?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"conversations\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(UserConversation.reader("USXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }
}