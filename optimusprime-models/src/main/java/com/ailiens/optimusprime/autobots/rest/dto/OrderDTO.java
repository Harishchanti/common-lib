package com.ailiens.optimusprime.autobots.rest.dto;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

import com.ailiens.optimusprime.domain.Consignment;
import com.ailiens.optimusprime.domain.Orders;
import com.ailiens.optimusprime.domain.Payment;

/**
 * A DTO representing an order.
 */
public class OrderDTO {

	private String orderId;

	private ZonedDateTime orderDate;

	private AccountDTO customer;

	private OrderStatesDTO orderStatus;

	private Set<PaymentDTO> paymentDetails;

	private Set<ConsignmentDTO> consignments;
	
	public OrderDTO(Orders order) {
		if(order != null) {
			this.orderId = String.valueOf(order.getId());
			this.orderDate = order.getOrderDate();
			if(order.getAccounts() != null)
				this.customer = new AccountDTO(order.getAccounts());
			if(order.getOrderStates() != null)
				this.orderStatus = new OrderStatesDTO(order.getOrderStates());
			//setConsignmentsFromOrder(order);
			//setPaymentDetailsFromOrder(order);
		}
	}


	public void setConsignmentsFromOrder(Orders order) {
		if(order != null) {
			Set<ConsignmentDTO> consignmentDTOs = new HashSet<>();
			Set<Consignment> consignments = order.getConsignments();

			for(Consignment consignment : consignments) {
				ConsignmentDTO consignmentDTO = new ConsignmentDTO(consignment);
				consignmentDTOs.add(consignmentDTO);
			}
			this.consignments = consignmentDTOs;
		}
	}

	public void setPaymentDetailsFromOrder(Orders order) {
		if(order != null) {
			Set<PaymentDTO> paymentDTOs = new HashSet<>();
			Set<Payment> payments = order.getPayments();

			for(Payment payment : payments) {
				PaymentDTO paymentDTO = new PaymentDTO(payment);
				paymentDTOs.add(paymentDTO);
			}
			this.paymentDetails = paymentDTOs;
		}
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String id) {
		this.orderId = id;
	}

	public Set<ConsignmentDTO> getConsignments() {
		return consignments;
	}

	public void setConsignments(Set<ConsignmentDTO> consignments) {
		this.consignments = consignments;
	}

	public AccountDTO getCustomer() {
		return customer;
	}

	public void setCustomer(AccountDTO customer) {
		this.customer = customer;
	}

	public ZonedDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(ZonedDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public OrderStatesDTO getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatesDTO orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Set<PaymentDTO> getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(Set<PaymentDTO> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", orderDate=" + orderDate + ", customer=" + customer + ", orderStatus="
				+ orderStatus + ", paymentDetails=" + paymentDetails + ", consignments=" + consignments + "]";
	}

}
