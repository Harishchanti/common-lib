package com.ailiens.common;

import java.util.HashMap;
import java.util.List;

public class StoreOptions {

	String fcId;
	HashMap<String,List<String>> paymentDeliveryMethods;
	public String getFcId() {
		return fcId;
	}
	public void setFcId(String fcId) {
		this.fcId = fcId;
	}
	public HashMap<String, List<String>> getPaymentDeliveryMethods() {
		return paymentDeliveryMethods;
	}
	public void setPaymentDeliveryMethods(HashMap<String, List<String>> paymentDeliveryMethods) {
		this.paymentDeliveryMethods = paymentDeliveryMethods;
	}


}
