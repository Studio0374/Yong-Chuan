/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.serverless.v1.service;

import com.twilio.base.Creator;
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

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class BuildCreator extends Creator<Build> {
    private final String pathServiceSid;
    private List<String> assetVersions;
    private List<String> functionVersions;
    private String dependencies;

    /**
     * Construct a new BuildCreator.
     *
     * @param pathServiceSid The SID of the Service to create the Build resource
     *                       under
     */
    public BuildCreator(final String pathServiceSid) {
        this.pathServiceSid = pathServiceSid;
    }

    /**
     * The list of Asset Version resource SIDs to include in the Build..
     *
     * @param assetVersions The list of Asset Version resource SIDs to include in
     *                      the Build
     * @return this
     */
    public BuildCreator setAssetVersions(final List<String> assetVersions) {
        this.assetVersions = assetVersions;
        return this;
    }

    /**
     * The list of Asset Version resource SIDs to include in the Build..
     *
     * @param assetVersions The list of Asset Version resource SIDs to include in
     *                      the Build
     * @return this
     */
    public BuildCreator setAssetVersions(final String assetVersions) {
        return setAssetVersions(Promoter.listOfOne(assetVersions));
    }

    /**
     * The list of the Function Version resource SIDs to include in the Build..
     *
     * @param functionVersions The list of the Function Version resource SIDs to
     *                         include in the Build
     * @return this
     */
    public BuildCreator setFunctionVersions(final List<String> functionVersions) {
        this.functionVersions = functionVersions;
        return this;
    }

    /**
     * The list of the Function Version resource SIDs to include in the Build..
     *
     * @param functionVersions The list of the Function Version resource SIDs to
     *                         include in the Build
     * @return this
     */
    public BuildCreator setFunctionVersions(final String functionVersions) {
        return setFunctionVersions(Promoter.listOfOne(functionVersions));
    }

    /**
     * A list of objects that describe the Dependencies included in the Build. Each
     * object contains the `name` and `version` of the dependency..
     *
     * @param dependencies A list of objects that describe the Dependencies
     *                     included in the Build
     * @return this
     */
    public BuildCreator setDependencies(final String dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Build
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Build create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.SERVERLESS.toString(),
            "/v1/Services/" + this.pathServiceSid + "/Builds"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Build creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Build.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (assetVersions != null) {
            for (String prop : assetVersions) {
                request.addPostParam("AssetVersions", prop);
            }
        }

        if (functionVersions != null) {
            for (String prop : functionVersions) {
                request.addPostParam("FunctionVersions", prop);
            }
        }

        if (dependencies != null) {
            request.addPostParam("Dependencies", dependencies);
        }
    }
}