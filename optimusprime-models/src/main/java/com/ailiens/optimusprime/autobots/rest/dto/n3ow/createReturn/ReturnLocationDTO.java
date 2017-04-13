package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createReturn;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ReturnLocationDTO {

	private String streetNo;
	private String streetName;
	private String town;
	private String postCode;
	private String city;
	private String state;

	/**
	 *
	 * @return
	 * The streetNo
	 */
	public String getStreetNo() {
		return streetNo;
	}
	public ReturnLocationDTO(){

	}

	/**
	 *
	 * @param streetNo
	 * The streetNo
	 */
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	/**
	 *
	 * @return
	 * The streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 *
	 * @param streetName
	 * The streetName
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 *
	 * @return
	 * The town
	 */
	public String getTown() {
		return town;
	}

	/**
	 *
	 * @param town
	 * The town
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 *
	 * @return
	 * The postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 *
	 * @param postCode
	 * The postCode
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 *
	 * @return
	 * The city
	 */
	public String getCity() {
		return city;
	}

	/**
	 *
	 * @param city
	 * The city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 *
	 * @return
	 * The state
	 */
	public String getState() {
		return state;
	}

	/**
	 *
	 * @param state
	 * The state
	 */
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
