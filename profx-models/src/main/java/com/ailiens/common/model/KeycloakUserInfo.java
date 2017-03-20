package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeycloakUserInfo
{
    private String lastName;

    private Boolean enabled;

    private String username;

    private String email;

    private String totp;

    private KeycloakUserAttributes attributes;

    private String firstName;

    private String emailVerified;

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public Boolean getEnabled ()
    {
        return enabled;
    }

    public void setEnabled (Boolean enabled)
    {
        this.enabled = enabled;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getTotp ()
    {
        return totp;
    }

    public void setTotp (String totp)
    {
        this.totp = totp;
    }

    public KeycloakUserAttributes getAttributes ()
    {
        return attributes;
    }

    public void setAttributes (KeycloakUserAttributes attributes)
    {
        this.attributes = attributes;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }


    public String getEmailVerified ()
    {
        return emailVerified;
    }

    public void setEmailVerified (String emailVerified)
    {
        this.emailVerified = emailVerified;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [lastName = "+lastName+", enabled = "+enabled+", username = "+username+", email = "+email+", totp = "+totp+", attributes = "+attributes+", firstName = "+firstName+", emailVerified = "+emailVerified+"]";
    }
}

