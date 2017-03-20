package com.ailiens.common.model.exceptions;

/**
 * Created by akki on 4/12/15.
 */
public class SavedCardNotFoundException extends RuntimeException {
    public SavedCardNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
