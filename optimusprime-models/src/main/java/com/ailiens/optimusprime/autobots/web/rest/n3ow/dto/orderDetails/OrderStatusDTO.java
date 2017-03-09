
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.Orders;

@Generated("org.jsonschema2pojo")
public class OrderStatusDTO {

	public String id;
	public String orderStatus;
	public String orderStatusType;
	public String orderStatusToCustomer;
	public String orderStatusToOms;

	public OrderStatusDTO(Orders order) {
		if(order.getOrderStates() !=null){
			this.setId(String.valueOf(order.getOrderStates().getId()));
			this.setOrderStatus(order.getOrderStates().getName());
			this.setOrderStatusType(order.getOrderStates().getType());
			this.setOrderStatusToCustomer(order.getOrderStates().getOrderStatusToCustomer());
			this.setOrderStatusToOms(order.getOrderStates().getStatusToOms());
		}
	}



	public OrderStatusDTO(){

	}

	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getOrderStatus() {
		return orderStatus;
	}




	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}




	public String getOrderStatusType() {
		return orderStatusType;
	}




	public void setOrderStatusType(String orderStatusType) {
		this.orderStatusType = orderStatusType;
	}




	public String getOrderStatusToCustomer() {
		return orderStatusToCustomer;
	}




	public void setOrderStatusToCustomer(String orderStatusToCustomer) {
		this.orderStatusToCustomer = orderStatusToCustomer;
	}

	public String getOrderStatusToOms() {
		return orderStatusToOms;
	}

	public void setOrderStatusToOms(String orderStatusToOms) {
		this.orderStatusToOms = orderStatusToOms;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
