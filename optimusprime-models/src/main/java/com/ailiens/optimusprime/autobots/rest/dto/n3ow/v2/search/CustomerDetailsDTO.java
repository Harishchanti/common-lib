package com.ailiens.optimusprime.autobots.rest.dto.n3ow.v2.search;

import com.ailiens.optimusprime.domain.Consignment;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CustomerDetailsDTO {
	private OrderDetails orderDetails;
	private CustomerDetails customerDetails;

	public CustomerDetailsDTO(Consignment consignment) {
		orderDetails = new OrderDetails(consignment);
		if (consignment.getOrders() != null && consignment.getOrders().getAccounts() != null)
			customerDetails = new CustomerDetails(consignment.getOrders().getAccounts());
	}
	public CustomerDetailsDTO(){

	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
