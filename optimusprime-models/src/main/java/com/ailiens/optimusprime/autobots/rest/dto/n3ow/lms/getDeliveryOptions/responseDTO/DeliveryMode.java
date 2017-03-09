
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.getDeliveryOptions.responseDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class DeliveryMode {

	private String deliveryId;
	private String deliveryType;
	private String paymentType;
	private String deliveryTime;
	private DeliveryCost deliveryCost;
	private String courierName;

	/**
	 *
	 * @return
	 *     The deliveryId
	 */
	public String getDeliveryId() {
		return deliveryId;
	}

	public DeliveryMode(){

	}
	/**
	 *
	 * @param deliveryId
	 *     The deliveryId
	 */
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	/**
	 *
	 * @return
	 *     The deliveryType
	 */
	public String getDeliveryType() {
		return deliveryType;
	}

	/**
	 *
	 * @param deliveryType
	 *     The deliveryType
	 */
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	/**
	 *
	 * @return
	 *     The paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 *
	 * @param paymentType
	 *     The paymentType
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 *
	 * @return
	 *     The deliveryTime
	 */
	public String getDeliveryTime() {
		return deliveryTime;
	}

	/**
	 *
	 * @param deliveryTime
	 *     The deliveryTime
	 */
	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	/**
	 *
	 * @return
	 *     The deliveryCost
	 */
	public DeliveryCost getDeliveryCost() {
		return deliveryCost;
	}

	/**
	 *
	 * @param deliveryCost
	 *     The deliveryCost
	 */
	public void setDeliveryCost(DeliveryCost deliveryCost) {
		this.deliveryCost = deliveryCost;
	}

	/**
	 *
	 * @return
	 *     The courierName
	 */
	public String getCourierName() {
		return courierName;
	}

	/**
	 *
	 * @param courierName
	 *     The courierName
	 */
	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
