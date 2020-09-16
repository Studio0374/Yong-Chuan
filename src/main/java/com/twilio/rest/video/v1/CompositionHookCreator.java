/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.video.v1;

import com.twilio.base.Creator;
import com.twilio.converter.Converter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class CompositionHookCreator extends Creator<CompositionHook> {
    private final String friendlyName;
    private Boolean enabled;
    private Map<String, Object> videoLayout;
    private List<String> audioSources;
    private List<String> audioSourcesExcluded;
    private String resolution;
    private CompositionHook.Format format;
    private URI statusCallback;
    private HttpMethod statusCallbackMethod;
    private Boolean trim;

    /**
     * Construct a new CompositionHookCreator.
     *
     * @param friendlyName A unique string to describe the resource
     */
    public CompositionHookCreator(final String friendlyName) {
        this.friendlyName = friendlyName;
    }

    /**
     * Whether the composition hook is active. When `true`, the composition hook
     * will be triggered for every completed Group Room in the account. When
     * `false`, the composition hook will never be triggered..
     *
     * @param enabled Whether the composition hook is active
     * @return this
     */
    public CompositionHookCreator setEnabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * An object that describes the video layout of the composition hook in terms of
     * regions. See <a
     * href="https://www.twilio.com/docs/video/api/compositions-resource#specifying-video-layouts">Specifying
     * Video Layouts</a> for more info..
     *
     * @param videoLayout An object that describes the video layout of the
     *                    composition hook
     * @return this
     */
    public CompositionHookCreator setVideoLayout(final Map<String, Object> videoLayout) {
        this.videoLayout = videoLayout;
        return this;
    }

    /**
     * An array of track names from the same group room to merge into the
     * compositions created by the composition hook. Can include zero or more track
     * names. A composition triggered by the composition hook includes all audio
     * sources specified in `audio_sources` except those specified in
     * `audio_sources_excluded`. The track names in this parameter can include an
     * asterisk as a wild card character, which matches zero or more characters in a
     * track name. For example, `student*` includes tracks named `student` as well
     * as `studentTeam`..
     *
     * @param audioSources An array of track names from the same group room to merge
     * @return this
     */
    public CompositionHookCreator setAudioSources(final List<String> audioSources) {
        this.audioSources = audioSources;
        return this;
    }

    /**
     * An array of track names from the same group room to merge into the
     * compositions created by the composition hook. Can include zero or more track
     * names. A composition triggered by the composition hook includes all audio
     * sources specified in `audio_sources` except those specified in
     * `audio_sources_excluded`. The track names in this parameter can include an
     * asterisk as a wild card character, which matches zero or more characters in a
     * track name. For example, `student*` includes tracks named `student` as well
     * as `studentTeam`..
     *
     * @param audioSources An array of track names from the same group room to merge
     * @return this
     */
    public CompositionHookCreator setAudioSources(final String audioSources) {
        return setAudioSources(Promoter.listOfOne(audioSources));
    }

    /**
     * An array of track names to exclude. A composition triggered by the
     * composition hook includes all audio sources specified in `audio_sources`
     * except for those specified in `audio_sources_excluded`. The track names in
     * this parameter can include an asterisk as a wild card character, which
     * matches zero or more characters in a track name. For example, `student*`
     * excludes `student` as well as `studentTeam`. This parameter can also be
     * empty..
     *
     * @param audioSourcesExcluded An array of track names to exclude
     * @return this
     */
    public CompositionHookCreator setAudioSourcesExcluded(final List<String> audioSourcesExcluded) {
        this.audioSourcesExcluded = audioSourcesExcluded;
        return this;
    }

    /**
     * An array of track names to exclude. A composition triggered by the
     * composition hook includes all audio sources specified in `audio_sources`
     * except for those specified in `audio_sources_excluded`. The track names in
     * this parameter can include an asterisk as a wild card character, which
     * matches zero or more characters in a track name. For example, `student*`
     * excludes `student` as well as `studentTeam`. This parameter can also be
     * empty..
     *
     * @param audioSourcesExcluded An array of track names to exclude
     * @return this
     */
    public CompositionHookCreator setAudioSourcesExcluded(final String audioSourcesExcluded) {
        return setAudioSourcesExcluded(Promoter.listOfOne(audioSourcesExcluded));
    }

    /**
     * A string that describes the columns (width) and rows (height) of the
     * generated composed video in pixels. Defaults to `640x480`.
     * The string's format is `{width}x{height}` where:
     *
     * * 16 &lt;= `{width}` &lt;= 1280
     * * 16 &lt;= `{height}` &lt;= 1280
     * * `{width}` * `{height}` &lt;= 921,600
     *
     * Typical values are:
     *
     * * HD = `1280x720`
     * * PAL = `1024x576`
     * * VGA = `640x480`
     * * CIF = `320x240`
     *
     * Note that the `resolution` imposes an aspect ratio to the resulting
     * composition. When the original video tracks are constrained by the aspect
     * ratio, they are scaled to fit. See <a
     * href="https://www.twilio.com/docs/video/api/compositions-resource#specifying-video-layouts">Specifying
     * Video Layouts</a> for more info..
     *
     * @param resolution A string that describes the rows (width) and columns
     *                   (height) of the generated composed video in pixels
     * @return this
     */
    public CompositionHookCreator setResolution(final String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * The container format of the media files used by the compositions created by
     * the composition hook. Can be: `mp4` or `webm` and the default is `webm`. If
     * `mp4` or `webm`, `audio_sources` must have one or more tracks and/or a
     * `video_layout` element must contain a valid `video_sources` list, otherwise
     * an error occurs..
     *
     * @param format The container format of the media files used by the
     *               compositions created by the composition hook
     * @return this
     */
    public CompositionHookCreator setFormat(final CompositionHook.Format format) {
        this.format = format;
        return this;
    }

    /**
     * The URL we should call using the `status_callback_method` to send status
     * information to your application on every composition event. If not provided,
     * status callback events will not be dispatched..
     *
     * @param statusCallback The URL we should call to send status information to
     *                       your application
     * @return this
     */
    public CompositionHookCreator setStatusCallback(final URI statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }

    /**
     * The URL we should call using the `status_callback_method` to send status
     * information to your application on every composition event. If not provided,
     * status callback events will not be dispatched..
     *
     * @param statusCallback The URL we should call to send status information to
     *                       your application
     * @return this
     */
    public CompositionHookCreator setStatusCallback(final String statusCallback) {
        return setStatusCallback(Promoter.uriFromString(statusCallback));
    }

    /**
     * The HTTP method we should use to call `status_callback`. Can be: `POST` or
     * `GET` and the default is `POST`..
     *
     * @param statusCallbackMethod The HTTP method we should use to call
     *                             status_callback
     * @return this
     */
    public CompositionHookCreator setStatusCallbackMethod(final HttpMethod statusCallbackMethod) {
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }

    /**
     * Whether to clip the intervals where there is no active media in the
     * Compositions triggered by the composition hook. The default is `true`.
     * Compositions with `trim` enabled are shorter when the Room is created and no
     * Participant joins for a while as well as if all the Participants leave the
     * room and join later, because those gaps will be removed. See <a
     * href="https://www.twilio.com/docs/video/api/compositions-resource#specifying-video-layouts">Specifying
     * Video Layouts</a> for more info..
     *
     * @param trim Whether to clip the intervals where there is no active media in
     *             the Compositions triggered by the composition hook
     * @return this
     */
    public CompositionHookCreator setTrim(final Boolean trim) {
        this.trim = trim;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created CompositionHook
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public CompositionHook create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.VIDEO.toString(),
            "/v1/CompositionHooks"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("CompositionHook creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return CompositionHook.fromJson(response.getStream(), client.getObjectMapper());
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

        if (enabled != null) {
            request.addPostParam("Enabled", enabled.toString());
        }

        if (videoLayout != null) {
            request.addPostParam("VideoLayout", Converter.mapToJson(videoLayout));
        }

        if (audioSources != null) {
            for (String prop : audioSources) {
                request.addPostParam("AudioSources", prop);
            }
        }

        if (audioSourcesExcluded != null) {
            for (String prop : audioSourcesExcluded) {
                request.addPostParam("AudioSourcesExcluded", prop);
            }
        }

        if (resolution != null) {
            request.addPostParam("Resolution", resolution);
        }

        if (format != null) {
            request.addPostParam("Format", format.toString());
        }

        if (statusCallback != null) {
            request.addPostParam("StatusCallback", statusCallback.toString());
        }

        if (statusCallbackMethod != null) {
            request.addPostParam("StatusCallbackMethod", statusCallbackMethod.toString());
        }

        if (trim != null) {
            request.addPostParam("Trim", trim.toString());
        }
    }
}