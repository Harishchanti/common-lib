package com.ailiens.optimusprime.autobots.rest.dto.n3ow.createReturn;

import javax.persistence.Column;

/**
 * A Address.
 */

public class ReturnAddressDTO{


	@Column(name = "address_id")
	private String addressId;

	public ReturnAddressDTO()
	{

	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

}
