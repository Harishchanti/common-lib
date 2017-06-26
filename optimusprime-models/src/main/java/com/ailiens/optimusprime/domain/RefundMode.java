package com.ailiens.optimusprime.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A RefundMode.
 */
@Entity
@Table(name = "refund_mode")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class RefundMode implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "neft")
    private Boolean neft;

    @Column(name = "bts")
    private Boolean bts;

    @Column(name = "voucher")
    private Boolean voucher;

    @OneToOne(mappedBy = "refundMode")
    @JsonIgnore
    private Returns returns;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getNeft() {
        return neft;
    }

    public void setNeft(Boolean neft) {
        this.neft = neft;
    }

    public Boolean getBts() {
        return bts;
    }

    public void setBts(Boolean bts) {
        this.bts = bts;
    }

    public Boolean getVoucher() {
        return voucher;
    }

    public void setVoucher(Boolean voucher) {
        this.voucher = voucher;
    }

    public Returns getReturns() {
        return returns;
    }

    public void setReturns(Returns returns) {
        this.returns = returns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RefundMode refundMode = (RefundMode) o;
        return Objects.equals(id, refundMode.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "RefundMode{" +
            "id=" + id +
            ", neft='" + neft + "'" +
            ", bts='" + bts + "'" +
            ", voucher='" + voucher + "'" +
            '}';
    }
}
