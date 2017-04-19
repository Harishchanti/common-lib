package com.ailiens.common;

import java.util.List;

public class ReturnShipment {

	private String consignmentId;
	private String invoiceId;
	private String destinationStoreId;
	private String sourceStoreId;
	private String orderId;
	private Double breadth;
	private Double length;
	private Double height;
	private String packageType;
	private List<ProductsDetails> returns;
	private Customer customer;
	private String returnType;
	public String getReturnType() {
		return returnType;
	}
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
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
	public String getDestinationStoreId() {
		return destinationStoreId;
	}
	public void setDestinationStoreId(String destinationStoreId) {
		this.destinationStoreId = destinationStoreId;
	}
	public String getSourceStoreId() {
		return sourceStoreId;
	}
	public void setSourceStoreId(String sourceStoreId) {
		this.sourceStoreId = sourceStoreId;
	}
	public List<ProductsDetails> getReturns() {
		return returns;
	}
	public void setReturns(List<ProductsDetails> returns) {
		this.returns = returns;
	}


}
