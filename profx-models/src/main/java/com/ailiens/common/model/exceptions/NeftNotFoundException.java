package com.ailiens.common.model.exceptions;

/**
 * Created by akki on 4/12/15.
 */
public class NeftNotFoundException extends RuntimeException {
    public NeftNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
