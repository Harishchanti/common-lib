package com.ailiens.optimusprime.autobots.rest.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * Created by yashika on 7/7/17.
 */
public class MissedItemsDTO {

    private final Logger log = LoggerFactory.getLogger(MissedItemsDTO.class);

    private String itemId;
    private String consignmentId;
    private String orderId;
    private ZonedDateTime orderDate;
    private String paymentType;
    private BigDecimal consignmentValue;
    private String customerName;
    private String orderingStore;
    private String fulfillmentCenter;
    private String reason;
    private String orderStatus;
    private String currentStatus;
    private ZonedDateTime consignmentStamp;


    public MissedItemsDTO(String itemId, String consignmentId, String orderId, ZonedDateTime orderDate) {
        this.itemId = itemId;
        this.consignmentId = consignmentId;
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public MissedItemsDTO(String itemId, String consignmentId, String orderId, ZonedDateTime orderDate, String paymentType, BigDecimal consignmentValue, String customerName, String orderingStore, String fulfillmentCenter) {
        this.itemId = itemId;
        this.consignmentId = consignmentId;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.paymentType = paymentType;
        this.consignmentValue = consignmentValue;
        this.customerName = customerName;
        this.orderingStore = orderingStore;
        this.fulfillmentCenter = fulfillmentCenter;
    }

    public MissedItemsDTO(String itemId, String consignmentId, String orderId, ZonedDateTime orderDate, String paymentType, BigDecimal consignmentValue, String customerName, String orderingStore, String fulfillmentCenter, String reason, String orderStatus, String currentStatus, ZonedDateTime consignmentStamp) {
        this.itemId = itemId;
        this.consignmentId = consignmentId;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.paymentType = paymentType;
        this.consignmentValue = consignmentValue;
        this.customerName = customerName;
        this.orderingStore = orderingStore;
        this.fulfillmentCenter = fulfillmentCenter;
        this.reason = reason;
        this.orderStatus = orderStatus;
        this.currentStatus = currentStatus;
        this.consignmentStamp = consignmentStamp;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(String consignmentId) {
        this.consignmentId = consignmentId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ZonedDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(ZonedDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getConsignmentValue() {
        return consignmentValue;
    }

    public void setConsignmentValue(BigDecimal consignmentValue) {
        this.consignmentValue = consignmentValue;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderingStore() {
        return orderingStore;
    }

    public void setOrderingStore(String orderingStore) {
        this.orderingStore = orderingStore;
    }

    public String getFulfillmentCenter() {
        return fulfillmentCenter;
    }

    public void setFulfillmentCenter(String fulfillmentCenter) {
        this.fulfillmentCenter = fulfillmentCenter;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public ZonedDateTime getConsignmentStamp() {
        return consignmentStamp;
    }

    public void setConsignmentStamp(ZonedDateTime consignmentStamp) {
        this.consignmentStamp = consignmentStamp;
    }
}
