package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 28/10/15.
 */
public class InvalidData extends RuntimeException {
    public InvalidData(String message, Throwable cause) {
        super(message, cause);
    }
}
