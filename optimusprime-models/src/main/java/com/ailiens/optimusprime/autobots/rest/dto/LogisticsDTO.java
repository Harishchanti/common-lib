package com.ailiens.optimusprime.autobots.rest.dto;

import java.time.ZonedDateTime;

import com.ailiens.optimusprime.domain.Logistics;

/**
 * A DTO representing a Logitics.
 */
public class LogisticsDTO {

	private String shipmentId;

	private ZonedDateTime deliveryDate;

	private String deliveryType;

	private String logisticsPartner;

	private String logisticsLink;

	public LogisticsDTO(Logistics logistics) {
		if(logistics != null) {
			this.shipmentId = logistics.getShipmentId();
			this.deliveryDate = logistics.getDeliveryDate();
			this.deliveryType = logistics.getDeliveryType();
			this.logisticsPartner = logistics.getLogisticsPartner();
			this.logisticsLink = logistics.getLogisticsLink();
		}
	}
	public LogisticsDTO(){

	}

	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public ZonedDateTime getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(ZonedDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getLogisticsPartner() {
		return logisticsPartner;
	}

	public void setLogisticsPartner(String logisticsPartner) {
		this.logisticsPartner = logisticsPartner;
	}

	public String getLogisticsLink() {
		return logisticsLink;
	}

	public void setLogisticsLink(String logisticsLink) {
		this.logisticsLink = logisticsLink;
	}

	@Override
	public String toString() {
		return "LogisticsDTO [shipmentId=" + shipmentId + ", deliveryDate=" + deliveryDate + ", deliveryType="
				+ deliveryType + ", logisticsPartner=" + logisticsPartner + ", logisticsLink=" + logisticsLink + "]";
	}

}
