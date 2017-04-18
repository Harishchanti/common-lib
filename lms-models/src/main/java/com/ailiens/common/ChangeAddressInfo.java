package com.ail.mbo.bumblebee.mbo.beans;

import com.ail.mbo.bumblebee.domain.Customer;

public class ChangeAddressInfo {
	private Customer customer;
	private String consignmentId;
	private String orderId;
	private String storeId;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	

}
