package com.ailiens.common;

public class DeliveryMode {
	private Integer code;
	private String deliveryTime;
	private DeliveryCost deliveryCost;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	public DeliveryCost getDeliveryCost() {
		return deliveryCost;
	}
	public void setDeliveryCost(DeliveryCost deliveryCost) {
		this.deliveryCost = deliveryCost;
	}

}
