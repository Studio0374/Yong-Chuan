/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.monitor.v1;

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

public class AlertTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Mocked
    private Twilio tw;

    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.MONITOR.toString(),
                                          "/v1/Alerts/NOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Alert.fetcher("NOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"alert_text\": \"alert_text\",\"api_version\": \"2010-04-01\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_generated\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"error_code\": \"error_code\",\"log_level\": \"log_level\",\"more_info\": \"more_info\",\"request_method\": \"GET\",\"request_url\": \"http://www.example.com\",\"request_variables\": \"request_variables\",\"resource_sid\": \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"response_body\": \"response_body\",\"response_headers\": \"response_headers\",\"request_headers\": \"request_headers\",\"sid\": \"NOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"url\": \"https://monitor.twilio.com/v1/Alerts/NOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"PNe2cd757cd5257b0217a447933a0290d2\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Alert.fetcher("NOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.MONITOR.toString(),
                                          "/v1/Alerts");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Alert.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"alerts\": [],\"meta\": {\"first_page_url\": \"https://monitor.twilio.com/v1/Alerts?LogLevel=log_level&StartDate=2016-01-01&EndDate=2016-01-01&PageSize=50&Page=0\",\"key\": \"alerts\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://monitor.twilio.com/v1/Alerts?LogLevel=log_level&StartDate=2016-01-01&EndDate=2016-01-01&PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Alert.reader().read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"alerts\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"alert_text\": \"alert_text\",\"api_version\": \"2010-04-01\",\"date_created\": \"2015-07-30T20:00:00Z\",\"date_generated\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"error_code\": \"error_code\",\"log_level\": \"log_level\",\"more_info\": \"more_info\",\"request_method\": \"GET\",\"request_url\": \"http://www.example.com\",\"resource_sid\": \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"NOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"url\": \"https://monitor.twilio.com/v1/Alerts/NOaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"PNe2cd757cd5257b0217a447933a0290d2\"}],\"meta\": {\"first_page_url\": \"https://monitor.twilio.com/v1/Alerts?LogLevel=log_level&StartDate=2016-01-01&EndDate=2016-01-01&PageSize=50&Page=0\",\"key\": \"alerts\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://monitor.twilio.com/v1/Alerts?LogLevel=log_level&StartDate=2016-01-01&EndDate=2016-01-01&PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Alert.reader().read());
    }
}