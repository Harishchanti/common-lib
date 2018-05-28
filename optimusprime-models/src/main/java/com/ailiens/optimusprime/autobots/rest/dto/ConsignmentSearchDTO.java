package com.ailiens.optimusprime.autobots.rest.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ailiens.optimusprime.domain.SourceMetadata;

import java.math.BigDecimal;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by yashika on 6/1/17.
 */
public class ConsignmentSearchDTO {

    private final Logger log = LoggerFactory.getLogger(ConsignmentSearchDTO.class);

    private String orderId;
    private ZonedDateTime orderDate;
    private String consignmentId;
    private ZonedDateTime slaEndTime;
    private String deliveryType;
    private String initialDeliveryType;
    private String orderType;
    private Integer itemCount;
    private BigDecimal consignmentTradeSp;
    private BigDecimal consignmentNetAmount;
    private String customerName;
    private String awbNumber;
    private ZonedDateTime deliveryDate;
    private ZonedDateTime consignmentStamp;
    private String orderingCenterId;
    private String orderingCenterName;
    private String fulfillmentCenterId;
    private String fulfillmentCenterName;
    private String consignmentStatus;
    private String orderStatus;
    private SourceMetadata source;
    private String sourceOrderId;  //ADDED  source id  for BT search  @adi
    private String sourceSubOrderId;

//    public ConsignmentSearchDTO(Object ...objects)
//    {
//        this.orderId = objects[0]!=null?String.valueOf(objects[0]):null;
//        this.orderDate =  objects[1]!=null?(ZonedDateTime)objects[1]:null;
//        this.consignmentId = objects[2]!=null?String.valueOf(objects[2]):null;
//        this.slaEndTime = objects[3]!=null?(ZonedDateTime)objects[3]:null;
//        this.deliveryType = objects[4]!=null?String.valueOf(objects[4]):null;
//        this.initialDeliveryType = objects[5]!=null?String.valueOf(objects[5]):null;
//        this.orderType = objects[6]!=null?String.valueOf(objects[6]):null;
//        this.itemCount = objects[7]!=null?Integer.parseInt(objects[7].toString()):null;
//        this.consignmentTradeSp = objects[8]!=null?new BigDecimal(objects[8].toString()):null;
//        this.consignmentNetAmount = objects[9]!=null?new BigDecimal(objects[9].toString()):null;
//        this.customerName = objects[10]!=null?String.valueOf(objects[10]):null;
//        this.awbNumber = objects[11]!=null?String.valueOf(objects[11]):null;
//        this.deliveryDate = objects[12]!=null?(ZonedDateTime)objects[12]:null;
//        this.consignmentStamp = objects[13]!=null?(ZonedDateTime)objects[13]:null;
//        this.orderingStoreId = objects[14]!=null?String.valueOf(objects[14]):null;
//        this.orderingStoreName = objects[15]!=null?String.valueOf(objects[15]):null;
//        this.fulfillmentCenterId = objects[16]!=null?String.valueOf(objects[16]):null;
//        this.fulfillmentCenterName = objects[17]!=null?String.valueOf(objects[17]):null;
//        this.consignmentStatus = objects[18]!=null?String.valueOf(objects[18]):null;
//        this.orderStatus = objects[19]!=null?String.valueOf(objects[19]):null;
//
//    }


    public ConsignmentSearchDTO() {
    }

    public String getSourceSubOrderId() {
		return sourceSubOrderId;
	}

	public void setSourceSubOrderId(String sourceSubOrderId) {
		this.sourceSubOrderId = sourceSubOrderId;
	}

	public ConsignmentSearchDTO(ConsignmentSearchDTO consignmentSearchDTO) {
    }

    public ConsignmentSearchDTO(String orderId, ZonedDateTime orderDate,
                                String consignmentId, ZonedDateTime slaEndTime,
                                String deliveryType, String initialDeliveryType,
                                String orderType, Integer itemCount,
                                BigDecimal consignmentTradeSp, BigDecimal consignmentNetAmount,
                                String customerName, String awbNumber, ZonedDateTime deliveryDate,
                                ZonedDateTime consignmentStamp, String orderingCenterId,
                                String orderingCenterName, String fulfillmentCenterId,
                                String fulfillmentCenterName, String consignmentStatus, String orderStatus,
                                SourceMetadata source, String sourceId ,String sourceSubOrderId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.consignmentId = consignmentId;
        this.slaEndTime = slaEndTime;
        this.deliveryType = deliveryType;
        this.initialDeliveryType = initialDeliveryType;
        this.orderType = orderType;
        this.itemCount = itemCount;
        this.consignmentTradeSp = consignmentTradeSp;
        this.consignmentNetAmount = consignmentNetAmount;
        this.customerName = customerName;
        this.awbNumber = awbNumber;
        this.deliveryDate = deliveryDate;
        this.consignmentStamp = consignmentStamp;
        this.orderingCenterId = orderingCenterId;
        this.orderingCenterName = orderingCenterName;
        this.fulfillmentCenterId = fulfillmentCenterId;
        this.fulfillmentCenterName = fulfillmentCenterName;
        this.consignmentStatus = consignmentStatus;
        this.orderStatus = orderStatus;
        this.source = source;
        this.sourceOrderId = sourceId;
        this.sourceSubOrderId=sourceSubOrderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ZonedDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(ZonedDateTime orderDate) {
        this.orderDate = orderDate;
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

    public String getInitialDeliveryType() {
        return initialDeliveryType;
    }

    public void setInitialDeliveryType(String initialDeliveryType) {
        this.initialDeliveryType = initialDeliveryType;
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

    public ZonedDateTime getConsignmentStamp() {
        return consignmentStamp;
    }

    public void setConsignmentStamp(ZonedDateTime consignmentStamp) {
        this.consignmentStamp = consignmentStamp;
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

    public String getConsignmentStatus() {
        return consignmentStatus;
    }

    public void setConsignmentStatus(String consignmentStatus) {
        this.consignmentStatus = consignmentStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }



    public SourceMetadata getSourceMetadata() {
		return source;
	}

	public void setSourceMetadata(SourceMetadata sourceMetadata) {
		this.source = sourceMetadata;
	}


	public String getSourceOrderId() {
		return sourceOrderId;
	}

	public void setSourceOrderId(String sourceOrderId) {
		this.sourceOrderId = sourceOrderId;
	}

	@Override
    public String toString() {
        return "ConsignmentSearchDTO{" +
            "orderId='" + orderId + '\'' +
            ", orderDate=" + orderDate +
            ", consignmentId='" + consignmentId + '\'' +
            ", slaEndTime=" + slaEndTime +
            ", deliveryType='" + deliveryType + '\'' +
            ", initialDeliveryType='" + initialDeliveryType + '\'' +
            ", orderType='" + orderType + '\'' +
            ", itemCount=" + itemCount +
            ", consignmentTradeSp=" + consignmentTradeSp +
            ", consignmentNetAmount=" + consignmentNetAmount +
            ", customerName='" + customerName + '\'' +
            ", awbNumber='" + awbNumber + '\'' +
            ", deliveryDate=" + deliveryDate +
            ", consignmentStamp=" + consignmentStamp +
            ", orderingStoreId='" + orderingCenterId + '\'' +
            ", orderingStoreName='" + orderingCenterName + '\'' +
            ", fulfillmentCenterId='" + fulfillmentCenterId + '\'' +
            ", fulfillmentCenterName='" + fulfillmentCenterName + '\'' +
            ", consignmentStatus='" + consignmentStatus + '\'' +
            ", orderStatus='" + orderStatus + '\'' +
            ", source'" + source.toString() + '\'' +
            ", sourceOrderId'" + sourceOrderId + '\'' +
            ", sourceSubOrderId'" + sourceSubOrderId + '\'' +

            '}';
    }
}
