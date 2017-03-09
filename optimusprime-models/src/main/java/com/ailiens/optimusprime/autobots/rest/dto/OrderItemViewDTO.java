package com.ailiens.optimusprime.autobots.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.ailiens.optimusprime.autobots.web.rest.OrderItemAttributeDTO;
import com.ailiens.optimusprime.autobots.web.rest.OrderItemCommonViewDTO;

public class OrderItemViewDTO {
	
	private List<OrderItemAttributeDTO> orderItemAttributeDTOs;

	public OrderItemViewDTO() {
		this.orderItemAttributeDTOs = new ArrayList<>();
	}
	
	public List<OrderItemAttributeDTO> getOrderItemAttributeDTOs() {
		return orderItemAttributeDTOs;
	}

	public void setOrderItemAttributeDTOs(List<OrderItemAttributeDTO> orderItemAttributeDTOs) {
		this.orderItemAttributeDTOs = orderItemAttributeDTOs;
	}

	public void add(OrderItemCommonViewDTO orderItemCommonViewDTO) {
		boolean orderItemCommonViewDTOFound = false;
		for (OrderItemAttributeDTO orderItemAttributeDTO : orderItemAttributeDTOs) {
			OrderItemCommonViewDTO orderItemCommonViewDTOs = orderItemAttributeDTO.getOrderItemCommonDTO();
			if(orderItemCommonViewDTOs.equals(orderItemCommonViewDTO)) {
				orderItemCommonViewDTOFound = !orderItemCommonViewDTOFound;
				orderItemAttributeDTO.add(orderItemCommonViewDTO);
			}
		}
		if(!orderItemCommonViewDTOFound) {
			OrderItemAttributeDTO orderItemAttributeDTO = new OrderItemAttributeDTO();
			orderItemAttributeDTO.add(orderItemCommonViewDTO);
			this.orderItemAttributeDTOs.add(orderItemAttributeDTO);
		}
	}
}
