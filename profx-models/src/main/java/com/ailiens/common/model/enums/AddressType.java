package com.ailiens.common.model.enums;

/**
 * Created by vaibhav on 28/10/15.
 */
public enum AddressType {

    SHIPPINGADDRESS("shippingaddress"),
    BILLINGADDRESS("billingaddress");

    private String addressTyp;

    AddressType(String addressTyp) {
        this.addressTyp = addressTyp;
    }


}
