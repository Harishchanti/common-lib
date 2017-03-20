package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 27/10/15.
 */
public class CartDoesNotExistsException extends RuntimeException {

    public CartDoesNotExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
