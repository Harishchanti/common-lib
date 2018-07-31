package com.ailiens.optimusprime.autobots.rest.dto.LMSDTOs;

import com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails.ConsignmentDTO;
import com.ailiens.optimusprime.domain.Consignment;
import com.ailiens.optimusprime.domain.OrderLine;
import com.ailiens.optimusprime.domain.PackagingType;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.List;

public class LMSConsignmentDTO {

    private Integer length;
    private Integer breadth;
    private Integer height;
    private String packageType;
    private DateTime created;
    private List<LMSProductsInConsignmentDetailsDTO> lmsProductsInConsignmentDetailsDTOS;
    private Customer destinationAddress;
    private String consignmentId;
    private String storeId;
    private String orderId;
    private String paymentType;
    private String serviceType;
    private BigDecimal amount  = new BigDecimal(0.0);
    private BigDecimal collectableAmount = new BigDecimal(0.0);
    private String initialServiceType;
    private String invoiceNo;



    public LMSConsignmentDTO(Consignment consignment, String orderId, List<LMSProductsInConsignmentDetailsDTO> lmsProductsInConsigDetDTOs, Customer customer, String invoiceNo, BigDecimal amount) {

        OrderLine orderLine =  consignment.getOrderLines().iterator().next();

        PackagingType packagingType = orderLine.getPackagingType();
        this.length =  packagingType.getPackagingLength();
        this.breadth =  packagingType.getPackagingBreadth();
        this.height =  packagingType.getPackagingHeight();
        this.packageType =  packagingType.getPackagingTypeName();
        this.created =  DateTime.now();
        this.consignmentId =  consignment.getConsignmentId();
        this.orderId = orderId;
        this.storeId =  consignment.getFulfillmentCenterId();
        this.serviceType =  consignment.getFcType();

        if(orderLine.getInitialFullfilmentType() !=null){
            this.initialServiceType =  orderLine.getInitialFullfilmentType().getType();
        }else{
            this.initialServiceType =  null;
        }

        this.lmsProductsInConsignmentDetailsDTOS = lmsProductsInConsigDetDTOs;
        this.destinationAddress = customer;

        this.invoiceNo = invoiceNo;

        this.amount = amount;

    }


    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getBreadth() {
        return breadth;
    }

    public void setBreadth(Integer breadth) {
        this.breadth = breadth;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }

    public List<LMSProductsInConsignmentDetailsDTO> getLmsProductsInConsignmentDetailsDTOS() {
        return lmsProductsInConsignmentDetailsDTOS;
    }

    public void setLmsProductsInConsignmentDetailsDTOS(List<LMSProductsInConsignmentDetailsDTO> lmsProductsInConsignmentDetailsDTOS) {
        this.lmsProductsInConsignmentDetailsDTOS = lmsProductsInConsignmentDetailsDTOS;
    }

    public Customer getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(Customer destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(String consignmentId) {
        this.consignmentId = consignmentId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getCollectableAmount() {
        return collectableAmount;
    }

    public void setCollectableAmount(BigDecimal collectableAmount) {
        this.collectableAmount = collectableAmount;
    }

    public String getInitialServiceType() {
        return initialServiceType;
    }

    public void setInitialServiceType(String initialServiceType) {
        this.initialServiceType = initialServiceType;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
}
