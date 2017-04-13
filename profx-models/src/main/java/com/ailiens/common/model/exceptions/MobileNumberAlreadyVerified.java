package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 27/10/15.
 */
public class MobileNumberAlreadyVerified extends RuntimeException {

    public MobileNumberAlreadyVerified(String message, Throwable cause) {
        super(message, cause);
    }
}
