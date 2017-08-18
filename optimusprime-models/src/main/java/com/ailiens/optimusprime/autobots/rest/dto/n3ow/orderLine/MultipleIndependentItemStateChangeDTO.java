package com.ailiens.optimusprime.autobots.rest.dto.n3ow.orderLine;

import com.ailiens.optimusprime.autobots.rest.dto.n3ow.stateChangeDTO.OrderLineStateChangeDTO;

/**
 * Created by ananth on 6/2/16.
 */
public class MultipleIndependentItemStateChangeDTO {
    private String orderLineId;

    private OrderLineStateChangeDTO orderLineStateChangeDTO;

    public String getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    public OrderLineStateChangeDTO getOrderLineStateChangeDTO() {
        return orderLineStateChangeDTO;
    }

    public void setOrderLineStateChangeDTO(OrderLineStateChangeDTO orderLineStateChangeDTO) {
        this.orderLineStateChangeDTO = orderLineStateChangeDTO;
    }

    @Override
    public String toString() {
        return "MultipleIndependentItemStateChangeDTO{" +
            "orderLineId='" + orderLineId + '\'' +
            ", orderLineStateChangeDTO=" + orderLineStateChangeDTO +
            '}';
    }
}
