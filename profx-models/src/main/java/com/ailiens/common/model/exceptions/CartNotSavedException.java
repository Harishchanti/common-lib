package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 21/10/15.
 */
public class CartNotSavedException extends RuntimeException{
    public CartNotSavedException(String message, Throwable cause) {
        super(message, cause);
    }

}
