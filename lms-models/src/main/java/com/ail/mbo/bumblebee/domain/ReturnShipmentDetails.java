package com.ail.mbo.bumblebee.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import com.ail.mbo.bumblebee.domain.util.CustomDateTimeDeserializer;
import com.ail.mbo.bumblebee.domain.util.CustomDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A ReturnShipmentDetails.
 */
@Entity
@Table(name = "RETURNSHIPMENTDETAILS")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnShipmentDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price", precision=10, scale=2)
    private BigDecimal price;

    @Column(name = "return_id")
    private String returnId;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "comments")
    private String comments;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "created_date_time")
    private DateTime createdDateTime;

    @Column(name = "qc_status")
    private String qcStatus;

    @ManyToOne
    @JoinColumn(name="return_shipment_transactions_id")
    private ReturnShipmentTransactions returnShipmentTransactions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public DateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(DateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getQcStatus() {
        return qcStatus;
    }

    public void setQcStatus(String qcStatus) {
        this.qcStatus = qcStatus;
    }

    public ReturnShipmentTransactions getReturnShipmentTransactions() {
        return returnShipmentTransactions;
    }

    public void setReturnShipmentTransactions(ReturnShipmentTransactions ReturnShipmentTransactions) {
        this.returnShipmentTransactions = ReturnShipmentTransactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReturnShipmentDetails returnShipmentDetails = (ReturnShipmentDetails) o;

        if ( ! Objects.equals(id, returnShipmentDetails.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnShipmentDetails{" +
                "id=" + id +
                ", productCode='" + productCode + "'" +
                ", quantity='" + quantity + "'" +
                ", price='" + price + "'" +
                ", returnId='" + returnId + "'" +
                ", productCategory='" + productCategory + "'" +
                ", comments='" + comments + "'" +
                ", createdDateTime='" + createdDateTime + "'" +
                ", qcStatus='" + qcStatus + "'" +
                '}';
    }
}
