package com.ailiens.optimusprime.autobots.rest.dto;

import java.math.BigDecimal;

/**
 * A DTO representing a Payment.
 */
public class PaymentDTO {

	private String paymentMode;

	private String paymentStatus;

	private BigDecimal paymentAmount;

	public PaymentDTO(Payment payment) {
		if(payment != null) {
			this.paymentMode = payment.getPaymentMode();
			this.paymentStatus = payment.getPaymentStatus();
			this.paymentAmount = payment.getPaymentAmount();
		}
	}
	public PaymentDTO()
	{

	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	@Override
	public String toString() {
		return "PaymentDTO [paymentMode=" + paymentMode + ", paymentStatus=" + paymentStatus + "]";
	}

}
