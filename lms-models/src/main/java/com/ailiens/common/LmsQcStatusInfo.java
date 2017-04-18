package com.ail.mbo.bumblebee.mbo.beans;

import javax.validation.constraints.NotNull;


public class LmsQcStatusInfo {
	@NotNull
	private String consignmentId;
	@NotNull
	private int declaredQuantity;
	@NotNull
	private int receivedQuantity;
	@NotNull
	private String qcStatus;
	@NotNull
	private String returnedPackageStatus;
	private String comment;
	public String getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}
	public int getDeclaredQuantity() {
		return declaredQuantity;
	}
	public void setDeclaredQuantity(int declaredQuantity) {
		this.declaredQuantity = declaredQuantity;
	}
	public int getReceivedQuantity() {
		return receivedQuantity;
	}
	public void setReceivedQuantity(int receivedQuantity) {
		this.receivedQuantity = receivedQuantity;
	}
	public String getQcStatus() {
		return qcStatus;
	}
	public void setQcStatus(String qcStatus) {
		this.qcStatus = qcStatus;
	}
	
	public String getReturnedPackageStatus() {
		return returnedPackageStatus;
	}
	public void setReturnedPackageStatus(String returnedPackageStatus) {
		this.returnedPackageStatus = returnedPackageStatus;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
