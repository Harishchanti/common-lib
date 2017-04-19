package com.ailiens.common;

/**
 * Created by rajesh on 8/30/16.
 */
public class ReturnCancelResponse {
    private String returnId;
    private String message;
    private Boolean success;


    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }


}
