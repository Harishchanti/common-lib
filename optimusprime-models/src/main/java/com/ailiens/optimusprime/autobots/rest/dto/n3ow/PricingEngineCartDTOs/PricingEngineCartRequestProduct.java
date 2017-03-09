
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineCartDTOs;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class PricingEngineCartRequestProduct {

	private String sku;
	private Long quantity;
	private String shippingMethod;
	private String sourceState;
	private String destinationState;


	public PricingEngineCartRequestProduct(){

	}
	/**
	 *
	 * @return
	 *     The sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 *
	 * @param sku
	 *     The sku
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 *
	 * @return
	 *     The quantity
	 */
	public Long getQuantity() {
		return quantity;
	}

	/**
	 *
	 * @param quantity
	 *     The quantity
	 */
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	/**
	 *
	 * @return
	 *     The shippingMethod
	 */
	public String getShippingMethod() {
		return shippingMethod;
	}

	/**
	 *
	 * @param shippingMethod
	 *     The shippingMethod
	 */
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	/**
	 *
	 * @return
	 *     The sourceState
	 */
	public String getSourceState() {
		return sourceState;
	}

	/**
	 *
	 * @param sourceState
	 *     The sourceState
	 */
	public void setSourceState(String sourceState) {
		this.sourceState = sourceState;
	}

	/**
	 *
	 * @return
	 *     The destinationState
	 */
	public String getDestinationState() {
		return destinationState;
	}

	/**
	 *
	 * @param destinationState
	 *     The destinationState
	 */
	public void setDestinationState(String destinationState) {
		this.destinationState = destinationState;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
