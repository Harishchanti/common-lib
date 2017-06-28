package com.ailiens.common;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;

import com.ailiens.common.enumeration.*;
/**
 * A FCDetails.
 */
@Entity
@Table(name = "fcdetails_history")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "fcdetails_history")
public class FCDetailsHistory extends AbstractFCDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fcdetails_id")
    private Long fcdetailsId;

    @Enumerated(EnumType.STRING)
    @Column(name = "fc_type")
    private FCTypes fcType;

    @Enumerated(EnumType.STRING)
    @Column(name = "operating_type")
    private OpsTypes operatingType;

    @Column(name = "multi_brand_id")
    private Long multiBrand;

    @Column(name = "warehouse_id")
    private Long warehouse;

    @Column(name = "store_id")
    private Long store;

    @Column(name = "entity_type_id")
    private Long entityType;

    @Column(name = "franchise_info_id")
    private Long franchiseInfo;

    @Column(name = "last_modified_time")
    private String lastModifiedTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FCDetailsHistory that = (FCDetailsHistory) o;

        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    public String getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Long getFcdetailsId() {
        return fcdetailsId;
    }

    public void setFcdetailsId(Long fcdetailsId) {
        this.fcdetailsId = fcdetailsId;
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

    public Long getMultiBrand() {
        return multiBrand;
    }

    public void setMultiBrand(Long multiBrand) {
        this.multiBrand = multiBrand;
    }

    public Long getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse;
    }

    public Long getStore() {
        return store;
    }

    public void setStore(Long store) {
        this.store = store;
    }

    public Long getEntityType() {
        return entityType;
    }

    public void setEntityType(Long entityType) {
        this.entityType = entityType;
    }

    public Long getFranchiseInfo() {
        return franchiseInfo;
    }

    public void setFranchiseInfo(Long franchiseInfo) {
        this.franchiseInfo = franchiseInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
