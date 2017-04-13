package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 28/10/15.
 */
public class UserInformationNotRemoved extends RuntimeException {
    public UserInformationNotRemoved(String message, Throwable cause) {
        super(message, cause);
    }
}
