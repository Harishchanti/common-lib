package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import com.ailiens.optimusprime.domain.OrderLine;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

/**
 * Created by yashika on 7/12/16.
 */

@Generated("org.jsonschema2pojo")
public class InitialFfTypeDTO {

    public String ffType;
    public String type;

    public InitialFfTypeDTO(OrderLine orderLine) {
        this.setFfType(orderLine.getInitialFullfilmentType().getName());
        this.setType(orderLine.getInitialFullfilmentType().getType());
    }



    public String getFfType() {
        return ffType;
    }



    public void setFfType(String ffType) {
        this.ffType = ffType;
    }



    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }



    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
