package com.ailiens.common.model.exceptions;

/**
 * Created by akki on 4/12/15.
 */
public class SavedCardNotUpdatedException extends RuntimeException {
    public SavedCardNotUpdatedException(String message, Throwable cause) {
        super(message, cause);
    }
}
