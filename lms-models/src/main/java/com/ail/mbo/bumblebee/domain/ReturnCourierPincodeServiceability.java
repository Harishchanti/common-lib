package com.ail.mbo.bumblebee.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A ReturnCourierPincodeServiceability.
 */
@Entity
@Table(name = "RETURNCOURIERPINCODESERVICEABILITY")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnCourierPincodeServiceability implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 6, max = 6)
    @Column(name = "pincode", length = 6)
    private String pincode;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "dc_name")
    private String dcName;

    @Column(name = "dc_code")
    private String dcCode;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "area")
    private String area;

    @Column(name = "area_city_code")
    private String areaCityCode;

    @ManyToOne
    private Courier courier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }

    public String getDcCode() {
        return dcCode;
    }

    public void setDcCode(String dcCode) {
        this.dcCode = dcCode;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaCityCode() {
        return areaCityCode;
    }

    public void setAreaCityCode(String areaCityCode) {
        this.areaCityCode = areaCityCode;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReturnCourierPincodeServiceability returnCourierPincodeServiceability = (ReturnCourierPincodeServiceability) o;

        if ( ! Objects.equals(id, returnCourierPincodeServiceability.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnCourierPincodeServiceability{" +
                "id=" + id +
                ", pincode='" + pincode + "'" +
                ", capacity='" + capacity + "'" +
                ", dcName='" + dcName + "'" +
                ", dcCode='" + dcCode + "'" +
                ", city='" + city + "'" +
                ", state='" + state + "'" +
                ", country='" + country + "'" +
                ", area='" + area + "'" +
                ", areaCityCode='" + areaCityCode + "'" +
                '}';
    }
}
