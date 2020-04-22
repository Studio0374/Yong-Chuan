package com.twilio.exception;

import java.util.Map;

public class ApiException extends TwilioException {

    private static final long serialVersionUID = -3228320166955630014L;

    private final Integer code;
    private final String moreInfo;
    private final Integer status;
    private final Map<String, Object> details;

    /**
     * Create a new API Exception.
     *
     * @param message exception message
     */
    public ApiException(final String message) {
        this(message, null, null, null, null, null);
    }

    /**
     * Create a new API Exception.
     *
     * @param message exception message
     * @param cause cause of the exception
     */
    public ApiException(final String message, final Throwable cause) {
        this(message, null, null, null, null, cause);
    }

    /**
     * Create a new API Exception.
     *
     * @param message exception message
     * @param code exception code
     * @param moreInfo more information if available
     * @param status status code
     * @param cause cause of the exception* @param cause
     */
    public ApiException(final String message, final Integer code, final String moreInfo, final Integer status,
                        final Throwable cause) {
        this(message, code, moreInfo, status, null, cause);
    }

    /**
     * Create a new API Exception.
     *
     * @param message exception message
     * @param code exception code
     * @param moreInfo more information if available
     * @param status status code
     * @param details additional details about the error
     * @param cause cause of the exception* @param cause
     */
    public ApiException(final String message, final Integer code, final String moreInfo, final Integer status,
                        final Map<String,Object> details, final Throwable cause) {
        super(message, cause);
        this.code = code;
        this.moreInfo = moreInfo;
        this.status = status;
        this.details = details;
    }

    public Integer getCode() {
        return code;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public Integer getStatusCode() {
        return status;
    }

    public Map<String, Object> getDetails() {
        return details;
    }
}
