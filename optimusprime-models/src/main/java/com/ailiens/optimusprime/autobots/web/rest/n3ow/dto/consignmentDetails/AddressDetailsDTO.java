
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import com.ailiens.optimusprime.domain.OrderLine;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class AddressDetailsDTO {

    public String addressId;
    public String pincode;
    private String line1;
    private String line2;
    private String line3;
    private String city;
    private String state;
    private String country;

    public AddressDetailsDTO(OrderLine orderLine) {
    	if(orderLine.getAddress() != null ){
    		this.setAddressId(orderLine.getAddress().getAddressId());
            this.setPincode(orderLine.getAddress().getPincode());
            this.setLine1(orderLine.getAddress().getLine1());
            this.setLine2(orderLine.getAddress().getLine2());
            this.setLine3(orderLine.getAddress().getLine3());
            this.setCity(orderLine.getAddress().getCity());
            this.setState(orderLine.getAddress().getState());
            this.setCountry(orderLine.getAddress().getCountry());
        }
	}



	public String getAddressId() {
		return addressId;
	}



	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}


    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
