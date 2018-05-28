
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.ailiens.optimusprime.domain.OrderDiscount;
import com.ailiens.optimusprime.domain.OrderPricing;

@Generated("org.jsonschema2pojo")
public class TotalPricingDetails {

    private BigDecimal netAmount;
    private BigDecimal totalTax;
    private BigDecimal tradeSP;
    private BigDecimal totalSP;
    private BigDecimal totalAmountWithShipping;
    @Valid
    private TotalDiscountDetails totalDiscountDetails;
    @Valid
    private TotalNNNowCashDetails totalNNNowCashDetails;
    @Valid
    private List<TotalActualHitRule> totalActualHitRule = new ArrayList<TotalActualHitRule>();
    private BigDecimal shippingCharge;

    private BigDecimal totalCgstAmount = new BigDecimal(0);
    private BigDecimal totalSgstAmount = new BigDecimal(0);
    private BigDecimal totalIgstAmount = new BigDecimal(0);
    private BigDecimal totalUtgstAmount = new BigDecimal(0);


    public TotalPricingDetails(OrderPricing orderPricing,List<OrderDiscount> orderDiscountDetailsList) {
//    	Iterator<OrderPricing> orderPricinggIterator = orderPricingDetailsList.iterator();
//    	if(orderPricinggIterator.hasNext()){
//    		OrderPricing orderPricing = orderPricinggIterator.next();
        if(orderPricing!=null){
    		this.setNetAmount(returnDefault(orderPricing.getTotalNetAmount()));
    		this.setTotalTax(returnDefault(orderPricing.getTotalTax()));
    		this.setTradeSP(returnDefault(orderPricing.getTotalTradeSP()));
    		this.setTotalSP(returnDefault(orderPricing.getTotalSP()));
    		this.setTotalAmountWithShipping(returnDefault(orderPricing.getTotalNetAmount().add(orderPricing.getTotalShippingCharge()))) ;
    		TotalDiscountDetails totalDiscountDetails = new TotalDiscountDetails();
    		totalDiscountDetails.setCartDiscount(orderPricing.getTotalCartDiscount());
    		totalDiscountDetails.setProductDiscount(orderPricing.getTotalProductDiscount());
    		totalDiscountDetails.setTotalDiscount(orderPricing.getTotalDiscount());

    		this.setTotalDiscountDetails(totalDiscountDetails);

    		TotalNNNowCashDetails totalNNNowCashDetails = new TotalNNNowCashDetails();

    		totalNNNowCashDetails.setCartNNNowCash(returnDefault(orderPricing.getTotalCartNnnowCash()));
    		totalNNNowCashDetails.setProductNNNowCash(returnDefault(orderPricing.getTotalProductNnnowCash()));
    		totalNNNowCashDetails.setTotalNNNowCash(returnDefault(orderPricing.getTotalNnnowCash()));

    		this.setTotalNNNowCashDetails(totalNNNowCashDetails);

    		this.setShippingCharge(orderPricing.getTotalShippingCharge());

    		this.setTotalCgstAmount(returnDefault(orderPricing.getTotalCgstAmount()));
    		this.setTotalSgstAmount(returnDefault(orderPricing.getTotalSgstAmount()));
    		this.setTotalIgstAmount(returnDefault(orderPricing.getTotalIgstAmount()));
    		this.setTotalUtgstAmount(returnDefault(orderPricing.getTotalUtgstAmount()));
    	}

    	Iterator<OrderDiscount> orderDiscountIterator = orderDiscountDetailsList.iterator();

        List<TotalActualHitRule> totalActualHitRuleAr = new ArrayList<TotalActualHitRule> ();
    	while(orderDiscountIterator.hasNext()){
    		OrderDiscount orderDiscount = orderDiscountIterator.next();
    		TotalActualHitRule totalActualHitRule = new TotalActualHitRule();
    		totalActualHitRule.setId(orderDiscount.getDiscountId());
    		totalActualHitRule.setName(orderDiscount.getDiscountName());
    		totalActualHitRuleAr.add(totalActualHitRule);
    	}
        this.setTotalActualHitRule(totalActualHitRuleAr);
	}

	/**
     *
     * @return
     *     The netAmount
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     *
     * @param netAmount
     *     The netAmount
     */
    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    /**
     *
     * @return
     *     The totalTax
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     *
     * @param totalTax
     *     The totalTax
     */
    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    /**
     *
     * @return
     *     The totalSP
     */
    public BigDecimal getTotalSP() {
        return totalSP;
    }

    /**
     *
     * @param totalSP
     *     The totalSP
     */
    public void setTotalSP(BigDecimal totalSP) {
        this.totalSP = totalSP;
    }

    /**
     *
     * @return
     *     The tradeSP
     */
    public BigDecimal getTradeSP() {
        return tradeSP;
    }

    /**
     *
     * @param tradeSP
     *     The tradeSP
     */
    public void setTradeSP(BigDecimal tradeSP) {
        this.tradeSP = tradeSP;
    }

    /**
     *
     * @return
     *     The totalDiscountDetails
     */
    public TotalDiscountDetails getTotalDiscountDetails() {
        return totalDiscountDetails;
    }

    /**
     *
     * @param totalDiscountDetails
     *     The totalDiscountDetails
     */
    public void setTotalDiscountDetails(TotalDiscountDetails totalDiscountDetails) {
        this.totalDiscountDetails = totalDiscountDetails;
    }

    /**
     *
     * @return
     *     The totalNNNowCashDetails
     */
    public TotalNNNowCashDetails getTotalNNNowCashDetails() {
        return totalNNNowCashDetails;
    }

    /**
     *
     * @param totalNNNowCashDetails
     *     The totalNNNowCashDetails
     */
    public void setTotalNNNowCashDetails(TotalNNNowCashDetails totalNNNowCashDetails) {
        this.totalNNNowCashDetails = totalNNNowCashDetails;
    }

    /**
     *
     * @return
     *     The totalActualHitRule
     */
    public List<TotalActualHitRule> getTotalActualHitRule() {
        return totalActualHitRule;
    }

    /**
     *
     * @param totalActualHitRule
     *     The totalActualHitRule
     */
    public void setTotalActualHitRule(List<TotalActualHitRule> totalActualHitRule) {
        this.totalActualHitRule = totalActualHitRule;
    }

    /**
     *
     * @return
     *     The shippingCharge
     */
    public BigDecimal getShippingCharge() {
        return shippingCharge;
    }

    /**
     *
     * @param shippingCharge
     *     The shippingCharge
     */
    public void setShippingCharge(BigDecimal shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

	public BigDecimal getTotalAmountWithShipping() {
		return totalAmountWithShipping;
	}

	public void setTotalAmountWithShipping(BigDecimal totalAmountWithShipping) {
		this.totalAmountWithShipping = totalAmountWithShipping;
	}

    public BigDecimal getTotalCgstAmount() {
        return totalCgstAmount;
    }

    public void setTotalCgstAmount(BigDecimal totalCgstAmount) {
        this.totalCgstAmount = totalCgstAmount;
    }

    public BigDecimal getTotalSgstAmount() {
        return totalSgstAmount;
    }

    public void setTotalSgstAmount(BigDecimal totalSgstAmount) {
        this.totalSgstAmount = totalSgstAmount;
    }

    public BigDecimal getTotalIgstAmount() {
        return totalIgstAmount;
    }

    public void setTotalIgstAmount(BigDecimal totalIgstAmount) {
        this.totalIgstAmount = totalIgstAmount;
    }

    public BigDecimal getTotalUtgstAmount() {
        return totalUtgstAmount;
    }

    public void setTotalUtgstAmount(BigDecimal totalUtgstAmount) {
        this.totalUtgstAmount = totalUtgstAmount;
    }


    public BigDecimal returnDefault(BigDecimal value) {
   	Optional<BigDecimal> optionalValue = Optional.ofNullable(value);
   	return optionalValue.orElse(new BigDecimal(0.0));
       }
}
