package com.ail.mbo.bumblebee.mbo.beans;

import org.joda.time.DateTime;

public class OptimusprimeReverseConsignmentObject {
	private String logisticsId;
	private String shipmentId;
    private DateTime deliveryDate;
    private String deliveryType;
    private String deliveryStatus;
    private String logisticsPartner;
    private String logisticsLink;
    private String expectedDeliveryDate;
    private String awbNumber;
    private String serviceType;
    private String fedexBarCode;
    private String dcCode;
    
	public String getLogisticsId() {
		return logisticsId;
	}
	public void setLogisticsId(String logisticsId) {
		this.logisticsId = logisticsId;
	}
	public String getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public DateTime getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(DateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
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
	public String getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}
	public void setExpectedDeliveryDate(String expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}
	public String getAwbNumber() {
		return awbNumber;
	}
	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getFedexBarCode() {
		return fedexBarCode;
	}
	public void setFedexBarCode(String fedexBarCode) {
		this.fedexBarCode = fedexBarCode;
	}
	public String getDcCode() {
		return dcCode;
	}
	public void setDcCode(String dcCode) {
		this.dcCode = dcCode;
	}
	

}
