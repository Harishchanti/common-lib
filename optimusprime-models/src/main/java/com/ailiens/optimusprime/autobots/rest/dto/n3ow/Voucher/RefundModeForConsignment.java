package com.ailiens.optimusprime.autobots.rest.dto.n3ow.Voucher;

import java.math.BigDecimal;

public class RefundModeForConsignment {

	private String refundMode;
	private String neftId;
	private BigDecimal refundAmount;

	public RefundModeForConsignment(){

	}
	public String getRefundMode() {
		return refundMode;
	}

	public void setRefundMode(String refundMode) {
		this.refundMode = refundMode;
	}

	public String getNeftId() {
		return neftId;
	}

	public void setNeftId(String neftId) {
		this.neftId = neftId;
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	@Override
	public String toString() {
		return "RefundModeForConsignment{" +
				"refundMode='" + refundMode + '\'' +
				", id='" + neftId + '\'' +
				", refundAmount=" + refundAmount +
				'}';
	}
}
