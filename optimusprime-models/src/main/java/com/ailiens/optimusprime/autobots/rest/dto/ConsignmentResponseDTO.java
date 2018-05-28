package com.ailiens.optimusprime.autobots.rest.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * Venky
 */
public class ConsignmentResponseDTO {

	private Long id;
	private int courierId;
	private String courierName;
	private String courierReferenceId;
	private int sourceId;
	private String consignmentId;
	private ZonedDateTime slaEndTime;
	private String deliveryType;
	private String workflowId;
	private Long consignmentstateId;
	private Long fullfillmentType;
	private String orderType;
	private Integer itemCount;
	private BigDecimal consignmentTradeSp;
	private BigDecimal consignmentNetAmount;
	private String customerName;
	private String awbNumber;
	private ZonedDateTime deliveryDate;
	private String orderingCenterId;
	private String orderingCenterName;
	private String fulfillmentCenterId;
	private String fulfillmentCenterName;
	private ZonedDateTime consignmentStamp;
	private String initialDeliveryType;
	private String fcType;
	private String orderId;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCourierId() {
		return courierId;
	}

	public void setCourierId(int courierId) {
		this.courierId = courierId;
	}

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public String getCourierReferenceId() {
		return courierReferenceId;
	}

	public void setCourierReferenceId(String courierReferenceId) {
		this.courierReferenceId = courierReferenceId;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}


	public String getConsignmentId() {
		return consignmentId;
	}

	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}

	public ZonedDateTime getSlaEndTime() {
		return slaEndTime;
	}

	public void setSlaEndTime(ZonedDateTime slaEndTime) {
		this.slaEndTime = slaEndTime;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}

	public Long getConsignmentstateId() {
		return consignmentstateId;
	}

	public void setConsignmentstateId(Long consignmentstateId) {
		this.consignmentstateId = consignmentstateId;
	}

	public Long getFullfillmentType() {
		return fullfillmentType;
	}

	public void setFullfillmentType(Long fullfillmentType) {
		this.fullfillmentType = fullfillmentType;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Integer getItemCount() {
		return itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public BigDecimal getConsignmentTradeSp() {
		return consignmentTradeSp;
	}

	public void setConsignmentTradeSp(BigDecimal consignmentTradeSp) {
		this.consignmentTradeSp = consignmentTradeSp;
	}

	public BigDecimal getConsignmentNetAmount() {
		return consignmentNetAmount;
	}

	public void setConsignmentNetAmount(BigDecimal consignmentNetAmount) {
		this.consignmentNetAmount = consignmentNetAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	public ZonedDateTime getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(ZonedDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getOrderingCenterId() {
		return orderingCenterId;
	}

	public void setOrderingCenterId(String orderingCenterId) {
		this.orderingCenterId = orderingCenterId;
	}

	public String getOrderingCenterName() {
		return orderingCenterName;
	}

	public void setOrderingCenterName(String orderingCenterName) {
		this.orderingCenterName = orderingCenterName;
	}

	public String getFulfillmentCenterId() {
		return fulfillmentCenterId;
	}

	public void setFulfillmentCenterId(String fulfillmentCenterId) {
		this.fulfillmentCenterId = fulfillmentCenterId;
	}

	public String getFulfillmentCenterName() {
		return fulfillmentCenterName;
	}

	public void setFulfillmentCenterName(String fulfillmentCenterName) {
		this.fulfillmentCenterName = fulfillmentCenterName;
	}

	public ZonedDateTime getConsignmentStamp() {
		return consignmentStamp;
	}

	public void setConsignmentStamp(ZonedDateTime consignmentStamp) {
		this.consignmentStamp = consignmentStamp;
	}

	public String getInitialDeliveryType() {
		return initialDeliveryType;
	}

	public void setInitialDeliveryType(String initialDeliveryType) {
		this.initialDeliveryType = initialDeliveryType;
	}

	public String getFcType() {
		return fcType;
	}

	public void setFcType(String fcType) {
		this.fcType = fcType;
	}

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

	/*public ConsignmentResponseDTO(Long id, Long courierId, String courierName, String courierReferenceId, String consignmentId,
			ZonedDateTime slaEndTime, String deliveryType, String workflowId, Long consignmentstateId,
			Long fullfillmentType, String orderType, Integer itemCount, BigDecimal consignmentTradeSp,
			BigDecimal consignmentNetAmount, String customerName, String awbNumber, ZonedDateTime deliveryDate,
			String orderingCenterId, String orderingCenterName, String fulfillmentCenterId,
			String fulfillmentCenterName, ZonedDateTime consignmentStamp, String initialDeliveryType, String fcType) {
		super();
		this.id = id;
		this.courierId = courierId;
		this.courierName = courierName;
		this.courierReferenceId = courierReferenceId;
		this.consignmentId = consignmentId;
		this.slaEndTime = slaEndTime;
		this.deliveryType = deliveryType;
		this.workflowId = workflowId;
		this.consignmentstateId = consignmentstateId;
		this.fullfillmentType = fullfillmentType;
		this.orderType = orderType;
		this.itemCount = itemCount;
		this.consignmentTradeSp = consignmentTradeSp;
		this.consignmentNetAmount = consignmentNetAmount;
		this.customerName = customerName;
		this.awbNumber = awbNumber;
		this.deliveryDate = deliveryDate;
		this.orderingCenterId = orderingCenterId;
		this.orderingCenterName = orderingCenterName;
		this.fulfillmentCenterId = fulfillmentCenterId;
		this.fulfillmentCenterName = fulfillmentCenterName;
		this.consignmentStamp = consignmentStamp;
		this.initialDeliveryType = initialDeliveryType;
		this.fcType = fcType;
	}
*/





	/*public ConsignmentResponseDTO(Long id, int courierId, String courierName, String courierReferenceId,
			String consignmentId, ZonedDateTime slaEndTime, String deliveryType, String workflowId,
			Long consignmentstateId, Long fullfillmentType, String orderType, Integer itemCount,
			BigDecimal consignmentTradeSp, BigDecimal consignmentNetAmount, String customerName, String awbNumber,
			ZonedDateTime deliveryDate, String orderingCenterId, String orderingCenterName, String fulfillmentCenterId,
			String fulfillmentCenterName, ZonedDateTime consignmentStamp, String initialDeliveryType, String fcType) {
		super();
		this.id = id;
		this.courierId = courierId;
		this.courierName = courierName;
		this.courierReferenceId = courierReferenceId;
		this.consignmentId = consignmentId;
		this.slaEndTime = slaEndTime;
		this.deliveryType = deliveryType;
		this.workflowId = workflowId;
		this.consignmentstateId = consignmentstateId;
		this.fullfillmentType = fullfillmentType;
		this.orderType = orderType;
		this.itemCount = itemCount;
		this.consignmentTradeSp = consignmentTradeSp;
		this.consignmentNetAmount = consignmentNetAmount;
		this.customerName = customerName;
		this.awbNumber = awbNumber;
		this.deliveryDate = deliveryDate;
		this.orderingCenterId = orderingCenterId;
		this.orderingCenterName = orderingCenterName;
		this.fulfillmentCenterId = fulfillmentCenterId;
		this.fulfillmentCenterName = fulfillmentCenterName;
		this.consignmentStamp = consignmentStamp;
		this.initialDeliveryType = initialDeliveryType;
		this.fcType = fcType;
	}
*/

	public ConsignmentResponseDTO(Long id, int courierId, String courierName, String courierReferenceId,int sourceId,
			String consignmentId, ZonedDateTime slaEndTime,String deliveryType, String workflowId,
			Long consignmentstateId, Long fullfillmentType,String orderType, Integer itemCount,
			BigDecimal consignmentTradeSp, BigDecimal consignmentNetAmount,String customerName, String awbNumber,
			ZonedDateTime deliveryDate,String orderingCenterId, String orderingCenterName,String fulfillmentCenterId, String fulfillmentCenterName,
			String initialDeliveryType, String fcType, String orderId) {
		super();
		this.id = id;
		this.courierId = courierId;
		this.courierName = courierName;
		this.courierReferenceId = courierReferenceId;
		this.sourceId = sourceId;
		this.consignmentId = consignmentId;
		this.slaEndTime = slaEndTime;
		this.deliveryType = deliveryType;
		this.workflowId = workflowId;
		this.consignmentstateId = consignmentstateId;
		this.fullfillmentType = fullfillmentType;
		this.orderType = orderType;
		this.itemCount = itemCount;
		this.consignmentTradeSp = consignmentTradeSp;
		this.consignmentNetAmount = consignmentNetAmount;
		this.customerName = customerName;
		this.awbNumber = awbNumber;
		this.deliveryDate = deliveryDate;
		this.orderingCenterId = orderingCenterId;
		this.orderingCenterName = orderingCenterName;
		this.fulfillmentCenterId = fulfillmentCenterId;
		this.fulfillmentCenterName = fulfillmentCenterName;
		this.initialDeliveryType = initialDeliveryType;
		this.fcType = fcType;
		this.orderId = orderId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConsignmentResponseDTO consignment = (ConsignmentResponseDTO) o;
		return Objects.equals(id, consignment.id);
	}


	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}

}
