
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Generated;

import com.ailiens.optimusprime.autobots.utils.PricingUtils;
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
	public BigDecimal taxPercentage;
	public BigDecimal discountPercentage;
	public Boolean taxInclusive;
	public String taxClass;
	public List<ActualHitRuleDTO> actualHitRule = new ArrayList<ActualHitRuleDTO>();

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

	public ItemPricingDetailsDTO(){

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



	public void setActualHitRule(List<ActualHitRuleDTO> actualHitRule) {
		this.actualHitRule = actualHitRule;
	}

	public BigDecimal getTradeSp() {
		return tradeSp;
	}

	public void setTradeSp(BigDecimal tradeSp) {
		this.tradeSp = tradeSp;
	}

	public Boolean getTaxInclusive() {
		return taxInclusive;
	}

	public void setTaxInclusive(Boolean taxInclusive) {
		this.taxInclusive = taxInclusive;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
