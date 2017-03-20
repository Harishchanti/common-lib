package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 27/10/15.
 */
public class MobileNumberVerifiedDoesNotExists extends RuntimeException {

    public MobileNumberVerifiedDoesNotExists(String message, Throwable cause) {
        super(message, cause);
    }
}
