package com.ailiens.common;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Brand.
 */
@Entity
@Table(name = "brand")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName="brand")
public class Brand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "fc_id")
    private String fcId;

    @ManyToOne
    private FCDetails fCDetails;

    @ManyToOne
    private MasterBrand masterBrand;

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

    public FCDetails getFCDetails() {
        return fCDetails;
    }

    public void setFCDetails(FCDetails fCDetails) {
        this.fCDetails = fCDetails;
    }

    public MasterBrand getMasterBrand() {
        return masterBrand;
    }

    public void setMasterBrand(MasterBrand masterBrand) {
        this.masterBrand = masterBrand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Brand brand = (Brand) o;

        if ( ! Objects.equals(id, brand.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", fcId='" + fcId + "'" +
                '}';
    }
}
