package com.ail.mbo.bumblebee.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Fulfillment_center.
 */
@Entity
@Table(name = "FULFILLMENT_CENTER")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Fulfillment_center implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "fcid", nullable = false)
    private String fcid;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "fc_type", nullable = false)
    private String fc_type;

    @NotNull
    @Column(name = "franchise", nullable = false)
    private String franchise;

    @Column(name = "address1")
    private String address1;

    @Column(name = "address2")
    private String address2;

    @Column(name = "address3")
    private String address3;

    @NotNull
    @Size(min = 6, max = 6)
    @Column(name = "pincode", length = 6, nullable = false)
    private String pincode;

    @NotNull
    @Column(name = "o2s_tat", nullable = false)
    private Integer o2s_tat;

    @Column(name = "is_enabled")
    private Boolean is_enabled;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "tin")
    private String tin;

    @Column(name = "geo_latitude")
    private String geoLatitude;

    @Column(name = "geo_longitude")
    private String geoLongitude;

    @Column(name = "time_open")
    private String timeOpen;

    @Column(name = "time_close")
    private String timeClose;

    @Column(name = "locality")
    private String locality;

    @Column(name = "Email")
    private String email;

    @ManyToOne
    private City fc_city;

    @ManyToOne
    private State fc_state;

    @ManyToOne
    private Source_cluster fc_cluster;
    
    @Column(name = "manifest_formate") 
    private String manifestFormate;
    
    public String getManifestFormate() {
		return manifestFormate;
	}

	public void setManifestFormate(String manifestFormate) {
		this.manifestFormate = manifestFormate;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFcid() {
        return fcid;
    }

    public void setFcid(String fcid) {
        this.fcid = fcid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFc_type() {
        return fc_type;
    }

    public void setFc_type(String fc_type) {
        this.fc_type = fc_type;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Integer geto2s_tat() {
        return o2s_tat;
    }

    public void seto2s_tat(Integer o2s_tat) {
        this.o2s_tat = o2s_tat;
    }

    public Boolean getIs_enabled() {
        return is_enabled;
    }

    public void setIs_enabled(Boolean is_enabled) {
        this.is_enabled = is_enabled;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getGeoLatitude() {
        return geoLatitude;
    }

    public void setGeoLatitude(String geoLatitude) {
        this.geoLatitude = geoLatitude;
    }

    public String getGeoLongitude() {
        return geoLongitude;
    }

    public void setGeoLongitude(String geoLongitude) {
        this.geoLongitude = geoLongitude;
    }

    public String getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(String timeOpen) {
        this.timeOpen = timeOpen;
    }

    public String getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(String timeClose) {
        this.timeClose = timeClose;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public City getFc_city() {
        return fc_city;
    }

    public void setFc_city(City city) {
        this.fc_city = city;
    }

    public State getFc_state() {
        return fc_state;
    }

    public void setFc_state(State state) {
        this.fc_state = state;
    }

    public Source_cluster getFc_cluster() {
        return fc_cluster;
    }

    public void setFc_cluster(Source_cluster source_cluster) {
        this.fc_cluster = source_cluster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Fulfillment_center fulfillment_center = (Fulfillment_center) o;

        if ( ! Objects.equals(id, fulfillment_center.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Fulfillment_center{" +
                "id=" + id +
                ", fcid='" + fcid + "'" +
                ", name='" + name + "'" +
                ", description='" + description + "'" +
                ", fc_type='" + fc_type + "'" +
                ", franchise='" + franchise + "'" +
                ", address1='" + address1 + "'" +
                ", address2='" + address2 + "'" +
                ", address3='" + address3 + "'" +
                ", pincode='" + pincode + "'" +
                ", o2s_tat='" + o2s_tat + "'" +
                ", is_enabled='" + is_enabled + "'" +
                ", contactName='" + contactName + "'" +
                ", phoneNumber='" + phoneNumber + "'" +
                ", tin='" + tin + "'" +
                ", geoLatitude='" + geoLatitude + "'" +
                ", geoLongitude='" + geoLongitude + "'" +
                ", timeOpen='" + timeOpen + "'" +
                ", timeClose='" + timeClose + "'" +
                ", locality='" + locality + "'" +
                ", email='" + email + "'" +
                '}';
    }
}
