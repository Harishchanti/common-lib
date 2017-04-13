package com.ailiens.optimusprime.autobots.rest.dto.n3ow.manualOverride;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.constraints.NotNull;

public class ManualOverrideRequestDTO {

	@NotNull
	private String orderLineId;

	@NotNull
	private String fcId;

	public String getOrderLineId() {
		return orderLineId;
	}

	public void setOrderLineId(String orderLineId) {
		this.orderLineId = orderLineId;
	}
	public ManualOverrideRequestDTO(){

	}

	public String getFcId() {
		return fcId;
	}

	public void setFcId(String fcId) {
		this.fcId = fcId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
