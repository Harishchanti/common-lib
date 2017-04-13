package com.ailiens.common.model.enums;

/**
 * Created by vaibhav on 30/10/15.
 */
public enum MobileType {

    PRIMARY("primary"),
    ALTERNATE("alternate");

    private String mobileType;

    MobileType(String mobileType) {
        this.mobileType = mobileType;
    }
}
