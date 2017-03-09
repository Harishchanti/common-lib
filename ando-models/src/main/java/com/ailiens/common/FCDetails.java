package com.ailiens.common;


import com.ailiens.common.enumeration.FCTypes;
import com.ailiens.common.enumeration.OpsTypes;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A FCDetails.
 */
@Entity
@Table(name = "fcdetails")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "fcdetails")
public class FCDetails implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "fc_id")
	private String fcId;

	@Column(name = "sap_code")
	private String sapCode;

	@Column(name = "fc_name")
	private String fcName;

	@Size(min = 0, max = 35)
	@Column(name = "street_no", length = 35)
	private String streetNo;

	@Size(min = 0, max = 35)
	@Column(name = "street_name", length = 35)
	private String streetName;

	@Column(name = "town")
	private String town;

	@Column(name = "post_code")
	private String postCode;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "latitude")
	private Float latitude;

	@Column(name = "longitude")
	private Float longitude;

	@Min(0)
	@Max(24)
	@Column(name = "opening_hours")
	private Integer openingHours;

	@Min(0)
	@Max(59)
	@Column(name = "opening_mins")
	private Integer openingMins;

	@Min(0)
	@Max(24)
	@Column(name = "closing_hours")
	private Integer closingHours;

	@Min(0)
	@Max(59)
	@Column(name = "closing_mins")
	private Integer closingMins;

	@Column(name = "working_days")
	private String workingDays;

	@Column(name = "holidays")
	private Integer holidays;

	@Column(name = "store_enabled")
	private Boolean storeEnabled;

	@Column(name = "return_enabled")
	private Boolean returnEnabled;

	@Column(name = "capacity")
	private Integer capacity;

	@Enumerated(EnumType.STRING)
	@Column(name = "fc_type")
	private FCTypes fcType;

	@Enumerated(EnumType.STRING)
	@Column(name = "operating_type")
	private OpsTypes operatingType;

	@Column(name = "cin_no")
	private String cinNo;

	@Column(name = "tin_no")
	private String tinNo;

	@Column(name = "pan_no")
	private String panNo;

	@Column(name = "contact_no")
	private String contactNo;

	@Column(name = "contact_person")
	private String contactPerson;

	@Column(name = "dailyorder_volume")
	private Integer dailyorderVolume;

	@Column(name = "dailyorder_qty")
	private Integer dailyorderQty;

	@Column(name = "buffer")
	private Integer buffer;

	@Column(name = "cutoff_inclusive",columnDefinition=" default 'true'")
    private Boolean cutoffInclusive;

	@Column(name = "sold_by")
	private String soldBy;

	@Column(name = "sync_start_time")
	private String syncStartTime;

	@Column(name = "sync_end_time")
	private String syncEndTime;

	@Column(name = "store_email_id")
    private String storeEmailId;

    @Column(name = "ivr_phone_number")
    private String ivrPhoneNumber;

    @Column(name = "ivr_enabled")
    private Boolean ivrEnabled;

    @Column(name = "return_fc_id")
    private String returnFcId;

	@NotNull
	@Min(value = 0)
	@Max(value = 100)
	@Column(name = "marginal_cost", precision = 5, scale = 2, nullable = false)
	private BigDecimal marginalCost;

	@OneToMany(mappedBy = "fCDetails")
	// @JsonIgnore
	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	private Set<Brand> brands = new HashSet<>();

	@OneToMany(mappedBy = "fCDetails")
	// @JsonIgnore
	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	private Set<Staff> staffs = new HashSet<>();

	@OneToOne
	private MultiBrand multiBrand;

	@OneToOne
	private Warehouse warehouse;

	@OneToOne
	private Store store;

	@ManyToOne
	private EntityType entityType;

	public String getReturnFcId() {
		return returnFcId;
	}

	public void setReturnFcId(String returnFcId) {
		this.returnFcId = returnFcId;
	}

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

	public Integer getBuffer() {
        return buffer;
    }

    public void setBuffer(Integer buffer) {
        this.buffer = buffer;
    }

	public EntityType getEntityType() {
		return entityType;
	}

	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
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

	public Boolean getCutoffInclusive() {
        return cutoffInclusive;
    }

    public void setCutoffInclusive(Boolean cutoffInclusive) {
        this.cutoffInclusive = cutoffInclusive;
    }

	public Boolean getIvrEnabled() {
		return ivrEnabled;
	}

	public void setIvrEnabled(Boolean ivrEnabled) {
		this.ivrEnabled = ivrEnabled;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		FCDetails fCDetails = (FCDetails) o;

		if (!Objects.equals(id, fCDetails.id))
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	public BigDecimal getMarginalCost() {
		return marginalCost;
	}

	public void setMarginalCost(BigDecimal marginalCost) {
		this.marginalCost = marginalCost;
	}

	@PrePersist
	public void initialize() {
		if (this.storeEnabled == null) {
			this.storeEnabled = false;
		}

	}

	@Override
	public String toString() {
		return "FCDetails [id=" + id + ", fcId=" + fcId + ", sapCode=" + sapCode + ", fcName=" + fcName + ", streetNo="
				+ streetNo + ", streetName=" + streetName + ", town=" + town + ", postCode=" + postCode + ", city="
				+ city + ", state=" + state + ", country=" + country + ", latitude=" + latitude + ", longitude="
				+ longitude + ", openingHours=" + openingHours + ", openingMins=" + openingMins + ", closingHours="
				+ closingHours + ", closingMins=" + closingMins + ", workingDays=" + workingDays + ", holidays="
				+ holidays + ", storeEnabled=" + storeEnabled + ", returnEnabled=" + returnEnabled + ", capacity="
				+ capacity + ", fcType=" + fcType + ", operatingType=" + operatingType + ", cinNo=" + cinNo + ", tinNo="
				+ tinNo + ", panNo=" + panNo + ", contactNo=" + contactNo + ", contactPerson=" + contactPerson
				+ ", dailyorderVolume=" + dailyorderVolume + ", dailyorderQty=" + dailyorderQty + ", buffer=" + buffer
				+ ", cutoffInclusive=" + cutoffInclusive + ", soldBy=" + soldBy + ", syncStartTime=" + syncStartTime
				+ ", syncEndTime=" + syncEndTime + ", storeEmailId=" + storeEmailId + ", ivrPhoneNumber="
				+ ivrPhoneNumber + ", ivrEnabled=" + ivrEnabled + ", returnFcId=" + returnFcId + ", marginalCost="
				+ marginalCost + ", brands=" + brands + ", staffs=" + staffs + ", multiBrand=" + multiBrand
				+ ", warehouse=" + warehouse + ", store=" + store + ", entityType=" + entityType + "]";
	}

}
