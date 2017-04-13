package com.ailiens.optimusprime.autobots.rest.dto;

import com.ailiens.optimusprime.domain.*;

public class ReturnsDTO {

    public ReturnsDTO()
    {

    }

    private String returnId;

    private String orderId;

    private long customerSLA;

    private Address address;

    private ReturnStates returnStates;

    private ReturnMode returnMode;

    private OrderLineDTO orderLineDTO;

    private ReturnStatesReasons returnStatesReasons;

    public void setOrderDetails(Orders orders)
    {
        this.orderId = orders.getOrderId();
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public long getCustomerSLA() {
        return customerSLA;
    }

    public void setCustomerSLA(long customerSLA) {
        this.customerSLA = customerSLA;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ReturnStates getReturnStates() {
        return returnStates;
    }

    public void setReturnStates(ReturnStates returnStates) {
        this.returnStates = returnStates;
    }

    public ReturnMode getReturnMode() {
        return returnMode;
    }

    public void setReturnMode(ReturnMode returnMode) {
        this.returnMode = returnMode;
    }

    public OrderLineDTO getOrderLineDTO() {
        return orderLineDTO;
    }

    public void setOrderLineDTO(OrderLineDTO orderLineDTO) {
        this.orderLineDTO = orderLineDTO;
    }

    public ReturnStatesReasons getReturnStatesReasons() {
        return returnStatesReasons;
    }

    public void setReturnStatesReasons(ReturnStatesReasons returnStatesReasons) {
        this.returnStatesReasons = returnStatesReasons;
    }
}
