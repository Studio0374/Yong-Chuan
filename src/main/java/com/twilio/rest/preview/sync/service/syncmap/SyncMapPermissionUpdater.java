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

package com.twilio.rest.preview.sync.service.syncmap;

import com.twilio.base.Updater;
import com.twilio.constant.EnumConstants;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;




public class SyncMapPermissionUpdater extends Updater<SyncMapPermission>{
    private String pathServiceSid;
    private String pathMapSid;
    private String pathIdentity;
    private Boolean read;
    private Boolean write;
    private Boolean manage;

    public SyncMapPermissionUpdater(final String pathServiceSid, final String pathMapSid, final String pathIdentity, final Boolean read, final Boolean write, final Boolean manage){
        this.pathServiceSid = pathServiceSid;
        this.pathMapSid = pathMapSid;
        this.pathIdentity = pathIdentity;
        this.read = read;
        this.write = write;
        this.manage = manage;
    }

    public SyncMapPermissionUpdater setRead(final Boolean read){
        this.read = read;
        return this;
    }
    public SyncMapPermissionUpdater setWrite(final Boolean write){
        this.write = write;
        return this;
    }
    public SyncMapPermissionUpdater setManage(final Boolean manage){
        this.manage = manage;
        return this;
    }

    @Override
    public SyncMapPermission update(final TwilioRestClient client){
        String path = "/Sync/Services/{ServiceSid}/Maps/{MapSid}/Permissions/{Identity}";

        path = path.replace("{"+"ServiceSid"+"}", this.pathServiceSid.toString());
        path = path.replace("{"+"MapSid"+"}", this.pathMapSid.toString());
        path = path.replace("{"+"Identity"+"}", this.pathIdentity.toString());
        path = path.replace("{"+"Read"+"}", this.read.toString());
        path = path.replace("{"+"Write"+"}", this.write.toString());
        path = path.replace("{"+"Manage"+"}", this.manage.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.PREVIEW.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("SyncMapPermission update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return SyncMapPermission.fromJson(response.getStream(), client.getObjectMapper());
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
