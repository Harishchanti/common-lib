package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 27/10/15.
 */
public class MobileNumberPrimaryDoesNotExists extends RuntimeException {

    public MobileNumberPrimaryDoesNotExists(String message, Throwable cause) {
        super(message, cause);
    }
}
