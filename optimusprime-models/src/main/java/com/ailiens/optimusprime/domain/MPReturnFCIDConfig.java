package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yashika on 19/9/17.
 */
@Entity
@Table(name = "mp_return_fc_id_config")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MPReturnFCIDConfig implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fc_id")
    private String fcId;

    @Column(name = "market_place_name")
    private String marketPlaceName;

    @Column(name = "return_type")
    private String returnType;

    @Column(name = "return_fc_id")
    private String returnFcId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFcId() {
        return fcId;
    }

    public void setFcId(String fcId) {
        this.fcId = fcId;
    }

    public String getMarketPlaceName() {
        return marketPlaceName;
    }

    public void setMarketPlaceName(String marketPlaceName) {
        this.marketPlaceName = marketPlaceName;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getReturnFcId() {
        return returnFcId;
    }

    public void setReturnFcId(String returnFcId) {
        this.returnFcId = returnFcId;
    }
}
