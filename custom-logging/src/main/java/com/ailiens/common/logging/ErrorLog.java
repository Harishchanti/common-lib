package com.ailiens.common.logging;

public class ErrorLog extends BaseLogger {


    Exception exception;

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}
