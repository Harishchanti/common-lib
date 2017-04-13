package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 30/10/15.
 */
public class ListItemNotFound extends RuntimeException {

    public ListItemNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
