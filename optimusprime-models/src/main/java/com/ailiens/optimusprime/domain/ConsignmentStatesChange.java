package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import java.time.ZonedDateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A ConsignmentStatesChange.
 */
@Entity
@Table(name = "consignment_states_change")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ConsignmentStatesChange implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "time")
    private ZonedDateTime time;

    @ManyToOne
    @JoinColumn(name = "consignment_id")
    private Consignment consignment;

    @ManyToOne
    @JoinColumn(name = "fullfilment_center_id")
    private FullfilmentCenter fullfilmentCenter;

    @ManyToOne
    @JoinColumn(name = "consignment_states_reasons_id")
    private ConsignmentStatesReasons consignmentStatesReasons;

    @ManyToOne
    @JoinColumn(name = "to_state_id")
    private ConsignmentStates toState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    public Consignment getConsignment() {
        return consignment;
    }

    public void setConsignment(Consignment consignment) {
        this.consignment = consignment;
    }

    public FullfilmentCenter getFullfilmentCenter() {
        return fullfilmentCenter;
    }

    public void setFullfilmentCenter(FullfilmentCenter fullfilmentCenter) {
        this.fullfilmentCenter = fullfilmentCenter;
    }

    public ConsignmentStatesReasons getConsignmentStatesReasons() {
        return consignmentStatesReasons;
    }

    public void setConsignmentStatesReasons(ConsignmentStatesReasons consignmentStatesReasons) {
        this.consignmentStatesReasons = consignmentStatesReasons;
    }

    public ConsignmentStates getToState() {
        return toState;
    }

    public void setToState(ConsignmentStates consignmentStates) {
        this.toState = consignmentStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsignmentStatesChange consignmentStatesChange = (ConsignmentStatesChange) o;
        return Objects.equals(id, consignmentStatesChange.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ConsignmentStatesChange{" +
            "id=" + id +
            ", comment='" + comment + "'" +
            ", time='" + time + "'" +
            '}';
    }
}
