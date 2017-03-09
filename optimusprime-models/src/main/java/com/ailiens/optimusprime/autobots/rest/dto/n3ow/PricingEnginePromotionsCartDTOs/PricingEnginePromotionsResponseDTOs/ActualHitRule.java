
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEnginePromotionsCartDTOs.PricingEnginePromotionsResponseDTOs;

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
	"id",
	"discount",
	"discountType",
	"freeItems"
})
public class ActualHitRule {

	@JsonProperty("id")
	private String id;
	@JsonProperty("discount")
	private Double discount;
	@JsonProperty("discountType")
	private String discountType;
	@JsonProperty("freeItems")
	private Object freeItems;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return
	 *     The id
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}
	public ActualHitRule(){

	}

	/**
	 * 
	 * @param id
	 *     The id
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 *     The discount
	 */
	@JsonProperty("discount")
	public Double getDiscount() {
		return discount;
	}

	/**
	 * 
	 * @param discount
	 *     The discount
	 */
	@JsonProperty("discount")
	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	/**
	 * 
	 * @return
	 *     The discountType
	 */
	@JsonProperty("discountType")
	public String getDiscountType() {
		return discountType;
	}

	/**
	 * 
	 * @param discountType
	 *     The discountType
	 */
	@JsonProperty("discountType")
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	/**
	 * 
	 * @return
	 *     The freeItems
	 */
	@JsonProperty("freeItems")
	public Object getFreeItems() {
		return freeItems;
	}

	/**
	 * 
	 * @param freeItems
	 *     The freeItems
	 */
	@JsonProperty("freeItems")
	public void setFreeItems(Object freeItems) {
		this.freeItems = freeItems;
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
