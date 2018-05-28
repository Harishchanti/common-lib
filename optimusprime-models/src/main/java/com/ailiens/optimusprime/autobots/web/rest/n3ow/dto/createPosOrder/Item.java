
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.createPosOrder;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Item {

    private Integer discountPercentage;
    private String schemeCode;
    private Integer quantity;
    private Double tax1Rate;
    private Integer price;
    private Double basicAmount;
    private String eancode;
    private Integer discountAmount;
    private String discountReason;
    private Double tax1Amount;
    private Integer schemeSlNumber;

    /**
     * 
     * @return
     *     The discountPercentage
     */
    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * 
     * @param discountPercentage
     *     The discountPercentage
     */
    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    /**
     * 
     * @return
     *     The schemeCode
     */
    public String getSchemeCode() {
        return schemeCode;
    }

    /**
     * 
     * @param schemeCode
     *     The schemeCode
     */
    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The tax1Rate
     */
    public Double getTax1Rate() {
        return tax1Rate;
    }

    /**
     * 
     * @param tax1Rate
     *     The tax1Rate
     */
    public void setTax1Rate(Double tax1Rate) {
        this.tax1Rate = tax1Rate;
    }

    /**
     * 
     * @return
     *     The price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The basicAmount
     */
    public Double getBasicAmount() {
        return basicAmount;
    }

    /**
     * 
     * @param basicAmount
     *     The basicAmount
     */
    public void setBasicAmount(Double basicAmount) {
        this.basicAmount = basicAmount;
    }

    /**
     * 
     * @return
     *     The eancode
     */
    public String getEancode() {
        return eancode;
    }

    /**
     * 
     * @param eancode
     *     The eancode
     */
    public void setEancode(String eancode) {
        this.eancode = eancode;
    }

    /**
     * 
     * @return
     *     The discountAmount
     */
    public Integer getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 
     * @param discountAmount
     *     The discountAmount
     */
    public void setDiscountAmount(Integer discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 
     * @return
     *     The discountReason
     */
    public String getDiscountReason() {
        return discountReason;
    }

    /**
     * 
     * @param discountReason
     *     The discountReason
     */
    public void setDiscountReason(String discountReason) {
        this.discountReason = discountReason;
    }

    /**
     * 
     * @return
     *     The tax1Amount
     */
    public Double getTax1Amount() {
        return tax1Amount;
    }

    /**
     * 
     * @param tax1Amount
     *     The tax1Amount
     */
    public void setTax1Amount(Double tax1Amount) {
        this.tax1Amount = tax1Amount;
    }

    /**
     * 
     * @return
     *     The schemeSlNumber
     */
    public Integer getSchemeSlNumber() {
        return schemeSlNumber;
    }

    /**
     * 
     * @param schemeSlNumber
     *     The schemeSlNumber
     */
    public void setSchemeSlNumber(Integer schemeSlNumber) {
        this.schemeSlNumber = schemeSlNumber;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
