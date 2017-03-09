package com.ailiens.optimusprime.autobots.rest.dto.n3ow.orderLine;

import com.ailiens.optimusprime.autobots.rest.dto.n3ow.stateChangeDTO.OrderLineStateChangeDTO;
import org.apache.commons.lang.builder.ToStringBuilder;

public class OrderLineDTO {
	private String orderLineId;
	private StatusDTO status;

	/**
	 *
	 * @return
	 * The orderLineId
	 */
	public String getOrderLineId() {
		return orderLineId;
	}

	/**
	 *
	 * @param orderLineId
	 * The orderLineId
	 */
	public void setOrderLineId(String orderLineId) {
		this.orderLineId = orderLineId;
	}
	public OrderLineDTO(){

	}

	/**
	 *
	 * @return
	 * The status
	 */
	public StatusDTO getStatus() {
		return status;
	}

	/**
	 *
	 * @param status
	 * The status
	 */
	public void setStatus(StatusDTO status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
