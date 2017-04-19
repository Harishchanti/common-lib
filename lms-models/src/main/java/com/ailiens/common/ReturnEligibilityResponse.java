package com.ailiens.common;

/**
 * Created by rajesh on 8/30/16.
 */
public class ReturnEligibilityResponse {
    private String returnId;
    private String message;
    private Boolean isEligible;


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

    public Boolean getEligible() {
        return isEligible;
    }

    public void setEligible(Boolean eligible) {
        isEligible = eligible;
    }

    @Override
    public String toString() {
        return "ReturnEligibilityResponse{" +
            "returnId='" + returnId + '\'' +
            ", message='" + message + '\'' +
            ", isEligible=" + isEligible +
            '}';
    }
}
