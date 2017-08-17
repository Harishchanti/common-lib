package com.ailiens.optimusprime.autobots.rest.dto;

/**
 * A DTO representing an OrderState.
 */
public class
OrderStatesDTO {

	private String name;

	public OrderStatesDTO(OrderStates orderStates) {
		if(orderStates != null) {
			this.name = orderStates.getName();
		}
	}

	public String getOrderStatus() {

		return name;
	}

	public OrderStatesDTO(){

	}
	public void setOrderStatus(String orderStatus) {
		this.name = orderStatus;
	}

	@Override
	public String toString() {
		return "OrderStatesDTO [name=" + name + "]";
	}

}
