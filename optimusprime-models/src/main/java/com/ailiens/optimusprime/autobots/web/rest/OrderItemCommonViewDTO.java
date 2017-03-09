package com.ailiens.optimusprime.autobots.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZonedDateTime;

public class OrderItemCommonViewDTO {

	private final Logger log = LoggerFactory.getLogger(OrderItemCommonViewDTO.class);

	private long orderId;

	private ZonedDateTime orderDate;

	private String accountId;

	private long orderLineId;

	private String shipmentId;

	private String orderStatus;

	private String consignmentSatus;

	private String fullFilmentStore;

	private String customerName;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public ZonedDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(ZonedDateTime zonedDateTime) {
		this.orderDate = zonedDateTime;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public long getOrderLineId() {
		return orderLineId;
	}

	public void setOrderLineId(long orderLineId) {
		this.orderLineId = orderLineId;
	}

	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getConsignmentSatus() {
		return consignmentSatus;
	}

	public void setConsignmentSatus(String consignmentSatus) {
		this.consignmentSatus = consignmentSatus;
	}

	public String getFullFilmentStore() {
		return fullFilmentStore;
	}

	public void setFullFilmentStore(String fullFilmentStore) {
		this.fullFilmentStore = fullFilmentStore;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public boolean equals(Object obj) {
		/* If the object is compared with itself then return true */
		if(obj == this) {
			log.debug("both objects matched.");
			return true;
		}
		/* Check if obj is an instance of OrderItemViewDTO or not
        "null instanceof [type]" also returns false */
		if (!(obj instanceof OrderItemCommonViewDTO)) {
			log.debug("Object instance is not type of OrderItemCommonViewDTO");
			return false;
		}
		OrderItemCommonViewDTO orderItemCommonViewDTO = (OrderItemCommonViewDTO) obj;
		int compareOrderId = Long.compare(this.orderId, orderItemCommonViewDTO.orderId);
		boolean compareStoreName = this.fullFilmentStore.equals(orderItemCommonViewDTO.getFullFilmentStore());
		log.debug("order Id compare result : " + (compareOrderId == 0));
		log.debug("store name compare result : " + compareStoreName);
		return ( compareOrderId == 0) && compareStoreName ;
	}
}
