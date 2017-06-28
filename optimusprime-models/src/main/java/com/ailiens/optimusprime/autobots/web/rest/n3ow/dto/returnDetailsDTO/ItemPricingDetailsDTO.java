
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

import com.ailiens.optimusprime.autobots.utils.PricingUtils;
import com.ailiens.optimusprime.domain.Discount;
import com.ailiens.optimusprime.domain.OrderLine;
import com.ailiens.optimusprime.domain.Price;
import com.ailiens.optimusprime.domain.Taxes;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class ItemPricingDetailsDTO {

    public BigDecimal discount;
    public BigDecimal nnnowCash;
    public BigDecimal netAmount;
    public BigDecimal value;
    public BigDecimal sp;
    public BigDecimal tradeSp;
    public BigDecimal tax;
    public BigDecimal taxPercentage;
    public BigDecimal discountPercentage;
    public String taxClass;
    public Boolean taxInclusive;
    public List<ActualHitRuleDTO> actualHitRule = new ArrayList<ActualHitRuleDTO>();
    private BigDecimal cgstAmount = new BigDecimal(0.0);
    private BigDecimal sgstAmount = new BigDecimal(0.0);
    private BigDecimal igstAmount = new BigDecimal(0.0);
    private BigDecimal utgstAmount = new BigDecimal(0.0);
    private BigDecimal cgstPercentage = new BigDecimal(0.0);
    private BigDecimal sgstPercentage = new BigDecimal(0.0);
    private BigDecimal igstPercentage = new BigDecimal(0.0);
    private BigDecimal utgstPercentage = new BigDecimal(0.0);
    private String hsn;

    public ItemPricingDetailsDTO() {
        super();
    }

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
            this.setHsn(price.getHsn());
		}

    	Iterator<Taxes> taxIterator = taxes.iterator();
    	if(taxIterator.hasNext()){
    		Taxes tax = taxIterator.next();
    		this.setTax(tax.getAmount());
            if (this.value != null && (this.value.compareTo(BigDecimal.ZERO) > 0) && this.tax != null) {
                this.setTaxPercentage(PricingUtils.getTaxPercentage(this.tax, this.value));
            } else {
                this.setTaxPercentage(new BigDecimal(0.0));
            }
            this.setCgstAmount(tax.getCgstAmount());
            this.setSgstAmount(tax.getSgstAmount());
            this.setIgstAmount(tax.getIgstAmount());
            this.setUtgstAmount(tax.getUtgstAmount());
            this.setCgstPercentage(tax.getCgstPercentage());
            this.setSgstPercentage(tax.getSgstPercentage());
            this.setIgstPercentage(tax.getIgstPercentage());
            this.setUtgstPercentage(tax.getUtgstPercentage());
        } else {
            this.setTax(new BigDecimal(0.0));
        }
    	Iterator<Discount> discountIterator = discounts.iterator();
    	if(discountIterator.hasNext()){
    		Discount discount = discountIterator.next();
    		this.setDiscount(discount.getDiscountAmount());
    	} else {
            this.setDiscount(new BigDecimal(0.0));
        }
	}



	public BigDecimal getDiscount() {
		return discount;
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



	public List<ActualHitRuleDTO> getActualHitRule() {
		return actualHitRule;
	}

    public Boolean getTaxInclusive() {
        return taxInclusive;
    }

    public void setTaxInclusive(Boolean taxInclusive) {
        this.taxInclusive = taxInclusive;
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

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(BigDecimal taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public BigDecimal getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(BigDecimal discountPercentage) {
        this.discountPercentage = discountPercentage;
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

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
