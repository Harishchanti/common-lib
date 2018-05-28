
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.OrderLine;

@Generated("org.jsonschema2pojo")
public class ItemStatusDTO {

    public String id;
    public String itemStatus;
    public String itemStatusType;
    public String itemStatusToCustomer;

    public ItemStatusDTO(OrderLine orderLine) {
    	if(orderLine.getOrderLineStates() != null){
	    	this.setId(String.valueOf(orderLine.getOrderLineStates().getId()));
			this.setItemStatus(orderLine.getOrderLineStates().getName());
			this.setItemStatusType(orderLine.getOrderLineStates().getType());
			this.setItemStatusToCustomer(orderLine.getOrderLineStates().getStatusToCustomer());
    	}
	}

    
    
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getItemStatus() {
		return itemStatus;
	}



	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}



	public String getItemStatusType() {
		return itemStatusType;
	}



	public void setItemStatusType(String itemStatusType) {
		this.itemStatusType = itemStatusType;
	}



	public String getItemStatusToCustomer() {
		return itemStatusToCustomer;
	}



	public void setItemStatusToCustomer(String itemStatusToCustomer) {
		this.itemStatusToCustomer = itemStatusToCustomer;
	}



	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
