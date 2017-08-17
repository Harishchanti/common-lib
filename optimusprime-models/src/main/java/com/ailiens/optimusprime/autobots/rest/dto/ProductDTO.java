package com.ailiens.optimusprime.autobots.rest.dto;

/**
 * A DTO representing a Product.
 */
public class ProductDTO {

	private String productId;

	public ProductDTO(Product product) {
		if(product != null) {
			this.productId = String.valueOf(product.getId());
		}
	}
	public ProductDTO(){

	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + "]";
	}

}
