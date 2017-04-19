package com.ailiens.common;

public class StatusUpdateInfo {
	private String orderId;
	private String consignmentId;
	private String status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSpecial_instructions() {
		return special_instructions;
	}
	public void setSpecial_instructions(String special_instructions) {
		this.special_instructions = special_instructions;
	}
	private String special_instructions;

}
