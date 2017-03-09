package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A ConsignmentParams.
 */
@Entity
@Table(name = "consignment_params")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ConsignmentParams implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "param_name")
    private String paramName;

    @Column(name = "param_type")
    private String paramType;

    @Column(name = "param_value")
    private String paramValue;

    @Column(name = "param_required")
    private Boolean paramRequired;

    @ManyToOne
    private Consignment consignment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParamName() {
        return paramName;
    }

    public ConsignmentParams paramName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamType() {
        return paramType;
    }

    public ConsignmentParams paramType(String paramType) {
        this.paramType = paramType;
        return this;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public String getParamValue() {
        return paramValue;
    }

    public ConsignmentParams paramValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public Boolean isParamRequired() {
        return paramRequired;
    }

    public ConsignmentParams paramRequired(Boolean paramRequired) {
        this.paramRequired = paramRequired;
        return this;
    }

    public void setParamRequired(Boolean paramRequired) {
        this.paramRequired = paramRequired;
    }

    public Consignment getConsignment() {
        return consignment;
    }

    public ConsignmentParams consignment(Consignment consignment) {
        this.consignment = consignment;
        return this;
    }

    public void setConsignment(Consignment consignment) {
        this.consignment = consignment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsignmentParams consignmentParams = (ConsignmentParams) o;
        if(consignmentParams.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, consignmentParams.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ConsignmentParams{" +
            "id=" + id +
            ", paramName='" + paramName + "'" +
            ", paramType='" + paramType + "'" +
            ", paramValue='" + paramValue + "'" +
            ", paramRequired='" + paramRequired + "'" +
            '}';
    }
}
