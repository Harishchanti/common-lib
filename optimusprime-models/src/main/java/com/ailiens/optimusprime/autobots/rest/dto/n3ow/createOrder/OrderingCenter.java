
package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createOrder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class OrderingCenter {

	private String fcid;
	private String sapCode;
	private String fcName;
	private String brand;
	private String fcType;
	private String postCode;

	/**
	 * 
	 * @return
	 *     The fcid
	 */
	public String getFcid() {
		return fcid;
	}

	public OrderingCenter(){

	}
	/**
	 * 
	 * @param fcid
	 *     The fcid
	 */
	public void setFcid(String fcid) {
		this.fcid = fcid;
	}

	/**
	 * 
	 * @return
	 *     The sapCode
	 */
	public String getSapCode() {
		return sapCode;
	}

	/**
	 * 
	 * @param sapCode
	 *     The sapCode
	 */
	public void setSapCode(String sapCode) {
		this.sapCode = sapCode;
	}

	/**
	 * 
	 * @return
	 *     The fcName
	 */
	public String getFcName() {
		return fcName;
	}

	/**
	 * 
	 * @param fcName
	 *     The fcName
	 */
	public void setFcName(String fcName) {
		this.fcName = fcName;
	}

	/**
	 * 
	 * @return
	 *     The brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * 
	 * @param brand
	 *     The brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * 
	 * @return
	 *     The fcType
	 */
	public String getFcType() {
		return fcType;
	}

	/**
	 * 
	 * @param fcType
	 *     The fcType
	 */
	public void setFcType(String fcType) {
		this.fcType = fcType;
	}

	/**
	 * 
	 * @return
	 *     The postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * 
	 * @param postCode
	 *     The postCode
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

}
