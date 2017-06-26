
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import com.ailiens.optimusprime.domain.OrderLine;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.math.BigDecimal;

@Generated("org.jsonschema2pojo")
public class LogisticsDetailsDTO {

    public String serviceType;
    public String paymentType;
    public BigDecimal CODAmount;
    public String courierStatus;
    public String lmsStatus;
    public String courierName;
    public String courierCode;
    public String airwayBillNumber;
    public String barCode;
    public String codBarCode;
    public String promiseDate;
    public String deliveryDate;
    public String trackingLink;
    public String dcCode;
    public String shipmentCost;
    public String codAirwayBillNumber;
    public String fedexForwardShipmentType;
    public String fedexReturnShipmentType;
    public String fedexForwardFormId;
    public String fedexReturnFormId;
    public String fedexMeter;
    public String countryCode;
    public String cityCode;
    public String fedexBillTc;
    public String fedexBillDt;

    public LogisticsDetailsDTO(OrderLine orderLine) {
		if(orderLine.getLogistics() !=null ){
			this.setAirwayBillNumber(orderLine.getLogistics().getAwbNumber());
			this.setLmsStatus(orderLine.getLogistics().getDeliveryStatus());
			this.setServiceType(orderLine.getLogistics().getServiceType());
			this.setPromiseDate(orderLine.getLogistics().getExpectedDeliveryDate());
			this.setTrackingLink(orderLine.getLogistics().getLogisticsLink());
			this.setCourierName(orderLine.getLogistics().getLogisticsPartner());
            this.setBarCode(orderLine.getLogistics().getBarCode());
            this.setCodBarCode(orderLine.getLogistics().getCodBarCode());
            this.setDcCode(orderLine.getLogistics().getDcCode());
            this.setCodAirwayBillNumber(orderLine.getLogistics().getCodAwbNumber());
            this.setFedexForwardShipmentType(orderLine.getLogistics().getFedexForwardShipmentType());
            this.setFedexReturnShipmentType(orderLine.getLogistics().getFedexReturnShipmentType());
            this.setFedexForwardFormId(orderLine.getLogistics().getFedexForwardFormId());
            this.setFedexReturnFormId(orderLine.getLogistics().getFedexReturnFormId());
            this.setFedexMeter(orderLine.getLogistics().getFedexMeter());
            this.setCountryCode(orderLine.getLogistics().getCountryCode());
            this.setCityCode(orderLine.getLogistics().getCityCode());
            this.setFedexBillTc(orderLine.getLogistics().getFedexBillTc());
            this.setFedexBillDt(orderLine.getLogistics().getFedexBillDt());
            if(orderLine.getLogistics().getDeliveryDate() != null)
                this.setDeliveryDate(String.valueOf(orderLine.getLogistics().getDeliveryDate()));
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
