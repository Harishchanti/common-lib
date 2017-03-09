package com.ailiens.optimusprime.autobots.rest.dto.EligibilityDTOs;


import java.time.ZonedDateTime;

public class EligibilityDetailsDTO {
    public EligibilityDetailsDTO() {}

    private String eligible;
    private String endTime;
    private String reason;

    public String getEligible() {
        return eligible;
    }

    public void setEligible(String eligible) {
        this.eligible = eligible;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "{" +
            "eligible='" + eligible + '\'' +
            ", endTime=" + endTime +
            ", reason='" + reason + '\'' +
            '}';
    }
}
