package com.ailiens.common.model.exceptions;

/**
 * Created by vaibhav on 21/10/15.
 */
public class CartNotUpdatedException extends RuntimeException  {
    public CartNotUpdatedException(String message, Throwable cause) {
        super(message, cause);
    }

}
