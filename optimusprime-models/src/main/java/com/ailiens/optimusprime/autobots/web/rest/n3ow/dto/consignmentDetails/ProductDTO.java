
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import java.math.BigDecimal;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.MBOProduct;

@Generated("org.jsonschema2pojo")
public class ProductDTO {

    public String description = "";
    public String skuId;
    public String color = "";
    public String size = "";
    public String brand = "";
    public BigDecimal mrp = new BigDecimal(0.0);
    public String eanCode;
    public String category1 = "";
    public String category2 = "";
    public String category3 = "";
    public String image = "";
    public String styleId = "";
    public String sapStyleId = "";
    public String sapSkuId = "";
    public ProductDTO() {

    }
    public ProductDTO(MBOProduct mboProduct) {

    	this.setBrand(mboProduct.getBrand());
    	this.setCategory1(mboProduct.getCategory1());
    	this.setCategory2(mboProduct.getCategory2());
    	this.setCategory3(mboProduct.getCategory3());
    	this.setColor(mboProduct.getColor());
    	this.setDescription(mboProduct.getDescription());
    	this.setEanCode(mboProduct.getEanCode());
    	this.setImage(mboProduct.getImage());
    	this.setMrp(mboProduct.getMrp());
    	this.setSize(mboProduct.getSize());
    	this.setSkuId(mboProduct.getSku());
    	this.setStyleId(mboProduct.getStyleId());
        this.setSapStyleId(mboProduct.getSapStyleId());
        this.setSapSkuId(mboProduct.getSapSkuId());
	}


    public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getSkuId() {
		return skuId;
	}




	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public String getSize() {
		return size;
	}




	public void setSize(String size) {
		this.size = size;
	}




	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public BigDecimal getMrp() {
		return mrp;
	}




	public void setMrp(BigDecimal mrp) {
		this.mrp = mrp;
	}




	public String getEanCode() {
		return eanCode;
	}




	public void setEanCode(String eanCode) {
		this.eanCode = eanCode;
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




	public String getImage() {
		return image;
	}




	public void setImage(String image) {
		this.image = image;
	}

	public String getStyleId() {
		return styleId;
	}



	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}


    public String getSapStyleId() {
        return sapStyleId;
    }

    public void setSapStyleId(String sapStyleId) {
        this.sapStyleId = sapStyleId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
	public String getSapSkuId() {
		return sapSkuId;
	}
	public void setSapSkuId(String sapSkuId) {
		this.sapSkuId = sapSkuId;
	}

}
