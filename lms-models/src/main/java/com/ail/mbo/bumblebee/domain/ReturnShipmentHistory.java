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
 * A ReturnShipmentHistory.
 */
@Entity
@Table(name = "RETURNSHIPMENTHISTORY")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnShipmentHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "awb")
    private String awb;

    @Column(name = "three_pl_comment")
    private String threePlComment;

    @Column(name = "ail_status")
    private String ailStatus;

    @Column(name = "three_pl_status")
    private String threePlStatus;

    @Column(name = "delivery_attempt")
    private Integer deliveryAttempt;

    @Column(name = "consignment_id")
    private String consignmentId;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "ail_status_date_time")
    private DateTime ailStatusDateTime;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "three_pl_status_date_time")
    private DateTime threePlStatusDateTime;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "last_updated_date_time")
    private DateTime lastUpdatedDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public String getThreePlComment() {
        return threePlComment;
    }

    public void setThreePlComment(String threePlComment) {
        this.threePlComment = threePlComment;
    }

    public String getAilStatus() {
        return ailStatus;
    }

    public void setAilStatus(String ailStatus) {
        this.ailStatus = ailStatus;
    }

    public String getThreePlStatus() {
        return threePlStatus;
    }

    public void setThreePlStatus(String threePlStatus) {
        this.threePlStatus = threePlStatus;
    }

    public Integer getDeliveryAttempt() {
        return deliveryAttempt;
    }

    public void setDeliveryAttempt(Integer deliveryAttempt) {
        this.deliveryAttempt = deliveryAttempt;
    }

    public String getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(String consignmentId) {
        this.consignmentId = consignmentId;
    }

    public DateTime getAilStatusDateTime() {
        return ailStatusDateTime;
    }

    public void setAilStatusDateTime(DateTime ailStatusDateTime) {
        this.ailStatusDateTime = ailStatusDateTime;
    }

    public DateTime getThreePlStatusDateTime() {
        return threePlStatusDateTime;
    }

    public void setThreePlStatusDateTime(DateTime threePlStatusDateTime) {
        this.threePlStatusDateTime = threePlStatusDateTime;
    }

    public DateTime getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    public void setLastUpdatedDateTime(DateTime lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReturnShipmentHistory returnShipmentHistory = (ReturnShipmentHistory) o;

        if ( ! Objects.equals(id, returnShipmentHistory.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnShipmentHistory{" +
                "id=" + id +
                ", awb='" + awb + "'" +
                ", threePlComment='" + threePlComment + "'" +
                ", ailStatus='" + ailStatus + "'" +
                ", threePlStatus='" + threePlStatus + "'" +
                ", deliveryAttempt='" + deliveryAttempt + "'" +
                ", consignmentId='" + consignmentId + "'" +
                ", ailStatusDateTime='" + ailStatusDateTime + "'" +
                ", threePlStatusDateTime='" + threePlStatusDateTime + "'" +
                ", lastUpdatedDateTime='" + lastUpdatedDateTime + "'" +
                '}';
    }
}
