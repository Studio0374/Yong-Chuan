/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.call;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Payment extends Resource {
    private static final long serialVersionUID = 264986398146032L;

    public enum PaymentMethod {
        CREDIT_CARD("credit-card"),
        ACH_DEBIT("ach-debit");

        private final String value;

        private PaymentMethod(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a PaymentMethod from a string.
         * @param value string value
         * @return generated PaymentMethod
         */
        @JsonCreator
        public static PaymentMethod forValue(final String value) {
            return Promoter.enumFromString(value, PaymentMethod.values());
        }
    }

    public enum BankAccountType {
        CONSUMER_CHECKING("consumer-checking"),
        CONSUMER_SAVINGS("consumer-savings"),
        COMMERCIAL_CHECKING("commercial-checking");

        private final String value;

        private BankAccountType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a BankAccountType from a string.
         * @param value string value
         * @return generated BankAccountType
         */
        @JsonCreator
        public static BankAccountType forValue(final String value) {
            return Promoter.enumFromString(value, BankAccountType.values());
        }
    }

    public enum TokenType {
        ONE_TIME("one-time"),
        REUSABLE("reusable");

        private final String value;

        private TokenType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a TokenType from a string.
         * @param value string value
         * @return generated TokenType
         */
        @JsonCreator
        public static TokenType forValue(final String value) {
            return Promoter.enumFromString(value, TokenType.values());
        }
    }

    public enum Capture {
        PAYMENT_CARD_NUMBER("payment-card-number"),
        EXPIRATION_DATE("expiration-date"),
        SECURITY_CODE("security-code"),
        POSTAL_CODE("postal-code"),
        BANK_ROUTING_NUMBER("bank-routing-number"),
        BANK_ACCOUNT_NUMBER("bank-account-number");

        private final String value;

        private Capture(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Capture from a string.
         * @param value string value
         * @return generated Capture
         */
        @JsonCreator
        public static Capture forValue(final String value) {
            return Promoter.enumFromString(value, Capture.values());
        }
    }

    public enum Status {
        COMPLETE("complete"),
        CANCEL("cancel");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Status from a string.
         * @param value string value
         * @return generated Status
         */
        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    /**
     * Create a PaymentCreator to execute create.
     *
     * @param pathAccountSid The SID of the Account that will create the resource
     * @param pathCallSid The SID of the call that will create the resource.
     * @param idempotencyKey A unique token that will be used to ensure that
     *                       multiple API calls with the same information do not
     *                       result in multiple transactions.
     * @param statusCallback Provide an absolute or relative URL to receive status
     *                       updates regarding your Pay session..
     * @return PaymentCreator capable of executing the create
     */
    public static PaymentCreator creator(final String pathAccountSid,
                                         final String pathCallSid,
                                         final String idempotencyKey,
                                         final URI statusCallback) {
        return new PaymentCreator(pathAccountSid, pathCallSid, idempotencyKey, statusCallback);
    }

    /**
     * Create a PaymentCreator to execute create.
     *
     * @param pathCallSid The SID of the call that will create the resource.
     * @param idempotencyKey A unique token that will be used to ensure that
     *                       multiple API calls with the same information do not
     *                       result in multiple transactions.
     * @param statusCallback Provide an absolute or relative URL to receive status
     *                       updates regarding your Pay session..
     * @return PaymentCreator capable of executing the create
     */
    public static PaymentCreator creator(final String pathCallSid,
                                         final String idempotencyKey,
                                         final URI statusCallback) {
        return new PaymentCreator(pathCallSid, idempotencyKey, statusCallback);
    }

    /**
     * Create a PaymentUpdater to execute update.
     *
     * @param pathAccountSid The SID of the Account that will update the resource
     * @param pathCallSid The SID of the call that will create the resource.
     * @param pathSid The SID of Payments session
     * @param idempotencyKey A unique token that will be used to ensure that
     *                       multiple API calls with the same information do not
     *                       result in multiple transactions.
     * @param statusCallback Provide an absolute or relative URL to receive status
     *                       updates regarding your Pay session.
     * @return PaymentUpdater capable of executing the update
     */
    public static PaymentUpdater updater(final String pathAccountSid,
                                         final String pathCallSid,
                                         final String pathSid,
                                         final String idempotencyKey,
                                         final URI statusCallback) {
        return new PaymentUpdater(pathAccountSid, pathCallSid, pathSid, idempotencyKey, statusCallback);
    }

    /**
     * Create a PaymentUpdater to execute update.
     *
     * @param pathCallSid The SID of the call that will create the resource.
     * @param pathSid The SID of Payments session
     * @param idempotencyKey A unique token that will be used to ensure that
     *                       multiple API calls with the same information do not
     *                       result in multiple transactions.
     * @param statusCallback Provide an absolute or relative URL to receive status
     *                       updates regarding your Pay session.
     * @return PaymentUpdater capable of executing the update
     */
    public static PaymentUpdater updater(final String pathCallSid,
                                         final String pathSid,
                                         final String idempotencyKey,
                                         final URI statusCallback) {
        return new PaymentUpdater(pathCallSid, pathSid, idempotencyKey, statusCallback);
    }

    /**
     * Converts a JSON String into a Payment object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Payment object represented by the provided JSON
     */
    public static Payment fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Payment.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Payment object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Payment object represented by the provided JSON
     */
    public static Payment fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Payment.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String callSid;
    private final String sid;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String uri;

    @JsonCreator
    private Payment(@JsonProperty("account_sid")
                    final String accountSid,
                    @JsonProperty("call_sid")
                    final String callSid,
                    @JsonProperty("sid")
                    final String sid,
                    @JsonProperty("date_created")
                    final String dateCreated,
                    @JsonProperty("date_updated")
                    final String dateUpdated,
                    @JsonProperty("uri")
                    final String uri) {
        this.accountSid = accountSid;
        this.callSid = callSid;
        this.sid = sid;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.uri = uri;
    }

    /**
     * Returns The SID of the Account that created the Payments resource..
     *
     * @return The SID of the Account that created the Payments resource.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The SID of the Call the resource is associated with..
     *
     * @return The SID of the Call the resource is associated with.
     */
    public final String getCallSid() {
        return this.callSid;
    }

    /**
     * Returns The SID of the Payments resource..
     *
     * @return The SID of the Payments resource.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The RFC 2822 date and time in GMT that the resource was created.
     *
     * @return The RFC 2822 date and time in GMT that the resource was created
     */
    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The RFC 2822 date and time in GMT that the resource was last updated.
     *
     * @return The RFC 2822 date and time in GMT that the resource was last updated
     */
    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The URI of the resource, relative to `https://api.twilio.com`.
     *
     * @return The URI of the resource, relative to `https://api.twilio.com`
     */
    public final String getUri() {
        return this.uri;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Payment other = (Payment) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(callSid, other.callSid) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(uri, other.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            callSid,
                            sid,
                            dateCreated,
                            dateUpdated,
                            uri);
    }
}
