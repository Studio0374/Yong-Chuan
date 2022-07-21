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

package com.twilio.rest.autopilot.v1.assistant;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Autopilot
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.31.1
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class QueryCreator extends Creator<Query>{
    private String assistantSid;
    private String language;
    private String query;
    private String tasks;
    private String modelBuild;

    public QueryCreator(final String assistantSid, final String language, final String query) {
        this.assistantSid = assistantSid;
        this.language = language;
        this.query = query;
    }

    public QueryCreator setLanguage(final String language){
        this.language = language;
        return this;
    }
    public QueryCreator setQuery(final String query){
        this.query = query;
        return this;
    }
    public QueryCreator setTasks(final String tasks){
        this.tasks = tasks;
        return this;
    }
    public QueryCreator setModelBuild(final String modelBuild){
        this.modelBuild = modelBuild;
        return this;
    }

    @Override
    public Query create(final TwilioRestClient client){
        String path = "/v1/Assistants/{AssistantSid}/Queries";

        path = path.replace("{"+"AssistantSid"+"}", this.assistantSid.toString());
        path = path.replace("{"+"Language"+"}", this.language.toString());
        path = path.replace("{"+"Query"+"}", this.query.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.AUTOPILOT.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Query creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Query.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (language != null) {
            request.addPostParam("Language", language);
    
        }
        if (query != null) {
            request.addPostParam("Query", query);
    
        }
        if (tasks != null) {
            request.addPostParam("Tasks", tasks);
    
        }
        if (modelBuild != null) {
            request.addPostParam("ModelBuild", modelBuild);
    
        }
    }
}
