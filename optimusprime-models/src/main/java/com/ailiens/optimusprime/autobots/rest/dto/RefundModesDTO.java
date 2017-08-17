package com.ailiens.optimusprime.autobots.rest.dto;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

@Generated("org.jsonschema2pojo")
public class RefundModesDTO {

    @NotNull
    private Boolean neft;
    @NotNull
    private Boolean bts;
    @NotNull
    private Boolean voucher;

    /**
     *
     * @return
     * The neft
     */
    public Boolean getNeft() {
        return neft;
    }

    /**
     *
     * @param neft
     * The neft
     */
    @Required
    public void setNeft(Boolean neft) {
        this.neft = neft;
    }

    /**
     *
     * @return
     * The bts
     */
    public Boolean getBts() {
        return bts;
    }

    /**
     *
     * @param bts
     * The bts
     */
    @Required
    public void setBts(Boolean bts) {
        this.bts = bts;
    }

    /**
     *
     * @return
     * The voucher
     */
    public Boolean getVoucher() {
        return voucher;
    }

    /**
     *
     * @param voucher
     * The voucher
     */
    @Required
    public void setVoucher(Boolean voucher) {
        this.voucher = voucher;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
