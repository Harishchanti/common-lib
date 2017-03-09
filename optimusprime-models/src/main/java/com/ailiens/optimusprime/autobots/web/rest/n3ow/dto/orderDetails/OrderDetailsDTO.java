
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.historyDTO.History;

@Generated("org.jsonschema2pojo")
public class OrderDetailsDTO {

	public String orderId;
	public String orderDate;
	public FfCenterDTO orderingCenter;
	public AccountsDetailsDTO customerDetails;
	public AccountsDetailsDTO storeStaffDetails;
	public OrderStatusDTO orderStatus;
	public TotalPricingDetails totalPricingDetails;
	public PaymentSummaryDTO paymentSummary;
	public PaymentSummaryDTO refundSummary;
	public List<ConsignmentDTO> consignments = new ArrayList<ConsignmentDTO>();
	public List<History> orderHistory = new ArrayList<History>();




	public TotalPricingDetails getTotalPricingDetails() {
		return totalPricingDetails;
	}


	public OrderDetailsDTO(){

	}

	public void setTotalPricingDetails(TotalPricingDetails totalPricingDetails) {
		this.totalPricingDetails = totalPricingDetails;
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



	public List<ConsignmentDTO> getConsignments() {
		return consignments;
	}



	public void setConsignments(List<ConsignmentDTO> consignments) {
		this.consignments = consignments;
	}



	public List<History> getOrderHistory() {
		return orderHistory;
	}



	public void setOrderHistory(List<History> orderHistory) {
		this.orderHistory = orderHistory;
	}



	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
