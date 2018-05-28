
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.createPosOrder;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class CreatePOSOrderDTO {

    private String date;
    private String transactionType;
    private String billDiscountScheme;
    private Integer billDiscountAmount;
    private String invoiceNumber;
    private String storeCode;
    private List<Item> items = new ArrayList<Item>();

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The transactionType
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * 
     * @param transactionType
     *     The transactionType
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * 
     * @return
     *     The billDiscountScheme
     */
    public String getBillDiscountScheme() {
        return billDiscountScheme;
    }

    /**
     * 
     * @param billDiscountScheme
     *     The billDiscountScheme
     */
    public void setBillDiscountScheme(String billDiscountScheme) {
        this.billDiscountScheme = billDiscountScheme;
    }

    /**
     * 
     * @return
     *     The billDiscountAmount
     */
    public Integer getBillDiscountAmount() {
        return billDiscountAmount;
    }

    /**
     * 
     * @param billDiscountAmount
     *     The billDiscountAmount
     */
    public void setBillDiscountAmount(Integer billDiscountAmount) {
        this.billDiscountAmount = billDiscountAmount;
    }

    /**
     * 
     * @return
     *     The invoiceNumber
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * 
     * @param invoiceNumber
     *     The invoiceNumber
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * 
     * @return
     *     The storeCode
     */
    public String getStoreCode() {
        return storeCode;
    }

    /**
     * 
     * @param storeCode
     *     The storeCode
     */
    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
