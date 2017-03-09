package com.ailiens.optimusprime.autobots.rest.dto.n3ow.manualOverride;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.validation.constraints.NotNull;

public class AssignFCRequestDTO {

	@NotNull
	private String consignmentId;

	@NotNull
	private String fcId;

	private String comment;

	private int reasonId;

	public String getConsignmentId() {
		return consignmentId;
	}

	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}
	public AssignFCRequestDTO(){

	}

	public String getFcId() {
		return fcId;
	}

	public void setFcId(String fcId) {
		this.fcId = fcId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getReasonId() {
		return reasonId;
	}

	public void setReasonId(int reasonId) {
		this.reasonId = reasonId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
