package com.ailiens.optimusprime.autobots.rest.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class RefundCountsResponseDTO {

    private String transactionCreatedDateStart;
    private String transactionCreatedDateEnd;
    private String refundType;
    private String refundStatus;
    private int count;
    private String identifier;

    public RefundCountsResponseDTO(String transactionCreatedDateStart, String transactionCreatedDateEnd, String refundType, String refundStatus) {
        this.transactionCreatedDateStart = transactionCreatedDateStart;
        this.transactionCreatedDateEnd = transactionCreatedDateEnd;
        this.refundType = refundType;
        this.refundStatus = refundStatus;
    }

    /**
     *
     * @return
     * The transactionCreatedDateStart
     */
    public String getTransactionCreatedDateStart() {
        return transactionCreatedDateStart;
    }

    /**
     *
     * @param transactionCreatedDateStart
     * The transactionCreatedDateStart
     */
    public void setTransactionCreatedDateStart(String transactionCreatedDateStart) {
        this.transactionCreatedDateStart = transactionCreatedDateStart;
    }

    /**
     *
     * @return
     * The transactionCreatedDateEnd
     */
    public String getTransactionCreatedDateEnd() {
        return transactionCreatedDateEnd;
    }

    /**
     *
     * @param transactionCreatedDateEnd
     * The transactionCreatedDateEnd
     */
    public void setTransactionCreatedDateEnd(String transactionCreatedDateEnd) {
        this.transactionCreatedDateEnd = transactionCreatedDateEnd;
    }

    /**
     *
     * @return
     * The refundType
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     *
     * @param refundType
     * The refundType
     */
    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    /**
     *
     * @return
     * The refundStatus
     */
    public String getRefundStatus() {
        return refundStatus;
    }

    /**
     *
     * @param refundStatus
     * The refundStatus
     */
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
