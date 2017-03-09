
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.getDeliveryOptions.responseDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class DeliveryCost {

	private String currencyIso;
	private Double value;

	/**
	 *
	 * @return
	 *     The currencyIso
	 */
	public String getCurrencyIso() {
		return currencyIso;
	}
	public DeliveryCost(){

	}

	/**
	 *
	 * @param currencyIso
	 *     The currencyIso
	 */
	public void setCurrencyIso(String currencyIso) {
		this.currencyIso = currencyIso;
	}

	/**
	 *
	 * @return
	 *     The value
	 */
	public Double getValue() {
		return value;
	}

	/**
	 *
	 * @param value
	 *     The value
	 */
	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
