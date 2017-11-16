package com.ail.mbo.bumblebee.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Store_pincode_distance.
 */
@Entity
@Table(name = "STORE_PINCODE_DISTANCE")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Store_pincode_distance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "geo_latitude")
    private String geo_latitude;

    @Column(name = "geo_longitude")
    private String geo_longitude;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "distance")
    private Integer distance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGeo_latitude() {
        return geo_latitude;
    }

    public void setGeo_latitude(String geo_latitude) {
        this.geo_latitude = geo_latitude;
    }

    public String getGeo_longitude() {
        return geo_longitude;
    }

    public void setGeo_longitude(String geo_longitude) {
        this.geo_longitude = geo_longitude;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Store_pincode_distance store_pincode_distance = (Store_pincode_distance) o;

        if ( ! Objects.equals(id, store_pincode_distance.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Store_pincode_distance{" +
                "id=" + id +
                ", geo_latitude='" + geo_latitude + "'" +
                ", geo_longitude='" + geo_longitude + "'" +
                ", pincode='" + pincode + "'" +
                ", distance='" + distance + "'" +
                '}';
    }
}
