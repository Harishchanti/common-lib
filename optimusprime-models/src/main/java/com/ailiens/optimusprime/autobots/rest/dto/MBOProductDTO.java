package com.ailiens.optimusprime.autobots.rest.dto;

import com.ailiens.optimusprime.domain.MBOProduct;

/**
 * A DTO representing a MBOProduct.
 */
public class MBOProductDTO {

	private String productId;

	private String skuId;

	private String color;

	private String size;

	private String brand;

	private String mrp;

	private String image;

	public MBOProductDTO(MBOProduct mboProduct) {
		if(mboProduct != null) {
			this.productId = String.valueOf(mboProduct.getId());
			this.skuId = mboProduct.getSku();
			this.color = mboProduct.getColor();
			this.size = mboProduct.getSize();
			this.brand = mboProduct.getBrand();
			this.mrp = String.valueOf(mboProduct.getMrp());
			this.image = mboProduct.getImage();
		}
	}

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "MBOProductDTO [mboProductId=" + productId + ", skuId=" + skuId + ", color=" + color + ", size=" + size
				+ ", brand=" + brand + ", mrp=" + mrp + ", image=" + image + "]";
	}

}
