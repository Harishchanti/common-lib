package com.ailiens.common;

import java.util.List;

public class Store {

	private String id;
	private List<DeliveryMode> deliveryModes;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<DeliveryMode> getDeliveryModes() {
		return deliveryModes;
	}
	public void setDeliveryModes(List<DeliveryMode> deliveryModes) {
		this.deliveryModes = deliveryModes;
	}

}
