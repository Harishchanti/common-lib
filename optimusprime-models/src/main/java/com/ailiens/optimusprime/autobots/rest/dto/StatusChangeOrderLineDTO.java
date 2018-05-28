package com.ailiens.optimusprime.autobots.rest.dto;

import javax.validation.constraints.NotNull;

public class StatusChangeOrderLineDTO {

    public StatusChangeOrderLineDTO()
    {

    }

    private String orderLineId;

    @NotNull
    private String status;

    private Long reasonId;

    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getReasonId() {
        return reasonId;
    }

    public void setReasonId(Long reasonId) {
        this.reasonId = reasonId;
    }


    @Override
    public String toString() {
        return "StatusChangeOrderLineDTO{" +
            "orderLineId='" + orderLineId + '\'' +
            ", status='" + status + '\'' +
            ", reasonId=" + reasonId +
            ", comment='" + comment + '\'' +
            '}';
    }
}
