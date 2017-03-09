
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.reversePickup.requestDTO;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class ReturnQCStatusDTO {

	private String consignmentId;
	private List<LMSReturnQCStatusProductDetailDTO> returns = new ArrayList<LMSReturnQCStatusProductDetailDTO>();

	/**
	 *
	 * @return
	 *     The consignmentId
	 */
	public String getConsignmentId() {
		return consignmentId;
	}
	public ReturnQCStatusDTO(){

	}

	/**
	 *
	 * @param consignmentId
	 *     The consignmentId
	 */
	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}

	/**
	 *
	 * @return
	 *     The returns
	 */
	public List<LMSReturnQCStatusProductDetailDTO> getReturns() {
		return returns;
	}

	/**
	 *
	 * @param returns
	 *     The returns
	 */
	public void setReturns(List<LMSReturnQCStatusProductDetailDTO> returns) {
		this.returns = returns;
	}

}
