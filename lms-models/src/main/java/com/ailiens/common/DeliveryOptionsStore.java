package com.ail.mbo.bumblebee.mbo.beans;

import java.util.List;

public class DeliveryOptionsStore {
	private String storeId;
	private List<DeliveryModes> deliveryModes;
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public List<DeliveryModes> getDeliveryModes() {
		return deliveryModes;
	}
	public void setDeliveryModes(List<DeliveryModes> deliveryModes) {
		this.deliveryModes = deliveryModes;
	}
}
