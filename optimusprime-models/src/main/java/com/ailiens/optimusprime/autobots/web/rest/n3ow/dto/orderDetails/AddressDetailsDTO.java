
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import com.ailiens.optimusprime.domain.OrderLine;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class AddressDetailsDTO {

    public String addressId;

    public AddressDetailsDTO(OrderLine orderLine) {
    	if(orderLine.getAddress() != null ){
    		this.setAddressId(orderLine.getAddress().getAddressId());
    	}
	}



	public String getAddressId() {
		return addressId;
	}



	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}



	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
