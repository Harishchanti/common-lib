package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Created by vaibhav on 19/10/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MobileNumber implements Serializable {

    /**
	 *
	 */
	private static final long serialVersionUID = 4620823461111658158L;
	private boolean verified;
    @Pattern(regexp = "[0-9]{10}+")
    private String phoneNumber;

    private String type;

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getPhoneNumber ()
    {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MobileNumber that = (MobileNumber) o;

        return getPhoneNumber().equals(that.getPhoneNumber());

    }

    @Override
    public int hashCode() {
        return getPhoneNumber().hashCode();
    }

    @Override

    public String toString()
    {
        return "ClassPojo [isVerified = "+verified+", phoneNumber = "+phoneNumber+", type = "+type+"]";
    }
}
