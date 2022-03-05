/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.conference;

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

public class ParticipantTest {
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
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conferences/CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Participants/CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Participant.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": true,\"call_sid_to_coach\": \"CAbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Participant.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testFetchByLabelResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": \"customer\",\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": true,\"call_sid_to_coach\": \"CAbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Participant.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conferences/CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Participants/CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Participant.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testMuteParticipantResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": true,\"hold\": false,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testMuteParticipantByLabelResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": \"customer\",\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": true,\"hold\": false,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testHoldParticipantWithMusicResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": true,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testAnnounceToParticipantResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testModifyParticipantResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"complete\",\"start_conference_on_enter\": true,\"coaching\": true,\"call_sid_to_coach\": \"CAbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testModifyParticipantByLabelResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": \"customer\",\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"complete\",\"start_conference_on_enter\": true,\"coaching\": true,\"call_sid_to_coach\": \"CAbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conferences/CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Participants.json");
            request.addPostParam("From", serialize(new com.twilio.type.PhoneNumber("+15017122661")));
            request.addPostParam("To", serialize(new com.twilio.type.PhoneNumber("+15558675310")));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateWithSidResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": \"customer\",\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"queued\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
    }

    @Test
    public void testCreateWithFriendlyNameResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": \"customer\",\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"queued\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
    }

    @Test
    public void testCreateWithSidAsCoachResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"queued\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
    }

    @Test
    public void testCreateWithNonE164NumberResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"queued\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
    }

    @Test
    public void testCreateWithFriendlyNameJitterBufferSizeResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"queued\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
    }

    @Test
    public void testCreateWithFriendlyNameByocResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"queued\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
    }

    @Test
    public void testCreateWithFriendlyNameCallerIdResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"queued\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"label\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
    }

    @Test
    public void testCreateWithFriendlyNameReasonResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"queued\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
    }

    @Test
    public void testCreateWithFriendlyNameRecordingTrackResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"queued\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
    }

    @Test
    public void testCreateWithFromToClientResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": \"customer\",\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"queued\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
    }

    @Test
    public void testCreateWithFromToSipResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": \"customer\",\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": false,\"hold\": false,\"status\": \"queued\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", new com.twilio.type.PhoneNumber("+15017122661"), new com.twilio.type.PhoneNumber("+15558675310")).create(tw);
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conferences/CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Participants/CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Participant.deleter("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
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

        Participant.deleter("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testDeleteByLabelResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("null", TwilioRestClient.HTTP_STATUS_CODE_NO_CONTENT);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Participant.deleter("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conferences/CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Participants.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Participant.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"participants\": [],\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json?Hold=True&PageSize=50&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json?Hold=True&PageSize=50&Page=0\",\"page\": 0,\"page_size\": 50,\"end\": 0,\"start\": 0}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Participant.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"participants\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Sat, 19 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Sat, 19 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": true,\"hold\": false,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": true,\"call_sid_to_coach\": \"CAbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"},{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Sat, 19 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Sat, 19 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": true,\"hold\": false,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.json\"}],\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json?Muted=true&PageSize=2&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json?Muted=true&PageSize=2&Page=0\",\"page\": 0,\"page_size\": 2,\"start\": 0,\"end\": 1}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Participant.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadNextResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"participants\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAcccccccccccccccccccccccccccccccc\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Thu, 17 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Thu, 17 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": true,\"hold\": false,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAcccccccccccccccccccccccccccccccc.json\"},{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAdddddddddddddddddddddddddddddddd\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Wed, 16 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Wed, 16 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": true,\"hold\": false,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAdddddddddddddddddddddddddddddddd.json\"}],\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json?Muted=true&PageSize=2&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json?Muted=true&PageSize=2&Page=0&PageToken=PBCPcccccccccccccccccccccccccccccccc\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json?Muted=true&PageSize=2&Page=1&PageToken=PACPbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"page\": 1,\"page_size\": 2,\"start\": 2,\"end\": 3}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Participant.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadPreviousResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"participants\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Sat, 19 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Sat, 19 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": true,\"hold\": false,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": true,\"call_sid_to_coach\": \"CAbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\"},{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 21:07:19 +0000\",\"end_conference_on_exit\": false,\"muted\": true,\"hold\": false,\"status\": \"connected\",\"start_conference_on_enter\": true,\"coaching\": false,\"call_sid_to_coach\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CAbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.json\"}],\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json?Muted=true&PageSize=2&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json?Muted=true&PageSize=2&Page=0&PageToken=PBCPcccccccccccccccccccccccccccccccc\",\"page\": 0,\"page_size\": 2,\"start\": 0,\"end\": 1}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Participant.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }
}