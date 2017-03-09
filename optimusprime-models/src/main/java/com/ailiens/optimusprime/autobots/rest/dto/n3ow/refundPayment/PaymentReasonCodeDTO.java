package com.ailiens.optimusprime.autobots.rest.dto.n3ow.refundPayment;

import org.apache.commons.lang.builder.ToStringBuilder;

public class PaymentReasonCodeDTO {

	private String reasonName;
	private String reasonCode;

	/**
	 *
	 * @return
	 * The reasonName
	 */
	public String getReasonName() {
		return reasonName;
	}
	public PaymentReasonCodeDTO(){

	}

	/**
	 *
	 * @param reasonName
	 * The reasonName
	 */
	public void setReasonName(String reasonName) {
		this.reasonName = reasonName;
	}

	/**
	 *
	 * @return
	 * The reasonCode
	 */
	public String getReasonCode() {
		return reasonCode;
	}

	/**
	 *
	 * @param reasonCode
	 * The reasonCode
	 */
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
