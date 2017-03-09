
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.getDeliveryOptions.responseDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class DestinationAddress {

	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	private String pincode;

	/**
	 *
	 * @return
	 *     The addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	public DestinationAddress(){

	}
	/**
	 *
	 * @param addressLine1
	 *     The addressLine1
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 *
	 * @return
	 *     The addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 *
	 * @param addressLine2
	 *     The addressLine2
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 *
	 * @return
	 *     The city
	 */
	public String getCity() {
		return city;
	}

	/**
	 *
	 * @param city
	 *     The city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 *
	 * @return
	 *     The state
	 */
	public String getState() {
		return state;
	}

	/**
	 *
	 * @param state
	 *     The state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 *
	 * @return
	 *     The country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 *
	 * @param country
	 *     The country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 *
	 * @return
	 *     The pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 *
	 * @param pincode
	 *     The pincode
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
