/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Taskrouter
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class TaskCreator extends Creator<Task>{
    private String workspaceSid;
    private Integer timeout;
    private Integer priority;
    private String taskChannel;
    private String workflowSid;
    private String attributes;

    public TaskCreator(final String workspaceSid) {
        this.workspaceSid = workspaceSid;
    }

    public TaskCreator setTimeout(final Integer timeout){
        this.timeout = timeout;
        return this;
    }
    public TaskCreator setPriority(final Integer priority){
        this.priority = priority;
        return this;
    }
    public TaskCreator setTaskChannel(final String taskChannel){
        this.taskChannel = taskChannel;
        return this;
    }
    public TaskCreator setWorkflowSid(final String workflowSid){
        this.workflowSid = workflowSid;
        return this;
    }
    public TaskCreator setAttributes(final String attributes){
        this.attributes = attributes;
        return this;
    }

    @Override
    public Task create(final TwilioRestClient client){
        String path = "/v1/Workspaces/{WorkspaceSid}/Tasks";

        path = path.replace("{"+"WorkspaceSid"+"}", this.workspaceSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.TASKROUTER.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("Task creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Task.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (timeout != null) {
            request.addPostParam("Timeout", timeout.toString());
    
        }
        if (priority != null) {
            request.addPostParam("Priority", priority.toString());
    
        }
        if (taskChannel != null) {
            request.addPostParam("TaskChannel", taskChannel);
    
        }
        if (workflowSid != null) {
            request.addPostParam("WorkflowSid", workflowSid);
    
        }
        if (attributes != null) {
            request.addPostParam("Attributes", attributes);
    
        }
    }
}
