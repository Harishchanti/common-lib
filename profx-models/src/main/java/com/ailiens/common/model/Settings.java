package com.ailiens.common.model;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by vaibhav on 19/10/15.
 */
public class Settings implements Serializable {


    /**
	 *
	 */
	private static final long serialVersionUID = -303109489110020549L;

	public Settings() {
        settingsId = UUID.randomUUID();
    }

    private UUID settingsId;


    private MobileConfiguration mobileConfiguration;

    private EmailConfiguration emailConfiguration;

    public UUID getSettingsId() {
        return settingsId;
    }

    public void setSettingsId(UUID settingsId) {
        this.settingsId = settingsId;
    }

    public MobileConfiguration getMobileConfiguration() {
        return mobileConfiguration;
    }

    public void setMobileConfiguration(MobileConfiguration MobileConfiguration) {
        this.mobileConfiguration = MobileConfiguration;
    }

    public EmailConfiguration getEmailConfiguration() {
        return emailConfiguration;
    }

    public void setEmailConfiguration(EmailConfiguration EmailConfiguration) {
        this.emailConfiguration = EmailConfiguration;
    }


}
