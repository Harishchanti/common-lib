
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineHistoryDTO;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ApplicablePromotions_ {

	private List<HitRule> hitRules = new ArrayList<HitRule>();
	private ActualHitRule actualHitRule;

	/**
	 *
	 * @return
	 *     The hitRules
	 */
	public List<HitRule> getHitRules() {
		return hitRules;
	}
	public ApplicablePromotions_(){

	}

	/**
	 *
	 * @param hitRules
	 *     The hitRules
	 */
	public void setHitRules(List<HitRule> hitRules) {
		this.hitRules = hitRules;
	}

	/**
	 *
	 * @return
	 *     The actualHitRule
	 */
	public ActualHitRule getActualHitRule() {
		return actualHitRule;
	}

	/**
	 *
	 * @param actualHitRule
	 *     The actualHitRule
	 */
	public void setActualHitRule(ActualHitRule actualHitRule) {
		this.actualHitRule = actualHitRule;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
