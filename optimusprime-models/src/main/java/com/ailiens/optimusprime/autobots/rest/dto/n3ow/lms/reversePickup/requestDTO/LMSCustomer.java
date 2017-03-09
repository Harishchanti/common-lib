
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.lms.reversePickup.requestDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class LMSCustomer {

	private LMSAddress address;
	private String title;
	private String mobile;
	private String name;

	/**
	 *
	 * @return
	 *     The address
	 */
	public LMSAddress getAddress() {
		return address;
	}
	public LMSCustomer(){

	}

	/**
	 *
	 * @param address
	 *     The address
	 */
	public void setAddress(LMSAddress address) {
		this.address = address;
	}

	/**
	 *
	 * @return
	 *     The title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 *
	 * @param title
	 *     The title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 *
	 * @return
	 *     The mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 *
	 * @param mobile
	 *     The mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 *
	 * @return
	 *     The name
	 */
	public String getName() {
		return name;
	}

	/**
	 *
	 * @param name
	 *     The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
