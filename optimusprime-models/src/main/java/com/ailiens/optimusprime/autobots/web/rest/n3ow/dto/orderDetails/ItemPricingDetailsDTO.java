
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.Discount;
import com.ailiens.optimusprime.domain.OrderLine;
import com.ailiens.optimusprime.domain.Price;
import com.ailiens.optimusprime.domain.Taxes;

@Generated("org.jsonschema2pojo")
public class ItemPricingDetailsDTO {

    public BigDecimal discount;
    public BigDecimal nnnowCash;
    public BigDecimal netAmount;
    public BigDecimal value;
    public BigDecimal sp;
    public BigDecimal tradeSp;
    public BigDecimal tax;
    public String taxClass;
    public Boolean taxInclusive;
    public List<ActualHitRuleDTO> actualHitRule = new ArrayList<ActualHitRuleDTO>();
    public String hsn;
    private BigDecimal cgstAmount = new BigDecimal(0.0);
    private BigDecimal sgstAmount = new BigDecimal(0.0);
    private BigDecimal igstAmount = new BigDecimal(0.0);
    private BigDecimal utgstAmount = new BigDecimal(0.0);
    private BigDecimal cgstPercentage = new BigDecimal(0.0);
    private BigDecimal sgstPercentage = new BigDecimal(0.0);
    private BigDecimal igstPercentage = new BigDecimal(0.0);
    private BigDecimal utgstPercentage = new BigDecimal(0.0);


    public ItemPricingDetailsDTO(OrderLine orderLine, List<Taxes> taxes, List<Discount> discounts) {
		Price price = orderLine.getPrice();
		if(price != null){
			this.setNnnowCash(price.getNnnowCash());
	    	this.setNetAmount(price.getFinalPrice());
	    	this.setValue(price.getOriginalPrice());
	    	this.setSp(price.getSp());
            this.setTradeSp(price.getTradeSp());
            this.setTaxClass(price.getTaxClass());
            if (price.getTaxExclusive() != null) {
                this.setTaxInclusive(!price.getTaxExclusive());
            }
            BigDecimal totalDiscount = BigDecimal.valueOf(0);
            for (Discount disc : discounts) {
                totalDiscount = totalDiscount.add(disc.getDiscountAmount());
            }
            this.setDiscount(totalDiscount);
            this.setHsn(price.getHsn());
		}

    	Iterator<Taxes> taxIterator = taxes.iterator();
    	if(taxIterator.hasNext()){
    		Taxes tax = taxIterator.next();
    		this.setTax(tax.getAmount());
            this.setCgstAmount(tax.getCgstAmount());
            this.setSgstAmount(tax.getSgstAmount());
            this.setIgstAmount(tax.getIgstAmount());
            this.setUtgstAmount(tax.getUtgstAmount());
            this.setCgstPercentage(tax.getCgstPercentage());
            this.setSgstPercentage(tax.getSgstPercentage());
            this.setIgstPercentage(tax.getIgstPercentage());
            this.setUtgstPercentage(tax.getUtgstPercentage());
    	}
    	Iterator<Discount> discountIterator = discounts.iterator();
        BigDecimal discountAmount = new BigDecimal(0);
        while(discountIterator.hasNext()){
    		Discount discount = discountIterator.next();
    		discountAmount = discountAmount.add(discount.getDiscountAmount());
    	}
        this.setDiscount(discountAmount);
    }



	public BigDecimal getDiscount() {
		return discount;
	}

	public ItemPricingDetailsDTO(){
        super();
    }



	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}



	public BigDecimal getNnnowCash() {
		return nnnowCash;
	}



	public void setNnnowCash(BigDecimal nnnowCash) {
		this.nnnowCash = nnnowCash;
	}



	public BigDecimal getNetAmount() {
		return netAmount;
	}



	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}



	public BigDecimal getValue() {
		return value;
	}



	public void setValue(BigDecimal value) {
		this.value = value;
	}



	public BigDecimal getSp() {
		return sp;
	}



	public void setSp(BigDecimal sp) {
		this.sp = sp;
	}



	public BigDecimal getTax() {
		return tax;
	}



	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

    public Boolean getTaxInclusive() {
        return taxInclusive;
    }

    public void setTaxInclusive(Boolean taxInclusive) {
        this.taxInclusive = taxInclusive;
    }

    public List<ActualHitRuleDTO> getActualHitRule() {
		return actualHitRule;
	}



	public void setActualHitRule(List<ActualHitRuleDTO> actualHitRule) {
		this.actualHitRule = actualHitRule;
	}

    public BigDecimal getTradeSp() {
        return tradeSp;
    }

    public void setTradeSp(BigDecimal tradeSp) {
        this.tradeSp = tradeSp;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    public BigDecimal getCgstAmount() {
        return cgstAmount;
    }

    public void setCgstAmount(BigDecimal cgstAmount) {
        this.cgstAmount = cgstAmount;
    }

    public BigDecimal getSgstAmount() {
        return sgstAmount;
    }

    public void setSgstAmount(BigDecimal sgstAmount) {
        this.sgstAmount = sgstAmount;
    }

    public BigDecimal getIgstAmount() {
        return igstAmount;
    }

    public void setIgstAmount(BigDecimal igstAmount) {
        this.igstAmount = igstAmount;
    }

    public BigDecimal getUtgstAmount() {
        return utgstAmount;
    }

    public void setUtgstAmount(BigDecimal utgstAmount) {
        this.utgstAmount = utgstAmount;
    }

    public BigDecimal getCgstPercentage() {
        return cgstPercentage;
    }

    public void setCgstPercentage(BigDecimal cgstPercentage) {
        this.cgstPercentage = cgstPercentage;
    }

    public BigDecimal getSgstPercentage() {
        return sgstPercentage;
    }

    public void setSgstPercentage(BigDecimal sgstPercentage) {
        this.sgstPercentage = sgstPercentage;
    }

    public BigDecimal getIgstPercentage() {
        return igstPercentage;
    }

    public void setIgstPercentage(BigDecimal igstPercentage) {
        this.igstPercentage = igstPercentage;
    }

    public BigDecimal getUtgstPercentage() {
        return utgstPercentage;
    }

    public void setUtgstPercentage(BigDecimal utgstPercentage) {
        this.utgstPercentage = utgstPercentage;
    }
}
