package com.ailiens.common.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the EntityMetaData entity.
 */
public class EntityMetaDataDTO implements Serializable {

    private Long id;

    @NotNull
    private String paramGroup;


    @NotNull
    private String paramName;


    @NotNull
    private String paramType;


    @NotNull
    private Boolean isRequired;


    private Long entityTypeId;

    private String entityTypeEntityType;

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

    public Long getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(Long entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public String getEntityTypeEntityType() {
        return entityTypeEntityType;
    }

    public void setEntityTypeEntityType(String entityTypeEntityType) {
        this.entityTypeEntityType = entityTypeEntityType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EntityMetaDataDTO entityMetaDataDTO = (EntityMetaDataDTO) o;

        if ( ! Objects.equals(id, entityMetaDataDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "EntityMetaDataDTO{" +
            "id=" + id +
            ", paramGroup='" + paramGroup + "'" +
            ", paramName='" + paramName + "'" +
            ", paramType='" + paramType + "'" +
            ", isRequired='" + isRequired + "'" +
            '}';
    }
}
