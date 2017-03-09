package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A PosItem.
 */
@Entity
@Table(name = "pos_item")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PosItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "discount_percentage")
    private String discountPercentage;

    @Column(name = "scheme_code")
    private String schemeCode;

    @Column(name = "quantity")
    private String quantity;

    @Column(name = "tax1_rate")
    private String tax1Rate;

    @Column(name = "price")
    private String price;

    @Column(name = "basic_amount")
    private String basicAmount;

    @Column(name = "eancode")
    private String eancode;

    @Column(name = "discount_amount")
    private String discountAmount;

    @Column(name = "tax1_amount")
    private String tax1Amount;

    @Column(name = "scheme_sinumber")
    private String schemeSINumber;

    @ManyToOne
    @JoinColumn(name = "pos_order_id")
    private PosOrder posOrder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getSchemeCode() {
        return schemeCode;
    }

    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTax1Rate() {
        return tax1Rate;
    }

    public void setTax1Rate(String tax1Rate) {
        this.tax1Rate = tax1Rate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBasicAmount() {
        return basicAmount;
    }

    public void setBasicAmount(String basicAmount) {
        this.basicAmount = basicAmount;
    }

    public String getEancode() {
        return eancode;
    }

    public void setEancode(String eancode) {
        this.eancode = eancode;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getTax1Amount() {
        return tax1Amount;
    }

    public void setTax1Amount(String tax1Amount) {
        this.tax1Amount = tax1Amount;
    }

    public String getSchemeSINumber() {
        return schemeSINumber;
    }

    public void setSchemeSINumber(String schemeSINumber) {
        this.schemeSINumber = schemeSINumber;
    }

    public PosOrder getPosOrder() {
        return posOrder;
    }

    public void setPosOrder(PosOrder PosOrder) {
        this.posOrder = PosOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PosItem posItem = (PosItem) o;
        return Objects.equals(id, posItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PosItem{" +
            "id=" + id +
            ", discountPercentage='" + discountPercentage + "'" +
            ", schemeCode='" + schemeCode + "'" +
            ", quantity='" + quantity + "'" +
            ", tax1Rate='" + tax1Rate + "'" +
            ", price='" + price + "'" +
            ", basicAmount='" + basicAmount + "'" +
            ", eancode='" + eancode + "'" +
            ", discountAmount='" + discountAmount + "'" +
            ", tax1Amount='" + tax1Amount + "'" +
            ", schemeSINumber='" + schemeSINumber + "'" +
            '}';
    }
}
