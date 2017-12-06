package com.ail.mbo.bumblebee.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ail.mbo.bumblebee.domain.util.CustomDateTimeDeserializer;
import com.ail.mbo.bumblebee.domain.util.CustomDateTimeSerializer;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * A ReturnShipmentTransactions.
 */
@Entity
@Table(name = "RETURNSHIPMENTTRANSACTIONS")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnShipmentTransactions implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "order_ref")
    private String orderRef;

    @Column(name = "return_id")
    private String returnId;

    @Column(name = "awb")
    private String awb;

    @Column(name = "invoice_id")
    private String invoiceId;

    @Column(name = "amount", precision=10, scale=2)
    private BigDecimal amount;

    @Column(name = "lms_status")
    private String lmsStatus;

    @Column(name = "tat")
    private Integer tat;

    @Column(name = "cost", precision=10, scale=2)
    private BigDecimal cost;

    @Column(name = "length")
    private Double length;

    @Column(name = "breadth")
    private Double breadth;

    @Column(name = "height")
    private Double height;

    @Column(name = "volumetric_weight")
    private Double volumetricWeight;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_address")
    private String customerAddress;

    @Column(name = "customer_phone")
    private String customerPhone;

    @Column(name = "customer_city")
    private String customerCity;

    @Column(name = "customer_state")
    private String customerState;

    @Column(name = "customer_country")
    private String customerCountry;

    @Column(name = "dc_name")
    private String dcName;

    @Column(name = "dc_code")
    private String dcCode;

    @Column(name = "customer_pincode")
    private String customerPincode;

    @Column(name = "attempt_count")
    private Integer attemptCount;

    @Column(name = "packaging_type")
    private String packagingType;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "promise_date")
    private DateTime promiseDate;

    @Column(name = "comments")
    private String comments;

    @Column(name = "source_fc_id")
    private String sourceFcId;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "in_scan_date_time")
    private DateTime inScanDateTime;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "delivered_date_time")
    private DateTime deliveredDateTime;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "last_updated_date_time")
    private DateTime lastUpdatedDateTime;

    @Column(name = "consignment_id")
    private String consignmentId;

    @Column(name = "courier_name")
    private String courierName;

    @Column(name = "destination_fc_id")
    private String destinationFcId;

    @Column(name = "quantity_received")
    private Integer quantityReceived;

    @Column(name = "quantity_declared")
    private Integer quantityDeclared;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "created_date_time")
    private DateTime createdDateTime;

    @Column(name = "qc_status")
    private String qcStatus;

    @Column(name = "package_status")
    private String packageStatus;

    @Column(name = "return_type")
    private String returnType;

    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    @Column(name = "pick_up_date_time")
    private DateTime pickUpDateTime;

    @Column(name = "courier_status")
    private String courierStatus;
    
    
    @Column(name = "MP_NAME")
	private String marketPlaceName;
	
	@Column(name = "MP_ORDER_ID")
	private String marketPlaceOrderId;
	
	@Column(name = "MP_SUB_ORDER_ID")
	private String marketPlaceSubOrderId;

    public String getMarketPlaceName() {
		return marketPlaceName;
	}

	public void setMarketPlaceName(String marketPlaceName) {
		this.marketPlaceName = marketPlaceName;
	}

	public String getMarketPlaceOrderId() {
		return marketPlaceOrderId;
	}

	public void setMarketPlaceOrderId(String marketPlaceOrderId) {
		this.marketPlaceOrderId = marketPlaceOrderId;
	}

	public String getMarketPlaceSubOrderId() {
		return marketPlaceSubOrderId;
	}

	public void setMarketPlaceSubOrderId(String marketPlaceSubOrderId) {
		this.marketPlaceSubOrderId = marketPlaceSubOrderId;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderRef() {
        return orderRef;
    }

    public void setOrderRef(String orderRef) {
        this.orderRef = orderRef;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getLmsStatus() {
        return lmsStatus;
    }

    public void setLmsStatus(String lmsStatus) {
        this.lmsStatus = lmsStatus;
    }

    public Integer getTat() {
        return tat;
    }

    public void setTat(Integer tat) {
        this.tat = tat;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getBreadth() {
        return breadth;
    }

    public void setBreadth(Double breadth) {
        this.breadth = breadth;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getVolumetricWeight() {
        return volumetricWeight;
    }

    public void setVolumetricWeight(Double volumetricWeight) {
        this.volumetricWeight = volumetricWeight;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getCustomerCountry() {
        return customerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }

    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName;
    }

    public String getDcCode() {
        return dcCode;
    }

    public void setDcCode(String dcCode) {
        this.dcCode = dcCode;
    }

    public String getCustomerPincode() {
        return customerPincode;
    }

    public void setCustomerPincode(String customerPincode) {
        this.customerPincode = customerPincode;
    }

    public Integer getAttemptCount() {
        return attemptCount;
    }

    public void setAttemptCount(Integer attemptCount) {
        this.attemptCount = attemptCount;
    }

    public String getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
    }

    public DateTime getPromiseDate() {
        return promiseDate;
    }

    public void setPromiseDate(DateTime promiseDate) {
        this.promiseDate = promiseDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSourceFcId() {
        return sourceFcId;
    }

    public void setSourceFcId(String sourceFcId) {
        this.sourceFcId = sourceFcId;
    }

    public DateTime getInScanDateTime() {
        return inScanDateTime;
    }

    public void setInScanDateTime(DateTime inScanDateTime) {
        this.inScanDateTime = inScanDateTime;
    }

    public DateTime getDeliveredDateTime() {
        return deliveredDateTime;
    }

    public void setDeliveredDateTime(DateTime deliveredDateTime) {
        this.deliveredDateTime = deliveredDateTime;
    }

    public DateTime getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    public void setLastUpdatedDateTime(DateTime lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    public String getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(String consignmentId) {
        this.consignmentId = consignmentId;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getDestinationFcId() {
        return destinationFcId;
    }

    public void setDestinationFcId(String destinationFcId) {
        this.destinationFcId = destinationFcId;
    }

    public Integer getQuantityReceived() {
        return quantityReceived;
    }

    public void setQuantityReceived(Integer quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public Integer getQuantityDeclared() {
        return quantityDeclared;
    }

    public void setQuantityDeclared(Integer quantityDeclared) {
        this.quantityDeclared = quantityDeclared;
    }

    public DateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(DateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getQcStatus() {
        return qcStatus;
    }

    public void setQcStatus(String qcStatus) {
        this.qcStatus = qcStatus;
    }

    public String getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public DateTime getPickUpDateTime() {
        return pickUpDateTime;
    }

    public void setPickUpDateTime(DateTime pickUpDateTime) {
        this.pickUpDateTime = pickUpDateTime;
    }

    public String getCourierStatus() {
        return courierStatus;
    }

    public void setCourierStatus(String courierStatus) {
        this.courierStatus = courierStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReturnShipmentTransactions returnShipmentTransactions = (ReturnShipmentTransactions) o;

        if ( ! Objects.equals(id, returnShipmentTransactions.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnShipmentTransactions{" +
                "id=" + id +
                ", orderRef='" + orderRef + "'" +
                ", returnId='" + returnId + "'" +
                ", awb='" + awb + "'" +
                ", invoiceId='" + invoiceId + "'" +
                ", amount='" + amount + "'" +
                ", lmsStatus='" + lmsStatus + "'" +
                ", tat='" + tat + "'" +
                ", cost='" + cost + "'" +
                ", length='" + length + "'" +
                ", breadth='" + breadth + "'" +
                ", height='" + height + "'" +
                ", volumetricWeight='" + volumetricWeight + "'" +
                ", customerName='" + customerName + "'" +
                ", customerAddress='" + customerAddress + "'" +
                ", customerPhone='" + customerPhone + "'" +
                ", customerCity='" + customerCity + "'" +
                ", customerState='" + customerState + "'" +
                ", customerCountry='" + customerCountry + "'" +
                ", dcName='" + dcName + "'" +
                ", dcCode='" + dcCode + "'" +
                ", customerPincode='" + customerPincode + "'" +
                ", attemptCount='" + attemptCount + "'" +
                ", packagingType='" + packagingType + "'" +
                ", promiseDate='" + promiseDate + "'" +
                ", comments='" + comments + "'" +
                ", sourceFcId='" + sourceFcId + "'" +
                ", inScanDateTime='" + inScanDateTime + "'" +
                ", deliveredDateTime='" + deliveredDateTime + "'" +
                ", lastUpdatedDateTime='" + lastUpdatedDateTime + "'" +
                ", consignmentId='" + consignmentId + "'" +
                ", courierName='" + courierName + "'" +
                ", destinationFcId='" + destinationFcId + "'" +
                ", quantityReceived='" + quantityReceived + "'" +
                ", quantityDeclared='" + quantityDeclared + "'" +
                ", createdDateTime='" + createdDateTime + "'" +
                ", qcStatus='" + qcStatus + "'" +
                ", packageStatus='" + packageStatus + "'" +
                ", returnType='" + returnType + "'" +
                ", pickUpDateTime='" + pickUpDateTime + "'" +
                ", courierStatus='" + courierStatus + "'" +
                '}';
    }
}
