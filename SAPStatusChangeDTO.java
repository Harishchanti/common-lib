package com.ailiens.optimusprime.autobots.rest.dto.n3ow.orderLine;

/**
 * Created by shirish on 14/1/16.
 */
public class SAPStatusChangeDTO {

    private String fullfilment_cat;

    private String status;

    private String hu_code;

    private String sales_order_no;

    private String entity;

    private String warehouse_no;

    private String sapInvoiceId;  // added sap/erp invoice id for B2b @adi

    private String orderItemId;
    public String getWarehouse_no() {
        return warehouse_no;
    }

    public void setWarehouse_no(String warehouse_no) {
        this.warehouse_no = warehouse_no;
    }

    public String getFullfilment_cat() {
        return fullfilment_cat;
    }

    public void setFullfilment_cat(String fullfilment_cat) {
        this.fullfilment_cat = fullfilment_cat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHu_code() {
        return hu_code;
    }

    public void setHu_code(String hu_code) {
        this.hu_code = hu_code;
    }

    public String getSales_order_no() {
        return sales_order_no;
    }

    public void setSales_order_no(String sales_order_no) {
        this.sales_order_no = sales_order_no;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }


    public String getSapInvoiceId() {
        return sapInvoiceId;
    }

    public void setSapInvoiceId(String sapInvoiceId) {
        this.sapInvoiceId = sapInvoiceId;
    }


    @Override
    public String toString() {
        return "SAPStatusChangeDTO{" +
            "fullfilment_cat='" + fullfilment_cat + '\'' +
            ", status='" + status + '\'' +
            ", hu_code='" + hu_code + '\'' +
            ", sales_order_no='" + sales_order_no + '\'' +
            ", entity='" + entity + '\'' +
            ", warehouse_no='" + warehouse_no + '\'' +
            ", sapInvoiceId='" + sapInvoiceId + '\'' +
            ", orderItemId='" + orderItemId + '\'' +
            '}';
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }


}
