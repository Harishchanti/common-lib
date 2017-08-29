package com.ailiens.optimusprime.autobots.rest.dto;

import java.util.List;

public class ReturnConsignmentDetailsDTO {

    private List<String> returnIds;

    private String status;

    public List<String> getReturnIds() {
        return returnIds;
    }

    public void setReturnIds(List<String> returnIds) {
        this.returnIds = returnIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReturnConsignmentDetailsDTO{" +
            "returnIds=" + returnIds +
            ", status='" + status + '\'' +
            '}';
    }
}
