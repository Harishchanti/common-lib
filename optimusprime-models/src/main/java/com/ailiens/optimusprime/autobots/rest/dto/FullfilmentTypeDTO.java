package com.ailiens.optimusprime.autobots.rest.dto;

/**
 * A DTO representing a FulfillmentType.
 */
public class FullfilmentTypeDTO {

	private String name;

	public FullfilmentTypeDTO(FullfilmentType fullfilmentType) {
		if(fullfilmentType != null) {
			this.name = fullfilmentType.getName();
		}
	}

	public String getName() {
		return name;
	}
	public FullfilmentTypeDTO(){

	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FulfillmentTypeDTO [name=" + name + "]";
	}

}
