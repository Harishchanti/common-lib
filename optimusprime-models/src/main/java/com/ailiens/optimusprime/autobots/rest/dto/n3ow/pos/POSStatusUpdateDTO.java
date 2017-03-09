package com.ailiens.optimusprime.autobots.rest.dto.n3ow.pos;

import com.ailiens.optimusprime.domain.enumeration.POSStatus;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.constraints.NotNull;

public class POSStatusUpdateDTO {

	@NotNull
	private String orderId;

	@NotNull
	private String consignmentId;

	@NotNull
	private String fcId;

	@NotNull
	private POSStatus status;

	public POSStatusUpdateDTO(){

	}
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getConsignmentId() {
		return consignmentId;
	}

	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}

	public String getFcId() {
		return fcId;
	}

	public void setFcId(String fcId) {
		this.fcId = fcId;
	}

	public POSStatus getStatus() {
		return status;
	}

	public void setStatus(POSStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
