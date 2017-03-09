package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createReturn;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ReturnsResponseDTO {

	private String returnId;
	private String returnConsignmentId;
	private ReturnLocationDTO returnLocation;

	/**
	 *
	 * @return
	 * The returnId
	 */
	public String getReturnId() {
		return returnId;
	}
	public ReturnsResponseDTO(){

	}

	/**
	 *
	 * @param returnId
	 * The returnId
	 */
	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}

	/**
	 *
	 * @return
	 * The returnConsignmentId
	 */
	public String getReturnConsignmentId() {
		return returnConsignmentId;
	}

	/**
	 *
	 * @param returnConsignmentId
	 * The returnConsignmentId
	 */
	public void setReturnConsignmentId(String returnConsignmentId) {
		this.returnConsignmentId = returnConsignmentId;
	}

	/**
	 *
	 * @return
	 * The returnLocation
	 */
	public ReturnLocationDTO getReturnLocation() {
		return returnLocation;
	}

	/**
	 *
	 * @param returnLocation
	 * The returnLocation
	 */
	public void setReturnLocation(ReturnLocationDTO returnLocation) {
		this.returnLocation = returnLocation;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
