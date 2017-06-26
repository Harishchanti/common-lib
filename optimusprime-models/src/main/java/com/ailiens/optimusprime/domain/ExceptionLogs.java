package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A ExceptionLogs.
 */
@Entity
@Table(name = "exception_logs")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ExceptionLogs implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "error_class")
    private String errorClass;

    @Column(name = "end_point")
    private String endPoint;

    @Column(name = "error_code")
    private String errorCode;

    @Column(name = "error_message")
    private String errorMessage;

    @Column(name = "error_date")
    private ZonedDateTime errorDate;

    @Column(name = "identifier")
    private String identifier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getErrorClass() {
        return errorClass;
    }

    public void setErrorClass(String errorClass) {
        this.errorClass = errorClass;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ZonedDateTime getErrorDate() {
        return errorDate;
    }

    public void setErrorDate(ZonedDateTime errorDate) {
        this.errorDate = errorDate;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExceptionLogs exceptionLogs = (ExceptionLogs) o;
        return Objects.equals(id, exceptionLogs.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ExceptionLogs{" +
            "id=" + id +
            ", errorClass='" + errorClass + "'" +
            ", endPoint='" + endPoint + "'" +
            ", errorCode='" + errorCode + "'" +
            ", errorMessage='" + errorMessage + "'" +
            ", errorDate='" + errorDate + "'" +
            ", identifier='" + identifier + "'" +
            '}';
    }
}
