
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.getDeliveryOptions.requestDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Store {

	private String storeId;

	/**
	 *
	 * @return
	 *     The storeId
	 */
	public String getStoreId() {
		return storeId;
	}
	public Store(){

	}

	/**
	 *
	 * @param storeId
	 *     The storeId
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
