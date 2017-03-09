
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.math.BigDecimal;

@Generated("org.jsonschema2pojo")
public class ReturnStatus {

	private String id;
	private String returnStatus;
	private String returnStatusType;
	private String returnStatusToCustomer;
	private String returnStateReason;
	private String returnStateComment;
	private String refundStatus;
	private Long returnStateReasonId;

	/**
	 *
	 * @return
	 *     The id
	 */
	public String getId() {
		return id;
	}
	public ReturnStatus(){

	}

	/**
	 *
	 * @param id
	 *     The id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 *
	 * @return
	 *     The returnStatus
	 */
	public String getReturnStatus() {
		return returnStatus;
	}

	/**
	 *
	 * @param returnStatus
	 *     The returnStatus
	 */
	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}

	/**
	 *
	 * @return
	 *     The returnStatusType
	 */
	public String getReturnStatusType() {
		return returnStatusType;
	}

	/**
	 *
	 * @param returnStatusType
	 *     The returnStatusType
	 */
	public void setReturnStatusType(String returnStatusType) {
		this.returnStatusType = returnStatusType;
	}

	/**
	 *
	 * @return
	 *     The returnStatusToCustomer
	 */
	public String getReturnStatusToCustomer() {
		return returnStatusToCustomer;
	}

	/**
	 *
	 * @param returnStatusToCustomer
	 *     The returnStatusToCustomer
	 */
	public void setReturnStatusToCustomer(String returnStatusToCustomer) {
		this.returnStatusToCustomer = returnStatusToCustomer;
	}

	public Long getReturnStateReasonId() {
		return returnStateReasonId;
	}

	public void setReturnStateReasonId(Long returnStateReasonId) {
		this.returnStateReasonId = returnStateReasonId;
	}

	public String getReturnStateReason() {
		return returnStateReason;
	}

	public void setReturnStateReason(String returnStateReason) {
		this.returnStateReason = returnStateReason;
	}

	public String getReturnStateComment() {
		return returnStateComment;
	}

	public void setReturnStateComment(String returnStateComment) {
		this.returnStateComment = returnStateComment;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
