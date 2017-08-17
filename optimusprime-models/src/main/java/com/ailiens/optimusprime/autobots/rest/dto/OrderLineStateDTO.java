package com.ailiens.optimusprime.autobots.rest.dto;

/**
 * A DTO representing an OrderLineState.
 */
public class OrderLineStateDTO {

	private String name;

	public OrderLineStateDTO(OrderLineStates orderLineState) {
		if(orderLineState != null)
			this.name = orderLineState.getName();
	}

	public String getName() {
		return name;
	}
	public OrderLineStateDTO(){

	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "OrderLineStateDTO [name=" + name + "]";
	}

}
