package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import com.ailiens.optimusprime.domain.ConsignmentParams;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ConsignmentParamsDTO {

    private String paramName;

    private String paramType;

    private String paramValue;

    private Boolean paramRequired;
    
    public ConsignmentParamsDTO() {
    	
    }

    public ConsignmentParamsDTO(ConsignmentParams consignmentParams) {
        if (consignmentParams != null) {
            this.paramName = consignmentParams.getParamName();
            this.paramType = consignmentParams.getParamType();
            this.paramValue = consignmentParams.getParamValue();
            this.paramRequired = consignmentParams.isParamRequired();
        }
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public Boolean getParamRequired() {
        return paramRequired;
    }

    public void setParamRequired(Boolean paramRequired) {
        this.paramRequired = paramRequired;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
