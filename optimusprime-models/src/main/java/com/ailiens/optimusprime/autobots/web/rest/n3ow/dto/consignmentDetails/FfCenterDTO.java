
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import com.ailiens.optimusprime.domain.FullfilmentCenter;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class FfCenterDTO {

    public String fcid;
    public String sapCode;
    public String fcName;
    public String brand;
    public String fcType;
    public String postCode;
    public String stateCode;
    public String gstnCode;


    public FfCenterDTO(FullfilmentCenter fullfilmentCenter) {
    	if(fullfilmentCenter != null){
    		this.setFcid(fullfilmentCenter.getFullfilmentCenterId());
    		this.setBrand(fullfilmentCenter.getBrandName());
    		this.setFcName(fullfilmentCenter.getFulfilmentCenterName());
    		this.setFcType(fullfilmentCenter.getFcType());
    		this.setPostCode(fullfilmentCenter.getPostCode());
    		this.setSapCode(fullfilmentCenter.getSapCode());
            this.setStateCode(fullfilmentCenter.getStateCode());
            this.setGstnCode(fullfilmentCenter.getGstnCode());
    	}
    }


	public String getFcid() {
		return fcid;
	}



	public void setFcid(String fcid) {
		this.fcid = fcid;
	}



	public String getSapCode() {
		return sapCode;
	}



	public void setSapCode(String sapCode) {
		this.sapCode = sapCode;
	}



	public String getFcName() {
		return fcName;
	}



	public void setFcName(String fcName) {
		this.fcName = fcName;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getFcType() {
		return fcType;
	}



	public void setFcType(String fcType) {
		this.fcType = fcType;
	}



	public String getPostCode() {
		return postCode;
	}



	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getGstnCode() {
        return gstnCode;
    }

    public void setGstnCode(String gstnCode) {
        this.gstnCode = gstnCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
