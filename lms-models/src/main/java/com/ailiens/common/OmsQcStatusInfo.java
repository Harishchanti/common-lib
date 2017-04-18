package com.ail.mbo.bumblebee.mbo.beans;

import java.util.List;

public class OmsQcStatusInfo {
	private String consignmentId;
	private List<ReturnsOmsQcInfo> returns;
	public String getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}
	public List<ReturnsOmsQcInfo> getReturns() {
		return returns;
	}
	public void setReturns(List<ReturnsOmsQcInfo> returns) {
		this.returns = returns;
	}
	@Override
	public String toString() {
		return "OmsQcStatusInfo [consignmentId=" + consignmentId + ", returns="
				+ returns + "]";
	}

}
