/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.verify.v2;

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

public class VerificationAttemptTest {
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
                                          Domains.VERIFY.toString(),
                                          "/v2/Attempts");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            VerificationAttempt.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testListVerificationAttemptsEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"attempts\": [],\"meta\": {\"key\": \"attempts\",\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://verify.twilio.com/v2/Attempts?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://verify.twilio.com/v2/Attempts?PageSize=50&Page=0\",\"next_page_url\": null}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(VerificationAttempt.reader().read());
    }

    @Test
    public void testListVerificationAttemptsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"attempts\": [{\"sid\": \"VLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"VAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"verification_sid\": \"VEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2020-08-11T18:36:59Z\",\"date_updated\": \"2020-08-11T18:37:00Z\",\"conversion_status\": \"unconverted\",\"channel\": \"sms\",\"price\": {\"value\": \"0.005\",\"currency\": \"usd\"},\"channel_data\": {\"verification_sid\": \"VEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"to\": \"+573003003030\",\"status\": \"unconfirmed\",\"message_status\": \"undelivered\",\"error_code\": \"30008\",\"country\": \"CO\",\"code_length\": 6,\"locale\": \"es\",\"mcc\": \"732\",\"mnc\": \"103\",\"carrier\": \"Colombia Movil (Tigo)\"},\"url\": \"https://verify.twilio.com/v2/Attempts/VLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"meta\": {\"key\": \"attempts\",\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://verify.twilio.com/v2/Attempts?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://verify.twilio.com/v2/Attempts?PageSize=50&Page=0\",\"next_page_url\": null}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(VerificationAttempt.reader().read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.VERIFY.toString(),
                                          "/v2/Attempts/VLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            VerificationAttempt.fetcher("VLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchVerificationAttemptResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"VLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"VAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"verification_sid\": \"VEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2020-08-11T18:36:59Z\",\"date_updated\": \"2020-08-11T18:37:00Z\",\"conversion_status\": \"unconverted\",\"channel\": \"sms\",\"price\": {\"value\": \"0.005\",\"currency\": \"usd\"},\"channel_data\": {\"verification_sid\": \"VEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"to\": \"+573003003030\",\"status\": \"unconfirmed\",\"message_status\": \"undelivered\",\"error_code\": \"30008\",\"country\": \"CO\",\"code_length\": 6,\"locale\": \"es\",\"mcc\": \"732\",\"mnc\": \"103\",\"carrier\": \"Colombia Movil (Tigo)\"},\"url\": \"https://verify.twilio.com/v2/Attempts/VLaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(VerificationAttempt.fetcher("VLXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }
}