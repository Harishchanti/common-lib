package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 21/10/15.
 */
public class CartNotRemovedException extends RuntimeException {

    public CartNotRemovedException(String message, Throwable cause) {
        super(message, cause);
    }
}
