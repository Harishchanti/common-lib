
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class RefundPaymentDetail {

    private String direction;
    private PaymentType paymentType;
    private String amount;
    private String transactionId;
    private String status;
    private String paymentMode;
    private String transactionCreatedDate;

    /**
     *
     * @return
     *     The direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     *
     * @param direction
     *     The direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     *
     * @return
     *     The paymentType
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     *
     * @param paymentType
     *     The paymentType
     */
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     *
     * @return
     *     The amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     *
     * @param amount
     *     The amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     *
     * @return
     *     The transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     *
     * @param transactionId
     *     The transactionId
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     *
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getTransactionCreatedDate() {
        return transactionCreatedDate;
    }

    public void setTransactionCreatedDate(String transactionCreatedDate) {
        this.transactionCreatedDate = transactionCreatedDate;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
