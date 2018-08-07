package com.ailiens.optimusprime.autobots.rest.dto.LMSDTOs;

import org.json.JSONException;
import org.json.JSONObject;

public class Customer {
    private CustomerAddress address;
    private String title = "";
    private String mobile;
    private String alternateNumber;
    private String name;
    private String primaryNumber;

    public String getAlternateNumber() {
        return alternateNumber;
    }
    public void setAlternateNumber(String alternateNumber) {
        this.alternateNumber = alternateNumber;
    }
    public CustomerAddress getAddress() {
        return address;
    }
    public void setAddress(CustomerAddress address) {
        this.address = address;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryNumber() {
        return primaryNumber;
    }

    public void setPrimaryNumber(String primaryNumber) {
        this.primaryNumber = primaryNumber;
    }

    public Customer() {
        
    }

    public Customer(JSONObject addressDetails, String primaryNumber) {

        if(addressDetails != null) {

            try {

                this.mobile = addressDetails.getString("mobileNumber");
                this.alternateNumber = addressDetails.getString("alternateMobileNumber");
                this.primaryNumber = primaryNumber;
                this.name = addressDetails.getString("name");
                this.address = new CustomerAddress(addressDetails);

            }catch (JSONException e) {
                e.printStackTrace();
            }


        }
    }
}
