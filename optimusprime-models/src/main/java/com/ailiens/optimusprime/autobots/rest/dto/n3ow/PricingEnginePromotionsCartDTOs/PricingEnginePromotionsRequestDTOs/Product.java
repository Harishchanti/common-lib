
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEnginePromotionsCartDTOs.PricingEnginePromotionsRequestDTOs;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"sku",
	"sourceState",
	"destinationState",
	"shippingMethod",
	"quantity"
})
public class Product {

	@JsonProperty("sku")
	private String sku;
	@JsonProperty("sourceState")
	private String sourceState;
	@JsonProperty("destinationState")
	private String destinationState;
	@JsonProperty("shippingMethod")
	private String shippingMethod;
	@JsonProperty("quantity")
	private Integer quantity;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return
	 *     The sku
	 */
	@JsonProperty("sku")
	public String getSku() {
		return sku;
	}
	public Product(){

	}

	/**
	 * 
	 * @param sku
	 *     The sku
	 */
	@JsonProperty("sku")
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * 
	 * @return
	 *     The sourceState
	 */
	@JsonProperty("sourceState")
	public String getSourceState() {
		return sourceState;
	}

	/**
	 * 
	 * @param sourceState
	 *     The sourceState
	 */
	@JsonProperty("sourceState")
	public void setSourceState(String sourceState) {
		this.sourceState = sourceState;
	}

	/**
	 * 
	 * @return
	 *     The destinationState
	 */
	@JsonProperty("destinationState")
	public String getDestinationState() {
		return destinationState;
	}

	/**
	 * 
	 * @param destinationState
	 *     The destinationState
	 */
	@JsonProperty("destinationState")
	public void setDestinationState(String destinationState) {
		this.destinationState = destinationState;
	}

	/**
	 * 
	 * @return
	 *     The shippingMethod
	 */
	@JsonProperty("shippingMethod")
	public String getShippingMethod() {
		return shippingMethod;
	}

	/**
	 * 
	 * @param shippingMethod
	 *     The shippingMethod
	 */
	@JsonProperty("shippingMethod")
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	/**
	 * 
	 * @return
	 *     The quantity
	 */
	@JsonProperty("quantity")
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * 
	 * @param quantity
	 *     The quantity
	 */
	@JsonProperty("quantity")
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
