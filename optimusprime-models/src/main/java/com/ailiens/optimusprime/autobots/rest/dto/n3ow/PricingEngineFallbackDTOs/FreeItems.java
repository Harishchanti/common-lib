package com.ailiens.optimusprime.autobots.rest.dto.n3ow.PricingEngineFallbackDTOs;

import java.math.BigDecimal;

public class FreeItems {

	int quantity;
	String skuID;
	BigDecimal totalPrice;

	public FreeItems(){

	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSkuID() {
		return skuID;
	}

	public void setSkuID(String skuID) {
		this.skuID = skuID;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
}
