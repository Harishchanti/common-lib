package com.ailiens.common.model.enums;

/**
 * Created by vaibhav on 18/11/15.
 */
public enum NotificationType {


    EMAIL("email"),
    MOBILE("mobile");

    private String string;

    NotificationType(String emailType) {
        this.string = emailType;
    }
}
