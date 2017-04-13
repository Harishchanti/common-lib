package com.ailiens.optimusprime.autobots.rest.dto.n3ow.v2.search;

import com.ailiens.optimusprime.domain.Consignment;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class ConsignmentDetailsV2DTO {
	private String consignmentId;
	private String orderId;
	private String consignmentStatus;
	private List<String> paymentMode = null;
	private String deliveryType;
	private String fcType;
	private String slaEndTime;
	private int itemCount;
	private List<ItemDetailsV2DTO> items = null;

	public ConsignmentDetailsV2DTO(Consignment consignment, List<String> paymentMode) {
		if (consignment != null) {
			this.consignmentId = consignment.getConsignmentId();
			if (consignment.getConsignmentStates() != null)
				this.consignmentStatus = consignment.getConsignmentStates().getName();
			if (consignment.getOrders() != null)
				this.orderId = consignment.getOrders().getOrderId();
			this.paymentMode = paymentMode;
			this.deliveryType = consignment.getDeliveryType();
			this.fcType = consignment.getFcType();
			this.slaEndTime = String.valueOf(consignment.getSlaEndTime());
		}
	}
	public ConsignmentDetailsV2DTO(){

	}

	public String getConsignmentId() {
		return consignmentId;
	}

	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<String> getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(List<String> paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getSlaEndTime() {
		return slaEndTime;
	}

	public void setSlaEndTime(String slaEndTime) {
		this.slaEndTime = slaEndTime;
	}

	public List<ItemDetailsV2DTO> getItems() {
		return items;
	}

	public void setItems(List<ItemDetailsV2DTO> items) {
		this.items = items;
	}

	public String getConsignmentStatus() {
		return consignmentStatus;
	}

	public void setConsignmentStatus(String consignmentStatus) {
		this.consignmentStatus = consignmentStatus;
	}

	public String getFcType() {
		return fcType;
	}

	public void setFcType(String fcType) {
		this.fcType = fcType;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
