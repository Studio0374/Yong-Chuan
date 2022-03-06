/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.ipmessaging.v2.service;

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

public class ChannelTest {
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
                                          Domains.IPMESSAGING.toString(),
                                          "/v2/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Channels/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Channel.fetcher("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"unique_name\": \"unique_name\",\"attributes\": \"{ \\\"foo\\\": \\\"bar\\\" }\",\"type\": \"public\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:37Z\",\"created_by\": \"system\",\"members_count\": 0,\"messages_count\": 0,\"url\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"members\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Members\",\"messages\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"invites\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Invites\",\"webhooks\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\",\"last_message\": null}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Channel.fetcher("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.IPMESSAGING.toString(),
                                          "/v2/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Channels/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            request.addHeaderParam("X-Twilio-Webhook-Enabled", serialize(Channel.WebhookEnabledType.TRUE));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Channel.deleter("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").setXTwilioWebhookEnabled(Channel.WebhookEnabledType.TRUE).delete(tw);
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

        Channel.deleter("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").setXTwilioWebhookEnabled(Channel.WebhookEnabledType.TRUE).delete(tw);
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.IPMESSAGING.toString(),
                                          "/v2/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Channels");
            request.addHeaderParam("X-Twilio-Webhook-Enabled", serialize(Channel.WebhookEnabledType.TRUE));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Channel.creator("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").setXTwilioWebhookEnabled(Channel.WebhookEnabledType.TRUE).create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"unique_name\": \"unique_name\",\"attributes\": \"{ \\\"foo\\\": \\\"bar\\\" }\",\"type\": \"public\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:38Z\",\"created_by\": \"username\",\"members_count\": 0,\"messages_count\": 0,\"url\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"members\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Members\",\"messages\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"invites\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Invites\",\"webhooks\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\",\"last_message\": null}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Channel.creator("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").setXTwilioWebhookEnabled(Channel.WebhookEnabledType.TRUE).create(tw);
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.IPMESSAGING.toString(),
                                          "/v2/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Channels");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Channel.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"channels\": [{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"unique_name\": \"unique_name\",\"attributes\": \"{ \\\"foo\\\": \\\"bar\\\" }\",\"type\": \"public\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:37Z\",\"created_by\": \"system\",\"members_count\": 0,\"messages_count\": 0,\"url\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"members\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Members\",\"messages\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"invites\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Invites\",\"webhooks\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\",\"last_message\": null}}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"channels\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Channel.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"channels\": [],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"channels\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Channel.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.IPMESSAGING.toString(),
                                          "/v2/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Channels/CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            request.addHeaderParam("X-Twilio-Webhook-Enabled", serialize(Channel.WebhookEnabledType.TRUE));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Channel.updater("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").setXTwilioWebhookEnabled(Channel.WebhookEnabledType.TRUE).update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"unique_name\": \"unique_name\",\"attributes\": \"{ \\\"foo\\\": \\\"bar\\\" }\",\"type\": \"public\",\"date_created\": \"2015-12-16T22:18:37Z\",\"date_updated\": \"2015-12-16T22:18:38Z\",\"created_by\": \"username\",\"members_count\": 0,\"messages_count\": 0,\"url\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"members\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Members\",\"messages\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Messages\",\"invites\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Invites\",\"webhooks\": \"https://ip-messaging.twilio.com/v2/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Channels/CHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks\",\"last_message\": null}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Channel.updater("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").setXTwilioWebhookEnabled(Channel.WebhookEnabledType.TRUE).update(tw);
    }
}