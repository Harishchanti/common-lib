package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A Master_bag.
 */
@Entity
@Table(name = "master_bag")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Master_bag implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "creation_time")
    private ZonedDateTime creationtime;

    @Column(name = "handover_time")
    private ZonedDateTime handovertime;

    @Column(name = "courier_name")
    private String courierName;

    @Column(name = "status")
    private String status;

    @Column(name = "fulfillment_center_id")
    private String fulfillmentCenterId;

    @Column(name = "manifest_id")
    private String manifestId;

    @Column(name = "manifest_pdf_path")
    private String manifestPdfPath;

    @Column(name = "market_place")
    private String marketPlace;

    @ManyToOne
    @JoinColumn(name = "courier_id")
    private Courier courier;
    
    
    @Column(name = "fulfillment_center_name")
    private String fulfillmentCenterName;

  

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public ZonedDateTime getCreationtime() {
		return creationtime;
	}



	public void setCreationtime(ZonedDateTime creationtime) {
		this.creationtime = creationtime;
	}



	public ZonedDateTime getHandovertime() {
		return handovertime;
	}



	public void setHandovertime(ZonedDateTime handovertime) {
		this.handovertime = handovertime;
	}



	public String getCourierName() {
		return courierName;
	}



	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getFulfillmentCenterId() {
		return fulfillmentCenterId;
	}



	public void setFulfillmentCenterId(String fulfillmentCenterId) {
		this.fulfillmentCenterId = fulfillmentCenterId;
	}



	public String getManifestId() {
		return manifestId;
	}



	public void setManifestId(String manifestId) {
		this.manifestId = manifestId;
	}



	public String getManifestPdfPath() {
		return manifestPdfPath;
	}



	public void setManifestPdfPath(String manifestPdfPath) {
		this.manifestPdfPath = manifestPdfPath;
	}



	public String getMarketPlace() {
		return marketPlace;
	}



	public void setMarketPlace(String marketPlace) {
		this.marketPlace = marketPlace;
	}



	public Courier getCourier() {
		return courier;
	}



	public void setCourier(Courier courier) {
		this.courier = courier;
	}



	public String getFulfillmentCenterName() {
		return fulfillmentCenterName;
	}



	public void setFulfillmentCenterName(String fulfillmentCenterName) {
		this.fulfillmentCenterName = fulfillmentCenterName;
	}



	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Master_bag master_bag = (Master_bag) o;
        if (master_bag.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), master_bag.getId());
    }
    
    
    
    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }



	@Override
	public String toString() {
		return "Master_bag [id=" + id + ", code=" + code + ", creationtime=" + creationtime + ", handovertime="
				+ handovertime + ", courierName=" + courierName + ", status=" + status + ", fulfillmentCenterId="
				+ fulfillmentCenterId + ", manifestId=" + manifestId + ", manifestPdfPath=" + manifestPdfPath
				+ ", marketPlace=" + marketPlace + ", courier=" + courier + ", fulfillmentCenterName="
				+ fulfillmentCenterName + "]";
	}

    
    
    
//    @Override
//    public String toString() {
//        return "Master_bag{" +
//            "id=" + getId() +
//            ", code='" + getCode() + "'" +
//            ", creation_time='" + getCreation_time() + "'" +
//            ", handover_time='" + getHandover_time() + "'" +
//            ", courier_name='" + getCourier_name() + "'" +
//            ", status='" + getStatus() + "'" +
//            ", fulfillmentCenterId='" + getFulfillment_center_id() + "'" +
//            ", manifest_id='" + getManifest_id() + "'" +
//            ", manifest_pdf_path='" + getManifest_pdf_path() + "'" +
//            ", marketPlace='" + getMarketPlace() + "'" +
//            "}";
//    }
}
