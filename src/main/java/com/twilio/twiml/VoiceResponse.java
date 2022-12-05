/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.twilio.twiml.TwiMLException;
import com.twilio.twiml.voice.Connect;
import com.twilio.twiml.voice.Dial;
import com.twilio.twiml.voice.Echo;
import com.twilio.twiml.voice.Enqueue;
import com.twilio.twiml.voice.Gather;
import com.twilio.twiml.voice.Hangup;
import com.twilio.twiml.voice.Leave;
import com.twilio.twiml.voice.Pause;
import com.twilio.twiml.voice.Pay;
import com.twilio.twiml.voice.Play;
import com.twilio.twiml.voice.Prompt;
import com.twilio.twiml.voice.Queue;
import com.twilio.twiml.voice.Record;
import com.twilio.twiml.voice.Redirect;
import com.twilio.twiml.voice.Refer;
import com.twilio.twiml.voice.Reject;
import com.twilio.twiml.voice.Say;
import com.twilio.twiml.voice.Sms;
import com.twilio.twiml.voice.Start;
import com.twilio.twiml.voice.Stop;

/**
 * TwiML wrapper for {@code <Response>}
 */
@JsonDeserialize(builder = VoiceResponse.Builder.class)
public class VoiceResponse extends TwiML {
    /**
     * For XML Serialization/Deserialization
     */
    private VoiceResponse() {
        this(new Builder());
    }

    /**
     * Create a new {@code <Response>} element
     */
    private VoiceResponse(Builder b) {
        super("Response", b);
    }

    /**
     * Create a new {@code <Response>} element
     */
    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder extends TwiML.Builder<Builder> {
        /**
         * Create and return a {@code <VoiceResponse.Builder>} from an XML string
         */
        public static Builder fromXml(final String xml) throws TwiMLException {
            try {
                return OBJECT_MAPPER.readValue(xml, Builder.class);
            } catch (final JsonProcessingException jpe) {
                throw new TwiMLException(
                    "Failed to deserialize a VoiceResponse.Builder from the provided XML string: " + jpe.getMessage());
            } catch (final Exception e) {
                throw new TwiMLException("Unhandled exception: " + e.getMessage());
            }
        }

        /**
         * Add a child {@code <Connect>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Connect")
        public Builder connect(Connect connect) {
            this.children.add(connect);
            return this;
        }

        /**
         * Add a child {@code <Dial>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Dial")
        public Builder dial(Dial dial) {
            this.children.add(dial);
            return this;
        }

        /**
         * Add a child {@code <Echo>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Echo")
        public Builder echo(Echo echo) {
            this.children.add(echo);
            return this;
        }

        /**
         * Add a child {@code <Enqueue>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Enqueue")
        public Builder enqueue(Enqueue enqueue) {
            this.children.add(enqueue);
            return this;
        }

        /**
         * Add a child {@code <Gather>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Gather")
        public Builder gather(Gather gather) {
            this.children.add(gather);
            return this;
        }

        /**
         * Add a child {@code <Hangup>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Hangup")
        public Builder hangup(Hangup hangup) {
            this.children.add(hangup);
            return this;
        }

        /**
         * Add a child {@code <Leave>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Leave")
        public Builder leave(Leave leave) {
            this.children.add(leave);
            return this;
        }

        /**
         * Add a child {@code <Pause>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Pause")
        public Builder pause(Pause pause) {
            this.children.add(pause);
            return this;
        }

        /**
         * Add a child {@code <Play>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Play")
        public Builder play(Play play) {
            this.children.add(play);
            return this;
        }

        /**
         * Add a child {@code <Queue>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Queue")
        public Builder queue(Queue queue) {
            this.children.add(queue);
            return this;
        }

        /**
         * Add a child {@code <Record>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Record")
        public Builder record(Record record) {
            this.children.add(record);
            return this;
        }

        /**
         * Add a child {@code <Redirect>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Redirect")
        public Builder redirect(Redirect redirect) {
            this.children.add(redirect);
            return this;
        }

        /**
         * Add a child {@code <Reject>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Reject")
        public Builder reject(Reject reject) {
            this.children.add(reject);
            return this;
        }

        /**
         * Add a child {@code <Say>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Say")
        public Builder say(Say say) {
            this.children.add(say);
            return this;
        }

        /**
         * Add a child {@code <Sms>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Sms")
        public Builder sms(Sms sms) {
            this.children.add(sms);
            return this;
        }

        /**
         * Add a child {@code <Pay>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Pay")
        public Builder pay(Pay pay) {
            this.children.add(pay);
            return this;
        }

        /**
         * Add a child {@code <Prompt>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Prompt")
        public Builder prompt(Prompt prompt) {
            this.children.add(prompt);
            return this;
        }

        /**
         * Add a child {@code <Start>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Start")
        public Builder start(Start start) {
            this.children.add(start);
            return this;
        }

        /**
         * Add a child {@code <Stop>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Stop")
        public Builder stop(Stop stop) {
            this.children.add(stop);
            return this;
        }

        /**
         * Add a child {@code <Refer>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Refer")
        public Builder refer(Refer refer) {
            this.children.add(refer);
            return this;
        }

        /**
         * Create and return resulting {@code <Response>} element
         */
        public VoiceResponse build() {
            return new VoiceResponse(this);
        }
    }
}