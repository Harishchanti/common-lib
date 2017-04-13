package com.ailiens.common.model;

public class Credentials
{
    private String secret;

    public String getSecret ()
    {
        return secret;
    }

    public void setSecret (String secret)
    {
        this.secret = secret;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [secret = "+secret+"]";
    }
}
