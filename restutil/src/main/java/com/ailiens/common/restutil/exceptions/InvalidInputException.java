package com.ailiens.common.restutil.exceptions;

/**
 * Created by jayant on 15/10/16.
 */
public class InvalidInputException extends GenericServiceException {

    public InvalidInputException()
    {
        super("InvalidInputException: Got 400 Response",400);
    }

    public InvalidInputException(String message)
    {
        super(message,400);
    }

    public InvalidInputException(int responseCode)
    {
        super("InvalidInput",responseCode);
    }
}
