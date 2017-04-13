package com.ailiens.optimusprime.autobots.rest.dto.EligibilityDTOs;

import com.ailiens.optimusprime.autobots.rest.dto.EligibilityDTOs.EligibilityDetailsDTO;

public class OrderLineEligibilityResponseDTO {

    public OrderLineEligibilityResponseDTO() {

        this.returns = new EligibilityDetailsDTO();
        this.cancel = new EligibilityDetailsDTO();
    }

    private String orderLineId;
    private String returnId;
    private EligibilityDetailsDTO returns;
    private EligibilityDetailsDTO cancel;

    public String getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    public EligibilityDetailsDTO getReturns() {
        return returns;
    }

    public void setReturns(EligibilityDetailsDTO returns) {
        this.returns = returns;
    }

    public EligibilityDetailsDTO getCancel() {
        return cancel;
    }

    public void setCancel(EligibilityDetailsDTO cancel) {
        this.cancel = cancel;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    @Override
    public String toString() {
        return "{" +
            "orderLineId='" + orderLineId + '\'' +
            ", returnId='" + returnId + '\'' +
            ", returns=" + returns +
            ", cancel=" + cancel +
            '}';
    }
}
