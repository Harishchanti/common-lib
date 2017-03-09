package com.ailiens.optimusprime.autobots.rest.dto;

import javax.validation.constraints.NotNull;
import java.util.List;

public class StatusChangeDTO {

    public StatusChangeDTO() {}
    @NotNull
    private List<StatusChangeOrderLineDTO> orderLines;

    public List<StatusChangeOrderLineDTO> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<StatusChangeOrderLineDTO> orderLines) {
        this.orderLines = orderLines;
    }
}
