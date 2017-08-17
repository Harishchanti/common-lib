package com.ailiens.optimusprime.autobots.rest.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author adi
 * date: 6th july 17
 * Dashboard count DTO
 */

public class FulfilmentCentreCountInfoDTO {
	
      
    private String fcType;
    private String orderType;
    private String consignmentState;
    private Long count;
    
    public FulfilmentCentreCountInfoDTO(String fcType, String orderType, String consignmentState, Long count) {
    	this.fcType = fcType;
    	this.orderType = orderType;
    	this.consignmentState = consignmentState;
    	this.count = count;
    }
    
	public String getFcType() {
		return fcType;
	}
	public void setFcType(String fcType) {
		this.fcType = fcType;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getConsignmentState() {
		return consignmentState;
	}
	public void setConsignmentState(String consignmentState) {
		this.consignmentState = consignmentState;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
    
    
	
    
	
}
