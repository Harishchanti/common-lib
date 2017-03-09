
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.reversePickup.requestDTO;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class LMSReturnQCStatusProductDetailDTO {

	private String returnId;
	private String qcStatus;
	private BigDecimal amount;
	private String comment;

	/**
	 *
	 * @return
	 *     The productCode
	 */
	public String getReturnId() {
		return returnId;
	}
	public LMSReturnQCStatusProductDetailDTO(){

	}

	/**
	 *
	 * @param returnId
	 *     The returnId
	 */
	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}
	/**
	 *
	 * @return
	 *     The productCode
	 */
	public String getQcStatus() {
		return qcStatus;
	}

	/**
	 *
	 * @param productCode
	 *     The productCode
	 */
	public void setQcStatus(String qcStatus) {
		this.qcStatus = qcStatus;
	}

	/**
	 *
	 * @return
	 *     The amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 *
	 * @param amount
	 *     The amount
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 *
	 * @return
	 *     The comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 *
	 * @param comment
	 *     The comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
