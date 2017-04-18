package com.ail.mbo.bumblebee.mbo.beans;

import java.math.BigDecimal;
import java.util.List;

import com.ail.mbo.bumblebee.domain.Customer;

public class OmsConsignment {
	private Double length;
	private Double breadth;
	private Double height;
	private String packageType;
	private String created;
	private List<OmsConsignmentEntries> consignmentEntries;
	private Customer destinationAddress;
	private String consignmentId;
	private String storeId;
	private String orderId;
	private String paymentType;
	private String serviceType;
	private BigDecimal amount;
	private BigDecimal collectableAmount;
	private String initialServiceType;

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getBreadth() {
		return breadth;
	}

	public void setBreadth(Double breadth) {
		this.breadth = breadth;
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

	public List<OmsConsignmentEntries> getConsignmentEntries() {
		return consignmentEntries;
	}

	public void setConsignmentEntries(List<OmsConsignmentEntries> consignmentEntries) {
		this.consignmentEntries = consignmentEntries;
	}

	public Customer getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(Customer destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getConsignmentId() {
		return consignmentId;
	}

	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getCollectableAmount() {
		return collectableAmount;
	}

	public void setCollectableAmount(BigDecimal collectableAmount) {
		this.collectableAmount = collectableAmount;
	}

	public String getInitialServiceType() {
		return initialServiceType;
	}

	public void setInitialServiceType(String initialServiceType) {
		this.initialServiceType = initialServiceType;
	}
}
