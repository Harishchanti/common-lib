
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import javax.annotation.Generated;

import com.ailiens.optimusprime.autobots.rest.dto.VoucherDetailsDTO;

import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ConsignmentDetailsDTO {

    public String orderId;
    public String orderDate;
    public String service;
    private String orderReference;
    private String orderReference2;
    private String serviceOrderId;
    public FfCenterDTO orderingCenter;
    public AccountsDetailsDTO customerDetails;
    public AccountsDetailsDTO storeStaffDetails;
    public OrderStatusDTO orderStatus;
    public PaymentSummaryDTO paymentSummary;
    public PaymentSummaryDTO refundSummary;
    public VoucherDetailsDTO voucherDetails;
    public String slaEndTime;
    public ConsignmentDTO consignment = new ConsignmentDTO();
    //public SourceMetadata sourceMetadata;
    public SourceMetadataDTO sourceMetadata;

    public  String tenantId;

	public String getOrderId() {
		return orderId;
	}

    public ConsignmentDetailsDTO() {

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



	public FfCenterDTO getOrderingCenter() {
		return orderingCenter;
	}



	public void setOrderingCenter(FfCenterDTO orderingCenter) {
		this.orderingCenter = orderingCenter;
	}



	public AccountsDetailsDTO getCustomerDetails() {
		return customerDetails;
	}



	public void setCustomerDetails(AccountsDetailsDTO customerDetails) {
		this.customerDetails = customerDetails;
	}



	public AccountsDetailsDTO getStoreStaffDetails() {
		return storeStaffDetails;
	}



	public void setStoreStaffDetails(AccountsDetailsDTO storeStaffDetails) {
		this.storeStaffDetails = storeStaffDetails;
	}



	public OrderStatusDTO getOrderStatus() {
		return orderStatus;
	}



	public void setOrderStatus(OrderStatusDTO orderStatus) {
		this.orderStatus = orderStatus;
	}



	public PaymentSummaryDTO getPaymentSummary() {
		return paymentSummary;
	}



	public void setPaymentSummary(PaymentSummaryDTO paymentSummary) {
		this.paymentSummary = paymentSummary;
	}



	public PaymentSummaryDTO getRefundSummary() {
		return refundSummary;
	}



	public void setRefundSummary(PaymentSummaryDTO refundSummary) {
		this.refundSummary = refundSummary;
	}



	public ConsignmentDTO getConsignment() {
		return consignment;
	}



	public void setConsignment(ConsignmentDTO consignment) {
		this.consignment = consignment;
	}

	public String getSlaEndTime() {
		return slaEndTime;
	}



	public void setSlaEndTime(String slaEndTime) {
		this.slaEndTime = slaEndTime;
	}

    public VoucherDetailsDTO getVoucherDetails() {
        return voucherDetails;
    }

    public void setVoucherDetailsDTO(VoucherDetailsDTO voucherDetails) {
        this.voucherDetails = voucherDetails;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }


/*
	public SourceMetadata getSourceMetadata() {
		return sourceMetadata;
	}



	public void setSourceMetadata(SourceMetadata sourceMetadata) {
		this.sourceMetadata = sourceMetadata;
	}*/



	public String getService() {
		return service;
	}



	public void setService(String service) {
		this.service = service;
	}



	public String getOrderReference() {
		return orderReference;
	}



	public void setOrderReference(String orderReference) {
		this.orderReference = orderReference;
	}



	public String getOrderReference2() {
		return orderReference2;
	}



	public void setOrderReference2(String orderReference2) {
		this.orderReference2 = orderReference2;
	}



	public void setVoucherDetails(VoucherDetailsDTO voucherDetails) {
		this.voucherDetails = voucherDetails;
	}



	public String getServiceOrderId() {
		return serviceOrderId;
	}



	public void setServiceOrderId(String serviceOrderId) {
		this.serviceOrderId = serviceOrderId;
	}



	public SourceMetadataDTO getSourceMetadata() {
		return sourceMetadata;
	}



	public void setSourceMetadata(SourceMetadataDTO sourceMetadata) {
		this.sourceMetadata = sourceMetadata;
	}

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}
