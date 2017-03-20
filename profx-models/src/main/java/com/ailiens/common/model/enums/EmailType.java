package com.ailiens.common.model.enums;

/**
 * Created by vaibhav on 30/10/15.
 */
public enum EmailType {

    PRIMARY("primary"),
    ALTERNATE("alternate");

    private String emailType;

    EmailType(String emailType) {
        this.emailType = emailType;
    }
}
