package com.ailiens.optimusprime.autobots.rest.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class RefundCountsRequestDTO {

	private String transactionCreatedDateStart;
	private String transactionCreatedDateEnd;
	private String refundType;
	private String refundStatus;
	private String identifier;

	/**
	 *
	 * @return
	 * The transactionCreatedDateStart
	 */
	public String getTransactionCreatedDateStart() {
		return transactionCreatedDateStart;
	}
	public RefundCountsRequestDTO(){

	}

	/**
	 *
	 * @param transactionCreatedDateStart
	 * The transactionCreatedDateStart
	 */
	public void setTransactionCreatedDateStart(String transactionCreatedDateStart) {
		this.transactionCreatedDateStart = transactionCreatedDateStart;
	}

	/**
	 *
	 * @return
	 * The transactionCreatedDateEnd
	 */
	public String getTransactionCreatedDateEnd() {
		return transactionCreatedDateEnd;
	}

	/**
	 *
	 * @param transactionCreatedDateEnd
	 * The transactionCreatedDateEnd
	 */
	public void setTransactionCreatedDateEnd(String transactionCreatedDateEnd) {
		this.transactionCreatedDateEnd = transactionCreatedDateEnd;
	}

	/**
	 *
	 * @return
	 * The refundType
	 */
	public String getRefundType() {
		return refundType;
	}

	/**
	 *
	 * @param refundType
	 * The refundType
	 */
	public void setRefundType(String refundType) {
		this.refundType = refundType;
	}

	/**
	 *
	 * @return
	 * The refundStatus
	 */
	public String getRefundStatus() {
		return refundStatus;
	}

	/**
	 *
	 * @param refundStatus
	 * The refundStatus
	 */
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
