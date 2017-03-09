
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineTaxDTOs.InvoiceTaxRequestDTOs;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"products"
})
public class InvoiceTaxRequestDTO {

	@JsonProperty("products")
	private List<Product> products = new ArrayList<Product>();

	/**
	 * 
	 * @return
	 *     The products
	 */
	@JsonProperty("products")
	public List<Product> getProducts() {
		return products;
	}
	public InvoiceTaxRequestDTO(){

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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
