package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeycloakRoles {

	private List<KeycloakRoleModel> listOfRoles;

	public List<KeycloakRoleModel> getListOfRoles() {
		return listOfRoles;
	}

	public void setListOfRoles(List<KeycloakRoleModel> listOfRoles) {
		this.listOfRoles = listOfRoles;
	}

}
