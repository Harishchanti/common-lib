package com.ailiens.common.model;

import java.util.UUID;

/**
 * Created by vaibhav on 19/10/15.
 */
public class Preferences {

    public Preferences() {
        preferenceId = UUID.randomUUID();
    }


    private UUID preferenceId;


    private String toBe;

    public UUID getPreferenceId() {
        return preferenceId;
    }

    public void setPreferenceId(UUID preferenceId) {
        this.preferenceId = preferenceId;
    }


    public String getToBe() {
        return toBe;
    }

    public void setToBe(String toBe) {
        this.toBe = toBe;
    }


}
