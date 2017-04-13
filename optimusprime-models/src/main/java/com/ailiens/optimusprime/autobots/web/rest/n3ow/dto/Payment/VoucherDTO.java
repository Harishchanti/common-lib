
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.Payment;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class VoucherDTO {

	private String voucherId;

	/**
	 *
	 * @return
	 * The voucherId
	 */
	public String getVoucherId() {
		return voucherId;
	}

	/**
	 *
	 * @param voucherId
	 * The voucherId
	 */
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public VoucherDTO(){

	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
