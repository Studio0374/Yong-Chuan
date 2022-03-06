/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.numbers.v2.regulatorycompliance;

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

public class RegulationTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    private Twilio tw;
    
    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.NUMBERS.toString(),
                                          "/v2/RegulatoryCompliance/Regulations");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Regulation.reader().read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"results\": [],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://numbers.twilio.com/v2/RegulatoryCompliance/Regulations?IsoCountry=US&EndUserType=business&NumberType=mobile&PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://numbers.twilio.com/v2/RegulatoryCompliance/Regulations?IsoCountry=US&EndUserType=business&NumberType=mobile&PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"results\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Regulation.reader().read(tw));
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"results\": [{\"sid\": \"RNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"Australia: Local - Individual\",\"iso_country\": \"AU\",\"number_type\": \"local\",\"end_user_type\": \"individual\",\"requirements\": {\"end_user\": [{\"name\": \"Individual\",\"type\": \"individual\",\"url\": \"https://numbers.twilio.com/v2/RegulatoryCompliance/Regulations/individual\",\"fields\": [\"first_name\",\"last_name\"]}],\"supporting_document\": [[{\"name\": \"Address\",\"type\": \"document\",\"description\": \"The physical location of the individual or business. Must be within locality or region covered by the phone numbers prefix; a PO Box is not acceptable where a local address is required.\",\"accepted_documents\": [{\"name\": \"Address Validation\",\"type\": \"address\",\"url\": \"https://numbers.twilio.com/v2/RegulatoryCompliance/DocumentTypes/address\",\"fields\": []}]}]]},\"url\": \"https://numbers.twilio.com/v2/RegulatoryCompliance/Regulations/RNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://numbers.twilio.com/v2/RegulatoryCompliance/Regulations?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://numbers.twilio.com/v2/RegulatoryCompliance/Regulations?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"results\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Regulation.reader().read(tw));
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.NUMBERS.toString(),
                                          "/v2/RegulatoryCompliance/Regulations/RNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Regulation.fetcher("RNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"RNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"Australia: Local - Individual\",\"iso_country\": \"AU\",\"number_type\": \"local\",\"end_user_type\": \"individual\",\"requirements\": {\"end_user\": [{\"name\": \"Individual\",\"type\": \"individual\",\"url\": \"https://numbers.twilio.com/v2/RegulatoryCompliance/Regulations/individual\",\"fields\": [\"first_name\",\"last_name\"]}],\"supporting_document\": [[{\"name\": \"Address\",\"type\": \"document\",\"description\": \"The physical location of the individual or business. Must be within locality or region covered by the phone numbers prefix; a PO Box is not acceptable where a local address is required.\",\"accepted_documents\": [{\"name\": \"Address Validation\",\"type\": \"address\",\"url\": \"https://numbers.twilio.com/v2/RegulatoryCompliance/DocumentTypes/address\",\"fields\": []}]}]]},\"url\": \"https://numbers.twilio.com/v2/RegulatoryCompliance/Regulations/RNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Regulation.fetcher("RNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }
}