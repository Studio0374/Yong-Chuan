/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.trustedComms;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;
import java.util.List;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class PhoneCallCreator extends Creator<PhoneCall> {
    private final String from;
    private final String to;
    private String reason;
    private String applicationSid;
    private String callerId;
    private HttpMethod fallbackMethod;
    private URI fallbackUrl;
    private String machineDetection;
    private Integer machineDetectionSilenceTimeout;
    private Integer machineDetectionSpeechEndThreshold;
    private Integer machineDetectionSpeechThreshold;
    private Integer machineDetectionTimeout;
    private HttpMethod method;
    private Boolean record;
    private String recordingChannels;
    private String recordingStatusCallback;
    private List<String> recordingStatusCallbackEvent;
    private HttpMethod recordingStatusCallbackMethod;
    private String sendDigits;
    private String sipAuthPassword;
    private String sipAuthUsername;
    private URI statusCallback;
    private List<String> statusCallbackEvent;
    private HttpMethod statusCallbackMethod;
    private Integer timeout;
    private String trim;
    private URI url;

    /**
     * Construct a new PhoneCallCreator.
     *
     * @param from Twilio number from which to originate the call
     * @param to The terminating Phone Number
     */
    public PhoneCallCreator(final String from,
                            final String to) {
        this.from = from;
        this.to = to;
    }

    /**
     * The business reason for this phone call that will appear in the terminating
     * device's screen. Max 50 characters..
     *
     * @param reason The business reason for this phone call
     * @return this
     */
    public PhoneCallCreator setReason(final String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param applicationSid Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setApplicationSid(final String applicationSid) {
        this.applicationSid = applicationSid;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param callerId Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setCallerId(final String callerId) {
        this.callerId = callerId;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param fallbackMethod Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setFallbackMethod(final HttpMethod fallbackMethod) {
        this.fallbackMethod = fallbackMethod;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param fallbackUrl Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setFallbackUrl(final URI fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param fallbackUrl Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setFallbackUrl(final String fallbackUrl) {
        return setFallbackUrl(Promoter.uriFromString(fallbackUrl));
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param machineDetection Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setMachineDetection(final String machineDetection) {
        this.machineDetection = machineDetection;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param machineDetectionSilenceTimeout Refers to the Voice API Initiate Call
     *                                       parameter
     * @return this
     */
    public PhoneCallCreator setMachineDetectionSilenceTimeout(final Integer machineDetectionSilenceTimeout) {
        this.machineDetectionSilenceTimeout = machineDetectionSilenceTimeout;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param machineDetectionSpeechEndThreshold Refers to the Voice API Initiate
     *                                           Call parameter
     * @return this
     */
    public PhoneCallCreator setMachineDetectionSpeechEndThreshold(final Integer machineDetectionSpeechEndThreshold) {
        this.machineDetectionSpeechEndThreshold = machineDetectionSpeechEndThreshold;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param machineDetectionSpeechThreshold Refers to the Voice API Initiate Call
     *                                        parameter
     * @return this
     */
    public PhoneCallCreator setMachineDetectionSpeechThreshold(final Integer machineDetectionSpeechThreshold) {
        this.machineDetectionSpeechThreshold = machineDetectionSpeechThreshold;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param machineDetectionTimeout Refers to the Voice API Initiate Call
     *                                parameter
     * @return this
     */
    public PhoneCallCreator setMachineDetectionTimeout(final Integer machineDetectionTimeout) {
        this.machineDetectionTimeout = machineDetectionTimeout;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param method Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setMethod(final HttpMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param record Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setRecord(final Boolean record) {
        this.record = record;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param recordingChannels Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setRecordingChannels(final String recordingChannels) {
        this.recordingChannels = recordingChannels;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param recordingStatusCallback Refers to the Voice API Initiate Call
     *                                parameter
     * @return this
     */
    public PhoneCallCreator setRecordingStatusCallback(final String recordingStatusCallback) {
        this.recordingStatusCallback = recordingStatusCallback;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param recordingStatusCallbackEvent Refers to the Voice API Initiate Call
     *                                     parameter
     * @return this
     */
    public PhoneCallCreator setRecordingStatusCallbackEvent(final List<String> recordingStatusCallbackEvent) {
        this.recordingStatusCallbackEvent = recordingStatusCallbackEvent;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param recordingStatusCallbackEvent Refers to the Voice API Initiate Call
     *                                     parameter
     * @return this
     */
    public PhoneCallCreator setRecordingStatusCallbackEvent(final String recordingStatusCallbackEvent) {
        return setRecordingStatusCallbackEvent(Promoter.listOfOne(recordingStatusCallbackEvent));
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param recordingStatusCallbackMethod Refers to the Voice API Initiate Call
     *                                      parameter
     * @return this
     */
    public PhoneCallCreator setRecordingStatusCallbackMethod(final HttpMethod recordingStatusCallbackMethod) {
        this.recordingStatusCallbackMethod = recordingStatusCallbackMethod;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param sendDigits Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setSendDigits(final String sendDigits) {
        this.sendDigits = sendDigits;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param sipAuthPassword Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setSipAuthPassword(final String sipAuthPassword) {
        this.sipAuthPassword = sipAuthPassword;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param sipAuthUsername Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setSipAuthUsername(final String sipAuthUsername) {
        this.sipAuthUsername = sipAuthUsername;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param statusCallback Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setStatusCallback(final URI statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param statusCallback Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setStatusCallback(final String statusCallback) {
        return setStatusCallback(Promoter.uriFromString(statusCallback));
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param statusCallbackEvent Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setStatusCallbackEvent(final List<String> statusCallbackEvent) {
        this.statusCallbackEvent = statusCallbackEvent;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param statusCallbackEvent Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setStatusCallbackEvent(final String statusCallbackEvent) {
        return setStatusCallbackEvent(Promoter.listOfOne(statusCallbackEvent));
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param statusCallbackMethod Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod) {
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param timeout Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setTimeout(final Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param trim Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setTrim(final String trim) {
        this.trim = trim;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param url Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setUrl(final URI url) {
        this.url = url;
        return this;
    }

    /**
     * Refers to the parameter with the same name when <a
     * href="https://www.twilio.com/docs/voice/api/call#create-a-call-resource">initiating a call via Voice API</a>.
     *
     * @param url Refers to the Voice API Initiate Call parameter
     * @return this
     */
    public PhoneCallCreator setUrl(final String url) {
        return setUrl(Promoter.uriFromString(url));
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created PhoneCall
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public PhoneCall create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            "/TrustedComms/Business/PhoneCalls"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("PhoneCall creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return PhoneCall.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (from != null) {
            request.addPostParam("From", from);
        }

        if (to != null) {
            request.addPostParam("To", to);
        }

        if (reason != null) {
            request.addPostParam("Reason", reason);
        }

        if (applicationSid != null) {
            request.addPostParam("ApplicationSid", applicationSid);
        }

        if (callerId != null) {
            request.addPostParam("CallerId", callerId);
        }

        if (fallbackMethod != null) {
            request.addPostParam("FallbackMethod", fallbackMethod.toString());
        }

        if (fallbackUrl != null) {
            request.addPostParam("FallbackUrl", fallbackUrl.toString());
        }

        if (machineDetection != null) {
            request.addPostParam("MachineDetection", machineDetection);
        }

        if (machineDetectionSilenceTimeout != null) {
            request.addPostParam("MachineDetectionSilenceTimeout", machineDetectionSilenceTimeout.toString());
        }

        if (machineDetectionSpeechEndThreshold != null) {
            request.addPostParam("MachineDetectionSpeechEndThreshold", machineDetectionSpeechEndThreshold.toString());
        }

        if (machineDetectionSpeechThreshold != null) {
            request.addPostParam("MachineDetectionSpeechThreshold", machineDetectionSpeechThreshold.toString());
        }

        if (machineDetectionTimeout != null) {
            request.addPostParam("MachineDetectionTimeout", machineDetectionTimeout.toString());
        }

        if (method != null) {
            request.addPostParam("Method", method.toString());
        }

        if (record != null) {
            request.addPostParam("Record", record.toString());
        }

        if (recordingChannels != null) {
            request.addPostParam("RecordingChannels", recordingChannels);
        }

        if (recordingStatusCallback != null) {
            request.addPostParam("RecordingStatusCallback", recordingStatusCallback);
        }

        if (recordingStatusCallbackEvent != null) {
            for (String prop : recordingStatusCallbackEvent) {
                request.addPostParam("RecordingStatusCallbackEvent", prop);
            }
        }

        if (recordingStatusCallbackMethod != null) {
            request.addPostParam("RecordingStatusCallbackMethod", recordingStatusCallbackMethod.toString());
        }

        if (sendDigits != null) {
            request.addPostParam("SendDigits", sendDigits);
        }

        if (sipAuthPassword != null) {
            request.addPostParam("SipAuthPassword", sipAuthPassword);
        }

        if (sipAuthUsername != null) {
            request.addPostParam("SipAuthUsername", sipAuthUsername);
        }

        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
        }

        if (statusCallbackEvent != null) {
            for (String prop : statusCallbackEvent) {
                request.addPostParam("StatusCallbackEvent", prop);
            }
        }

        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
        }

        if (timeout != null) {
            request.addPostParam("Timeout", timeout.toString());
        }

        if (trim != null) {
            request.addPostParam("Trim", trim);
        }

        if (url != null) {
            request.addPostParam("Url", url.toString());
        }
    }
}