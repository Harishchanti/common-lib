package com.ailiens.common.model;

/**
 * Created by vaibhav on 19/10/15.
 */
public class Geolocation {

    private String lon;

    private String alt;

    private String lat;

    public String getLon ()
    {
        return lon;
    }

    public void setLon (String lon)
    {
        this.lon = lon;
    }

    public String getAlt ()
    {
        return alt;
    }

    public void setAlt (String alt)
    {
        this.alt = alt;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [lon = "+lon+", alt = "+alt+", lat = "+lat+"]";
    }
}
