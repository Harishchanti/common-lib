package com.ailiens.common.model;

import java.util.Set;

public class Principal {
	String username = null;
	String firstname = null;
	String lastname = null;
	Set<String> roles = null;
	String emailID = null;
	String realms = null;
	String realmName = null;
	String userID = null;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getRealms() {
		return realms;
	}
	public void setRealms(String realms) {
		this.realms = realms;
	}
	public String getRealmName() {
		return realmName;
	}
	public void setRealmName(String realmName) {
		this.realmName = realmName;
	}


}
