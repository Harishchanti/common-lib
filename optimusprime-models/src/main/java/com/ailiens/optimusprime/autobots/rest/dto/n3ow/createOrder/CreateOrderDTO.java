
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createOrder;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;

import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class CreateOrderDTO {

	@Valid
	private TotalPricingDetails totalpricingDetails;
	@Valid
	private CustomerDetails customerDetails;
	@Valid
	private StoreStaffDetails storeStaffDetails;
	@Valid
	private OrderingCenter orderingCenter;
	@Valid
	private List<Item> items = new ArrayList<Item>();

	/**
	 * 
	 * @return
	 *     The totalpricingDetails
	 */
	public TotalPricingDetails getTotalpricingDetails() {
		return totalpricingDetails;
	}

	public CreateOrderDTO(){

	}

	/**
	 * 
	 * @param totalpricingDetails
	 *     The totalpricingDetails
	 */
	public void setTotalpricingDetails(TotalPricingDetails totalpricingDetails) {
		this.totalpricingDetails = totalpricingDetails;
	}

	/**
	 * 
	 * @return
	 *     The customerDetails
	 */
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}

	/**
	 * 
	 * @param customerDetails
	 *     The customerDetails
	 */
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}

	/**
	 * 
	 * @return
	 *     The storeStaffDetails
	 */
	public StoreStaffDetails getStoreStaffDetails() {
		return storeStaffDetails;
	}

	/**
	 * 
	 * @param storeStaffDetails
	 *     The storeStaffDetails
	 */
	public void setStoreStaffDetails(StoreStaffDetails storeStaffDetails) {
		this.storeStaffDetails = storeStaffDetails;
	}

	/**
	 * 
	 * @return
	 *     The orderingCenter
	 */
	public OrderingCenter getOrderingCenter() {
		return orderingCenter;
	}

	/**
	 * 
	 * @param orderingCenter
	 *     The orderingCenter
	 */
	public void setOrderingCenter(OrderingCenter orderingCenter) {
		this.orderingCenter = orderingCenter;
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
