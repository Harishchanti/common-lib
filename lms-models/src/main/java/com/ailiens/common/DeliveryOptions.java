package com.ail.mbo.bumblebee.mbo.beans;

import java.util.List;

public class DeliveryOptions {
	private String itemId;
	private List<DeliveryOptionsStore> stores;
	private String shipmentValue;
	private DestinationAddress destinationAddress;
	
	public String getShipmentValue() {
		return shipmentValue;
	}
	public void setShipmentValue(String shipmentValue) {
		this.shipmentValue = shipmentValue;
	}
	public List<DeliveryOptionsStore> getStores() {
		return stores;
	}
	public void setStores(List<DeliveryOptionsStore> stores) {
		this.stores = stores;
	}
	public DestinationAddress getDestinationAddress() {
		return destinationAddress;
	}
	public void setDestinationAddress(DestinationAddress destinationAddress) {
		this.destinationAddress = destinationAddress;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	 
}
