
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEnginePromotionsCartDTOs.PricingEnginePromotionsResponseDTOs;

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
	"hitRules",
	"actualHitRule"
})
public class ApplicablePromotions {

	@JsonProperty("hitRules")
	private List<HitRule> hitRules = new ArrayList<HitRule>();
	@JsonProperty("actualHitRule")
	private ActualHitRule actualHitRule;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return
	 *     The hitRules
	 */
	@JsonProperty("hitRules")
	public List<HitRule> getHitRules() {
		return hitRules;
	}
	public ApplicablePromotions(){

	}

	/**
	 * 
	 * @param hitRules
	 *     The hitRules
	 */
	@JsonProperty("hitRules")
	public void setHitRules(List<HitRule> hitRules) {
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

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
