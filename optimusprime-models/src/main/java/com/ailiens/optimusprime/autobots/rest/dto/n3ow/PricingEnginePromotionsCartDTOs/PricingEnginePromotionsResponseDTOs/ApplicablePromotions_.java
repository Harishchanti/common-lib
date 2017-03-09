
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
public class ApplicablePromotions_ {

	@JsonProperty("hitRules")
	private List<Object> hitRules = new ArrayList<Object>();
	@JsonProperty("actualHitRule")
	private Object actualHitRule;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	public ApplicablePromotions_(){

	}

	/**
	 * 
	 * @return
	 *     The actualHitRule
	 */
	@JsonProperty("actualHitRule")
	public Object getActualHitRule() {
		return actualHitRule;
	}

	/**
	 * 
	 * @param actualHitRule
	 *     The actualHitRule
	 */
	@JsonProperty("actualHitRule")
	public void setActualHitRule(Object actualHitRule) {
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
