package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A MBOProduct.
 */
@Entity
@Table(name = "mboproduct")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MBOProduct implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "sku")
    private String sku;

    @Column(name = "brand")
    private String brand;

    @Column(name = "size")
    private String size;

    @Column(name = "color")
    private String color;

    @Column(name = "mrp", precision=10, scale=2)
    private BigDecimal mrp;

    @Column(name = "image")
    private String image;

    @Column(name = "ean_code")
    private String eanCode;

    @Column(name = "style_id")
    private String styleId;

    @Column(name = "category1")
    private String category1;

    @Column(name = "category2")
    private String category2;

    @Column(name = "category3")
    private String category3;

    @Column(name = "gross_sp")
    private String grossSP;

    @Column(name = "description")
    private String description;

    @Column(name = "sap_style_id")
    private String sapStyleId;

    @Column(name = "sap_sku_id")
    private String sapSkuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getMrp() {
        return mrp;
    }

    public void setMrp(BigDecimal mrp) {
        this.mrp = mrp;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEanCode() {
        return eanCode;
    }

    public void setEanCode(String eanCode) {
        this.eanCode = eanCode;
    }

    public String getStyleId() {
        return styleId;
    }

    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1;
    }

    public String getCategory2() {
        return category2;
    }

    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    public String getCategory3() {
        return category3;
    }

    public void setCategory3(String category3) {
        this.category3 = category3;
    }

    public String getGrossSP() {
        return grossSP;
    }

    public void setGrossSP(String grossSP) {
        this.grossSP = grossSP;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSapStyleId() {
        return sapStyleId;
    }

    public void setSapStyleId(String sapStyleId) {
        this.sapStyleId = sapStyleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MBOProduct mBOProduct = (MBOProduct) o;
        return Objects.equals(id, mBOProduct.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MBOProduct{" +
            "id=" + id +
            ", sku='" + sku + "'" +
            ", brand='" + brand + "'" +
            ", size='" + size + "'" +
            ", color='" + color + "'" +
            ", mrp='" + mrp + "'" +
            ", image='" + image + "'" +
            ", eanCode='" + eanCode + "'" +
            ", styleId='" + styleId + "'" +
            ", category1='" + category1 + "'" +
            ", category2='" + category2 + "'" +
            ", category3='" + category3 + "'" +
            ", grossSP='" + grossSP + "'" +
            ", description='" + description + "'" +
            ", sapStyleId='" + sapStyleId + "'" +
            '}';
    }

    public String getSapSkuId() {
        return sapSkuId;
    }

    public void setSapSkuId(String sapSkuId) {
        this.sapSkuId = sapSkuId;
    }
}
