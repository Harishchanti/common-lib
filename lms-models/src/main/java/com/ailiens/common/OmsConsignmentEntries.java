package com.ailiens.common;

public class OmsConsignmentEntries {
	private String productCode;
	private String productCategory;
	private int quantity;
	private DeliveryCost totalPrice;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public DeliveryCost getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(DeliveryCost totalPrice) {
		this.totalPrice = totalPrice;
	}
}
