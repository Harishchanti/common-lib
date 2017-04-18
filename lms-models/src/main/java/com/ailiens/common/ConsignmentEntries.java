package com.ail.mbo.bumblebee.mbo.beans;

public class ConsignmentEntries {

	private String productCode;
	private int quantity;
	private DeliveryCost totalPrice;
	public DeliveryCost getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(DeliveryCost totalPrice) {
		this.totalPrice = totalPrice;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	private ShippingAddress shippingAddress;

	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
