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

package com.twilio.rest.taskrouter.v1;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class TaskQueueBulkRealTimeStatisticsCreator extends Creator<TaskQueueBulkRealTimeStatistics>{
    private String pathWorkspaceSid;

    public TaskQueueBulkRealTimeStatisticsCreator(final String pathWorkspaceSid) {
        this.pathWorkspaceSid = pathWorkspaceSid;
    }


    @Override
    public TaskQueueBulkRealTimeStatistics create(final TwilioRestClient client){
        String path = "/v1/Workspaces/{WorkspaceSid}/TaskQueues/RealTimeStatistics";

        path = path.replace("{"+"WorkspaceSid"+"}", this.pathWorkspaceSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.TASKROUTER.toString(),
            path
        );
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("TaskQueueBulkRealTimeStatistics creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return TaskQueueBulkRealTimeStatistics.fromJson(response.getStream(), client.getObjectMapper());
    }
}