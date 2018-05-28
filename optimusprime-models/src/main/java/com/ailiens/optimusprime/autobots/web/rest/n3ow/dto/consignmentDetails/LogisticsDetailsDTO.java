
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import java.math.BigDecimal;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.Courier;
import com.ailiens.optimusprime.domain.Logistics;
import com.ailiens.optimusprime.domain.OrderLine;

@Generated("org.jsonschema2pojo")
public class LogisticsDetailsDTO {

    public String serviceType = "";
    public String paymentType = "";
    public BigDecimal CODAmount = new BigDecimal(0.0);
    public String courierStatus = "";
    public String lmsStatus = "";
    public String courierName="";
    public String courierCode = "";
    public String airwayBillNumber = "";
    public String barCode = "";
    public String codBarCode;
    public String promiseDate = "";
    public String deliveryDate = "";
    public String trackingLink = "";
    public String dcCode = "";
    public String shipmentCost="";
    public String codAirwayBillNumber = "";
    public String fedexForwardShipmentType = "";
    public String fedexReturnShipmentType = "";
    public String fedexForwardFormId = "";
    public String fedexReturnFormId = "";
    public String fedexMeter = "";
    public String countryCode = "";
    public String cityCode = "";
    public String fedexBillTc = "";
    public String fedexBillDt = "";
    public CourierDetailDTO courierDetails;  // added courier details for the automation process

    public LogisticsDetailsDTO() {

    }
    public LogisticsDetailsDTO(OrderLine orderLine) {
	if(orderLine.getLogistics() !=null ){
	    Logistics logistics = orderLine.getLogistics();
	    this.setAirwayBillNumber(logistics.getAwbNumber());
	    this.setLmsStatus(logistics.getDeliveryStatus());
	    this.setServiceType(logistics.getServiceType());
	    this.setPromiseDate(logistics.getExpectedDeliveryDate());
	    this.setTrackingLink(logistics.getLogisticsLink());
	    this.setCourierName(logistics.getLogisticsPartner());
	    this.setBarCode(logistics.getBarCode());
	    this.setCodBarCode(logistics.getCodBarCode());
	    this.setDcCode(logistics.getDcCode());
	    this.setCodAirwayBillNumber(logistics.getCodAwbNumber());
	    this.setFedexForwardShipmentType(logistics.getFedexForwardShipmentType());
	    this.setFedexReturnShipmentType(logistics.getFedexReturnShipmentType());
	    this.setFedexForwardFormId(logistics.getFedexForwardFormId());
	    this.setFedexReturnFormId(logistics.getFedexReturnFormId());
	    this.setFedexMeter(logistics.getFedexMeter());
	    this.setCountryCode(logistics.getCountryCode());
	    this.setCityCode(logistics.getCityCode());
	    this.setFedexBillTc(logistics.getFedexBillTc());
	    this.setFedexBillDt(logistics.getFedexBillDt());
	    if(logistics.getDeliveryDate() != null)
		this.setDeliveryDate(String.valueOf(logistics.getDeliveryDate()));
	    this.courierDetails = new CourierDetailDTO(logistics.getCourier());
	}

    }

    public String getServiceType() {
	return serviceType;
    }



    public void setServiceType(String serviceType) {
	this.serviceType = serviceType;
    }



    public String getPaymentType() {
	return paymentType;
    }



    public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
    }



    public BigDecimal getCODAmount() {
	return CODAmount;
    }



    public void setCODAmount(BigDecimal cODAmount) {
	CODAmount = cODAmount;
    }



    public String getCourierStatus() {
	return courierStatus;
    }



    public void setCourierStatus(String courierStatus) {
	this.courierStatus = courierStatus;
    }



    public String getLmsStatus() {
	return lmsStatus;
    }



    public void setLmsStatus(String lmsStatus) {
	this.lmsStatus = lmsStatus;
    }



    public String getCourierName() {
	return courierName;
    }



    public void setCourierName(String courierName) {
	this.courierName = courierName;
    }



    public String getCourierCode() {
	return courierCode;
    }



    public void setCourierCode(String courierCode) {
	this.courierCode = courierCode;
    }



    public String getAirwayBillNumber() {
	return airwayBillNumber;
    }



    public void setAirwayBillNumber(String airwayBillNumber) {
	this.airwayBillNumber = airwayBillNumber;
    }



    public String getPromiseDate() {
	return promiseDate;
    }


    public void setPromiseDate(String promiseDate) {
	this.promiseDate = promiseDate;
    }


    public String getDeliveryDate() {
	return deliveryDate;
    }


    public void setDeliveryDate(String deliveryDate) {
	this.deliveryDate = deliveryDate;
    }


    public String getTrackingLink() {
	return trackingLink;
    }


    public void setTrackingLink(String trackingLink) {
	this.trackingLink = trackingLink;
    }


    public String getBarCode() {
	return barCode;
    }


    public void setBarCode(String barCode) {
	this.barCode = barCode;
    }


    public String getCodBarCode() {
	return codBarCode;
    }


    public void setCodBarCode(String codBarCode) {
	this.codBarCode = codBarCode;
    }


    public String getDcCode() {
	return dcCode;
    }


    public void setDcCode(String dcCode) {
	this.dcCode = dcCode;
    }

    public String getShipmentCost() {
	return shipmentCost;
    }

    public void setShipmentCost(String shipmentCost) {
	this.shipmentCost = shipmentCost;
    }

    public String getCodAirwayBillNumber() {
	return codAirwayBillNumber;
    }

    public void setCodAirwayBillNumber(String codAirwayBillNumber) {
	this.codAirwayBillNumber = codAirwayBillNumber;
    }

    public String getFedexForwardShipmentType() {
	return fedexForwardShipmentType;
    }

    public void setFedexForwardShipmentType(String fedexForwardShipmentType) {
	this.fedexForwardShipmentType = fedexForwardShipmentType;
    }

    public String getFedexReturnShipmentType() {
	return fedexReturnShipmentType;
    }

    public void setFedexReturnShipmentType(String fedexReturnShipmentType) {
	this.fedexReturnShipmentType = fedexReturnShipmentType;
    }

    public String getFedexForwardFormId() {
	return fedexForwardFormId;
    }

    public void setFedexForwardFormId(String fedexForwardFormId) {
	this.fedexForwardFormId = fedexForwardFormId;
    }

    public String getFedexReturnFormId() {
	return fedexReturnFormId;
    }

    public void setFedexReturnFormId(String fedexReturnFormId) {
	this.fedexReturnFormId = fedexReturnFormId;
    }

    public String getFedexMeter() {
	return fedexMeter;
    }

    public void setFedexMeter(String fedexMeter) {
	this.fedexMeter = fedexMeter;
    }

    public String getCountryCode() {
	return countryCode;
    }

    public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
    }

    public String getCityCode() {
	return cityCode;
    }

    public void setCityCode(String cityCode) {
	this.cityCode = cityCode;
    }

    public String getFedexBillTc() {
	return fedexBillTc;
    }

    public void setFedexBillTc(String fedexBillTc) {
	this.fedexBillTc = fedexBillTc;
    }

    public String getFedexBillDt() {
	return fedexBillDt;
    }

    public void setFedexBillDt(String fedexBillDt) {
	this.fedexBillDt = fedexBillDt;
    }

    @Override
    public String toString() {
	return ToStringBuilder.reflectionToString(this);
    }

}
