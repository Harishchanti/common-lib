package com.ailiens.optimusprime.autobots.rest.dto.n3ow.orderLine;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class OrderLinesListDTO {

    private List<OrderLineDTO> orderLines = new ArrayList<OrderLineDTO>();

    /**
     *
     * @return
     * The orderLines
     */
    public List<OrderLineDTO> getOrderLines() {
        return orderLines;
    }

    /**
     *
     * @param orderLines
     * The orderLines
     */
    public void setOrderLines(List<OrderLineDTO> orderLines) {
        this.orderLines = orderLines;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
