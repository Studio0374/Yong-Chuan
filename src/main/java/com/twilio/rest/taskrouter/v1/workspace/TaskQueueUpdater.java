/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class TaskQueueUpdater extends Updater<TaskQueue> {
    private final String pathWorkspaceSid;
    private final String pathSid;
    private String friendlyName;
    private String targetWorkers;
    private String reservationActivitySid;
    private String assignmentActivitySid;
    private Integer maxReservedWorkers;
    private TaskQueue.TaskOrder taskOrder;

    /**
     * Construct a new TaskQueueUpdater.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the TaskQueue to update
     * @param pathSid The SID of the resource to update
     */
    public TaskQueueUpdater(final String pathWorkspaceSid,
                            final String pathSid) {
        this.pathWorkspaceSid = pathWorkspaceSid;
        this.pathSid = pathSid;
    }

    /**
     * A descriptive string that you create to describe the TaskQueue. For example
     * `Support-Tier 1`, `Sales`, or `Escalation`..
     *
     * @param friendlyName A string to describe the resource
     * @return this
     */
    public TaskQueueUpdater setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * A string describing the Worker selection criteria for any Tasks that enter
     * the TaskQueue. For example '"language" == "spanish"' If no TargetWorkers
     * parameter is provided, Tasks will wait in the queue until they are either
     * deleted or moved to another queue. Additional examples on how to describing
     * Worker selection criteria below..
     *
     * @param targetWorkers A string describing the Worker selection criteria for
     *                      any Tasks that enter the TaskQueue
     * @return this
     */
    public TaskQueueUpdater setTargetWorkers(final String targetWorkers) {
        this.targetWorkers = targetWorkers;
        return this;
    }

    /**
     * The SID of the Activity to assign Workers when a task is reserved for them..
     *
     * @param reservationActivitySid The SID of the Activity to assign Workers when
     *                               a task is reserved for them
     * @return this
     */
    public TaskQueueUpdater setReservationActivitySid(final String reservationActivitySid) {
        this.reservationActivitySid = reservationActivitySid;
        return this;
    }

    /**
     * The SID of the Activity to assign Workers when a task is assigned for them..
     *
     * @param assignmentActivitySid The SID of the Activity to assign Workers when
     *                              a task is assigned for them
     * @return this
     */
    public TaskQueueUpdater setAssignmentActivitySid(final String assignmentActivitySid) {
        this.assignmentActivitySid = assignmentActivitySid;
        return this;
    }

    /**
     * The maximum number of Workers to create reservations for the assignment of a
     * task while in the queue. Maximum of 50..
     *
     * @param maxReservedWorkers The maximum number of Workers to create
     *                           reservations for the assignment of a task while in
     *                           the queue
     * @return this
     */
    public TaskQueueUpdater setMaxReservedWorkers(final Integer maxReservedWorkers) {
        this.maxReservedWorkers = maxReservedWorkers;
        return this;
    }

    /**
     * How Tasks will be assigned to Workers. Can be: `FIFO` or `LIFO` and the
     * default is `FIFO`. Use `FIFO` to assign the oldest task first and `LIFO` to
     * assign the most recent task first. For more information, see <a
     * href="https://www.twilio.com/docs/taskrouter/queue-ordering-last-first-out-lifo">Queue Ordering</a>..
     *
     * @param taskOrder How Tasks will be assigned to Workers
     * @return this
     */
    public TaskQueueUpdater setTaskOrder(final TaskQueue.TaskOrder taskOrder) {
        this.taskOrder = taskOrder;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated TaskQueue
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public TaskQueue update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.TASKROUTER.toString(),
            "/v1/Workspaces/" + this.pathWorkspaceSid + "/TaskQueues/" + this.pathSid + ""
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("TaskQueue update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return TaskQueue.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }

        if (targetWorkers != null) {
            request.addPostParam("TargetWorkers", targetWorkers);
        }

        if (reservationActivitySid != null) {
            request.addPostParam("ReservationActivitySid", reservationActivitySid);
        }

        if (assignmentActivitySid != null) {
            request.addPostParam("AssignmentActivitySid", assignmentActivitySid);
        }

        if (maxReservedWorkers != null) {
            request.addPostParam("MaxReservedWorkers", maxReservedWorkers.toString());
        }

        if (taskOrder != null) {
            request.addPostParam("TaskOrder", taskOrder.toString());
        }
    }
}