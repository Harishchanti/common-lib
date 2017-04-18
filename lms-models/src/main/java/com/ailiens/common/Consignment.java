package com.ail.mbo.bumblebee.mbo.beans;

import java.util.List;

import com.ail.mbo.bumblebee.domain.Customer;

public class Consignment {
	private Double breadth;
	private Double length;
	private Double height;
	private String packageType;
	private String created;
	private List<ConsignmentEntries> consignmentEntries;
//	private DeliveryCost totalPrice;
//	private ShippingAddress shippingAddress;
	private Customer customer;
	private String consignmentId;
	private String orderId;
	private String storeId;
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public Double getBreadth() {
		return breadth;
	}
	public void setBreadth(Double breadth) {
		this.breadth = breadth;
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public List<ConsignmentEntries> getConsignmentEntries() {
		return consignmentEntries;
	}
	public void setConsignmentEntries(List<ConsignmentEntries> consignmentEntries) {
		this.consignmentEntries = consignmentEntries;
	}
	/*public DeliveryCost getTotalPrice() {
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
	}*/
	public String getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String oderId) {
		this.orderId = oderId;
	}
	/*public Store getStores() {
		return stores;
	}
	public void setStores(Store stores) {
		this.stores = stores;
	}*/
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
