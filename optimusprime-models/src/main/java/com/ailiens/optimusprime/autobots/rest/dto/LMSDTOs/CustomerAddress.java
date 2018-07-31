package com.ailiens.optimusprime.autobots.rest.dto.LMSDTOs;

import com.hazelcast.util.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomerAddress {
    private String addressline1;
    private String addressline2;
    private String postcode;
    private String country;
    private String city;
    private String landmark;

    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddressline1() {
        return addressline1;
    }
    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }
    public String getAddressline2() {
        return addressline2;
    }
    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public CustomerAddress(JSONObject addressDetails)
    {
            if(addressDetails != null) {

                try {
                    this.addressline1 = addressDetails.getString("firstLine");

                    if (!addressDetails.isNull("secondLine")) {
                        if (!addressDetails.isNull("secondLine")) {
                            this.addressline2 = addressDetails.getString("secondLine");
                        } else {
                            this.addressline2 = "";
                        }
                        if (addressDetails.has("landmark")) {
                            this.landmark = addressDetails.getString("landmark");
                        }
                        this.postcode = addressDetails.getString("pincode");
                        this.city = addressDetails.getString("city");
                        this.country = addressDetails.getString("country");

                    }

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
    }



}
