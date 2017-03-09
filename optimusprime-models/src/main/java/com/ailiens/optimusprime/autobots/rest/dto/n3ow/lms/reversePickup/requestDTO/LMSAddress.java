
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.reversePickup.requestDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class LMSAddress {

	private String addressline1;
	private String addressline2;
	private String postcode;
	private String country;
	private String city;

	/**
	 *
	 * @return
	 *     The addressline1
	 */
	public String getAddressline1() {
		return addressline1;
	}
	public LMSAddress(){

	}

	/**
	 *
	 * @param addressline1
	 *     The addressline1
	 */
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	/**
	 *
	 * @return
	 *     The addressline2
	 */
	public String getAddressline2() {
		return addressline2;
	}

	/**
	 *
	 * @param addressline2
	 *     The addressline2
	 */
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	/**
	 *
	 * @return
	 *     The postcode
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 *
	 * @param postcode
	 *     The postcode
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
