/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Frontline
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.frontlineapi.v1;

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




public class UserUpdater extends Updater<User>{
    private String pathSid;
    private String friendlyName;
    private String avatar;
    private User.StateType state;
    private Boolean isAvailable;

    public UserUpdater(final String pathSid){
        this.pathSid = pathSid;
    }

    public UserUpdater setFriendlyName(final String friendlyName){
        this.friendlyName = friendlyName;
        return this;
    }
    public UserUpdater setAvatar(final String avatar){
        this.avatar = avatar;
        return this;
    }
    public UserUpdater setState(final User.StateType state){
        this.state = state;
        return this;
    }
    public UserUpdater setIsAvailable(final Boolean isAvailable){
        this.isAvailable = isAvailable;
        return this;
    }

    @Override
    public User update(final TwilioRestClient client){
        String path = "/v1/Users/{Sid}";

        path = path.replace("{"+"Sid"+"}", this.pathSid.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.FRONTLINEAPI.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException("User update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content", response.getStatusCode());
            }
            throw new ApiException(restException);
        }

        return User.fromJson(response.getStream(), client.getObjectMapper());
    }
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
    
        }
        if (avatar != null) {
            request.addPostParam("Avatar", avatar);
    
        }
        if (state != null) {
            request.addPostParam("State", state.toString());
    
        }
        if (isAvailable != null) {
            request.addPostParam("IsAvailable", isAvailable.toString());
    
        }
    }
}
