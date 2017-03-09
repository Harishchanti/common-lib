package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A ReturnFulfillmentCenterMapping.
 */
@Entity
@Table(name = "return_fulfillment_center_mapping")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnFulfillmentCenterMapping implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "entity_type")
    private String entityType;
    
    @Column(name = "fc_id")
    private String fcId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntityType() {
        return entityType;
    }
    
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getFcId() {
        return fcId;
    }
    
    public void setFcId(String fcId) {
        this.fcId = fcId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReturnFulfillmentCenterMapping returnFulfillmentCenterMapping = (ReturnFulfillmentCenterMapping) o;
        if(returnFulfillmentCenterMapping.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, returnFulfillmentCenterMapping.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnFulfillmentCenterMapping{" +
            "id=" + id +
            ", entityType='" + entityType + "'" +
            ", fcId='" + fcId + "'" +
            '}';
    }
}
