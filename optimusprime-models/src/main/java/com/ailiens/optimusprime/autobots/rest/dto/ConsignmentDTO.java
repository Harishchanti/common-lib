package com.ailiens.optimusprime.autobots.rest.dto;

import java.util.HashSet;
import java.util.Set;


public class ConsignmentDTO {

	private String consignmentId;

	private String count;

	private String workflowId;

	private FullfilmentTypeDTO fullfilmentType;

	private String deliveryType;

	private Set<OrderLineDTO> items;

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ConsignmentDTO(Consignment consignment) {
		if(consignment != null) {
			this.consignmentId = String.valueOf(consignment.getId());
			this.workflowId = consignment.getWorkflowId();
			this.deliveryType = consignment.getDeliveryType();
			if(consignment.getFullfilmentType() != null)
				this.fullfilmentType = new FullfilmentTypeDTO(consignment.getFullfilmentType());
			//setItemsFromConsignment(consignment);
		}
	}

	public ConsignmentDTO(){

	}
	public void setItemsFromConsignment(Consignment consignment) {
		if(consignment != null) {
			Set<OrderLineDTO> orderLineDTOs = new HashSet<>();
			Set<OrderLine> orderLines = consignment.getOrderLines();

			for(OrderLine orderLine : orderLines) {
				OrderLineDTO orderLineDTO = new OrderLineDTO(orderLine);
				orderLineDTOs.add(orderLineDTO);
			}
			this.items = orderLineDTOs;
			this.count = String.valueOf(orderLineDTOs.size());
		}
	}

	public void setAddressOfConsignment(OrderLine orderLine)
	{
		if(orderLine != null)
			this.address = orderLine.getAddress();
	}

	public String getConsignmentId() {
		return consignmentId;
	}

	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}

	public Set<OrderLineDTO> getItems() {
		return items;
	}

	public void setItems(Set<OrderLineDTO> items) {
		this.items = items;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}

	public FullfilmentTypeDTO getFullfilmentType() {
		return fullfilmentType;
	}

	public void setFullfilmentType(FullfilmentTypeDTO fullfilmentType) {
		this.fullfilmentType = fullfilmentType;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	@Override
	public String toString() {
		return "ConsignmentDTO [consignmentId=" + consignmentId + ", count=" + count + ", workflowId=" + workflowId
				+ ", fullfilmentType=" + fullfilmentType + ", items=" + items + "]";
	}

}
