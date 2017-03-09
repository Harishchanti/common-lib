
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineTaxDTOs.InvoiceTaxRequestDTOs;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"actualHitRule"
})
public class ApplicablePromotions {

	@JsonProperty("actualHitRule")
	private ActualHitRule actualHitRule;

	public ApplicablePromotions(){

	}
	/**
	 * 
	 * @return
	 *     The actualHitRule
	 */
	@JsonProperty("actualHitRule")
	public ActualHitRule getActualHitRule() {
		return actualHitRule;
	}

	/**
	 * 
	 * @param actualHitRule
	 *     The actualHitRule
	 */
	@JsonProperty("actualHitRule")
	public void setActualHitRule(ActualHitRule actualHitRule) {
		this.actualHitRule = actualHitRule;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
