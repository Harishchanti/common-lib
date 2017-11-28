package com.ail.mbo.bumblebee.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Courier_constraints.
 */
@Entity
@Table(name = "COURIER_CONSTRAINTS")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Courier_constraints implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "amount", precision=10, scale=2, nullable = false)
    private BigDecimal amount;

    @NotNull
    @Column(name = "code", nullable = false)
    private String code;

    @NotNull
    @Column(name = "constraint_type", nullable = false)
    private String constraint_type;

    @ManyToOne
    private Payment_type payment_type;

    @ManyToOne
    private Courier courier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getConstraint_type() {
        return constraint_type;
    }

    public void setConstraint_type(String constraint_type) {
        this.constraint_type = constraint_type;
    }

    public Payment_type getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(Payment_type payment_type) {
        this.payment_type = payment_type;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Courier_constraints courier_constraints = (Courier_constraints) o;

        if ( ! Objects.equals(id, courier_constraints.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Courier_constraints{" +
                "id=" + id +
                ", amount='" + amount + "'" +
                ", code='" + code + "'" +
                ", constraint_type='" + constraint_type + "'" +
                '}';
    }
}
