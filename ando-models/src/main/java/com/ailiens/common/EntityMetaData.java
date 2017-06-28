package com.ailiens.common;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A EntityMetaData.
 */
@Entity
@Table(name = "entity_meta_data")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "entitymetadata")
public class EntityMetaData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "param_group", nullable = false)
    private String paramGroup;

    @NotNull
    @Column(name = "param_name", nullable = false)
    private String paramName;

    @NotNull
    @Column(name = "param_type", nullable = false)
    private String paramType;

    @NotNull
    @Column(name = "is_required", nullable = false)
    private Boolean isRequired;

    @ManyToOne
    @JoinColumn(name = "entity_type_id")
    private EntityType entityType;

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

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityMetaData entityMetaData = (EntityMetaData) o;
        if(entityMetaData.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, entityMetaData.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "EntityMetaData{" +
            "id=" + id +
            ", paramGroup='" + paramGroup + "'" +
            ", paramName='" + paramName + "'" +
            ", paramType='" + paramType + "'" +
            ", isRequired='" + isRequired + "'" +
            '}';
    }
}
