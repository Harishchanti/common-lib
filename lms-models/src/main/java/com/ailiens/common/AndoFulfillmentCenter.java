
package com.ailiens.common;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "fcId",
    "sapCode",
    "fcName",
    "streetNo",
    "streetName",
    "town",
    "postCode",
    "city",
    "state",
    "country",
    "latitude",
    "longitude",
    "openingHours",
    "openingMins",
    "closingHours",
    "closingMins",
    "workingDays",
    "holidays",
    "storeEnabled",
    "fcType",
    "contactNo",
    "contactPerson",
    "operatingType",
    "tinNo"
})

public class AndoFulfillmentCenter {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("fcId")
    private String fcId;
    @JsonProperty("sapCode")
    private String sapCode;
    @JsonProperty("fcName")
    private String fcName;
    @JsonProperty("streetNo")
    private String streetNo;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("town")
    private String town;
    @JsonProperty("postCode")
    private String postCode;
    @JsonProperty("city")
    private String city;
    @JsonProperty("state")
    private String state;
    @JsonProperty("country")
    private String country;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("openingHours")
    private Integer openingHours;
    @JsonProperty("closingHours")
    private Integer closingHours;
    @JsonProperty("openingMins")
    private Integer openingMins;
    @JsonProperty("closingMins")
    private Integer closingMins;
    @JsonProperty("workingDays")
    private String workingDays;
    @JsonProperty("holidays")
    private Integer holidays;
    @JsonProperty("storeEnabled")
    private Boolean storeEnabled;
    @JsonProperty("fcType")
    private String fcType;
    @JsonProperty("operatingType")
    private String operatingType;
    @JsonProperty("contactNo")
    private String contactNo;
    @JsonProperty("contactPerson")
    private String contactPerson;
    @JsonProperty("tinNo")
    private String tinNo;

    @JsonProperty("contactNo")
    public String getContactNo() {
		return contactNo;
	}
    @JsonProperty("contactNo")
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
    @JsonProperty("tinNo")
    public String getTinNo() {
		return tinNo;
	}
    @JsonProperty("tinNo")
	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
	}
    @JsonProperty("contactPerson")
	public String getContactPerson() {
		return contactPerson;
	}
    @JsonProperty("contactPerson")
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     *     The fcId
     */
    @JsonProperty("fcId")
    public String getFcId() {
        return fcId;
    }

    /**
     *
     * @param fcId
     *     The fcId
     */
    @JsonProperty("fcId")
    public void setFcId(String fcId) {
        this.fcId = fcId;
    }

    /**
     *
     * @return
     *     The sapCode
     */
    @JsonProperty("sapCode")
    public String getSapCode() {
        return sapCode;
    }

    /**
     *
     * @param sapCode
     *     The sapCode
     */
    @JsonProperty("sapCode")
    public void setSapCode(String sapCode) {
        this.sapCode = sapCode;
    }

    /**
     *
     * @return
     *     The fcName
     */
    @JsonProperty("fcName")
    public String getFcName() {
        return fcName;
    }

    /**
     *
     * @param fcName
     *     The fcName
     */
    @JsonProperty("fcName")
    public void setFcName(String fcName) {
        this.fcName = fcName;
    }

    /**
     *
     * @return
     *     The streetNo
     */
    @JsonProperty("streetNo")
    public String getStreetNo() {
        return streetNo;
    }

    /**
     *
     * @param streetNo
     *     The streetNo
     */
    @JsonProperty("streetNo")
    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    /**
     *
     * @return
     *     The streetName
     */
    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    /**
     *
     * @param streetName
     *     The streetName
     */
    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     *
     * @return
     *     The town
     */
    @JsonProperty("town")
    public String getTown() {
        return town;
    }

    /**
     *
     * @param town
     *     The town
     */
    @JsonProperty("town")
    public void setTown(String town) {
        this.town = town;
    }

    /**
     *
     * @return
     *     The postCode
     */
    @JsonProperty("postCode")
    public String getPostCode() {
        return postCode;
    }

    /**
     *
     * @param postCode
     *     The postCode
     */
    @JsonProperty("postCode")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     *
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return
     *     The country
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     *     The country
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     *     The longitude
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     *     The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     *     The openingHours
     */
    @JsonProperty("openingHours")
    public Integer getOpeningHours() {
        return openingHours;
    }

    /**
     *
     * @param openingHours
     *     The openingHours
     */
    @JsonProperty("openingHours")
    public void setOpeningHours(Integer openingHours) {
        this.openingHours = openingHours;
    }

    /**
     *
     * @return
     *     The openingMins
     */
    @JsonProperty("openingMins")
    public Integer getOpeningMins() {
        return openingMins;
    }

    /**
     *
     * @param openingMins
     *     The openingMins
     */
    @JsonProperty("openingMins")
    public void setOpeningMins(Integer openingMins) {
        this.openingMins = openingMins;
    }


    /**
     *
     * @return
     *     The closingHours
     */
    @JsonProperty("closingHours")
    public Integer getClosingHours() {
        return closingHours;
    }

    /**
     *
     * @param closingHours
     *     The closingHours
     */
    @JsonProperty("closingHours")
    public void setClosingHours(Integer closingHours) {
        this.closingHours = closingHours;
    }

    /**
     *
     * @return
     *     The closingMins
     */
    @JsonProperty("closingMins")
    public Integer getClosingMins() {
        return closingMins;
    }

    /**
     *
     * @param closingMins
     *     The closingMins
     */
    @JsonProperty("closingMins")
    public void setClosingMins(Integer closingMins) {
        this.closingMins = closingMins;
    }

    /**
     *
     * @return
     *     The workingDays
     */
    @JsonProperty("workingDays")
    public String getWorkingDays() {
        return workingDays;
    }

    /**
     *
     * @param workingDays
     *     The workingDays
     */
    @JsonProperty("workingDays")
    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    /**
     *
     * @return
     *     The holidays
     */
    @JsonProperty("holidays")
    public Integer getHolidays() {
        return holidays;
    }

    /**
     *
     * @param holidays
     *     The holidays
     */
    @JsonProperty("holidays")
    public void setHolidays(Integer holidays) {
        this.holidays = holidays;
    }

    /**
     *
     * @return
     *     The storeEnabled
     */
    @JsonProperty("storeEnabled")
    public Boolean getStoreEnabled() {
        return storeEnabled;
    }

    /**
     *
     * @param storeEnabled
     *     The storeEnabled
     */
    @JsonProperty("storeEnabled")
    public void setStoreEnabled(Boolean storeEnabled) {
        this.storeEnabled = storeEnabled;
    }

    /**
     *
     * @return
     *     The fcType
     */
    @JsonProperty("fcType")
    public String getFcType() {
        return fcType;
    }

    /**
     *
     * @param fcType
     *     The fcType
     */
    @JsonProperty("fcType")
    public void setFcType(String fcType) {
        this.fcType = fcType;
    }

    /**
     *
     * @return
     *     The operatingType
     */
    @JsonProperty("operatingType")
    public String getOperatingType() {
        return operatingType;
    }

    /**
     *
     * @param operatingType
     *     The operatingType
     */
    @JsonProperty("operatingType")
    public void setOperatingType(String operatingType) {
        this.operatingType = operatingType;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
