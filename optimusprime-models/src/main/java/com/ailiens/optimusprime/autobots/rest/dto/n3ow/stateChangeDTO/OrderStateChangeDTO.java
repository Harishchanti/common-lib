package com.ailiens.optimusprime.autobots.rest.dto.n3ow.stateChangeDTO;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class OrderStateChangeDTO {
    private String comment;
    private Long reasonId;
    private String status;

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

}
