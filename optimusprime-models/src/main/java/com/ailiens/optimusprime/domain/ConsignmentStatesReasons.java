package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A ConsignmentStatesReasons.
 */
@Entity
@Table(name = "consignment_states_reasons")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ConsignmentStatesReasons implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "reason")
    private String reason;

    @ManyToOne
    @JoinColumn(name = "consignment_states_id")
    private ConsignmentStates consignmentStates;

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

    public ConsignmentStates getConsignmentStates() {
        return consignmentStates;
    }

    public void setConsignmentStates(ConsignmentStates consignmentStates) {
        this.consignmentStates = consignmentStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsignmentStatesReasons consignmentStatesReasons = (ConsignmentStatesReasons) o;
        return Objects.equals(id, consignmentStatesReasons.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ConsignmentStatesReasons{" +
            "id=" + id +
            ", reason='" + reason + "'" +
            '}';
    }
}
