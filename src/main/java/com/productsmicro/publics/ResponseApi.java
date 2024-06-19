package com.productsmicro.publics;

/**
 * The type Response api.
 *
 * @param <T> the type parameter
 */
public class ResponseApi<T> {

    /**
     * code response
     */
    public String code;

    /**
     * body response
     */
    public T body;

    /**
     * message response
     */
    public String message;

    /**
     * Instantiates a new Response api.
     */
    public ResponseApi() {
    }

    /**
     * Instantiates a new Response api.
     *
     * @param code    the code
     * @param message the message
     * @param body    the body
     */
    public ResponseApi(String code, T body, String message) {
        this.code = code;
        this.body = body;
        this.message = message;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets body.
     *
     * @return the body
     */
    public T getBody() {
        return body;
    }

    /**
     * Sets body.
     *
     * @param body the body
     */
    public void setBody(T body) {
        this.body = body;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
