package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import java.math.BigDecimal;
import com.ailiens.optimusprime.domain.Payment;

/**
 * Created by adi on 14/9/17.
 */


public class PaymentTransactionalDetails {

    private String paymentId = "";

    private String paymentStatus = "";

    private BigDecimal paymentAmount = new BigDecimal(0.0);

    private String direction = "";


    public PaymentTransactionalDetails(Payment payment) {

        if(payment != null) {
            this.paymentId = payment.getPaymentId();
            this.paymentStatus = payment.getPaymentStatus();
            this.paymentAmount = payment.getPaymentAmount();
            this.direction = payment.getDirection();
        }

    }

    public PaymentTransactionalDetails(){}

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }



}
