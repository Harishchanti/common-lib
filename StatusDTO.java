package com.ailiens.optimusprime.autobots.rest.dto.n3ow.orderLine;

import org.apache.commons.lang.builder.ToStringBuilder;

public class StatusDTO {

    private String comment;
    private Long reasonId;

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
