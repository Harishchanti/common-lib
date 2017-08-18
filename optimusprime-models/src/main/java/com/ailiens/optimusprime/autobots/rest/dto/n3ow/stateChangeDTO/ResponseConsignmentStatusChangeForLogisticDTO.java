package com.ailiens.optimusprime.autobots.rest.dto.n3ow.stateChangeDTO;

import org.apache.commons.lang.builder.ToStringBuilder;

public class ResponseConsignmentStatusChangeForLogisticDTO {
	private String consignmentId;
	
	private String message;
	
	public String getConsignmentId() {
		return consignmentId;
	}

	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
