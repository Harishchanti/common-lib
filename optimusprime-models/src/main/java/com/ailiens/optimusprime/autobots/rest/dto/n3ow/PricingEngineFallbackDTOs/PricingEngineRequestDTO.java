
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineFallbackDTOs;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"orderID",
	"productsToBeReturned"
})
public class PricingEngineRequestDTO {

	@JsonProperty("orderID")
	private String orderID;
	@JsonProperty("productsToBeReturned")
	private List<ProductsToBeReturned> productsToBeReturned = new ArrayList<ProductsToBeReturned>();

	public PricingEngineRequestDTO(){

	}
	/**
	 *
	 * @return
	 *     The orderID
	 */
	@JsonProperty("orderID")
	public String getOrderID() {
		return orderID;
	}

	/**
	 *
	 * @param orderID
	 *     The orderID
	 */
	@JsonProperty("orderID")
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	/**
	 *
	 * @return
	 *     The productsToBeReturned
	 */
	@JsonProperty("productsToBeReturned")
	public List<ProductsToBeReturned> getProductsToBeReturned() {
		return productsToBeReturned;
	}

	/**
	 *
	 * @param productsToBeReturned
	 *     The productsToBeReturned
	 */
	@JsonProperty("productsToBeReturned")
	public void setProductsToBeReturned(List<ProductsToBeReturned> productsToBeReturned) {
		this.productsToBeReturned = productsToBeReturned;
	}

}
