package com.ailiens.common.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the BrandMetaData entity.
 */
public class BrandMetaDataDTO implements Serializable {

    private Long id;

    @NotNull
    private String paramGroup;


    @NotNull
    private String paramName;


    @NotNull
    private String paramType;


    @NotNull
    private Boolean isRequired;


    private Long masterBrandId;

    private String masterBrandBrand;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getParamGroup() {
        return paramGroup;
    }

    public void setParamGroup(String paramGroup) {
        this.paramGroup = paramGroup;
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
    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public Long getMasterBrandId() {
        return masterBrandId;
    }

    public void setMasterBrandId(Long masterBrandId) {
        this.masterBrandId = masterBrandId;
    }

    public String getMasterBrandBrand() {
        return masterBrandBrand;
    }

    public void setMasterBrandBrand(String masterBrandBrand) {
        this.masterBrandBrand = masterBrandBrand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BrandMetaDataDTO brandMetaDataDTO = (BrandMetaDataDTO) o;

        if ( ! Objects.equals(id, brandMetaDataDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "BrandMetaDataDTO{" +
            "id=" + id +
            ", paramGroup='" + paramGroup + "'" +
            ", paramName='" + paramName + "'" +
            ", paramType='" + paramType + "'" +
            ", isRequired='" + isRequired + "'" +
            '}';
    }
}
