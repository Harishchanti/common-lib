package com.ailiens.optimusprime.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A PosOrder.
 */
@Entity
@Table(name = "pos_order")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PosOrder implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "invoice_number")
    private String invoiceNumber;

    @Column(name = "date")
    private String date;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "bill_discount_scheme")
    private String billDiscountScheme;

    @Column(name = "store_code")
    private String storeCode;

    @Column(name = "bill_discount_amount")
    private String billDiscountAmount;

    @OneToMany(mappedBy = "posOrder")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<PosItem> posItems = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getBillDiscountScheme() {
        return billDiscountScheme;
    }

    public void setBillDiscountScheme(String billDiscountScheme) {
        this.billDiscountScheme = billDiscountScheme;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getBillDiscountAmount() {
        return billDiscountAmount;
    }

    public void setBillDiscountAmount(String billDiscountAmount) {
        this.billDiscountAmount = billDiscountAmount;
    }

    public Set<PosItem> getPosItems() {
        return posItems;
    }

    public void setPosItems(Set<PosItem> posItems) {
        this.posItems = posItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PosOrder posOrder = (PosOrder) o;
        return Objects.equals(id, posOrder.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PosOrder{" +
            "id=" + id +
            ", invoiceNumber='" + invoiceNumber + "'" +
            ", date='" + date + "'" +
            ", transactionType='" + transactionType + "'" +
            ", billDiscountScheme='" + billDiscountScheme + "'" +
            ", storeCode='" + storeCode + "'" +
            ", billDiscountAmount='" + billDiscountAmount + "'" +
            '}';
    }
}
