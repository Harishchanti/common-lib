
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.historyDTO.History;
import com.ailiens.optimusprime.domain.OrderLine;

@Generated("org.jsonschema2pojo")
public class ItemDTO {

    public String itemId;
    public String erpInvoiceId;
    public String warehouseItemId;
    public String sapOrderNo;
    public ProductDTO product;
    public String slaEndTime;
    public ItemStatusDTO itemStatus;
    public InitialFfTypeDTO initialFfType;
    public FfTypeDTO ffType;
    public AddressDetailsDTO addressDetails;
    public FfCenterDTO ffCenter;
    public LogisticsDetailsDTO logistics;
    public ItemPricingDetailsDTO itemPricingDetails;
    public List<ImageDTO> images;
    public List<String> relatedItems = new ArrayList<String>();
    public List<History> orderItemHistory = new ArrayList<History>();

    public String clusterId;

    public ItemPricingDetailsDTO shippingCharges;
    public ItemPricingDetailsDTO codCharges;


    public ItemDTO() {

    }

    public ItemDTO(OrderLine orderLine) {
        this.setItemId(orderLine.getOrderLineId());
        this.setWarehouseItemId(orderLine.getWarehoueItemId());
        this.setSapOrderNo(orderLine.getSapOrderNo());
        this.setSlaEndTime(String.valueOf(orderLine.getSlaEndTime()));
        this.setErpInvoiceId(orderLine.getErpInvoiceId());
        this.setClusterId(orderLine.getClusterId());
    }



    public String getItemId() {
        return itemId;
    }



    public void setItemId(String itemId) {
        this.itemId = itemId;
    }



    public String getWarehouseItemId() {
        return warehouseItemId;
    }



    public void setWarehouseItemId(String warehouseItemId) {
        this.warehouseItemId = warehouseItemId;
    }



    public ProductDTO getProduct() {
        return product;
    }



    public void setProduct(ProductDTO product) {
        this.product = product;
    }



    public String getSlaEndTime() {
        return slaEndTime;
    }



    public void setSlaEndTime(String slaEndTime) {
        this.slaEndTime = slaEndTime;
    }



    public ItemStatusDTO getItemStatus() {
        return itemStatus;
    }



    public void setItemStatus(ItemStatusDTO itemStatus) {
        this.itemStatus = itemStatus;
    }



    public FfTypeDTO getFfType() {
        return ffType;
    }



    public void setFfType(FfTypeDTO ffType) {
        this.ffType = ffType;
    }



    public AddressDetailsDTO getAddressDetails() {
        return addressDetails;
    }



    public void setAddressDetails(AddressDetailsDTO addressDetails) {
        this.addressDetails = addressDetails;
    }



    public FfCenterDTO getFfCenter() {
        return ffCenter;
    }



    public void setFfCenter(FfCenterDTO ffCenter) {
        this.ffCenter = ffCenter;
    }



    public LogisticsDetailsDTO getLogistics() {
        return logistics;
    }



    public void setLogistics(LogisticsDetailsDTO logistics) {
        this.logistics = logistics;
    }



    public ItemPricingDetailsDTO getItemPricingDetails() {
        return itemPricingDetails;
    }



    public void setItemPricingDetails(ItemPricingDetailsDTO itemPricingDetails) {
        this.itemPricingDetails = itemPricingDetails;
    }



    public List<String> getRelatedItems() {
        return relatedItems;
    }



    public void setRelatedItems(List<String> relatedItems) {
        this.relatedItems = relatedItems;
    }



    public List<History> getOrderItemHistory() {
        return orderItemHistory;
    }



    public void setOrderItemHistory(List<History> orderItemHistory) {
        this.orderItemHistory = orderItemHistory;
    }

    public String getSapOrderNo() {
        return sapOrderNo;
    }

    public void setSapOrderNo(String sapOrderNo) {
        this.sapOrderNo = sapOrderNo;
    }

    public List<ImageDTO> getImages() {
        return images;
    }

    public void setImages(List<ImageDTO> images) {
        this.images = images;
    }

    public InitialFfTypeDTO getInitialFfType() {
        return initialFfType;
    }

    public void setInitialFfType(InitialFfTypeDTO initialFfType) {
        this.initialFfType = initialFfType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
    public String getErpInvoiceId() {
        return erpInvoiceId;
    }
    public void setErpInvoiceId(String erpInvoiceId) {
        this.erpInvoiceId = erpInvoiceId;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }


    public ItemPricingDetailsDTO getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(ItemPricingDetailsDTO shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    public ItemPricingDetailsDTO getCodCharges() {
        return codCharges;
    }

    public void setCodCharges(ItemPricingDetailsDTO codCharges) {
        this.codCharges = codCharges;
    }
}
