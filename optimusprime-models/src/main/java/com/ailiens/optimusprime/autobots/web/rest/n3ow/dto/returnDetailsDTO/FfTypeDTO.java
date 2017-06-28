
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

import com.ailiens.optimusprime.domain.OrderLine;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class FfTypeDTO {

    public String ffType;
    public String type;

    public FfTypeDTO(OrderLine orderLine) {
		this.setFfType(orderLine.getFullfilmentType().getName());
		this.setType(orderLine.getFullfilmentType().getType());
	}

	public FfTypeDTO() {
        super();
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
