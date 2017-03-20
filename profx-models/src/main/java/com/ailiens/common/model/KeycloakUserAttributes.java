package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Arrays;

@JsonInclude(Include.NON_NULL)
public class KeycloakUserAttributes {
    private String[] phoneNumber;

    private String[] myAccountID;

    public String[] getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String[] phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getMyAccountID() {
        return myAccountID;
    }

    public void setMyAccountID(String[] myAccountID) {
        this.myAccountID = myAccountID;
    }

    @Override
    public String toString() {
        return "KeycloakUserAttributes{" +
                "phoneNumber=" + Arrays.toString(phoneNumber) +
                ", myAccountID=" + Arrays.toString(myAccountID) +
                '}';
    }
}
