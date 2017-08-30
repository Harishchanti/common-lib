
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.Consignment;

@Generated("org.jsonschema2pojo")
public class ConsignmentStatusDTO {

    public Long id;
    public String consignmentStatus;
    public String consignmentStatusType;
    public String consignmentStatusToCustomer;
    public String consignmentStatusToOms;

    public ConsignmentStatusDTO(Consignment consignment) {
    	if(consignment.getConsignmentStates()!=null){
			this.setId(consignment.getConsignmentStates().getId());
			this.setConsignmentStatus(consignment.getConsignmentStates().getName());
			this.setConsignmentStatusType(consignment.getConsignmentStates().getType());
			this.setConsignmentStatusToCustomer(consignment.getConsignmentStates().getStatusToCustomer());
            this.setConsignmentStatusToOms(consignment.getConsignmentStates().getStatusToOms());
    	}
	}

	public ConsignmentStatusDTO() {

    }

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getConsignmentStatus() {
		return consignmentStatus;
	}



	public void setConsignmentStatus(String consignmentStatus) {
		this.consignmentStatus = consignmentStatus;
	}



	public String getConsignmentStatusType() {
		return consignmentStatusType;
	}



	public void setConsignmentStatusType(String consignmentStatusType) {
		this.consignmentStatusType = consignmentStatusType;
	}



	public String getConsignmentStatusToCustomer() {
		return consignmentStatusToCustomer;
	}



	public void setConsignmentStatusToCustomer(String consignmentStatusToCustomer) {
		this.consignmentStatusToCustomer = consignmentStatusToCustomer;
	}

    public String getConsignmentStatusToOms() {
        return consignmentStatusToOms;
    }

    public void setConsignmentStatusToOms(String consignmentStatusToOms) {
        this.consignmentStatusToOms = consignmentStatusToOms;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
