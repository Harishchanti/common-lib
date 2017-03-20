package com.ailiens.common.model;

/**
 * Created by vaibhav on 30/10/15.
 */
public class ExtentedInsertableItem extends InsertableItem {


    String productId;
    String productUrl;

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductId() {

        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}

