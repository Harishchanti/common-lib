package com.ailiens.optimusprime.autobots.rest.dto;

/**
 * Created by yashika on 31/7/17.
 */
public class InvoiceDetailsDTO {

    private String status;

    private String invoiceType;

    private String shippingLabelPath;

    private String invoicePath;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getShippingLabelPath() {
        return shippingLabelPath;
    }

    public void setShippingLabelPath(String shippingLabelPath) {
        this.shippingLabelPath = shippingLabelPath;
    }

    public String getInvoicePath() {
        return invoicePath;
    }

    public void setInvoicePath(String invoicePath) {
        this.invoicePath = invoicePath;
    }
}
