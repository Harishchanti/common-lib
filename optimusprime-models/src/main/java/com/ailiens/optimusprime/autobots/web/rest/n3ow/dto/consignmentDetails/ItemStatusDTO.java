
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.OrderLine;

@Generated("org.jsonschema2pojo")
public class ItemStatusDTO {

    public String id;
    public String itemStatus;
    public String itemStatusType;
    public String itemStatusToCustomer;
    public String itemStatusReason;
    public String itemStatusComment;
    public Long itemStatusReasonId;

    public ItemStatusDTO(OrderLine orderLine) {
    	if(orderLine.getOrderLineStates() != null){
	    	this.setId(String.valueOf(orderLine.getOrderLineStates().getId()));
			this.setItemStatus(orderLine.getOrderLineStates().getName());
			this.setItemStatusType(orderLine.getOrderLineStates().getType());
			this.setItemStatusToCustomer(orderLine.getOrderLineStates().getStatusToCustomer());
    	}
	}

	public ItemStatusDTO(){
        super();
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

    public String getItemStatusReason() {
        return itemStatusReason;
    }

    public void setItemStatusReason(String itemStatusReason) {
        this.itemStatusReason = itemStatusReason;
    }

    public String getItemStatusComment() {
        return itemStatusComment;
    }

    public void setItemStatusComment(String itemStatusComment) {
        this.itemStatusComment = itemStatusComment;
    }

    public Long getItemStatusReasonId() {
        return itemStatusReasonId;
    }

    public void setItemStatusReasonId(Long itemStatusReasonId) {
        this.itemStatusReasonId = itemStatusReasonId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
