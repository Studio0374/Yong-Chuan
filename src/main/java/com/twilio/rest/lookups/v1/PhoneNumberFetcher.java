/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.lookups.v1;

import com.twilio.base.Fetcher;
import com.twilio.converter.PrefixedCollapsibleMap;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.util.List;
import java.util.Map;

public class PhoneNumberFetcher extends Fetcher<PhoneNumber> {
    private final com.twilio.type.PhoneNumber pathPhoneNumber;
    private String countryCode;
    private List<String> type;
    private List<String> addOns;
    private Map<String, Object> addOnsData;

    /**
     * Construct a new PhoneNumberFetcher.
     *
     * @param pathPhoneNumber The phone number to fetch in E.164 format
     */
    public PhoneNumberFetcher(final com.twilio.type.PhoneNumber pathPhoneNumber) {
        this.pathPhoneNumber = pathPhoneNumber;
    }

    /**
     * The <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO country
     * code</a> of the phone number to fetch. This is used to specify the country
     * when the phone number is provided in a national format..
     *
     * @param countryCode The ISO country code of the phone number
     * @return this
     */
    public PhoneNumberFetcher setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The type of information to return. Can be: `carrier` or `caller-name`. The
     * default is null.  Carrier information costs $0.005 per phone number looked
     * up.  Caller Name information is currently available only in the US and costs
     * $0.01 per phone number looked up.  To retrieve both types on information,
     * specify this parameter twice; once with `carrier` and once with `caller-name`
     * as the value..
     *
     * @param type The type of information to return
     * @return this
     */
    public PhoneNumberFetcher setType(final List<String> type) {
        this.type = type;
        return this;
    }

    /**
     * The type of information to return. Can be: `carrier` or `caller-name`. The
     * default is null.  Carrier information costs $0.005 per phone number looked
     * up.  Caller Name information is currently available only in the US and costs
     * $0.01 per phone number looked up.  To retrieve both types on information,
     * specify this parameter twice; once with `carrier` and once with `caller-name`
     * as the value..
     *
     * @param type The type of information to return
     * @return this
     */
    public PhoneNumberFetcher setType(final String type) {
        return setType(Promoter.listOfOne(type));
    }

    /**
     * The `unique_name` of an Add-on you would like to invoke. Can be the
     * `unique_name` of an Add-on that is installed on your account. You can specify
     * multiple instances of this parameter to invoke multiple Add-ons. For more
     * information about  Add-ons, see the <a
     * href="https://www.twilio.com/docs/add-ons">Add-ons documentation</a>..
     *
     * @param addOns The unique_name of an Add-on you would like to invoke
     * @return this
     */
    public PhoneNumberFetcher setAddOns(final List<String> addOns) {
        this.addOns = addOns;
        return this;
    }

    /**
     * The `unique_name` of an Add-on you would like to invoke. Can be the
     * `unique_name` of an Add-on that is installed on your account. You can specify
     * multiple instances of this parameter to invoke multiple Add-ons. For more
     * information about  Add-ons, see the <a
     * href="https://www.twilio.com/docs/add-ons">Add-ons documentation</a>..
     *
     * @param addOns The unique_name of an Add-on you would like to invoke
     * @return this
     */
    public PhoneNumberFetcher setAddOns(final String addOns) {
        return setAddOns(Promoter.listOfOne(addOns));
    }

    /**
     * Data specific to the add-on you would like to invoke. The content and format
     * of this value depends on the add-on..
     *
     * @param addOnsData Data specific to the add-on you would like to invoke
     * @return this
     */
    public PhoneNumberFetcher setAddOnsData(final Map<String, Object> addOnsData) {
        this.addOnsData = addOnsData;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched PhoneNumber
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public PhoneNumber fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.LOOKUPS.toString(),
            "/v1/PhoneNumbers/" + this.pathPhoneNumber.encode("utf-8") + ""
        );

        addQueryParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("PhoneNumber fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return PhoneNumber.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (countryCode != null) {
            request.addQueryParam("CountryCode", countryCode);
        }

        if (type != null) {
            for (String prop : type) {
                request.addQueryParam("Type", prop);
            }
        }

        if (addOns != null) {
            for (String prop : addOns) {
                request.addQueryParam("AddOns", prop);
            }
        }

        if (addOnsData != null) {
            Map<String, String> params = PrefixedCollapsibleMap.serialize(addOnsData, "AddOns");
            for (Map.Entry<String, String> entry : params.entrySet()) {
                request.addQueryParam(entry.getKey(), entry.getValue());
            }
        }
    }
}