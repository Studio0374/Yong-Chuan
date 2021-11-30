/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.twilio.converter.Promoter;
import com.twilio.http.HttpMethod;
import com.twilio.twiml.TwiML;
import com.twilio.twiml.TwiMLException;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * TwiML wrapper for {@code <Sms>}
 */
@JsonDeserialize(builder = Sms.Builder.class)
public class Sms extends TwiML {
    private final com.twilio.type.PhoneNumber to;
    private final com.twilio.type.PhoneNumber from;
    private final URI action;
    private final HttpMethod method;
    private final URI statusCallback;
    private final String message;

    /**
     * For XML Serialization/Deserialization
     */
    private Sms() {
        this(new Builder((String) null));
    }

    /**
     * Create a new {@code <Sms>} element
     */
    private Sms(Builder b) {
        super("Sms", b);
        this.to = b.to;
        this.from = b.from;
        this.action = b.action;
        this.method = b.method;
        this.statusCallback = b.statusCallback;
        this.message = b.message;
    }

    /**
     * The body of the TwiML element
     *
     * @return Element body as a string if present else null
     */
    protected String getElementBody() {
        return this.getMessage() == null ? null : this.getMessage();
    }

    /**
     * Attributes to set on the generated XML element
     *
     * @return A Map of attribute keys to values
     */
    protected Map<String, String> getElementAttributes() {
        // Preserve order of attributes
        Map<String, String> attrs = new HashMap<>();

        if (this.getTo() != null) {
            attrs.put("to", this.getTo().toString());
        }
        if (this.getFrom() != null) {
            attrs.put("from", this.getFrom().toString());
        }
        if (this.getAction() != null) {
            attrs.put("action", this.getAction().toString());
        }
        if (this.getMethod() != null) {
            attrs.put("method", this.getMethod().toString());
        }
        if (this.getStatusCallback() != null) {
            attrs.put("statusCallback", this.getStatusCallback().toString());
        }

        return attrs;
    }

    /**
     * Number to send message to
     *
     * @return Number to send message to
     */
    public com.twilio.type.PhoneNumber getTo() {
        return to;
    }

    /**
     * Number to send message from
     *
     * @return Number to send message from
     */
    public com.twilio.type.PhoneNumber getFrom() {
        return from;
    }

    /**
     * Action URL
     *
     * @return Action URL
     */
    public URI getAction() {
        return action;
    }

    /**
     * Action URL method
     *
     * @return Action URL method
     */
    public HttpMethod getMethod() {
        return method;
    }

    /**
     * Status callback URL
     *
     * @return Status callback URL
     */
    public URI getStatusCallback() {
        return statusCallback;
    }

    /**
     * Message body
     *
     * @return Message body
     */
    public String getMessage() {
        return message;
    }

    /**
     * Create a new {@code <Sms>} element
     */
    public static class Builder extends TwiML.Builder<Builder> {
        /**
         * Create and return a {@code <Sms.Builder>} from an XML string
         */
        public static Builder fromXml(final String xml) throws TwiMLException {
            try {
                return OBJECT_MAPPER.readValue(xml, Builder.class);
            } catch (final JsonProcessingException jpe) {
                throw new TwiMLException(
                    "Failed to deserialize a Sms.Builder from the provided XML string: " + jpe.getMessage());
            } catch (final Exception e) {
                throw new TwiMLException("Unhandled exception: " + e.getMessage());
            }
        }

        private com.twilio.type.PhoneNumber to;
        private com.twilio.type.PhoneNumber from;
        private URI action;
        private HttpMethod method;
        private URI statusCallback;
        private String message;

        /**
         * Create a {@code <Sms>} with message
         */
        public Builder(String message) {
            this.message = message;
        }

        /**
         * Create a {@code <Sms>} (for XML deserialization)
         */
        private Builder() {
        }

        /**
         * Number to send message to
         */
        @JacksonXmlProperty(isAttribute = true, localName = "to")
        public Builder to(com.twilio.type.PhoneNumber to) {
            this.to = to;
            return this;
        }

        /**
         * Number to send message to
         */
        public Builder to(String to) {
            this.to = Promoter.phoneNumberFromString(to);
            return this;
        }

        /**
         * Number to send message from
         */
        @JacksonXmlProperty(isAttribute = true, localName = "from")
        public Builder from(com.twilio.type.PhoneNumber from) {
            this.from = from;
            return this;
        }

        /**
         * Number to send message from
         */
        public Builder from(String from) {
            this.from = Promoter.phoneNumberFromString(from);
            return this;
        }

        /**
         * Action URL
         */
        @JacksonXmlProperty(isAttribute = true, localName = "action")
        public Builder action(URI action) {
            this.action = action;
            return this;
        }

        /**
         * Action URL
         */
        public Builder action(String action) {
            this.action = Promoter.uriFromString(action);
            return this;
        }

        /**
         * Action URL method
         */
        @JacksonXmlProperty(isAttribute = true, localName = "method")
        public Builder method(HttpMethod method) {
            this.method = method;
            return this;
        }

        /**
         * Status callback URL
         */
        @JacksonXmlProperty(isAttribute = true, localName = "statusCallback")
        public Builder statusCallback(URI statusCallback) {
            this.statusCallback = statusCallback;
            return this;
        }

        /**
         * Status callback URL
         */
        public Builder statusCallback(String statusCallback) {
            this.statusCallback = Promoter.uriFromString(statusCallback);
            return this;
        }

        /**
         * Create and return resulting {@code <Sms>} element
         */
        public Sms build() {
            return new Sms(this);
        }
    }
}