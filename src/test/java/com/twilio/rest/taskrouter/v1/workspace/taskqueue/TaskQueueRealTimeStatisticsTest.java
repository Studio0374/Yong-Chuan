/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace.taskqueue;

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

public class TaskQueueRealTimeStatisticsTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.TASKROUTER.toString(),
                                          "/v1/Workspaces/WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/TaskQueues/WQXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/RealTimeStatistics");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            TaskQueueRealTimeStatistics.fetcher("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WQXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"longest_task_waiting_age\": 100,\"longest_task_waiting_sid\": \"WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"longest_relative_task_age_in_queue\": 100,\"longest_relative_task_sid_in_queue\": \"WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"tasks_by_status\": {\"reserved\": 0,\"pending\": 0,\"assigned\": 0,\"wrapping\": 0},\"total_eligible_workers\": 100,\"activity_statistics\": [{\"friendly_name\": \"Idle\",\"workers\": 0,\"sid\": \"WAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},{\"friendly_name\": \"Busy\",\"workers\": 9,\"sid\": \"WAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},{\"friendly_name\": \"Offline\",\"workers\": 6,\"sid\": \"WAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},{\"friendly_name\": \"Reserved\",\"workers\": 0,\"sid\": \"WAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"tasks_by_priority\": {},\"total_tasks\": 100,\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workspace_sid\": \"WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"total_available_workers\": 100,\"url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/TaskQueues/WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/RealTimeStatistics\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(TaskQueueRealTimeStatistics.fetcher("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WQXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }
}