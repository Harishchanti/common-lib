
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.returnDetailsDTO;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class RefundPaymentSummary {

    private String cash;
    private String online;
    private String NNNowCash;
    private String card;

    /**
     *
     * @return
     *     The cash
     */
    public String getCash() {
        return cash;
    }

    public RefundPaymentSummary() {
        super();
    }

    /**
     *
     * @param cash
     *     The cash
     */
    public void setCash(String cash) {
        this.cash = cash;
    }

    /**
     *
     * @return
     *     The online
     */
    public String getOnline() {
        return online;
    }

    /**
     *
     * @param online
     *     The online
     */
    public void setOnline(String online) {
        this.online = online;
    }

    /**
     *
     * @return
     *     The NNNowCash
     */
    public String getNNNowCash() {
        return NNNowCash;
    }

    /**
     *
     * @param NNNowCash
     *     The NNNowCash
     */
    public void setNNNowCash(String NNNowCash) {
        this.NNNowCash = NNNowCash;
    }

    /**
     *
     * @return
     *     The card
     */
    public String getCard() {
        return card;
    }

    /**
     *
     * @param card
     *     The card
     */
    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
