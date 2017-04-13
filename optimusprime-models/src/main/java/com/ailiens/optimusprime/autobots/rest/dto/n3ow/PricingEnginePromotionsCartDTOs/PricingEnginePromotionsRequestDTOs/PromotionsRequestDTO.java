
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEnginePromotionsCartDTOs.PricingEnginePromotionsRequestDTOs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
	"products",
	"userID"
})
public class PromotionsRequestDTO {

	@JsonProperty("products")
	private List<Product> products = new ArrayList<Product>();
	@JsonProperty("userID")
	private String userID;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return
	 *     The products
	 */
	@JsonProperty("products")
	public List<Product> getProducts() {
		return products;
	}
	public PromotionsRequestDTO(){

	}

	/**
	 * 
	 * @param products
	 *     The products
	 */
	@JsonProperty("products")
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	/**
	 * 
	 * @return
	 *     The userID
	 */
	@JsonProperty("userID")
	public String getUserID() {
		return userID;
	}

	/**
	 * 
	 * @param userID
	 *     The userID
	 */
	@JsonProperty("userID")
	public void setUserID(String userID) {
		this.userID = userID;
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
