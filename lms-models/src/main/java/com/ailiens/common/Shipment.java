package com.ail.mbo.bumblebee.mbo.beans;

import java.util.List;

public class Shipment {

	private String id;
	
	private List<ProductLineItem> productLineItems;
	
	private String orderDate;
	
	private ShippingAddress shippingAddress;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<ProductLineItem> getProductLineItems() {
		return productLineItems;
	}
	public void setProductLineItems(List<ProductLineItem> productLineItems) {
		this.productLineItems = productLineItems;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
}
