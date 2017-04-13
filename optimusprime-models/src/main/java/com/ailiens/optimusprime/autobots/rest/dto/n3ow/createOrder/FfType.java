
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createOrder;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class FfType {

	private String ffTypeName;
	private Long ffTypeId;

	/**
	 * 
	 * @return
	 *     The ffTypeId
	 */
	public Long getFfTypeId() {
		return ffTypeId;
	}
	public FfType(){

	}

	/**
	 * 
	 * @param ffType
	 *     The ffTypeId
	 */
	public void setFfTypeId(Long ffTypeId) {
		this.ffTypeId = ffTypeId;
	}

	/**
	 * 
	 * @return
	 *     The ffTypeName
	 */
	public String getFfTypeName() {
		return ffTypeName;
	}

	/**
	 * 
	 * @param ffTypeName
	 *     The ffTypeName
	 */
	public void setFfTypeName(String ffTypeName) {
		this.ffTypeName = ffTypeName;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
