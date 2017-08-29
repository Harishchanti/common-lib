package com.ailiens.optimusprime.autobots.rest.dto;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

import com.ailiens.optimusprime.domain.Discount;
import com.ailiens.optimusprime.domain.MBOProduct;
import com.ailiens.optimusprime.domain.OrderLine;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A DTO representing an OrderLine.
 */
public class OrderLineDTO {

	private String itemId;

	private MBOProductDTO mboProducts;

	private ZonedDateTime slaEndTime;

	private OrderLineStateDTO itemStatus;

	private FullfilmentTypeDTO fullfilmentType;

	private FullfilmentCenterDTO fullfilmentCenter;

	private LogisticsDTO logistics;

	private PriceDTO priceDetails;

//    private InvoiceLineDTO invoiceLine;

	private Set<DiscountDTO> discountDetails;

	public OrderLineDTO(OrderLine orderLine) {
		if(orderLine != null) {
			this.itemId = String.valueOf(orderLine.getId());
			this.slaEndTime = orderLine.getSlaEndTime();
			if(orderLine.getOrderLineStates() != null)
				this.itemStatus = new OrderLineStateDTO(orderLine.getOrderLineStates());
			if(orderLine.getFullfilmentType() != null)
				this.fullfilmentType = new FullfilmentTypeDTO(orderLine.getFullfilmentType());
			if(orderLine.getFullfilmentCenter() != null)
				this.fullfilmentCenter = new FullfilmentCenterDTO(orderLine.getFullfilmentCenter());
			if(orderLine.getLogistics() != null)
				this.logistics = new LogisticsDTO(orderLine.getLogistics());
			if(orderLine.getPrice() != null)
				this.priceDetails = new PriceDTO(orderLine.getPrice());
			//setProductsFromOrderLine(orderLine);
			//setDiscountDetailsFromOrderLine(orderLine);
		}
	}

	public void setProductsFromOrderLine(OrderLine orderLine) {
		if(orderLine != null) {
			MBOProduct products = orderLine.getMboProducts();


            MBOProductDTO productDTO = new MBOProductDTO(products);
//				productDTOs.add(productDTO);

			this.mboProducts = productDTO;
		}
	}

	public void setDiscountDetailsFromOrderLine(OrderLine orderLine) {
		if(orderLine != null) {
			Set<DiscountDTO> discountDTOs = new HashSet<>();
			Set<Discount> discounts = orderLine.getDiscounts();

			for(Discount discount : discounts) {
				DiscountDTO discountDTO = new DiscountDTO(discount);
				discountDTOs.add(discountDTO);
			}
			this.discountDetails = discountDTOs;
		}
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


	public ZonedDateTime getSlaEndTime() {
		return slaEndTime;
	}

	public void setSlaEndTime(ZonedDateTime slaEndTime) {
		this.slaEndTime = slaEndTime;
	}

	public OrderLineStateDTO getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(OrderLineStateDTO itemStatus) {
		this.itemStatus = itemStatus;
	}

	public FullfilmentTypeDTO getFullfilmentType() {
		return fullfilmentType;
	}

	public void setFullfilmentType(FullfilmentTypeDTO fullfilmentType) {
		this.fullfilmentType = fullfilmentType;
	}

	public FullfilmentCenterDTO getFullfilmentCenter() {
		return fullfilmentCenter;
	}

	public void setFullfilmentCenter(FullfilmentCenterDTO fullfilmentCenter) {
		this.fullfilmentCenter = fullfilmentCenter;
	}

	public LogisticsDTO getLogistics() {
		return logistics;
	}

	public void setLogistics(LogisticsDTO logistics) {
		this.logistics = logistics;
	}

	public PriceDTO getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(PriceDTO priceDetails) {
		this.priceDetails = priceDetails;
	}

	public Set<DiscountDTO> getDiscountDetails() {
		return discountDetails;
	}

	public void setDiscountDetails(Set<DiscountDTO> discountDetails) {
		this.discountDetails = discountDetails;
	}

    public MBOProductDTO getMboProducts() {
        return mboProducts;
    }

    public void setMboProducts(MBOProductDTO mboProducts) {
        this.mboProducts = mboProducts;
    }

//    public InvoiceLineDTO getInvoiceLine() {
//        return invoiceLine;
//    }
//
//    public void setInvoiceLine(InvoiceLineDTO invoiceLine) {
//        this.invoiceLine = invoiceLine;
//    }

    @Override
	public String toString() {
		return "OrderLineDTO [itemId=" + itemId + ", mboProducts=" + mboProducts
				+ ", slaEndTime=" + slaEndTime + ", itemStatus=" + itemStatus + ", fullfilmentType=" + fullfilmentType
				+ ", fullfilmentCenter=" + fullfilmentCenter + ", logistics=" + logistics + ", priceDetails="
				+ priceDetails + ", discountDetails=" + discountDetails +  "]";
	}

}
