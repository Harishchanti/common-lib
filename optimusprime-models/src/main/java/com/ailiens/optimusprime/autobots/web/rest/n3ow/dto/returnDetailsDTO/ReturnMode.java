
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ReturnMode {

	private String id;
	private String name;

	/**
	 * 
	 * @return
	 *     The id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *     The id
	 */
	public ReturnMode(){

	}
	public void setId(String id) {
		this.id = id;
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
