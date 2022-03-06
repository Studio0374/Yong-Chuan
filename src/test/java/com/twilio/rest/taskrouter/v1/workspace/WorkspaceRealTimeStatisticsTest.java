/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

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

public class WorkspaceRealTimeStatisticsTest {
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
                                          Domains.TASKROUTER.toString(),
                                          "/v1/Workspaces/WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/RealTimeStatistics");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            WorkspaceRealTimeStatistics.fetcher("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/RealTimeStatistics\",\"tasks_by_priority\": {},\"activity_statistics\": [{\"friendly_name\": \"Idle\",\"workers\": 0,\"sid\": \"WAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},{\"friendly_name\": \"Busy\",\"workers\": 9,\"sid\": \"WAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},{\"friendly_name\": \"Offline\",\"workers\": 6,\"sid\": \"WAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},{\"friendly_name\": \"Reserved\",\"workers\": 0,\"sid\": \"WAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"workspace_sid\": \"WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"longest_task_waiting_age\": 100,\"longest_task_waiting_sid\": \"WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"total_workers\": 100,\"total_tasks\": 100,\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"tasks_by_status\": {}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(WorkspaceRealTimeStatistics.fetcher("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }
}