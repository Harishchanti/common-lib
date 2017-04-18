package com.ail.mbo.bumblebee.mbo.beans;

public class OptimusprimeReverseConsignmentStatusUpdateRequestObject {
	private String comment;
	private OptimusprimeReverseConsignmentObject logisticDetails;
	private String status;
	private String consignmentId;
	
	
	
	public String getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public OptimusprimeReverseConsignmentObject getLogisticDetails() {
		return logisticDetails;
	}
	public void setLogisticDetails(
			OptimusprimeReverseConsignmentObject logisticDetails) {
		this.logisticDetails = logisticDetails;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
