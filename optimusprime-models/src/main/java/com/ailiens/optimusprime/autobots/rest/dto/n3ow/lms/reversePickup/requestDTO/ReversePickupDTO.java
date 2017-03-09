
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.reversePickup.requestDTO;

import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class ReversePickupDTO {

	private String consignmentId;
	private String invoiceId;
	private String destinationStoreId;
	private String orderId;
	private Long length;
	private Long height;
	private Long breadth;
	private String packageType;
	private List<LMSProductsDetail> returns = new ArrayList<LMSProductsDetail>();
	private LMSCustomer customer;
	private String returnType;

	/**
	 *
	 * @return
	 *     The returnId
	 */
	public String getConsignmentId() {
		return consignmentId;
	}
	public ReversePickupDTO(){

	}

	/**
	 *
	 * @param consignmentId
	 *     The consignmentId
	 */
	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}

	/**
	 *
	 * @return
	 *     The invoiceId
	 */
	public String getInvoiceId() {
		return invoiceId;
	}

	/**
	 *
	 * @param invoiceId
	 *     The invoiceId
	 */
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	/**
	 *
	 * @return
	 *     The destinationStoreId
	 */
	public String getDestinationStoreId() {
		return destinationStoreId;
	}

	/**
	 *
	 * @param destinationStoreId
	 *     The destinationStoreId
	 */
	public void setStoreId(String destinationStoreId) {
		this.destinationStoreId = destinationStoreId;
	}

	/**
	 *
	 * @return
	 *     The orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 *
	 * @param orderId
	 *     The orderId
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 *
	 * @return
	 *     The length
	 */
	public Long getLength() {
		return length;
	}

	/**
	 *
	 * @param length
	 *     The length
	 */
	public void setLength(Long length) {
		this.length = length;
	}

	/**
	 *
	 * @return
	 *     The height
	 */
	public Long getHeight() {
		return height;
	}

	/**
	 *
	 * @param height
	 *     The height
	 */
	public void setHeight(Long height) {
		this.height = height;
	}

	/**
	 *
	 * @return
	 *     The breadth
	 */
	public Long getBreadth() {
		return breadth;
	}

	/**
	 *
	 * @param breadth
	 *     The breadth
	 */
	public void setBreadth(Long breadth) {
		this.breadth = breadth;
	}

	/**
	 *
	 * @return
	 *     The packageType
	 */
	public String getPackageType() {
		return packageType;
	}

	/**
	 *
	 * @param packageType
	 *     The packageType
	 */
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	/**
	 *
	 * @return
	 *     The returns
	 */
	public List<LMSProductsDetail> getReturns() {
		return returns;
	}

	/**
	 *
	 * @param returns
	 *     The returns
	 */
	public void setReturns(List<LMSProductsDetail> returns) {
		this.returns = returns;
	}

	/**
	 *
	 * @return
	 *     The customer
	 */
	public LMSCustomer getCustomer() {
		return customer;
	}

	/**
	 *
	 * @param customer
	 *     The customer
	 */
	public void setCustomer(LMSCustomer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}


	/**
	 *
	 * @return
	 *     The returnType
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 *
	 * @param returnType
	 *     The returnType
	 */
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}


}
