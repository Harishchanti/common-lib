package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineFallbackDTOs;

import java.math.BigDecimal;

public class HitRuleAndDiscount {

	private String id;
	private BigDecimal discount;
	private String discountType;
	private FreeItems freeItems;


	public HitRuleAndDiscount(){

	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public FreeItems getFreeItems() {
		return freeItems;
	}

	public void setFreeItems(FreeItems freeItems) {
		this.freeItems = freeItems;
	}
}
