package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created by vaibhav on 19/10/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Email implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = 5284916069652680776L;

	private boolean verified;

    @NotEmpty
    @Pattern(regexp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$")
    private String emailID;

    private String type;

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        return getEmailID().equals(email.getEmailID());
    }

    @Override
    public int hashCode() {
        return getEmailID().hashCode();
    }

    @Override
    public String toString() {
        return "Email{" +
                "verified=" + verified +
                ", emailID='" + emailID + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
