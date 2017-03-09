
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createOrder;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class AddressDetails {


	private String addressId;

	private String name;

	private String firstLine;

	private String secondLine;

	private String landmark;

	private String locality;

	private String description;

	private String geolocation;

	private String city;

	private String state;

	private String country;

	private String pincode;

	private String mobileNumber;

	/**
	 * 
	 * @return
	 *     The addressId
	 */
	public String getAddressId() {
		return addressId;
	}

	/**
	 * 
	 * @param addressId
	 *     The addressId
	 */
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	/**
	 * 
	 * @return
	 *     The name
	 */
	public String getName() {
		return name;
	}

	public AddressDetails(){

	}

	/**
	 * 
	 * @param name
	 *     The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 *     The firstLine
	 */
	public String getFirstLine() {
		return firstLine;
	}

	/**
	 * 
	 * @param firstLine
	 *     The firstLine
	 */
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	/**
	 * 
	 * @return
	 *     The secondLine
	 */
	public String getSecondLine() {
		return secondLine;
	}

	/**
	 * 
	 * @param secondLine
	 *     The secondLine
	 */
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	/**
	 * 
	 * @return
	 *     The landmark
	 */
	public String getLandmark() {
		return landmark;
	}

	/**
	 * 
	 * @param landmark
	 *     The landmark
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	/**
	 * 
	 * @return
	 *     The locality
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * 
	 * @param locality
	 *     The locality
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}

	/**
	 * 
	 * @return
	 *     The description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 *     The description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return
	 *     The geolocation
	 */
	public String getGeolocation() {
		return geolocation;
	}

	/**
	 * 
	 * @param geolocation
	 *     The geolocation
	 */
	public void setGeolocation(String geolocation) {
		this.geolocation = geolocation;
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

	/**
	 * 
	 * @return
	 *     The mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * 
	 * @param mobileNumber
	 *     The mobileNumber
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
