package com.ail.mbo.bumblebee.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ail.mbo.bumblebee.domain.util.CustomDateTimeDeserializer;
import com.ail.mbo.bumblebee.domain.util.CustomDateTimeSerializer;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Master_bag.
 */
@Entity
@Table(name = "MASTER_BAG")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Master_bag implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "code")
    private String code;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "creation_time")
    private DateTime creationTime;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "handover_time")
    private DateTime handoverTime;

    @Column(name = "status")
    private String status;

    @ManyToOne
    private Courier courier;

    @ManyToOne
    @JoinColumn(name="fulfillment_center_id")
    private Fulfillment_center fulfillmentCenter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(DateTime creationTime) {
        this.creationTime = creationTime;
    }

    public DateTime getHandoverTime() {
        return handoverTime;
    }

    public void setHandoverTime(DateTime handoverTime) {
        this.handoverTime = handoverTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Fulfillment_center getFulfillmentCenter() {
        return fulfillmentCenter;
    }

    public void setFulfillmentCenter(Fulfillment_center Fulfillment_center) {
        this.fulfillmentCenter = Fulfillment_center;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Master_bag master_bag = (Master_bag) o;

        if ( ! Objects.equals(id, master_bag.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Master_bag{" +
                "id=" + id +
                ", code='" + code + "'" +
                ", creationTime='" + creationTime + "'" +
                ", handoverTime='" + handoverTime + "'" +
                ", status='" + status + "'" +
                '}';
    }
}
