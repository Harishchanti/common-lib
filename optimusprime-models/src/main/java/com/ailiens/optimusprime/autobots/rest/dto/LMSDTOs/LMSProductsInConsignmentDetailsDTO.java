package com.ailiens.optimusprime.autobots.rest.dto.LMSDTOs;

import com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails.ItemDTO;
import com.ailiens.optimusprime.domain.OrderLine;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

public class LMSProductsInConsignmentDetailsDTO {

    private String productCode;
    private String productCategory;
    private int quantity;
    private DeliveryCost totalPrice;
    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public DeliveryCost getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(DeliveryCost totalPrice) {
        this.totalPrice = totalPrice;
    }


    public LMSProductsInConsignmentDetailsDTO( OrderLine orderLine) {


        orderLine.getMboProducts().getEanCode();
        this.productCode =  orderLine.getMboProducts().getEanCode();
        this.productCategory =

            (StringUtils.isBlank(orderLine.getMboProducts().getCategory1()) ? "" : StringUtils.isBlank(orderLine.getMboProducts().getCategory1()))
            + "-" +
                (StringUtils.isBlank(orderLine.getMboProducts().getCategory1()) ? "" : StringUtils.isBlank(orderLine.getMboProducts().getCategory2()))
            + "-" +
                (StringUtils.isBlank(orderLine.getMboProducts().getCategory1()) ? "" : StringUtils.isBlank(orderLine.getMboProducts().getCategory3()));

        this.quantity =  1;

        JSONObject totalPrice = new JSONObject();


        DeliveryCost  deliveryCost = new DeliveryCost(orderLine.getPrice().getFinalPrice());

        this.totalPrice = deliveryCost;

    }
}
