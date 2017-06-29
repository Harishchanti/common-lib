
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import com.ailiens.optimusprime.domain.Accounts;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
@AllArgsConstructor
@NoArgsConstructor
public class AccountsDetailsDTO {

    public String username;
    public String userId;
    public String title;
    public String firstName;
    public String middleName;
    public String lastName;
    public String gender;
    public String dateOfBirth;
    public String phonenumber;
    public String email;

    public AccountsDetailsDTO(Accounts accounts) {

    	if(accounts!=null){
    		this.setUserId(accounts.getAccountId());
    		this.setDateOfBirth(String.valueOf(accounts.getDateOfBirth()));
    		this.setEmail(accounts.getEmail());
    		this.setFirstName(accounts.getFirstName());
    		this.setGender(accounts.getGender());
    		this.setLastName(accounts.getLastName());
    		this.setMiddleName(accounts.getMiddleName());
    		this.setTitle(accounts.getTitle());
    		this.setUsername(accounts.getUsername());
    		this.setPhonenumber(accounts.getPhoneNumber());
    	}
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getMiddleName() {
		return middleName;
	}



	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getPhonenumber() {
		return phonenumber;
	}



	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
