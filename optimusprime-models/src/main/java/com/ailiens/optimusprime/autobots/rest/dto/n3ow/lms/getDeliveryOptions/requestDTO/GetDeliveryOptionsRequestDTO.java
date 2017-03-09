
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.getDeliveryOptions.requestDTO;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class GetDeliveryOptionsRequestDTO {

	private List<Store> stores = new ArrayList<Store>();
	private String shipmentValue;
	private DestinationAddress destinationAddress;

	/**
	 *
	 * @return
	 *     The stores
	 */
	public List<Store> getStores() {
		return stores;
	}
	public GetDeliveryOptionsRequestDTO(){

	}

	/**
	 *
	 * @param stores
	 *     The stores
	 */
	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	/**
	 *
	 * @return
	 *     The shipmentValue
	 */
	public String getShipmentValue() {
		return shipmentValue;
	}

	/**
	 *
	 * @param shipmentValue
	 *     The shipmentValue
	 */
	public void setShipmentValue(String shipmentValue) {
		this.shipmentValue = shipmentValue;
	}

	/**
	 *
	 * @return
	 *     The destinationAddress
	 */
	public DestinationAddress getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 *
	 * @param destinationAddress
	 *     The destinationAddress
	 */
	public void setDestinationAddress(DestinationAddress destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
