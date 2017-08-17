package com.ailiens.optimusprime.autobots.rest.dto;

public class DiscountDTO {

	private String discount;

	private String couponApplied;

	public DiscountDTO(Discount discount) {
		if(discount != null) {
			this.discount = String.valueOf(discount.getDiscountAmount());
			this.couponApplied = discount.getDiscountName();
		}
	}

	public String getDiscount() {
		return discount;
	}
	public DiscountDTO(){

	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getCouponApplied() {
		return couponApplied;
	}

	public void setCouponApplied(String couponApplied) {
		this.couponApplied = couponApplied;
	}

	@Override
	public String toString() {
		return "DiscountDTO [discount=" + discount + ", couponApplied=" + couponApplied + "]";
	}

}
