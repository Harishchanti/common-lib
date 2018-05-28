
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.annotation.Generated;

import com.ailiens.optimusprime.autobots.utils.PricingUtils;
import com.ailiens.optimusprime.domain.enumeration.service;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.Discount;
import com.ailiens.optimusprime.domain.OrderLine;
import com.ailiens.optimusprime.domain.Price;
import com.ailiens.optimusprime.domain.Taxes;

@Generated("org.jsonschema2pojo")
public class ItemPricingDetailsDTO {

    public BigDecimal discount = new BigDecimal(0.0);
    public BigDecimal nnnowCash = new BigDecimal(0.0);
    public BigDecimal netAmount = new BigDecimal(0.0);
    public BigDecimal value = new BigDecimal(0.0);
    public BigDecimal sp = new BigDecimal(0.0);
    public BigDecimal tradeSp = new BigDecimal(0.0);
    public BigDecimal tax = new BigDecimal(0.0);
    public BigDecimal taxPercentage = new BigDecimal(0.0);
    public BigDecimal discountPercentage = new BigDecimal(0.0);
    public Boolean taxInclusive=false;
    public String taxClass;
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
            //@adi added extra condition while reading BT consignment and then calucating the tax percentage by adding all taxe %'s
            if(orderLine.getConsignment().getOrders().getService().equals(service.BT)) {

                this.setTaxPercentage(PricingUtils.getTaxPercentageForBTOrder(tax));

                // checking discount shoudn't be zero
                if(!discounts.isEmpty() && discounts.get(0).getDiscountAmount().compareTo(BigDecimal.ZERO) > 0 && this.netAmount.compareTo(BigDecimal.ZERO) > 0) {

                    this.setDiscount(discounts.get(0).getDiscountAmount());

                } else {
                    this.setDiscount(new BigDecimal(0.0));
                }
            }
            else {

                if (this.value != null && (this.value.compareTo(BigDecimal.ZERO) > 0) && this.tax != null) {
                    this.setTaxPercentage(PricingUtils.getTaxPercentage(this.tax, this.value));
                } else {
                    this.setTaxPercentage(new BigDecimal(0.0));
                }

                Iterator<Discount> discountIterator = discounts.iterator();
                if(discountIterator.hasNext()){
                    Discount discount = discountIterator.next();
                    this.setDiscount(discount.getDiscountAmount());
                } else {
                    this.setDiscount(new BigDecimal(0.0));
                }
            }
            this.setCgstAmount(returnDefault(tax.getCgstAmount()));
            this.setSgstAmount(returnDefault(tax.getSgstAmount()));
            this.setIgstAmount(returnDefault(tax.getIgstAmount()));
            this.setUtgstAmount(returnDefault(tax.getUtgstAmount()));
            this.setCgstPercentage(returnDefault(tax.getCgstPercentage()));
            this.setSgstPercentage(returnDefault(tax.getSgstPercentage()));
            this.setIgstPercentage(returnDefault(tax.getIgstPercentage()));
            this.setUtgstPercentage(returnDefault(tax.getUtgstPercentage()));
        } else {
            this.setTax(new BigDecimal(0.0));
        }


// logic shifted above
//        Iterator<Discount> discountIterator = discounts.iterator();
//        if(discountIterator.hasNext()){
//            Discount discount = discountIterator.next();
//            this.setDiscount(discount.getDiscountAmount());
//        } else {
//            this.setDiscount(new BigDecimal(0.0));
//        }
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

    public String getHsn() {
        return hsn;
    }

    public void setHsn(String hsn) {
        this.hsn = hsn;
    }

    public BigDecimal getUtgstAmount() {
        return utgstAmount;
    }

    public void setUtgstAmount(BigDecimal utgstAmount) {
        this.utgstAmount = utgstAmount;
    }

    public BigDecimal getUtgstPercentage() {
        return utgstPercentage;
    }

    public void setUtgstPercentage(BigDecimal utgstPercentage) {
        this.utgstPercentage = utgstPercentage;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public BigDecimal returnDefault(BigDecimal value) {
        Optional<BigDecimal> optionalValue = Optional.ofNullable(value);
        return optionalValue.orElse(new BigDecimal(0.0));
    }

}
