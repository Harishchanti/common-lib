package com.ailiens.common;


import com.ailiens.common.dto.BrandMetaDataDTO;
import com.ailiens.common.dto.EntityMetaDataDTO;
import com.ailiens.common.enumeration.FCTypes;
import com.ailiens.common.enumeration.OpsTypes;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FCDetailsMetaData implements Serializable {

	private Long id;

	private String fcId;

	private String sapCode;

	private String fcName;

	private String streetNo;

	private String streetName;

	private String town;

	private String postCode;

	private String city;

	private String state;

	private String country;

	private Float latitude;

	private Float longitude;

	private Integer openingHours;

	private Integer openingMins;

	private Integer closingHours;

	private Integer closingMins;

	private String workingDays;

	private Integer holidays;

	private Boolean storeEnabled;

	private Boolean returnEnabled;

	private Integer capacity;

	private FCTypes fcType;

	private OpsTypes operatingType;

	private String cinNo;

	private String tinNo;

	private String panNo;

	private String contactNo;

	private String contactPerson;

	private Integer dailyorderVolume;

	private Integer dailyorderQty;

	private Integer buffer;

	private Boolean cutoffInclusive;

	private String soldBy;

	private String syncStartTime;

	private String syncEndTime;

	private String storeEmailId;

    private String ivrPhoneNumber;

    private Boolean ivrEnabled;

    private String returnFcId;

    private BigDecimal marginalCost;

	private Set<Brand> brands = new HashSet<>();

	private Set<Staff> staffs = new HashSet<>();

	private MultiBrand multiBrand = new MultiBrand();

	private Warehouse warehouse = new Warehouse();

	private Store store = new Store();

	private EntityType entityType = new EntityType();

	List<BrandMetaDataDTO> brandMetaData = new ArrayList<BrandMetaDataDTO>();

	List<EntityMetaDataDTO> entityMetaData = new ArrayList<EntityMetaDataDTO>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFcId() {
		return fcId;
	}

	public void setFcId(String fcId) {
		this.fcId = fcId;
	}

	public String getSapCode() {
		return sapCode;
	}

	public void setSapCode(String sapCode) {
		this.sapCode = sapCode;
	}

	public String getFcName() {
		return fcName;
	}

	public void setFcName(String fcName) {
		this.fcName = fcName;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
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

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public Integer getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(Integer openingHours) {
		this.openingHours = openingHours;
	}

	public Integer getOpeningMins() {
		return openingMins;
	}

	public void setOpeningMins(Integer openingMins) {
		this.openingMins = openingMins;
	}

	public Integer getClosingHours() {
		return closingHours;
	}

	public void setClosingHours(Integer closingHours) {
		this.closingHours = closingHours;
	}

	public Integer getClosingMins() {
		return closingMins;
	}

	public void setClosingMins(Integer closingMins) {
		this.closingMins = closingMins;
	}

	public String getWorkingDays() {
		return workingDays;
	}

	public void setWorkingDays(String workingDays) {
		this.workingDays = workingDays;
	}

	public Integer getHolidays() {
		return holidays;
	}

	public void setHolidays(Integer holidays) {
		this.holidays = holidays;
	}

	public Boolean getStoreEnabled() {
		return storeEnabled;
	}

	public void setStoreEnabled(Boolean storeEnabled) {
		this.storeEnabled = storeEnabled;
	}

	public Boolean getReturnEnabled() {
		return returnEnabled;
	}

	public void setReturnEnabled(Boolean returnEnabled) {
		this.returnEnabled = returnEnabled;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public FCTypes getFcType() {
		return fcType;
	}

	public void setFcType(FCTypes fcType) {
		this.fcType = fcType;
	}

	public OpsTypes getOperatingType() {
		return operatingType;
	}

	public void setOperatingType(OpsTypes operatingType) {
		this.operatingType = operatingType;
	}

	public String getCinNo() {
		return cinNo;
	}

	public void setCinNo(String cinNo) {
		this.cinNo = cinNo;
	}

	public String getTinNo() {
		return tinNo;
	}

	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Integer getDailyorderVolume() {
		return dailyorderVolume;
	}

	public void setDailyorderVolume(Integer dailyorderVolume) {
		this.dailyorderVolume = dailyorderVolume;
	}

	public Integer getDailyorderQty() {
		return dailyorderQty;
	}

	public void setDailyorderQty(Integer dailyorderQty) {
		this.dailyorderQty = dailyorderQty;
	}

	public Integer getBuffer() {
		return buffer;
	}

	public void setBuffer(Integer buffer) {
		this.buffer = buffer;
	}

	public Boolean getCutoffInclusive() {
		return cutoffInclusive;
	}

	public void setCutoffInclusive(Boolean cutoffInclusive) {
		this.cutoffInclusive = cutoffInclusive;
	}

	public String getSoldBy() {
		return soldBy;
	}

	public void setSoldBy(String soldBy) {
		this.soldBy = soldBy;
	}

	public String getSyncStartTime() {
		return syncStartTime;
	}

	public void setSyncStartTime(String syncStartTime) {
		this.syncStartTime = syncStartTime;
	}

	public String getSyncEndTime() {
		return syncEndTime;
	}

	public void setSyncEndTime(String syncEndTime) {
		this.syncEndTime = syncEndTime;
	}

	public String getStoreEmailId() {
		return storeEmailId;
	}

	public void setStoreEmailId(String storeEmailId) {
		this.storeEmailId = storeEmailId;
	}

	public String getIvrPhoneNumber() {
		return ivrPhoneNumber;
	}

	public void setIvrPhoneNumber(String ivrPhoneNumber) {
		this.ivrPhoneNumber = ivrPhoneNumber;
	}

	public Boolean getIvrEnabled() {
		return ivrEnabled;
	}

	public void setIvrEnabled(Boolean ivrEnabled) {
		this.ivrEnabled = ivrEnabled;
	}

	public String getReturnFcId() {
		return returnFcId;
	}

	public void setReturnFcId(String returnFcId) {
		this.returnFcId = returnFcId;
	}

	public BigDecimal getMarginalCost() {
		return marginalCost;
	}

	public void setMarginalCost(BigDecimal marginalCost) {
		this.marginalCost = marginalCost;
	}

	public Set<Brand> getBrands() {
		return brands;
	}

	public void setBrands(Set<Brand> brands) {
		this.brands = brands;
	}

	public Set<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(Set<Staff> staffs) {
		this.staffs = staffs;
	}

	public MultiBrand getMultiBrand() {
		return multiBrand;
	}

	public void setMultiBrand(MultiBrand multiBrand) {
		this.multiBrand = multiBrand;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}

	public List<BrandMetaDataDTO> getBrandMetaData() {
		return brandMetaData;
	}

	public void setBrandMetaData(List<BrandMetaDataDTO> brandMetaData) {
		this.brandMetaData = brandMetaData;
	}

	public List<EntityMetaDataDTO> getEntityMetaData() {
		return entityMetaData;
	}

	public void setEntityMetaData(List<EntityMetaDataDTO> entityMetaData) {
		this.entityMetaData = entityMetaData;
	}

	@Override
	public String toString() {
		return "FCDetailsMetaData [id=" + id + ", fcId=" + fcId + ", sapCode=" + sapCode + ", fcName=" + fcName
				+ ", streetNo=" + streetNo + ", streetName=" + streetName + ", town=" + town + ", postCode=" + postCode
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", openingHours=" + openingHours + ", openingMins=" + openingMins
				+ ", closingHours=" + closingHours + ", closingMins=" + closingMins + ", workingDays=" + workingDays
				+ ", holidays=" + holidays + ", storeEnabled=" + storeEnabled + ", returnEnabled=" + returnEnabled
				+ ", capacity=" + capacity + ", fcType=" + fcType + ", operatingType=" + operatingType + ", cinNo="
				+ cinNo + ", tinNo=" + tinNo + ", panNo=" + panNo + ", contactNo=" + contactNo + ", contactPerson="
				+ contactPerson + ", dailyorderVolume=" + dailyorderVolume + ", dailyorderQty=" + dailyorderQty
				+ ", buffer=" + buffer + ", cutoffInclusive=" + cutoffInclusive + ", soldBy=" + soldBy
				+ ", syncStartTime=" + syncStartTime + ", syncEndTime=" + syncEndTime + ", storeEmailId=" + storeEmailId
				+ ", ivrPhoneNumber=" + ivrPhoneNumber + ", ivrEnabled=" + ivrEnabled + ", returnFcId=" + returnFcId
				+ ", marginalCost=" + marginalCost + ", brands=" + brands + ", staffs=" + staffs + ", multiBrand="
				+ multiBrand + ", warehouse=" + warehouse + ", store=" + store + ", entityType=" + entityType
				+ ", brandMetaData=" + brandMetaData + ", entityMetaData=" + entityMetaData + "]";
	}
}
