package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A ReturnStatesReasons.
 */
@Entity
@Table(name = "return_states_reasons")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnStatesReasons implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "reason")
    private String reason;

    @ManyToOne
    @JoinColumn(name = "return_states_id")
    private ReturnStates returnStates;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ReturnStates getReturnStates() {
        return returnStates;
    }

    public void setReturnStates(ReturnStates returnStates) {
        this.returnStates = returnStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReturnStatesReasons returnStatesReasons = (ReturnStatesReasons) o;
        return Objects.equals(id, returnStatesReasons.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnStatesReasons{" +
            "id=" + id +
            ", reason='" + reason + "'" +
            '}';
    }
}
