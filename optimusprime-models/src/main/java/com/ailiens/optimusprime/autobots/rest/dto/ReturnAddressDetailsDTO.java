package com.ailiens.optimusprime.autobots.rest.dto;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by yashika on 4/12/17.
 */
public class ReturnAddressDetailsDTO {

    private String name;
    private String firstLine;
    private String secondLine;
    private String landmark;
    private String locality;
    private String city;
    private String state;
    private String country;
    private String pincode;

    public ReturnAddressDetailsDTO(JSONObject returnFc) throws JSONException {
        if(StringUtils.isNotBlank(returnFc.getString("soldBy"))){
            this.name = returnFc.getString("soldBy");
        }
        if(StringUtils.isNotBlank(returnFc.getString("streetNo"))){
            this.firstLine = returnFc.getString("streetNo");
        }
        if(StringUtils.isNotBlank(returnFc.getString("streetName"))){
            this.secondLine = returnFc.getString("streetName");
        }
        if(StringUtils.isNotBlank(returnFc.getString("town"))){
            this.locality = returnFc.getString("town");
        }
        if(StringUtils.isNotBlank(returnFc.getString("city"))){
            this.city = returnFc.getString("city");
        }
        if(StringUtils.isNotBlank(returnFc.getString("state"))){
            this.state = returnFc.getString("state");
        }
        if(StringUtils.isNotBlank(returnFc.getString("country"))){
            this.country = returnFc.getString("country");
        }
        if(StringUtils.isNotBlank(returnFc.getString("postCode"))){
            this.pincode = returnFc.getString("postCode");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
