package com.ailiens.common.model.enums;

public enum UserStatus {
Active("active"),InActive("inActive"),Deleted("deleted");

	private String UserStatus;

	UserStatus(String UserStatus){
		this.UserStatus=UserStatus;
	}
}
