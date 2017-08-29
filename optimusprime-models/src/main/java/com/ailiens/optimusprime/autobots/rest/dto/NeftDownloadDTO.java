package com.ailiens.optimusprime.autobots.rest.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class NeftDownloadDTO implements Serializable{

    private String returnId;

    private ZonedDateTime returnInitiatedDate;

    private BigDecimal returnAmount;

    private String accountType;

    private String emailID;

    private String phoneNumber;

    private String refundStatus;

    private String paymentTransactionId;

    private String neftTransactionId;

    private String orderId;

    private String userID;

    private NeftDetailsDTO neftDetailsDTO;

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public ZonedDateTime getReturnInitiatedDate() {
        return returnInitiatedDate;
    }

    public void setReturnInitiatedDate(ZonedDateTime returnInitiatedDate) {
        this.returnInitiatedDate = returnInitiatedDate;
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(String paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    public String getNeftTransactionId() {
        return neftTransactionId;
    }

    public void setNeftTransactionId(String neftTransactionId) {
        this.neftTransactionId = neftTransactionId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public NeftDetailsDTO getNeftDetailsDTO() {
        return neftDetailsDTO;
    }

    public void setNeftDetailsDTO(NeftDetailsDTO neftDetailsDTO) {
        this.neftDetailsDTO = neftDetailsDTO;
    }

    @Override
    public String toString() {
        return "NeftDownloadDTO{" +
            "returnId='" + returnId + '\'' +
            ", returnAmount=" + returnAmount.toString() +
            ", accountType='" + accountType + '\'' +
            ", emailID='" + emailID + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", refundStatus='" + refundStatus + '\'' +
            ", paymentTransactionId='" + paymentTransactionId + '\'' +
            ", neftTransactionId='" + neftTransactionId + '\'' +
            ", orderId='" + orderId + '\'' +
            ", userID='" + userID + '\'' +
            ", neftDetailsDTO=" + neftDetailsDTO +
            '}';
    }
}
