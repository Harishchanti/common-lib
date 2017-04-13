package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by vaibhav on 27/10/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)

public class CommonAddressFields implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 8312968329439627454L;

    public String existingAddressId;

    //not mandatory
    //@Pattern(regexp = "[a-zA-Z\\s]{3,40}+|^[\\s]*$")
    public String name;

    @NotNull
    //@Pattern(regexp = "[A-Za-z0-9\\s@#/,-]{3,100}+")
    public String firstLine;

    //@Pattern(regexp = "[A-Za-z0-9\\s@#/,-]{3,100}+$|^$")
    public String secondLine;

    //@Pattern(regexp = "[A-Za-z0-9\\s@#,-]{0,100}+")
    public String landmark;

    //@Pattern(regexp = "[a-zA-Z\\s]{0,40}+")
    public String locality;

    //@Pattern(regexp = "[a-zA-Z0-9\\s@#,-]{0,100}+")
    public String description;

    public Geolocation geolocation;

    @NotNull
    //@Pattern(regexp = "[a-zA-Z\\s]{3,40}+")
    public String city;

    @NotNull
    //@Pattern(regexp = "[a-zA-Z\\s]{3,40}+")
    public String state;

    @NotNull
    //@Pattern(regexp = "[a-zA-Z]{3,40}+")
    public String country;

    @NotNull
    //@Pattern(regexp = "[0-9]{5,6}+")
    public String pincode;


    //@Pattern(regexp = "[0-9]{5,20}+|^[\\s]*$")
    public String mobileNumber;

    public boolean isDefault;

    public boolean userEnabled;

    public boolean systemEnabled;

    @CreatedDate
    private String createdDate;

    @LastModifiedDate
    private String lastModifiedDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSystemEnabled() {
        return systemEnabled;
    }

    public void setSystemEnabled(boolean systemEnabled) {
        this.systemEnabled = systemEnabled;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @JsonIgnore
    public String getExistingAddressId() {
        return existingAddressId;
    }

    public void setExistingAddressId(String existingAddressId) {
        this.existingAddressId = existingAddressId;
    }

    public boolean isUserEnabled() {
        return userEnabled;
    }

    public void setUserEnabled(boolean userEnabled) {
        this.userEnabled = userEnabled;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    public String getState() {
        return state;
    }

    public void setState(String State) {
        this.state = State;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String Locality) {
        this.locality = Locality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String Country) {
        this.country = Country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

    @Override
    public String toString() {
        return "CommonAddressFields{" +
                "existingAddressId='" + existingAddressId + '\'' +
                ", name='" + name + '\'' +
                ", firstLine='" + firstLine + '\'' +
                ", secondLine='" + secondLine + '\'' +
                ", landmark='" + landmark + '\'' +
                ", locality='" + locality + '\'' +
                ", description='" + description + '\'' +
                ", geolocation=" + geolocation +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", isDefault=" + isDefault +
                ", userEnabled=" + userEnabled +
                ", systemEnabled=" + systemEnabled +
//                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                '}';
    }
}
