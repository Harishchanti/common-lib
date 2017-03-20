package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 30/10/15.
 */
public class ListNotFound extends RuntimeException {

    public ListNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
