package com.ailiens.common;

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
