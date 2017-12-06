package com.ailiens.optimusprime.autobots.utils;

import com.ailiens.optimusprime.domain.Taxes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class PricingUtils {

    private static final Logger log = LoggerFactory.getLogger(PricingUtils.class);

    public static BigDecimal getTaxPercentage(BigDecimal tax, BigDecimal value) {
        // This is as per Pricing engine's calculation
        // taxPercentage = tax / value * 100

        log.info("Tax, Value: " + tax + ", " + value);
        BigDecimal taxPercentage = tax.divide(value, 4, BigDecimal.ROUND_HALF_EVEN);
        taxPercentage = taxPercentage.multiply(new BigDecimal(100.0));
        taxPercentage = taxPercentage.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        log.info("Tax %age: " + taxPercentage);

        return taxPercentage;
    }

    public static BigDecimal getDiscountPercentage(BigDecimal discount, BigDecimal mrp) {
        // This is as per Pricing engine's calculation
        // discountPercentage = discount / mrp * 100

        log.info("Discount, MRP: " + discount + ", " + mrp);
        BigDecimal discountPercentage = discount.divide(mrp, 4, BigDecimal.ROUND_HALF_EVEN);
        discountPercentage = discountPercentage.multiply(new BigDecimal(100.0));
        discountPercentage = discountPercentage.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        log.info("Discount %age: " + discountPercentage);

        return discountPercentage;
    }

    // @adi  calucating the tax percentage by adding all taxe %'s
    public static BigDecimal getTaxPercentageForBTOrder(Taxes taxes) {

        return  taxes.getCgstPercentage().add(taxes.getUtgstPercentage().add(taxes.getSgstPercentage().add(taxes.getIgstPercentage())));
    }
}
