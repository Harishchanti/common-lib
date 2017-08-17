package com.ailiens.optimusprime.autobots.rest.dto;

import java.math.BigDecimal;

/**
 * A DTO representing a Price.
 */
public class PriceDTO {

	private BigDecimal price;

	private BigDecimal finalPrice;

	public PriceDTO(Price price) {
		if(price != null) {
			this.price = price.getOriginalPrice();
			this.finalPrice = price.getFinalPrice();
		}
	}
	public PriceDTO(){

	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(BigDecimal finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public String toString() {
		return "PriceDTO [price=" + price + ", finalPrice=" + finalPrice + "]";
	}

}
