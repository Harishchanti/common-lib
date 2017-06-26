
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.Payment;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class PaymentUpdate {

    private String paymentId;
    private String paymentMode;
    private String paymentAmount;
    private String direction;
    private String paymentStatus;
    private String transactionCreatedDate;
    private List<VoucherDTO> vouchers = new ArrayList<VoucherDTO>();

    /**
     *
     * @return
     *     The paymentId
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     *
     * @param paymentId
     *     The paymentId
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    /**
     *
     * @return
     *     The paymentMode
     */
    public String getPaymentMode() {
        return paymentMode;
    }

    /**
     *
     * @param paymentMode
     *     The paymentMode
     */
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    /**
     *
     * @return
     *     The paymentAmount
     */
    public String getPaymentAmount() {
        return paymentAmount;
    }

    /**
     *
     * @param paymentAmount
     *     The paymentAmount
     */
    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

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
     *     The paymentStatus
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     *
     * @param paymentStatus
     *     The paymentStatus
     */
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    /**
     *
     * @return
     *     The vouchers
     */
    public List<VoucherDTO> getVouchers() {
        return vouchers;
    }

    /**
     *
     * @param vouchers
     *     The vouchers
     */
    public void setVouchers(List<VoucherDTO> vouchers) {
        this.vouchers = vouchers;
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
