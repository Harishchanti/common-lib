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
 * A ReturnStatesChange.
 */
@Entity
@Table(name = "return_states_change")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnStatesChange implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "comment")
    private String comment;
    
    @Column(name = "time")
    private ZonedDateTime time;
    
    @Column(name = "refund_status")
    private String refundStatus;
    
    @ManyToOne
    @JoinColumn(name = "returns_id")
    private Returns returns;

    @ManyToOne
    @JoinColumn(name = "fullfilment_center_id")
    private FullfilmentCenter fullfilmentCenter;

    @ManyToOne
    @JoinColumn(name = "return_states_reasons_id")
    private ReturnStatesReasons returnStatesReasons;

    @ManyToOne
    @JoinColumn(name = "to_state_id")
    private ReturnStates toState;

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

    public String getRefundStatus() {
        return refundStatus;
    }
    
    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Returns getReturns() {
        return returns;
    }

    public void setReturns(Returns returns) {
        this.returns = returns;
    }

    public FullfilmentCenter getFullfilmentCenter() {
        return fullfilmentCenter;
    }

    public void setFullfilmentCenter(FullfilmentCenter fullfilmentCenter) {
        this.fullfilmentCenter = fullfilmentCenter;
    }

    public ReturnStatesReasons getReturnStatesReasons() {
        return returnStatesReasons;
    }

    public void setReturnStatesReasons(ReturnStatesReasons returnStatesReasons) {
        this.returnStatesReasons = returnStatesReasons;
    }

    public ReturnStates getToState() {
        return toState;
    }

    public void setToState(ReturnStates returnStates) {
        this.toState = returnStates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReturnStatesChange returnStatesChange = (ReturnStatesChange) o;
        if(returnStatesChange.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, returnStatesChange.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnStatesChange{" +
            "id=" + id +
            ", comment='" + comment + "'" +
            ", time='" + time + "'" +
            ", refundStatus='" + refundStatus + "'" +
            '}';
    }
}
