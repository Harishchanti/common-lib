package com.ailiens.optimusprime.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import java.time.ZonedDateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A OrderLine.
 */
@Entity
@Table(name = "order_line")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OrderLine implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "sla_end_time")
    private ZonedDateTime slaEndTime;

    @Column(name = "warehoue_item_id")
    private String warehoueItemId;

    @Column(name = "order_line_id")
    private String orderLineId;

    @Column(name = "sap_order_no")
    private String sapOrderNo;

    @ManyToOne
    @JoinColumn(name = "price_id")
    private Price price;

    @OneToOne    private Address address;

    @ManyToOne
    @JoinColumn(name = "order_line_states_id")
    private OrderLineStates orderLineStates;

    @ManyToOne
    @JoinColumn(name = "initial_fullfilment_type_id")
    private FullfilmentType initialFullfilmentType;

    @ManyToOne
    @JoinColumn(name = "fullfilment_type_id")
    private FullfilmentType fullfilmentType;

    @ManyToOne
    @JoinColumn(name = "logistics_id")
    private Logistics logistics;

    @OneToOne    private Accounts accounts;

    @ManyToOne
    @JoinColumn(name = "consignment_id")
    private Consignment consignment;

//    @OneToOne(mappedBy = "orderLine")
//    @JsonIgnore
//    private InvoiceLine invoiceLine;

    @OneToOne(mappedBy = "orderLine")
    @JsonIgnore
    private Returns returns;

    @OneToMany(mappedBy = "orderLine")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Discount> discounts = new HashSet<>();

    @OneToOne
    private MBOProduct mboProducts;

    @OneToMany(mappedBy = "orderLine")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Taxes> taxess = new HashSet<>();


    @ManyToOne
    @JoinColumn(name = "fullfilment_center_id")
    private FullfilmentCenter fullfilmentCenter;

    @ManyToOne
    @JoinColumn(name = "packaging_type_id")
    private PackagingType packagingType;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getSlaEndTime() {
        return slaEndTime;
    }

    public void setSlaEndTime(ZonedDateTime slaEndTime) {
        this.slaEndTime = slaEndTime;
    }

    public String getWarehoueItemId() {
        return warehoueItemId;
    }

    public void setWarehoueItemId(String warehoueItemId) {
        this.warehoueItemId = warehoueItemId;
    }

    public String getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    public String getSapOrderNo() {
        return sapOrderNo;
    }

    public void setSapOrderNo(String sapOrderNo) {
        this.sapOrderNo = sapOrderNo;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public OrderLineStates getOrderLineStates() {
        return orderLineStates;
    }

    public void setOrderLineStates(OrderLineStates orderLineStates) {
        this.orderLineStates = orderLineStates;
    }

    public FullfilmentType getInitialFullfilmentType() {
        return initialFullfilmentType;
    }

    public void setInitialFullfilmentType(FullfilmentType fullfilmentType) {
        this.initialFullfilmentType = fullfilmentType;
    }

    public FullfilmentType getFullfilmentType() {
        return fullfilmentType;
    }

    public void setFullfilmentType(FullfilmentType fullfilmentType) {
        this.fullfilmentType = fullfilmentType;
    }

    public Logistics getLogistics() {
        return logistics;
    }

    public void setLogistics(Logistics logistics) {
        this.logistics = logistics;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public Consignment getConsignment() {
        return consignment;
    }

    public void setConsignment(Consignment consignment) {
        this.consignment = consignment;
    }
//
//    public InvoiceLine getInvoiceLine() {
//        return invoiceLine;
//    }
//
//    public void setInvoiceLine(InvoiceLine invoiceLine) {
//        this.invoiceLine = invoiceLine;
//    }

    public Returns getReturns() {
        return returns;
    }

    public void setReturns(Returns returns) {
        this.returns = returns;
    }

    public Set<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Set<Discount> discounts) {
        this.discounts = discounts;
    }

    public MBOProduct getMboProducts() {
        return mboProducts;
    }

    public void setMboProducts(MBOProduct mboProducts) {
        this.mboProducts = mboProducts;
    }

    public Set<Taxes> getTaxess() {
        return taxess;
    }

    public void setTaxess(Set<Taxes> taxess) {
        this.taxess = taxess;
    }

    public FullfilmentCenter getFullfilmentCenter() {
        return fullfilmentCenter;
    }

    public void setFullfilmentCenter(FullfilmentCenter fullfilmentCenter) {
        this.fullfilmentCenter = fullfilmentCenter;
    }

    public PackagingType getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderLine orderLine = (OrderLine) o;
        return Objects.equals(id, orderLine.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OrderLine{" +
            "id=" + id +
            ", slaEndTime='" + slaEndTime + "'" +
            ", warehoueItemId='" + warehoueItemId + "'" +
            ", orderLineId='" + orderLineId + "'" +
            ", sapOrderNo='" + sapOrderNo + "'" +
            '}';
    }
}
