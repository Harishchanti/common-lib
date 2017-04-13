package com.ailiens.optimusprime.autobots.rest.dto.n3ow.logistics;

import com.ailiens.optimusprime.autobots.rest.dto.RefundModesDTO;
import org.apache.commons.lang.builder.ToStringBuilder;

public class LogisticsUpdateDTO {

	private String awbNumber;

	private String barCode;

	private String codBarCode;

	private String logisticsPartner;

	private String deliveryStatus;

	private String deliveryDate;

	private String expectedDeliveryDate;

	private String logisticsLink;

	private String dcCode;

	private String codAwbNumber;

	private String fedexForwardShipmentType;

	private String fedexReturnShipmentType;

	private String fedexForwardFormId;

	private String fedexReturnFormId;

	private String fedexMeter;

	private String countryCode;

	private String cityCode;

	private String fedexBillTc;

	private String fedexBillDt;

	private Boolean reprintFlag;

	private String comment;

	private RefundModesDTO refundModesDTO;

	public String getAwbNumber() {
		return awbNumber;
	}
	public LogisticsUpdateDTO(){

	}

	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
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

	public String getLogisticsPartner() {
		return logisticsPartner;
	}

	public void setLogisticsPartner(String logisticsPartner) {
		this.logisticsPartner = logisticsPartner;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(String expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	public String getLogisticsLink() {
		return logisticsLink;
	}

	public void setLogisticsLink(String logisticsLink) {
		this.logisticsLink = logisticsLink;
	}

	public String getDcCode() {
		return dcCode;
	}

	public void setDcCode(String dcCode) {
		this.dcCode = dcCode;
	}

	public String getCodAwbNumber() {
		return codAwbNumber;
	}

	public void setCodAwbNumber(String codAwbNumber) {
		this.codAwbNumber = codAwbNumber;
	}

	public Boolean getReprintFlag() {
		return reprintFlag;
	}

	public void setReprintFlag(Boolean reprintFlag) {
		this.reprintFlag = reprintFlag;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public RefundModesDTO getRefundModesDTO() {
		return refundModesDTO;
	}

	public void setRefundModesDTO(RefundModesDTO refundModesDTO) {
		this.refundModesDTO = refundModesDTO;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
