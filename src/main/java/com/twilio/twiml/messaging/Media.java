/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.messaging;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.twilio.converter.Promoter;
import com.twilio.twiml.TwiML;
import com.twilio.twiml.TwiMLException;

import java.net.URI;

/**
 * TwiML wrapper for {@code <Media>}
 */
@JsonDeserialize(builder = Media.Builder.class)
public class Media extends TwiML {
    private final URI url;

    /**
     * For XML Serialization/Deserialization
     */
    private Media() {
        this(new Builder((URI) null));
    }

    /**
     * Create a new {@code <Media>} element
     */
    private Media(Builder b) {
        super("Media", b);
        this.url = b.url;
    }

    /**
     * The body of the TwiML element
     *
     * @return Element body as a string if present else null
     */
    protected String getElementBody() {
        return this.getUrl() == null ? null : this.getUrl().toString();
    }

    /**
     * Media URL
     *
     * @return Media URL
     */
    public URI getUrl() {
        return url;
    }

    /**
     * Create a new {@code <Media>} element
     */
    public static class Builder extends TwiML.Builder<Builder> {
        /**
         * Create and return a {@code <Media.Builder>} from an XML string
         */
        public static Builder fromXml(final String xml) throws TwiMLException {
            try {
                return OBJECT_MAPPER.readValue(xml, Builder.class);
            } catch (final JsonProcessingException jpe) {
                throw new TwiMLException(
                    "Failed to deserialize a Media.Builder from the provided XML string: " + jpe.getMessage());
            } catch (final Exception e) {
                throw new TwiMLException("Unhandled exception: " + e.getMessage());
            }
        }

        private URI url;

        /**
         * Create a {@code <Media>} with url
         */
        public Builder(URI url) {
            this.url = url;
        }

        /**
         * Create a {@code <Media>} with url
         */
        public Builder(String url) {
            this.url = Promoter.uriFromString(url);
        }

        /**
         * Create a {@code <Media>} (for XML deserialization)
         */
        private Builder() {
        }

        /**
         * Create and return resulting {@code <Media>} element
         */
        public Media build() {
            return new Media(this);
        }
    }
}