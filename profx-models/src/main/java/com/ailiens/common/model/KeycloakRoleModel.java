package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeycloakRoleModel {

	private String id;

    private String description;

    private String name;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }


    @Override
    public String toString()
    {
        return "KeycloakRole [id = "+id+", description = "+description+", name = "+name+", ]";
    }
}
