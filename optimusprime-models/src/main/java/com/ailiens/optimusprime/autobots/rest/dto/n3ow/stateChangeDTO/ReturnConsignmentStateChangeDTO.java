package com.ailiens.optimusprime.autobots.rest.dto.n3ow.stateChangeDTO;

import com.ailiens.optimusprime.domain.Logistics;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class ReturnConsignmentStateChangeDTO {

    private String comment;
    private Long reasonId;
    private String status;
    private String consignmentId;
    private Logistics logisticDetails;

    /**
     *
     * @return
     * The comment
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     * The comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     *
     * @return
     * The reasonId
     */
    public Long getReasonId() {
        return reasonId;
    }

    /**
     *
     * @param reasonId
     * The reasonId
     */
    public void setReasonId(Long reasonId) {
        this.reasonId = reasonId;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Logistics getLogisticDetails() {
        return logisticDetails;
    }

    public void setLogisticDetails(Logistics logisticDetails) {
        this.logisticDetails = logisticDetails;
    }

    public String getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(String consignmentId) {
        this.consignmentId = consignmentId;
    }

    @Override
    public String toString() {
        return "ReturnConsignmentStateChangeDTO{" +
            "comment='" + comment + '\'' +
            ", reasonId=" + reasonId +
            ", status='" + status + '\'' +
            ", consignmentId='" + consignmentId + '\'' +
            ", logisticDetails=" + logisticDetails +
            '}';
    }
}
