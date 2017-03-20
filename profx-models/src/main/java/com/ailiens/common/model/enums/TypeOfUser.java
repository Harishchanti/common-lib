package com.ailiens.common.model.enums;

public enum TypeOfUser {



	CUSTOMER("customer"),
	AIL_STAFF("ail_staff");

	private String typeofuser;

	TypeOfUser(String typeofuser){
		this.typeofuser = typeofuser;
	}
}
