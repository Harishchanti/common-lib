package com.ail.mbo.bumblebee.mbo.beans;

public class OrderInfo {
	ShippingAddress shippingAddress;
	private String paymentMode;
	private String serviceType;
	private String shipmentValue;
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getShipmentValue() {
		return shipmentValue;
	}

	public void setShipmentValue(String shipmentValue) {
		this.shipmentValue = shipmentValue;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
}
