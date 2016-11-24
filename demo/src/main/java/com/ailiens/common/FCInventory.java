package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FCInventory {

	private String fcId;
	private String skuId;
	private Integer quantity;
	private Integer actualQty;

	public String getFcId() {
		return fcId;
	}

	public void setFcId(String fcId) {
		this.fcId = fcId;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getActualQty() {
		return actualQty;
	}

	public void setActualQty(Integer actualQty) {
		this.actualQty = actualQty;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FCInventory [");
		if (fcId != null)
			builder.append("fcId=").append(fcId).append(", ");
		if (skuId != null)
			builder.append("skuId=").append(skuId).append(", ");
		if (quantity != null)
			builder.append("quantity=").append(quantity).append(", ");
		if (actualQty != null)
			builder.append("actualQty=").append(actualQty);
		builder.append("]");
		return builder.toString();
	}

}
