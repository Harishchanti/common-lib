
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createOrder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class StoreStaffDetails {

	private String username;
	private String userId;
	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private String phonenumber;
	private String email;
	private String orderingAgentName;

	/**
	 *
	 * @return
	 *     The username
	 */
	public String getUsername() {
		return username;
	}
	public StoreStaffDetails(){

	}

	/**
	 *
	 * @param username
	 *     The username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 *
	 * @return
	 *     The userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 *
	 * @param userId
	 *     The userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 *
	 * @return
	 *     The title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 *
	 * @param title
	 *     The title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 *
	 * @return
	 *     The firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 *
	 * @param firstName
	 *     The firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 *
	 * @return
	 *     The middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 *
	 * @param middleName
	 *     The middleName
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 *
	 * @return
	 *     The lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 *
	 * @param lastName
	 *     The lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 *
	 * @return
	 *     The gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 *
	 * @param gender
	 *     The gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 *
	 * @return
	 *     The dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 *
	 * @param dateOfBirth
	 *     The dateOfBirth
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 *
	 * @return
	 *     The phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	/**
	 *
	 * @param phonenumber
	 *     The phonenumber
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 *
	 * @return
	 *     The email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 *
	 * @param email
	 *     The email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrderingAgentName() {
		return orderingAgentName;
	}

	public void setOrderingAgentName(String orderingAgentName) {
		this.orderingAgentName = orderingAgentName;
	}
}
