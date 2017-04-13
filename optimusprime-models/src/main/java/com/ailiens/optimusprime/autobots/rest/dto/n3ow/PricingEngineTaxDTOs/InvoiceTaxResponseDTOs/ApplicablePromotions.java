
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineTaxDTOs.InvoiceTaxResponseDTOs;

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
	"hitRules",
	"actualHitRule"
})
public class ApplicablePromotions {

	@JsonProperty("hitRules")
	private List<Object> hitRules = new ArrayList<Object>();
	@JsonProperty("actualHitRule")
	private ActualHitRule actualHitRule;

	public ApplicablePromotions(){

	}
	/**
	 * 
	 * @return
	 *     The hitRules
	 */
	@JsonProperty("hitRules")
	public List<Object> getHitRules() {
		return hitRules;
	}

	/**
	 * 
	 * @param hitRules
	 *     The hitRules
	 */
	@JsonProperty("hitRules")
	public void setHitRules(List<Object> hitRules) {
		this.hitRules = hitRules;
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
