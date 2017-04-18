package com.ail.mbo.bumblebee.mbo.beans;

import java.math.BigDecimal;

public class ReturnsOmsQcInfo {
	private String returnId;
	private String qcStatus;
	private BigDecimal amount;
	private String comment;
	public String getReturnId() {
		return returnId;
	}
	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}
	public String getQcStatus() {
		return qcStatus;
	}
	public void setQcStatus(String qcStatus) {
		this.qcStatus = qcStatus;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "OmsQcReturnsInfo [returnId=" + returnId + ", qcStatus="
				+ qcStatus + ", amount=" + amount + ", comment=" + comment
				+ "]";
	}

}
