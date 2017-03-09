
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.historyDTO.History;

@Generated("org.jsonschema2pojo")
public class ConsignmentDTO {

	public String consignmentId;
	public String invoiceId;
	public String invoiceDate;
	public Integer itemCount;
	public String slaEndTime;
	public PackagingTypeDTO packagingType;
	public FfTypeDTO ffType;
	public AddressDetailsDTO addressDetails;
	public LogisticsDetailsDTO logisticsDetails;
	public FfCenterDTO ffCenter;
	public ConsignmentStatusDTO consignmentStatus;
	public List<ItemDTO> items = new ArrayList<ItemDTO>();
	public List<History> consignmentHistory = new ArrayList<History>();



	public String getConsignmentId() {
		return consignmentId;
	}

	public ConsignmentDTO(){

	}

	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}



	public String getInvoiceId() {
		return invoiceId;
	}



	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}



	public String getInvoiceDate() {
		return invoiceDate;
	}



	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}



	public Integer getItemCount() {
		return itemCount;
	}



	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}



	public PackagingTypeDTO getPackagingType() {
		return packagingType;
	}



	public void setPackagingType(PackagingTypeDTO packagingType) {
		this.packagingType = packagingType;
	}



	public FfTypeDTO getFfType() {
		return ffType;
	}



	public void setFfType(FfTypeDTO ffType) {
		this.ffType = ffType;
	}



	public AddressDetailsDTO getAddressDetails() {
		return addressDetails;
	}



	public void setAddressDetails(AddressDetailsDTO addressDetails) {
		this.addressDetails = addressDetails;
	}



	public LogisticsDetailsDTO getLogisticsDetails() {
		return logisticsDetails;
	}



	public void setLogisticsDetails(LogisticsDetailsDTO logisticsDetails) {
		this.logisticsDetails = logisticsDetails;
	}



	public FfCenterDTO getFfCenter() {
		return ffCenter;
	}



	public void setFfCenter(FfCenterDTO ffCenter) {
		this.ffCenter = ffCenter;
	}



	public ConsignmentStatusDTO getConsignmentStatus() {
		return consignmentStatus;
	}



	public void setConsignmentStatus(ConsignmentStatusDTO consignmentStatus) {
		this.consignmentStatus = consignmentStatus;
	}



	public List<ItemDTO> getItems() {
		return items;
	}



	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}




	public String getSlaEndTime() {
		return slaEndTime;
	}



	public void setSlaEndTime(String slaEndTime) {
		this.slaEndTime = slaEndTime;
	}





	public List<History> getConsignmentHistory() {
		return consignmentHistory;
	}



	public void setConsignmentHistory(List<History> consignmentHistory) {
		this.consignmentHistory = consignmentHistory;
	}



	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
