package com.ailiens.common.model.exceptions;

/**
 * Created by akki on 4/12/15.
 */
public class NeftNotSavedException extends RuntimeException {
    public NeftNotSavedException(String message, Throwable cause) {
        super(message, cause);
    }
}
