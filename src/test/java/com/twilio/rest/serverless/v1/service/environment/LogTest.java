/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.serverless.v1.service.environment;

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

public class LogTest {
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
                                          Domains.SERVERLESS.toString(),
                                          "/v1/Services/ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Environments/ZEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Logs");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Log.reader("ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ZEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"logs\": [],\"meta\": {\"first_page_url\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Environments/ZE00000000000000000000000000000000/Logs?StartDate=2018-11-10T20%3A00%3A00Z&EndDate=2018-12-10T20%3A00%3A00Z&FunctionSid=ZH00000000000000000000000000000000&PageSize=50&Page=0\",\"key\": \"logs\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Environments/ZE00000000000000000000000000000000/Logs?StartDate=2018-11-10T20%3A00%3A00Z&EndDate=2018-12-10T20%3A00%3A00Z&FunctionSid=ZH00000000000000000000000000000000&PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Log.reader("ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ZEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.SERVERLESS.toString(),
                                          "/v1/Services/ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Environments/ZEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Logs/NOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Log.fetcher("ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ZEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "NOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"NO00000000000000000000000000000000\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ZS00000000000000000000000000000000\",\"environment_sid\": \"ZE00000000000000000000000000000000\",\"build_sid\": \"ZB00000000000000000000000000000000\",\"deployment_sid\": \"ZD00000000000000000000000000000000\",\"function_sid\": \"ZH00000000000000000000000000000000\",\"request_sid\": \"RQ00000000000000000000000000000000\",\"level\": \"warn\",\"message\": \"This is a warning\",\"date_created\": \"2018-11-10T20:00:00Z\",\"url\": \"https://serverless.twilio.com/v1/Services/ZS00000000000000000000000000000000/Environments/ZE00000000000000000000000000000000/Logs/NO00000000000000000000000000000000\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Log.fetcher("ZSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ZEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "NOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }
}