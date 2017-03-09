
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.getDeliveryOptions.responseDTO;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Store {

	private String storeId;
	private List<DeliveryMode> deliveryModes = new ArrayList<DeliveryMode>();

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

	/**
	 *
	 * @return
	 *     The deliveryModes
	 */
	public List<DeliveryMode> getDeliveryModes() {
		return deliveryModes;
	}

	/**
	 *
	 * @param deliveryModes
	 *     The deliveryModes
	 */
	public void setDeliveryModes(List<DeliveryMode> deliveryModes) {
		this.deliveryModes = deliveryModes;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
