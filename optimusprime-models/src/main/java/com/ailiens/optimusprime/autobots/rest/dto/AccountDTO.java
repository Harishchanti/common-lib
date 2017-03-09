package com.ailiens.optimusprime.autobots.rest.dto;

import com.ailiens.optimusprime.domain.Accounts;

/**
 * A DTO representing an Account.
 */
public class AccountDTO {

	private String accountId;

	private String firstName;

	private String middleName;

	private String lastName;

	public AccountDTO(Accounts account) {
		if(account != null) {
			this.accountId = account.getAccountId();
			this.firstName = account.getFirstName();
			this.middleName = account.getMiddleName();
			this.lastName = account.getLastName();
		}
	}

	public AccountDTO(){

	}
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
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

	@Override
	public String toString() {
		return "AccountDTO [accountId=" + accountId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + "]";
	}


}
