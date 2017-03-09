package com.ailiens.optimusprime.autobots.rest.dto.n3ow.stateChangeDTO;

import com.ailiens.optimusprime.autobots.rest.dto.RefundModesDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

@Generated("org.jsonschema2pojo")
public class ConsignmentStateChangeDTO {

	private String comment;
	private Long reasonId;
	private String neftId;

	@NotNull
	private String status;

	private String voucherId;

	private RefundModesDTO refundModes;

	public ConsignmentStateChangeDTO(){

	}
	/**
	 *
	 * @return
	 * The comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 *
	 * @param comment
	 * The comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 *
	 * @return
	 * The reasonId
	 */
	public Long getReasonId() {
		return reasonId;
	}

	/**
	 *
	 * @param reasonId
	 * The reasonId
	 */
	public void setReasonId(Long reasonId) {
		this.reasonId = reasonId;
	}

	/**
	 *
	 * @return
	 * The status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 *
	 * @param status
	 * The status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public String getNeftId() {
		return neftId;
	}

	public void setNeftId(String neftId) {
		this.neftId = neftId;
	}

	public String getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public RefundModesDTO getRefundModes() {
		return refundModes;
	}

	public void setRefundModes(RefundModesDTO refundModes) {
		this.refundModes = refundModes;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
