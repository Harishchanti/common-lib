package com.ail.mbo.bumblebee.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A ClientWarehouseNames.
 */
@Entity
@Table(name = "CLIENTWAREHOUSENAMES")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ClientWarehouseNames implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fcid")
    private String fcid;

    @Column(name = "courier_name")
    private String courierName;

    @Column(name = "service_type")
    private String serviceType;

    @Column(name = "value")
    private String value;

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

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ClientWarehouseNames clientWarehouseNames = (ClientWarehouseNames) o;

        if ( ! Objects.equals(id, clientWarehouseNames.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ClientWarehouseNames{" +
                "id=" + id +
                ", fcid='" + fcid + "'" +
                ", courierName='" + courierName + "'" +
                ", serviceType='" + serviceType + "'" +
                ", value='" + value + "'" +
                '}';
    }
}
