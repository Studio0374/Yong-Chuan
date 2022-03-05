/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.understand.assistant;

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

public class QueryTest {
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
                                          Domains.PREVIEW.toString(),
                                          "/understand/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Queries/UHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Query.fetcher("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"language\": \"language\",\"date_created\": \"2015-07-30T20:00:00Z\",\"model_build_sid\": \"UGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"query\": \"query\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"status\",\"sample_sid\": \"UFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"results\": {\"task\": {\"name\": \"name\",\"task_sid\": \"UDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"confidence\": 0.9},\"entities\": [{\"name\": \"name\",\"value\": \"value\",\"type\": \"type\"}]},\"url\": \"https://preview.twilio.com/understand/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queries/UHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"UHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"source_channel\": \"voice\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Query.fetcher("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.PREVIEW.toString(),
                                          "/understand/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Queries");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Query.reader("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"queries\": [],\"meta\": {\"previous_page_url\": null,\"next_page_url\": null,\"first_page_url\": \"https://preview.twilio.com/understand/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queries?Status=status&ModelBuild=UGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&Language=language&PageSize=50&Page=0\",\"page\": 0,\"key\": \"queries\",\"url\": \"https://preview.twilio.com/understand/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queries?Status=status&ModelBuild=UGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&Language=language&PageSize=50&Page=0\",\"page_size\": 50}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Query.reader("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"queries\": [{\"language\": \"language\",\"date_created\": \"2015-07-30T20:00:00Z\",\"model_build_sid\": \"UGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"query\": \"query\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"status\",\"sample_sid\": \"UFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"results\": {\"task\": {\"name\": \"name\",\"task_sid\": \"UDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"confidence\": 0.9},\"entities\": [{\"name\": \"name\",\"value\": \"value\",\"type\": \"type\"}]},\"url\": \"https://preview.twilio.com/understand/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queries/UHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"UHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"source_channel\": null}],\"meta\": {\"previous_page_url\": null,\"next_page_url\": null,\"first_page_url\": \"https://preview.twilio.com/understand/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queries?Status=status&ModelBuild=UGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&Language=language&PageSize=50&Page=0\",\"page\": 0,\"key\": \"queries\",\"url\": \"https://preview.twilio.com/understand/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queries?Status=status&ModelBuild=UGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&Language=language&PageSize=50&Page=0\",\"page_size\": 50}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Query.reader("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.PREVIEW.toString(),
                                          "/understand/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Queries");
            request.addPostParam("Language", serialize("language"));
            request.addPostParam("Query", serialize("query"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Query.creator("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "language", "query").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"language\": \"language\",\"date_created\": \"2015-07-30T20:00:00Z\",\"model_build_sid\": \"UGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"query\": \"query\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"status\",\"sample_sid\": \"UFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"results\": {\"task\": {\"name\": \"name\",\"task_sid\": \"UDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"confidence\": 0.9},\"entities\": [{\"name\": \"name\",\"value\": \"value\",\"type\": \"type\"}]},\"url\": \"https://preview.twilio.com/understand/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queries/UHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"UHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"source_channel\": \"voice\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Query.creator("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "language", "query").create(tw);
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.PREVIEW.toString(),
                                          "/understand/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Queries/UHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Query.updater("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"language\": \"language\",\"date_created\": \"2015-07-30T20:00:00Z\",\"model_build_sid\": \"UGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"query\": \"query\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"status\": \"status\",\"sample_sid\": \"UFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"results\": {\"task\": {\"name\": \"name\",\"task_sid\": \"UDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"confidence\": 0.9},\"entities\": [{\"name\": \"name\",\"value\": \"value\",\"type\": \"type\"}]},\"url\": \"https://preview.twilio.com/understand/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Queries/UHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"UHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"source_channel\": \"sms\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Query.updater("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.PREVIEW.toString(),
                                          "/understand/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Queries/UHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Query.deleter("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
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

        Query.deleter("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }
}