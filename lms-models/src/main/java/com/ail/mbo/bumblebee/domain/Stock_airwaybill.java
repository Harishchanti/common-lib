package com.ail.mbo.bumblebee.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Stock_airwaybill.
 */
@Entity
@Table(name = "STOCK_AIRWAYBILL")
//@Cache(usage = CacheConcurrencyStrategy.NONE)
@Cacheable(false)
public class Stock_airwaybill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "awb", nullable = false)
    private String awb;

    @NotNull
    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "type")
    private String type;

    @ManyToOne
    private Courier courier;

    @ManyToOne
    private Payment_type payment_type;

    @ManyToOne
    private Service_type service_type;
    
    @Column(name = "replaced_awb")
    private String replaced_awb;

    @Column(name = "consignment_id")
    private String consignment_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Payment_type getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(Payment_type payment_type) {
        this.payment_type = payment_type;
    }

    public Service_type getService_type() {
        return service_type;
    }

    public void setService_type(Service_type service_type) {
        this.service_type = service_type;
    }

    public String getReplaced_awb() {
		return replaced_awb;
	}

	public void setReplaced_awb(String replaced_awb) {
		this.replaced_awb = replaced_awb;
	}

	public String getConsignment_id() {
		return consignment_id;
	}

	public void setConsignment_id(String consignment_id) {
		this.consignment_id = consignment_id;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Stock_airwaybill stock_airwaybill = (Stock_airwaybill) o;

        if ( ! Objects.equals(id, stock_airwaybill.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Stock_airwaybill{" +
                "id=" + id +
                ", awb='" + awb + "'" +
                ", status='" + status + "'" +
                ", type='" + type + "'" +
                '}';
    }

}
