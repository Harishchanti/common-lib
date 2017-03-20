package com.ailiens.common.model.exceptions;

/**
 * Created by akki on 4/12/15.
 */
public class SavedCardNotSavedException extends RuntimeException {
    public SavedCardNotSavedException(String message, Throwable cause) {
        super(message, cause);
    }
}
