package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A RetConStateChange.
 */
@Entity
@Table(name = "ret_con_state_change")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class RetConStateChange implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @Column(name = "time")
    private ZonedDateTime time;

    @ManyToOne
    @JoinColumn(name = "return_consignment_id")
    private ReturnConsignment returnConsignment;

    @ManyToOne
    @JoinColumn(name = "fullfilment_center_id")
    private FullfilmentCenter fullfilmentCenter;

    @ManyToOne
    @JoinColumn(name = "ret_con_states_reasons_id")
    private RetConStatesReasons retConStatesReasons;

    @ManyToOne
    @JoinColumn(name = "to_state_id")
    private RetConStates toState;

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

    public ReturnConsignment getReturnConsignment() {
        return returnConsignment;
    }

    public void setReturnConsignment(ReturnConsignment returnConsignment) {
        this.returnConsignment = returnConsignment;
    }

    public FullfilmentCenter getFullfilmentCenter() {
        return fullfilmentCenter;
    }

    public void setFullfilmentCenter(FullfilmentCenter fullfilmentCenter) {
        this.fullfilmentCenter = fullfilmentCenter;
    }

    public RetConStatesReasons getRetConStatesReasons() {
        return retConStatesReasons;
    }

    public void setRetConStatesReasons(RetConStatesReasons retConStatesReasons) {
        this.retConStatesReasons = retConStatesReasons;
    }

    public RetConStates getToState() {
        return toState;
    }

    public void setToState(RetConStates retConStates) {
        this.toState = retConStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetConStateChange retConStateChange = (RetConStateChange) o;
        return Objects.equals(id, retConStateChange.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "RetConStateChange{" +
            "id=" + id +
            ", comment='" + comment + "'" +
            ", time='" + time + "'" +
            '}';
    }
}
