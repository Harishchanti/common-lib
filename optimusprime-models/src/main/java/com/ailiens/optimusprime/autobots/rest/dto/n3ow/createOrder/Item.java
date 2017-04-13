
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createOrder;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;

@Generated("org.jsonschema2pojo")
public class Item {

	@Valid
	private ProductDetails productDetails;
	@Valid
	private FfType ffType;
	@Valid
	private FfCenter ffCenter;
	@Valid
	private ItemPricingDetails itemPricingDetails;
	@Valid
	private AddressDetails addressDetails;
	@Valid
	private List<String> relatedSKU = new ArrayList<String>();

	/**
	 * 
	 * @return
	 *     The productDetails
	 */
	public ProductDetails getProductDetails() {
		return productDetails;
	}
	public Item(){

	}

	/**
	 * 
	 * @param productDetails
	 *     The productDetails
	 */
	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}

	/**
	 * 
	 * @return
	 *     The ffType
	 */
	public FfType getFfType() {
		return ffType;
	}

	/**
	 * 
	 * @param ffType
	 *     The ffType
	 */
	public void setFfType(FfType ffType) {
		this.ffType = ffType;
	}

	/**
	 * 
	 * @return
	 *     The ffCenter
	 */
	public FfCenter getFfCenter() {
		return ffCenter;
	}

	/**
	 * 
	 * @param ffCenter
	 *     The ffCenter
	 */
	public void setFfCenter(FfCenter ffCenter) {
		this.ffCenter = ffCenter;
	}

	/**
	 * 
	 * @return
	 *     The itemPricingDetails
	 */
	public ItemPricingDetails getItemPricingDetails() {
		return itemPricingDetails;
	}

	/**
	 * 
	 * @param itemPricingDetails
	 *     The itemPricingDetails
	 */
	public void setItemPricingDetails(ItemPricingDetails itemPricingDetails) {
		this.itemPricingDetails = itemPricingDetails;
	}

	/**
	 * 
	 * @return
	 *     The addressDetails
	 */
	public AddressDetails getAddressDetails() {
		return addressDetails;
	}

	/**
	 * 
	 * @param addressDetails
	 *     The addressDetails
	 */
	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}

	/**
	 * 
	 * @return
	 *     The relatedSKU
	 */
	public List<String> getRelatedSKU() {
		return relatedSKU;
	}

	/**
	 * 
	 * @param relatedSKU
	 *     The relatedSKU
	 */
	public void setRelatedSKU(List<String> relatedSKU) {
		this.relatedSKU = relatedSKU;
	}

}
