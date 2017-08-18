package com.ailiens.optimusprime.autobots.rest.dto.n3ow.stateChangeDTO;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsignmentStatusChangeForLogisticDTO {
	private List<String> consignmentList;
	
	@NotNull
	private String status;

	public List<String> getConsignmentList() {
		return consignmentList;
	}

	public void setConsignmentList(List<String> consignmentList) {
		this.consignmentList = consignmentList;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
