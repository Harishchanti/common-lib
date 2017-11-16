package com.ail.mbo.bumblebee.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.ail.mbo.bumblebee.domain.util.CustomDateTimeDeserializer;
import com.ail.mbo.bumblebee.domain.util.CustomDateTimeSerializer;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Shipment_transactions.
 */
@Entity
@Table(name = "SHIPMENT_TRANSACTIONS")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Shipment_transactions implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@Column(name = "order_ref", nullable = false)
	private String orderRef;

	@NotNull
	@Column(name = "invoice_id", nullable = false)
	private String invoiceId;

	@NotNull
	@Column(name = "shipment_id", nullable = false)
	private String shipmentId;

	@NotNull
	@Column(name = "amount", precision = 10, scale = 2, nullable = false)
	private BigDecimal amount;

	@Column(name = "awb")
	private String awb;

	@Column(name = "status")
	private String status;

	@NotNull
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	@Column(name = "time", nullable = false)
	private DateTime time;

	@Column(name = "volumentricweight")
	private Double volumentricweight;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	@Column(name = "in_scan_time", nullable = false)
	private DateTime in_scan_time;

	@Column(name = "description")
	private String description;

	@Column(name = "cost", precision = 10, scale = 2, nullable = false)
	private BigDecimal cost;

	@Column(name = "tat")
	private Long tat;

	@Column(name = "courier_status")
	private String courierStatus;

	@Column(name = "length")
	private Double length;

	@Column(name = "breadth")
	private Double breadth;

	@Column(name = "height")
	private Double height;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "customer_address")
	private String customerAddress;

	@Column(name = "customer_city")
	private String customerCity;

	@Column(name = "customer_state")
	private String customerState;

	@Column(name = "customer_country")
	private String customerCountry;

	@Column(name = "customer_phone")
	private String customerPhone;

	@Column(name = "dc_name")
	private String dcName;

	@Column(name = "dc_code")
	private String dcCode;

	@NotNull
	@Size(min = 6, max = 6)
	@Column(name = "dest_pincode", length = 6, nullable = false)
	private String dest_pincode;

	@Column(name = "packaging_type")
	private String packagingType;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	@Column(name = "promise_date", nullable = false)
	private DateTime promiseDate;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	@Column(name = "shipping_date", nullable = false)
	private DateTime shippingDate;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	@Column(name = "delivered_date", nullable = false)
	private DateTime deliveredDate;

	@Column(name = "attempt_count")
	private Integer attemptCount;

	@Column(name = "fulfillment_city")
	private String fulfillmentCity;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	@Column(name = "awb_date", nullable = false)
	private DateTime awbDate;

	@Column(name = "comment")
	private String comment;

	@Column(name = "consignment_source")
	private String consignmentSource;

	@Column(name = "rto_package_status")
	private String rtoPackageStatus;

	@Column(name = "rto_awb")
	private String rtoAwb;

	@Column(name = "collectable_amount", precision = 10, scale = 2, nullable = false)
	private BigDecimal collectableAmount;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@JsonSerialize(using = CustomDateTimeSerializer.class)
	@JsonDeserialize(using = CustomDateTimeDeserializer.class)
	@Column(name = "first_attempt_date", nullable = false)
	private DateTime firstAttemptDate;

	@Column(name = "initial_service")
	private String initialService;

	@ManyToOne
	private Fulfillment_center fulfillment_center;

	@ManyToOne
	private Courier courier;

	@ManyToOne
	private Payment_service_mapper payment_service_mapper;

	@ManyToOne
	private Master_bag master_bag;

	@ManyToOne
	private Dest_cluster dest_cluster;
	 
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

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public DateTime getTime() {
		return time;
	}

	public void setTime(DateTime time) {
		this.time = time;
	}

	public Double getVolumentricweight() {
		return volumentricweight;
	}

	public void setVolumentricweight(Double volumentricweight) {
		this.volumentricweight = volumentricweight;
	}

	public DateTime getIn_scan_time() {
		return in_scan_time;
	}

	public void setIn_scan_time(DateTime in_scan_time) {
		this.in_scan_time = in_scan_time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public Long getTat() {
		return tat;
	}

	public void setTat(Long tat) {
		this.tat = tat;
	}

	public String getCourierStatus() {
		return courierStatus;
	}

	public void setCourierStatus(String courierStatus) {
		this.courierStatus = courierStatus;
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

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
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

	public String getDest_pincode() {
		return dest_pincode;
	}

	public void setDest_pincode(String dest_pincode) {
		this.dest_pincode = dest_pincode;
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

	public DateTime getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(DateTime shippingDate) {
		this.shippingDate = shippingDate;
	}

	public DateTime getDeliveredDate() {
		return deliveredDate;
	}

	public void setDeliveredDate(DateTime deliveredDate) {
		this.deliveredDate = deliveredDate;
	}

	public Integer getAttemptCount() {
		return attemptCount;
	}

	public void setAttemptCount(Integer attemptCount) {
		this.attemptCount = attemptCount;
	}

	public String getFulfillmentCity() {
		return fulfillmentCity;
	}

	public void setFulfillmentCity(String fulfillmentCity) {
		this.fulfillmentCity = fulfillmentCity;
	}

	public DateTime getAwbDate() {
		return awbDate;
	}

	public void setAwbDate(DateTime awbDate) {
		this.awbDate = awbDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getConsignmentSource() {
		return consignmentSource;
	}

	public void setConsignmentSource(String consignmentSource) {
		this.consignmentSource = consignmentSource;
	}

	public String getRtoPackageStatus() {
		return rtoPackageStatus;
	}

	public void setRtoPackageStatus(String rtoPackageStatus) {
		this.rtoPackageStatus = rtoPackageStatus;
	}

	public String getRtoAwb() {
		return rtoAwb;
	}

	public void setRtoAwb(String rtoAwb) {
		this.rtoAwb = rtoAwb;
	}

	public BigDecimal getCollectableAmount() {
		return collectableAmount;
	}

	public void setCollectableAmount(BigDecimal collectableAmount) {
		this.collectableAmount = collectableAmount;
	}

	public DateTime getFirstAttemptDate() {
		return firstAttemptDate;
	}

	public void setFirstAttemptDate(DateTime firstAttemptDate) {
		this.firstAttemptDate = firstAttemptDate;
	}

	public Fulfillment_center getFulfillment_center() {
		return fulfillment_center;
	}

	public void setFulfillment_center(Fulfillment_center fulfillment_center) {
		this.fulfillment_center = fulfillment_center;
	}

	public Courier getCourier() {
		return courier;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public Payment_service_mapper getPayment_service_mapper() {
		return payment_service_mapper;
	}

	public void setPayment_service_mapper(Payment_service_mapper payment_service_mapper) {
		this.payment_service_mapper = payment_service_mapper;
	}

	public Master_bag getMaster_bag() {
		return master_bag;
	}

	public void setMaster_bag(Master_bag master_bag) {
		this.master_bag = master_bag;
	}

	public Dest_cluster getDest_cluster() {
		return dest_cluster;
	}

	public void setDest_cluster(Dest_cluster dest_cluster) {
		this.dest_cluster = dest_cluster;
	}

	public String getInitialService() {
		return initialService;
	}

	public void setInitialService(String initialService) {
		this.initialService = initialService;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Shipment_transactions shipment_transactions = (Shipment_transactions) o;

		if (!Objects.equals(id, shipment_transactions.id))
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

	@Override
	public String toString() {
		return "Shipment_transactions{" + "id=" + id + ", orderRef='" + orderRef + "'" + ", invoiceId='" + invoiceId
				+ "'" + ", shipmentId='" + shipmentId + "'" + ", amount='" + amount + "'" + ", awb='" + awb + "'"
				+ ", status='" + status + "'" + ", time='" + time + "'" + ", volumentricweight='" + volumentricweight
				+ "'" + ", in_scan_time='" + in_scan_time + "'" + ", description='" + description + "'" + ", cost='"
				+ cost + "'" + ", tat='" + tat + "'" + ", courierStatus='" + courierStatus + "'" + ", length='" + length
				+ "'" + ", breadth='" + breadth + "'" + ", height='" + height + "'" + ", customerName='" + customerName
				+ "'" + ", customerAddress='" + customerAddress + "'" + ", customerCity='" + customerCity + "'"
				+ ", customerState='" + customerState + "'" + ", customerCountry='" + customerCountry + "'"
				+ ", customerPhone='" + customerPhone + "'" + ", dcName='" + dcName + "'" + ", dcCode='" + dcCode + "'"
				+ ", dest_pincode='" + dest_pincode + "'" + ", packagingType='" + packagingType + "'"
				+ ", promiseDate='" + promiseDate + "'" + ", shippingDate='" + shippingDate + "'" + ", deliveredDate='"
				+ deliveredDate + "'" + ", attemptCount='" + attemptCount + "'" + ", fulfillmentCity='"
				+ fulfillmentCity + "'" + ", awbDate='" + awbDate + "'" + ", comment='" + comment + "'"
				+ ", consignmentSource='" + consignmentSource + "'" + ", rtoPackageStatus='" + rtoPackageStatus + "'"
				+ ", rtoAwb='" + rtoAwb + "'" + ", collectableAmount='" + collectableAmount + "'"
				+ ", firstAttemptDate='" + firstAttemptDate + "'" + ", initialService='" + initialService + "'" + '}';
	}
}
