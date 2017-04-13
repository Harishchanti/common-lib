package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 28/10/15.
 */
public class RequestedDataNotFound extends RuntimeException{
    public RequestedDataNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
