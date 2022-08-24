/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Api
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.api.v2010.account.call;

import com.twilio.base.Creator;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import java.math.BigDecimal;
import java.util.Map;
import com.twilio.converter.Converter;
import java.net.URI;

import java.util.Map;



import java.net.URI;

/*
    * Twilio - Api
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class PaymentCreator extends Creator<Payment>{
    private String callSid;
    private String idempotencyKey;
    private URI statusCallback;
    private String accountSid;
    private Payment.BankAccountType bankAccountType;
    private BigDecimal chargeAmount;
    private String currency;
    private String description;
    private String input;
    private Integer minPostalCodeLength;
    private Map<String, Object> parameter;
    private String paymentConnector;
    private Payment.PaymentMethod paymentMethod;
    private Boolean postalCode;
    private Boolean securityCode;
    private Integer timeout;
    private Payment.TokenType tokenType;
    private String validCardTypes;

    public PaymentCreator(final String callSid, final String idempotencyKey, final URI statusCallback) {
        this.callSid = callSid;
        this.idempotencyKey = idempotencyKey;
        this.statusCallback = statusCallback;
    }
    public PaymentCreator(final String accountSid, final String callSid, final String idempotencyKey, final URI statusCallback) {
        this.accountSid = accountSid;
        this.callSid = callSid;
        this.idempotencyKey = idempotencyKey;
        this.statusCallback = statusCallback;
    }

    public PaymentCreator setIdempotencyKey(final String idempotencyKey){
        this.idempotencyKey = idempotencyKey;
        return this;
    }
    public PaymentCreator setStatusCallback(final URI statusCallback){
        this.statusCallback = statusCallback;
        return this;
    }

    public PaymentCreator setStatusCallback(final String statusCallback){
    this.statusCallback = Promoter.uriFromString(statusCallback);
    return this;
    }
    public PaymentCreator setBankAccountType(final Payment.BankAccountType bankAccountType){
        this.bankAccountType = bankAccountType;
        return this;
    }
    public PaymentCreator setChargeAmount(final BigDecimal chargeAmount){
        this.chargeAmount = chargeAmount;
        return this;
    }
    public PaymentCreator setCurrency(final String currency){
        this.currency = currency;
        return this;
    }
    public PaymentCreator setDescription(final String description){
        this.description = description;
        return this;
    }
    public PaymentCreator setInput(final String input){
        this.input = input;
        return this;
    }
    public PaymentCreator setMinPostalCodeLength(final Integer minPostalCodeLength){
        this.minPostalCodeLength = minPostalCodeLength;
        return this;
    }
    public PaymentCreator setParameter(final Map<String, Object> parameter){
        this.parameter = parameter;
        return this;
    }
    public PaymentCreator setPaymentConnector(final String paymentConnector){
        this.paymentConnector = paymentConnector;
        return this;
    }
    public PaymentCreator setPaymentMethod(final Payment.PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
        return this;
    }
    public PaymentCreator setPostalCode(final Boolean postalCode){
        this.postalCode = postalCode;
        return this;
    }
    public PaymentCreator setSecurityCode(final Boolean securityCode){
        this.securityCode = securityCode;
        return this;
    }
    public PaymentCreator setTimeout(final Integer timeout){
        this.timeout = timeout;
        return this;
    }
    public PaymentCreator setTokenType(final Payment.TokenType tokenType){
        this.tokenType = tokenType;
        return this;
    }
    public PaymentCreator setValidCardTypes(final String validCardTypes){
        this.validCardTypes = validCardTypes;
        return this;
    }

    @Override
    public Payment create(final TwilioRestClient client){
        String path = "/2010-04-01/Accounts/{AccountSid}/Calls/{CallSid}/Payments.json";

        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        path = path.replace("{"+"AccountSid"+"}", this.accountSid.toString());
        path = path.replace("{"+"CallSid"+"}", this.callSid.toString());
        path = path.replace("{"+"IdempotencyKey"+"}", this.idempotencyKey.toString());
        path = path.replace("{"+"StatusCallback"+"}", this.statusCallback.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.API.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Payment creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Payment.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (idempotencyKey != null) {
            request.addPostParam("IdempotencyKey", idempotencyKey);
    
        }
        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
    
        }
        if (bankAccountType != null) {
            request.addPostParam("BankAccountType", bankAccountType.toString());
    
        }
        if (chargeAmount != null) {
            request.addPostParam("ChargeAmount", chargeAmount.toString());
    
        }
        if (currency != null) {
            request.addPostParam("Currency", currency);
    
        }
        if (description != null) {
            request.addPostParam("Description", description);
    
        }
        if (input != null) {
            request.addPostParam("Input", input);
    
        }
        if (minPostalCodeLength != null) {
            request.addPostParam("MinPostalCodeLength", minPostalCodeLength.toString());
    
        }
        if (parameter != null) {
            request.addPostParam("Parameter",  Converter.mapToJson(parameter));
    
        }
        if (paymentConnector != null) {
            request.addPostParam("PaymentConnector", paymentConnector);
    
        }
        if (paymentMethod != null) {
            request.addPostParam("PaymentMethod", paymentMethod.toString());
    
        }
        if (postalCode != null) {
            request.addPostParam("PostalCode", postalCode.toString());
    
        }
        if (securityCode != null) {
            request.addPostParam("SecurityCode", securityCode.toString());
    
        }
        if (timeout != null) {
            request.addPostParam("Timeout", timeout.toString());
    
        }
        if (tokenType != null) {
            request.addPostParam("TokenType", tokenType.toString());
    
        }
        if (validCardTypes != null) {
            request.addPostParam("ValidCardTypes", validCardTypes);
    
        }
    }
}
