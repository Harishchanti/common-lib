package com.ail.mbo.bumblebee.mbo.beans;

/**
 * Created by rajesh on 8/29/16.
 */
public class DeliveryOption {

    private long courierId;
    private int priority;
    private String courierName;
    private long paymentServiceMapperId;
    private long paymentTypeId;
    private String paymentTypeName;
    private long serviceTypeId;
    private String serviceTypeName;

    public DeliveryOption(long courierId,
                          int priority,
                          String courierName,
                          long paymentServiceMapperId,
                          long paymentTypeId,
                          String paymentTypeName,
                          long serviceTypeId,
                          String serviceTypeName) {
        this.courierId = courierId;
        this.priority = priority;
        this.courierName = courierName;
        this.paymentServiceMapperId = paymentServiceMapperId;
        this.paymentTypeId = paymentTypeId;
        this.paymentTypeName = paymentTypeName;
        this.serviceTypeId = serviceTypeId;
        this.serviceTypeName = serviceTypeName;
    }

    public long getCourierId() {
        return courierId;
    }

    public void setCourierId(long courierId) {
        this.courierId = courierId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public long getPaymentServiceMapperId() {
        return paymentServiceMapperId;
    }

    public void setPaymentServiceMapperId(long paymentServiceMapperId) {
        this.paymentServiceMapperId = paymentServiceMapperId;
    }

    public long getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(long paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }

    public long getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    @Override
    public String toString() {
        return "DeliveryOption{" +
            "courierId=" + courierId +
            ", priority=" + priority +
            ", courierName='" + courierName + '\'' +
            ", paymentServiceMapperId=" + paymentServiceMapperId +
            ", paymentTypeId=" + paymentTypeId +
            ", paymentTypeName='" + paymentTypeName + '\'' +
            ", serviceTypeId=" + serviceTypeId +
            ", serviceTypeName='" + serviceTypeName + '\'' +
            '}';
    }
}
