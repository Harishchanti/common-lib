package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A RetConStatesReasons.
 */
@Entity
@Table(name = "ret_con_states_reasons")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class RetConStatesReasons implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "reason")
    private String reason;

    @ManyToOne
    @JoinColumn(name = "ret_con_states_id")
    private RetConStates retConStates;

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

    public RetConStates getRetConStates() {
        return retConStates;
    }

    public void setRetConStates(RetConStates retConStates) {
        this.retConStates = retConStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetConStatesReasons retConStatesReasons = (RetConStatesReasons) o;
        return Objects.equals(id, retConStatesReasons.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "RetConStatesReasons{" +
            "id=" + id +
            ", reason='" + reason + "'" +
            '}';
    }
}
