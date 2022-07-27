/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Autopilot
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.autopilot.v1.assistant.task;

import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import com.twilio.base.Page;





/*
    * Twilio - Autopilot
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.32.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class FieldReader extends Reader<Field> {
    private String assistantSid;
    private String taskSid;
    private Integer pageSize;

    public FieldReader(final String assistantSid, final String taskSid){
        this.assistantSid = assistantSid;
        this.taskSid = taskSid;
    }

    public FieldReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<Field> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<Field> firstPage(final TwilioRestClient client) {
        String path = "/v1/Assistants/{AssistantSid}/Tasks/{TaskSid}/Fields";
        path = path.replace("{"+"AssistantSid"+"}", this.assistantSid.toString());
        path = path.replace("{"+"TaskSid"+"}", this.taskSid.toString());

        Request request = new Request(
            HttpMethod.GET,
            Domains.AUTOPILOT.toString(),
            path
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    private Page<Field> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Field read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "fields",
            response.getContent(),
            Field.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<Field> previousPage(final Page<Field> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.AUTOPILOT.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<Field> nextPage(final Page<Field> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.AUTOPILOT.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Field> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addQueryParams(final Request request) {
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }
    }
}

