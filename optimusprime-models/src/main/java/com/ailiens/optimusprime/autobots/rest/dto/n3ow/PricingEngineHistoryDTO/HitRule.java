
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineHistoryDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.math.BigDecimal;

@Generated("org.jsonschema2pojo")
public class HitRule {

	private String id;
	private BigDecimal discount;
	private String discountType;
	private Object freeItems;

	/**
	 *
	 * @return
	 *     The id
	 */
	public String getId() {
		return id;
	}
	public HitRule(){

	}

	/**
	 *
	 * @param id
	 *     The id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 *
	 * @return
	 *     The discount
	 */
	public BigDecimal getDiscount() {
		return discount;
	}

	/**
	 *
	 * @param discount
	 *     The discount
	 */
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	/**
	 *
	 * @return
	 *     The discountType
	 */
	public String getDiscountType() {
		return discountType;
	}

	/**
	 *
	 * @param discountType
	 *     The discountType
	 */
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	/**
	 *
	 * @return
	 *     The freeItems
	 */
	public Object getFreeItems() {
		return freeItems;
	}

	/**
	 *
	 * @param freeItems
	 *     The freeItems
	 */
	public void setFreeItems(Object freeItems) {
		this.freeItems = freeItems;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
