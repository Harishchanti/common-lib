package com.ailiens.optimusprime.autobots.web.rest;

import java.util.ArrayList;
import java.util.List;

public class OrderItemAttributeDTO {
	
	private OrderItemCommonViewDTO orderItemCommonDTO;
	
	private int count;
	
	private List<Long> itemId;
	
	public OrderItemAttributeDTO() {
		this.orderItemCommonDTO = new OrderItemCommonViewDTO();
		this.count = 0;
		this.itemId = new ArrayList<>();
	}
	
	public OrderItemCommonViewDTO getOrderItemCommonDTO() {
		return orderItemCommonDTO;
	}
	
	public void setOrderItemCommonDTO(OrderItemCommonViewDTO orderItemCommonDTO) {
		this.orderItemCommonDTO = orderItemCommonDTO;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	public List<Long> getItemId() {
		return itemId;
	}

	public void setItemId(List<Long> itemId) {
		this.itemId = itemId;
	}

	public void add(OrderItemCommonViewDTO orderItemCommonViewDTO) {
		// TODO Auto-generated method stub
		this.orderItemCommonDTO = orderItemCommonViewDTO;
		this.itemId.add(orderItemCommonViewDTO.getOrderLineId());
		this.count++;
	}
	
}
