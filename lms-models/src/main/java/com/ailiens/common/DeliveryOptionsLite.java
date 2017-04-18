package com.ail.mbo.bumblebee.mbo.beans;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public class DeliveryOptionsLite {

	private String itemId;
	private List<StoreOptions> storeOptions;
	
	
	public List<StoreOptions> getStoreOptions() {
		return storeOptions;
	}
	public void setStoreOptions(List<StoreOptions> storeOptions) {
		this.storeOptions = storeOptions;
	}
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	
}
