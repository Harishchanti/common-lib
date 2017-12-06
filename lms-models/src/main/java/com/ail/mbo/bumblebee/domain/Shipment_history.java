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
import java.io.Serializable;
import java.util.Objects;

/**
 * A Shipment_history.
 */
@Entity
@Table(name = "SHIPMENT_HISTORY")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Shipment_history implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "awbno")
    private String awbno;

    @Column(name = "threepl_reason_code")
    private String threepl_reason_code;

    @Column(name = "ail_status")
    private String ail_status;

    @Column(name = "threepl_status")
    private String threepl_status;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "ail_status_time")
    private DateTime ail_status_time;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "threepl_status_time")
    private DateTime threepl_status_time;

    @Column(name = "delivery_attempt")
    private Integer delivery_attempt;

    @Column(name = "courier")
    private String courier;

    @Column(name = "shipment_id")
    private String shipmentId;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "last_updated_time")
    private DateTime lastUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAwbno() {
        return awbno;
    }

    public void setAwbno(String awbno) {
        this.awbno = awbno;
    }

    public String getThreepl_reason_code() {
        return threepl_reason_code;
    }

    public void setThreepl_reason_code(String threepl_reason_code) {
        this.threepl_reason_code = threepl_reason_code;
    }

    public String getAil_status() {
        return ail_status;
    }

    public void setAil_status(String ail_status) {
        this.ail_status = ail_status;
    }

    public String getThreepl_status() {
        return threepl_status;
    }

    public void setThreepl_status(String threepl_status) {
        this.threepl_status = threepl_status;
    }

    public DateTime getAil_status_time() {
        return ail_status_time;
    }

    public void setAil_status_time(DateTime ail_status_time) {
        this.ail_status_time = ail_status_time;
    }

    public DateTime getThreepl_status_time() {
        return threepl_status_time;
    }

    public void setThreepl_status_time(DateTime threepl_status_time) {
        this.threepl_status_time = threepl_status_time;
    }

    public Integer getDelivery_attempt() {
        return delivery_attempt;
    }

    public void setDelivery_attempt(Integer delivery_attempt) {
        this.delivery_attempt = delivery_attempt;
    }

    public String getcourier() {
        return courier;
    }

    public void setcourier(String courier) {
        this.courier = courier;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public DateTime getLastUpdatedTime() {
        return lastUpdateTime;
    }

    public void setLastUpdatedTime(DateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Shipment_history shipment_history = (Shipment_history) o;

        if ( ! Objects.equals(id, shipment_history.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Shipment_history{" +
                "id=" + id +
                ", awbno='" + awbno + "'" +
                ", threepl_reason_code='" + threepl_reason_code + "'" +
                ", ail_status='" + ail_status + "'" +
                ", threepl_status='" + threepl_status + "'" +
                ", ail_status_time='" + ail_status_time + "'" +
                ", threepl_status_time='" + threepl_status_time + "'" +
                ", delivery_attempt='" + delivery_attempt + "'" +
                ", courier='" + courier + "'" +
                ", shipmentId='" + shipmentId + "'" +
                ", lastUpdateTime='" + lastUpdateTime + "'" +
                '}';
    }
}
