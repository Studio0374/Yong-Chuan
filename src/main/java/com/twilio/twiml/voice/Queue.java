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
 * TwiML wrapper for {@code <Queue>}
 */
@JsonDeserialize(builder = Queue.Builder.class)
public class Queue extends TwiML {
    private final URI url;
    private final HttpMethod method;
    private final String reservationSid;
    private final String postWorkActivitySid;
    private final String name;

    /**
     * For XML Serialization/Deserialization
     */
    private Queue() {
        this(new Builder((String) null));
    }

    /**
     * Create a new {@code <Queue>} element
     */
    private Queue(Builder b) {
        super("Queue", b);
        this.url = b.url;
        this.method = b.method;
        this.reservationSid = b.reservationSid;
        this.postWorkActivitySid = b.postWorkActivitySid;
        this.name = b.name;
    }

    /**
     * The body of the TwiML element
     *
     * @return Element body as a string if present else null
     */
    protected String getElementBody() {
        return this.getName() == null ? null : this.getName();
    }

    /**
     * Attributes to set on the generated XML element
     *
     * @return A Map of attribute keys to values
     */
    protected Map<String, String> getElementAttributes() {
        // Preserve order of attributes
        Map<String, String> attrs = new HashMap<>();

        if (this.getUrl() != null) {
            attrs.put("url", this.getUrl().toString());
        }
        if (this.getMethod() != null) {
            attrs.put("method", this.getMethod().toString());
        }
        if (this.getReservationSid() != null) {
            attrs.put("reservationSid", this.getReservationSid());
        }
        if (this.getPostWorkActivitySid() != null) {
            attrs.put("postWorkActivitySid", this.getPostWorkActivitySid());
        }

        return attrs;
    }

    /**
     * Action URL
     *
     * @return Action URL
     */
    public URI getUrl() {
        return url;
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
     * TaskRouter Reservation SID
     *
     * @return TaskRouter Reservation SID
     */
    public String getReservationSid() {
        return reservationSid;
    }

    /**
     * TaskRouter Activity SID
     *
     * @return TaskRouter Activity SID
     */
    public String getPostWorkActivitySid() {
        return postWorkActivitySid;
    }

    /**
     * Queue name
     *
     * @return Queue name
     */
    public String getName() {
        return name;
    }

    /**
     * Create a new {@code <Queue>} element
     */
    public static class Builder extends TwiML.Builder<Builder> {
        /**
         * Create and return a {@code <Queue.Builder>} from an XML string
         */
        public static Builder fromXml(final String xml) throws TwiMLException {
            try {
                return OBJECT_MAPPER.readValue(xml, Builder.class);
            } catch (final JsonProcessingException jpe) {
                throw new TwiMLException(
                    "Failed to deserialize a Queue.Builder from the provided XML string: " + jpe.getMessage());
            } catch (final Exception e) {
                throw new TwiMLException("Unhandled exception: " + e.getMessage());
            }
        }

        private URI url;
        private HttpMethod method;
        private String reservationSid;
        private String postWorkActivitySid;
        private String name;

        /**
         * Create a {@code <Queue>} with name
         */
        public Builder(String name) {
            this.name = name;
        }

        /**
         * Create a {@code <Queue>} (for XML deserialization)
         */
        private Builder() {
        }

        /**
         * Action URL
         */
        @JacksonXmlProperty(isAttribute = true, localName = "url")
        public Builder url(URI url) {
            this.url = url;
            return this;
        }

        /**
         * Action URL
         */
        public Builder url(String url) {
            this.url = Promoter.uriFromString(url);
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
         * TaskRouter Reservation SID
         */
        @JacksonXmlProperty(isAttribute = true, localName = "reservationSid")
        public Builder reservationSid(String reservationSid) {
            this.reservationSid = reservationSid;
            return this;
        }

        /**
         * TaskRouter Activity SID
         */
        @JacksonXmlProperty(isAttribute = true, localName = "postWorkActivitySid")
        public Builder postWorkActivitySid(String postWorkActivitySid) {
            this.postWorkActivitySid = postWorkActivitySid;
            return this;
        }

        /**
         * Create and return resulting {@code <Queue>} element
         */
        public Queue build() {
            return new Queue(this);
        }
    }
}