package com.ailiens.common.logging;

public class DefaultContext implements AILIContext {

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
