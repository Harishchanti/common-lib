package com.ailiens.optimusprime.autobots.rest.dto.n3ow.v2.search;

import com.ailiens.optimusprime.domain.Consignment;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class OrderDetails {
	private String orderId;
	private String orderDate;
	private String deliveryType;
	private String orderingCenterName;
	private String orderStatus;
	private String consignmentStatus;
	private String deliveryDate;

	public OrderDetails(Consignment consignment) {
		if (consignment != null) {
			if (consignment.getOrders() != null) {
				this.orderId = consignment.getOrders().getOrderId();
				this.orderDate = String.valueOf(consignment.getOrders().getOrderDate());
				if (consignment.getOrders().getOrderStates() != null)
					this.orderStatus = consignment.getOrders().getOrderStates().getName();
			}
			this.orderingCenterName = consignment.getOrderingCenterName();
			this.deliveryType = consignment.getDeliveryType();
			if (consignment.getDeliveryDate() != null)
				this.deliveryDate = String.valueOf(consignment.getDeliveryDate());
			if (consignment.getConsignmentStates() != null)
				this.consignmentStatus = consignment.getConsignmentStates().getName();
		}
	}

	public OrderDetails(){

	}
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getOrderingCenterName() {
		return orderingCenterName;
	}

	public void setOrderingCenterName(String orderingCenterName) {
		this.orderingCenterName = orderingCenterName;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getConsignmentStatus() {
		return consignmentStatus;
	}

	public void setConsignmentStatus(String consignmentStatus) {
		this.consignmentStatus = consignmentStatus;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
