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
 * A Dest_pincode.
 */
@Entity
@Table(name = "DEST_PINCODE")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Dest_pincode implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 6, max = 6)
    @Column(name = "pincode", length = 6, nullable = false)
    private String pincode;

    @ManyToOne
    private Area pincode_area;

    @ManyToOne
    private City pincode_city;

    @ManyToOne
    private Areacity_code areacity_code;

    @ManyToOne
    private State pincode_state;

    @ManyToOne
    private Region pincode_region;

    @ManyToOne
    private Country pincode_country;

    @ManyToOne
    private Dest_cluster dest_cluster;

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

    public Area getPincode_area() {
        return pincode_area;
    }

    public void setPincode_area(Area area) {
        this.pincode_area = area;
    }

    public City getPincode_city() {
        return pincode_city;
    }

    public void setPincode_city(City city) {
        this.pincode_city = city;
    }

    public Areacity_code getAreacity_code() {
        return areacity_code;
    }

    public void setAreacity_code(Areacity_code city) {
        this.areacity_code = city;
    }

    public State getPincode_state() {
        return pincode_state;
    }

    public void setPincode_state(State state) {
        this.pincode_state = state;
    }

    public Region getPincode_region() {
        return pincode_region;
    }

    public void setPincode_region(Region region) {
        this.pincode_region = region;
    }

    public Country getPincode_country() {
        return pincode_country;
    }

    public void setPincode_country(Country country) {
        this.pincode_country = country;
    }

    public Dest_cluster getDest_cluster() {
        return dest_cluster;
    }

    public void setDest_cluster(Dest_cluster dest_cluster) {
        this.dest_cluster = dest_cluster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Dest_pincode dest_pincode = (Dest_pincode) o;

        if ( ! Objects.equals(id, dest_pincode.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Dest_pincode{" +
                "id=" + id +
                ", pincode='" + pincode + "'" +
                '}';
    }
}
