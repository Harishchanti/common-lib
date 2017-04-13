package com.ailiens.optimusprime.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import java.time.ZonedDateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Returns.
 */
@Entity
@Table(name = "returns")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Returns implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "return_id")
    private String returnId;

    @Column(name = "expected_refund_amount", precision=10, scale=2)
    private BigDecimal expectedRefundAmount;

    @Column(name = "refund_amount", precision=10, scale=2)
    private BigDecimal refundAmount;

    @Column(name = "quality_bucket")
    private String qualityBucket;

    @Column(name = "return_cancellation_sla")
    private ZonedDateTime returnCancellationSLA;

    @Column(name = "return_initiated_date")
    private ZonedDateTime returnInitiatedDate;

    @Column(name = "neft")
    private String neft;
    @Column(name = "refund_status")
    private String refundStatus;

    @OneToOne
    private OrderLine orderLine;

    @ManyToOne
    @JoinColumn(name = "return_states_id")
    private ReturnStates returnStates;

    @ManyToOne
    @JoinColumn(name = "return_mode_id")
    private ReturnMode returnMode;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne
    private FullfilmentCenter returnLocation;

    @ManyToOne
    @JoinColumn(name = "return_consignment_id")
    private ReturnConsignment returnConsignment;

    @OneToMany(mappedBy = "returns")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Payment> payments = new HashSet<>();

    @OneToOne
    private RefundMode refundMode;

    @OneToMany(mappedBy = "returns")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Voucher> vouchers = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public BigDecimal getExpectedRefundAmount() {
        return expectedRefundAmount;
    }

    public void setExpectedRefundAmount(BigDecimal expectedRefundAmount) {
        this.expectedRefundAmount = expectedRefundAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getQualityBucket() {
        return qualityBucket;
    }

    public void setQualityBucket(String qualityBucket) {
        this.qualityBucket = qualityBucket;
    }

    public ZonedDateTime getReturnCancellationSLA() {
        return returnCancellationSLA;
    }

    public void setReturnCancellationSLA(ZonedDateTime returnCancellationSLA) {
        this.returnCancellationSLA = returnCancellationSLA;
    }

    public ZonedDateTime getReturnInitiatedDate() {
        return returnInitiatedDate;
    }

    public void setReturnInitiatedDate(ZonedDateTime returnInitiatedDate) {
        this.returnInitiatedDate = returnInitiatedDate;
    }

    public String getNeft() {
        return neft;
    }

    public void setNeft(String neft) {
        this.neft = neft;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    public ReturnStates getReturnStates() {
        return returnStates;
    }

    public void setReturnStates(ReturnStates returnStates) {
        this.returnStates = returnStates;
    }

    public ReturnMode getReturnMode() {
        return returnMode;
    }

    public void setReturnMode(ReturnMode returnMode) {
        this.returnMode = returnMode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public FullfilmentCenter getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(FullfilmentCenter FullfilmentCenter) {
        this.returnLocation = FullfilmentCenter;
    }

    public ReturnConsignment getReturnConsignment() {
        return returnConsignment;
    }

    public void setReturnConsignment(ReturnConsignment returnConsignment) {
        this.returnConsignment = returnConsignment;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public RefundMode getRefundMode() {
        return refundMode;
    }

    public void setRefundMode(RefundMode refundMode) {
        this.refundMode = refundMode;
    }

    public Set<Voucher> getVouchers() {
        return vouchers;
    }

    public void setVouchers(Set<Voucher> vouchers) {
        this.vouchers = vouchers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Returns returns = (Returns) o;
        if(returns.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, returns.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Returns{" +
            "id=" + id +
            ", returnId='" + returnId + "'" +
            ", expectedRefundAmount='" + expectedRefundAmount + "'" +
            ", refundAmount='" + refundAmount + "'" +
            ", qualityBucket='" + qualityBucket + "'" +
            ", returnCancellationSLA='" + returnCancellationSLA + "'" +
            ", returnInitiatedDate='" + returnInitiatedDate + "'" +
            ", neft='" + neft + "'" +
            ", refundStatus='" + refundStatus + "'" +
            '}';
    }
}
