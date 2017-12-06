package com.ail.mbo.bumblebee.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A ServiceTypeCutoff.
 */
@Entity
@Table(name = "SERVICETYPECUTOFF")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ServiceTypeCutoff implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cutoff")
    private String cutoff;

    @ManyToOne
    private City source_city;

    @ManyToOne
    private City destination_city;

    @ManyToOne
    private Service_type service_type;

    @ManyToOne
    private Courier courier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCutoff() {
        return cutoff;
    }

    public void setCutoff(String cutoff) {
        this.cutoff = cutoff;
    }

    public City getSource_city() {
        return source_city;
    }

    public void setSource_city(City city) {
        this.source_city = city;
    }

    public City getDestination_city() {
        return destination_city;
    }

    public void setDestination_city(City city) {
        this.destination_city = city;
    }

    public Service_type getService_type() {
        return service_type;
    }

    public void setService_type(Service_type service_type) {
        this.service_type = service_type;
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

        ServiceTypeCutoff serviceTypeCutoff = (ServiceTypeCutoff) o;

        if ( ! Objects.equals(id, serviceTypeCutoff.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ServiceTypeCutoff{" +
                "id=" + id +
                ", cutoff='" + cutoff + "'" +
                '}';
    }
}
