package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 27/10/15.
 */
public class MobileNumberDoesNotExists extends RuntimeException {

    public MobileNumberDoesNotExists(String message, Throwable cause) {
        super(message, cause);
    }
}
