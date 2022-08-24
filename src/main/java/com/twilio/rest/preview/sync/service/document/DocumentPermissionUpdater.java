/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Preview
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.preview.sync.service.document;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;





/*
    * Twilio - Preview
    *
    * This is the public Twilio REST API.
    *
    * API version: 1.34.0
    * Contact: support@twilio.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.


public class DocumentPermissionUpdater extends Updater<DocumentPermission>{
    private String serviceSid;
    private String documentSid;
    private String identity;
    private Boolean read;
    private Boolean write;
    private Boolean manage;

    public DocumentPermissionUpdater(final String serviceSid, final String documentSid, final String identity, final Boolean read, final Boolean write, final Boolean manage){
        this.serviceSid = serviceSid;
        this.documentSid = documentSid;
        this.identity = identity;
        this.read = read;
        this.write = write;
        this.manage = manage;
    }

    public DocumentPermissionUpdater setRead(final Boolean read){
        this.read = read;
        return this;
    }
    public DocumentPermissionUpdater setWrite(final Boolean write){
        this.write = write;
        return this;
    }
    public DocumentPermissionUpdater setManage(final Boolean manage){
        this.manage = manage;
        return this;
    }

    @Override
    public DocumentPermission update(final TwilioRestClient client){
        String path = "/Sync/Services/{ServiceSid}/Documents/{DocumentSid}/Permissions/{Identity}";

        path = path.replace("{"+"ServiceSid"+"}", this.serviceSid.toString());
        path = path.replace("{"+"DocumentSid"+"}", this.documentSid.toString());
        path = path.replace("{"+"Identity"+"}", this.identity.toString());
        path = path.replace("{"+"Read"+"}", this.read.toString());
        path = path.replace("{"+"Write"+"}", this.write.toString());
        path = path.replace("{"+"Manage"+"}", this.manage.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("DocumentPermission update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return DocumentPermission.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (read != null) {
            request.addPostParam("Read", read.toString());
    
        }
        if (write != null) {
            request.addPostParam("Write", write.toString());
    
        }
        if (manage != null) {
            request.addPostParam("Manage", manage.toString());
    
        }
    }
}
