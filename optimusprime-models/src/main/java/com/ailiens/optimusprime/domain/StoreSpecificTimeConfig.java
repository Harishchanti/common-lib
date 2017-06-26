package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A StoreSpecificTimeConfig.
 */
@Entity
@Table(name = "store_specific_time_config")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class StoreSpecificTimeConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fc_id")
    private String fcId;

    @Column(name = "standard_time")
    private Integer standardTime;

    @Column(name = "ndd_time")
    private Integer nddTime;

    @Column(name = "sdd_time")
    private Integer sddTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFcId() {
        return fcId;
    }

    public StoreSpecificTimeConfig fcId(String fcId) {
        this.fcId = fcId;
        return this;
    }

    public void setFcId(String fcId) {
        this.fcId = fcId;
    }

    public Integer getStandardTime() {
        return standardTime;
    }

    public StoreSpecificTimeConfig standardTime(Integer standardTime) {
        this.standardTime = standardTime;
        return this;
    }

    public void setStandardTime(Integer standardTime) {
        this.standardTime = standardTime;
    }

    public Integer getNddTime() {
        return nddTime;
    }

    public StoreSpecificTimeConfig nddTime(Integer nddTime) {
        this.nddTime = nddTime;
        return this;
    }

    public void setNddTime(Integer nddTime) {
        this.nddTime = nddTime;
    }

    public Integer getSddTime() {
        return sddTime;
    }

    public StoreSpecificTimeConfig sddTime(Integer sddTime) {
        this.sddTime = sddTime;
        return this;
    }

    public void setSddTime(Integer sddTime) {
        this.sddTime = sddTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StoreSpecificTimeConfig storeSpecificTimeConfig = (StoreSpecificTimeConfig) o;
        if(storeSpecificTimeConfig.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, storeSpecificTimeConfig.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "StoreSpecificTimeConfig{" +
            "id=" + id +
            ", fcId='" + fcId + "'" +
            ", standardTime='" + standardTime + "'" +
            ", nddTime='" + nddTime + "'" +
            ", sddTime='" + sddTime + "'" +
            '}';
    }
}
