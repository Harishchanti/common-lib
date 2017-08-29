package com.ailiens.optimusprime.autobots.rest.dto;

import com.ailiens.optimusprime.domain.FullfilmentCenter;

/**
 * A DTO representing a FullfilmentCenter.
 */
public class FullfilmentCenterDTO {

	private String name;

    private String sapCode;

    private String fcType;

    private String contactNumber;

	public FullfilmentCenterDTO(FullfilmentCenter fullfilmentCenter) {
		if(fullfilmentCenter != null) {
			this.name = fullfilmentCenter.getFulfilmentCenterName();
            this.sapCode = fullfilmentCenter.getSapCode();
            this.fcType = fullfilmentCenter.getFcType();
            this.contactNumber = fullfilmentCenter.getContactNo();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getSapCode() {
        return sapCode;
    }

    public void setSapCode(String sapCode) {
        this.sapCode = sapCode;
    }

    public String getFcType() {
        return fcType;
    }

    public void setFcType(String fcType) {
        this.fcType = fcType;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "FullfilmentCenterDTO{" +
            "name='" + name + '\'' +
            ", sapCode='" + sapCode + '\'' +
            ", fcType='" + fcType + '\'' +
            ", contactNumber='" + contactNumber + '\'' +
            '}';
    }
}
