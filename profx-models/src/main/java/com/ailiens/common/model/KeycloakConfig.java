package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeycloakConfig
{

	@JsonProperty("auth-server-url")
    private String auth_server_url;

    private String realm;

    private Credentials credentials;

    private String resource;

    @JsonProperty("ssl-required")
    private String ssl_required;

    @JsonProperty("bearer-only")
    private String bearer_only;

    @JsonProperty("realm-public-key")
    private String realm_public_key;

    public Credentials getCredentials ()
    {
        return credentials;
    }

    public void setCredentials (Credentials credentials)
    {
        this.credentials = credentials;
    }

    public String getAuth_server_url ()
    {
        return auth_server_url;
    }

    public void setAuth_server_url (String auth_server_url)
    {
        this.auth_server_url = auth_server_url;
    }

    public String getRealm ()
    {
        return realm;
    }

    public void setRealm (String realm)
    {
        this.realm = realm;
    }

    public String getResource ()
    {
        return resource;
    }

    public void setResource (String resource)
    {
        this.resource = resource;
    }

    public String getSsl_required ()
    {
        return ssl_required;
    }

    public void setSsl_required (String ssl_required)
    {
        this.ssl_required = ssl_required;
    }

    public String getBearer_only ()
    {
        return bearer_only;
    }

    public void setBearer_only (String bearer_only)
    {
        this.bearer_only = bearer_only;
    }

    public String getRealm_public_key ()
    {
        return realm_public_key;
    }

    public void setRealm_public_key (String realm_public_key)
    {
        this.realm_public_key = realm_public_key;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [auth-server-url = "+auth_server_url+", realm = "+realm+", resource = "+resource+", ssl-required = "+ssl_required+", bearer-only = "+bearer_only+", realm-public-key = "+realm_public_key+"]";
    }
}
