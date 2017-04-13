package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessTokenDS
{

	@JsonProperty("not-before-policy")
    private String not_before_policy;

	@JsonProperty("session-state")
    private String session_state;

    private String refresh_expires_in;

    private String token_type;

    private String expires_in;

    private String refresh_token;

    private String id_token;

    private String access_token;

    public String getNot_before_policy ()
    {
        return not_before_policy;
    }

    public void setNot_before_policy (String not_before_policy)
    {
        this.not_before_policy = not_before_policy;
    }

    public String getSession_state ()
    {
        return session_state;
    }

    public void setSession_state (String session_state)
    {
        this.session_state = session_state;
    }

    public String getRefresh_expires_in ()
    {
        return refresh_expires_in;
    }

    public void setRefresh_expires_in (String refresh_expires_in)
    {
        this.refresh_expires_in = refresh_expires_in;
    }

    public String getToken_type ()
    {
        return token_type;
    }

    public void setToken_type (String token_type)
    {
        this.token_type = token_type;
    }

    public String getExpires_in ()
    {
        return expires_in;
    }

    public void setExpires_in (String expires_in)
    {
        this.expires_in = expires_in;
    }

    public String getRefresh_token ()
    {
        return refresh_token;
    }

    public void setRefresh_token (String refresh_token)
    {
        this.refresh_token = refresh_token;
    }

    public String getId_token ()
    {
        return id_token;
    }

    public void setId_token (String id_token)
    {
        this.id_token = id_token;
    }

    public String getAccess_token ()
    {
        return access_token;
    }

    public void setAccess_token (String access_token)
    {
        this.access_token = access_token;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [not-before-policy = "+not_before_policy+", session-state = "+session_state+", refresh_expires_in = "+refresh_expires_in+", token_type = "+token_type+", expires_in = "+expires_in+", refresh_token = "+refresh_token+", id_token = "+id_token+", access_token = "+access_token+"]";
    }
}
