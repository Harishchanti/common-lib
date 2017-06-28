package com.ailiens.common;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

/**
 * Created by surya on 11/5/17.
 */

@Data
@MappedSuperclass
@Embeddable
public class AbstractFCDetails {

    @Column(name = "fc_id")
    private String fcId;

    @Column(name = "sap_code")
    private String sapCode;

    @Column(name = "post_code")
    private String postCode;

    @Column(name = "fc_name")
    private String fcName;

    @Size(min = 0, max = 35)
    @Column(name = "street_no", length = 35)
    private String streetNo;

    @Size(min = 0, max = 35)
    @Column(name = "street_name", length = 35)
    private String streetName;

    @Column(name = "town")
    private String town;

    @Column(name = "ordering_enabled")
    private String orderingEnabled;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "latitude")
    private Float latitude;

    @Column(name = "longitude")
    private Float longitude;

    @Min(0)
    @Max(23)
    @Column(name = "opening_hours")
    private Integer openingHours;

    @Min(0)
    @Max(59)
    @Column(name = "opening_mins")
    private Integer openingMins;

    @Min(0)
    @Max(23)
    @Column(name = "closing_hours")
    private Integer closingHours;

    @Min(0)
    @Max(59)
    @Column(name = "closing_mins")
    private Integer closingMins;

    @Column(name = "working_days")
    private String workingDays;

    @Column(name = "holidays")
    private Integer holidays;

    @Column(name = "store_enabled")
    private Boolean storeEnabled;

    @Column(name = "return_enabled")
    private Boolean returnEnabled;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "cin_no")
    private String cinNo;

    @Column(name = "tin_no")
    private String tinNo;

    @Column(name = "pan_no")
    private String panNo;

    @Column(name = "contact_no")
    private String contactNo;

    @Column(name = "contact_person")
    private String contactPerson;

    @Column(name = "dailyorder_volume", nullable = false, columnDefinition = "int default 0")
    private Integer dailyorderVolume;

    @Column(name = "dailyorder_qty",nullable = false, columnDefinition = "int default 0")
    private Integer dailyorderQty;

    @Column(name = "buffer")
    private Integer buffer;

    @Column(name = "cutoff_inclusive",columnDefinition=" default 'true'")
    private Boolean cutoffInclusive;

    @Column(name = "sold_by")
    private String soldBy;

    @Column(name = "sync_start_time")
    private String syncStartTime;

    @Column(name = "sync_end_time")
    private String syncEndTime;

    @Column(name = "store_email_id")
    private String storeEmailId;

    @Column(name = "ivr_phone_number")
    private String ivrPhoneNumber;

    @Column(name = "ivr_enabled")
    private Boolean ivrEnabled;

    @Column(name = "return_fc_id")
    private String returnFcId;

    @Column(name = "store_brand")
    private String storeBrand;

    @Column(name = "re")
    private String re;

    @Column(name = "rm")
    private String rm;

    @Column(name = "state_code")
    private String stateCode;

    @Column(name = "gstn_code")
    private String gstnCode;

    @Column(name = "store_score", nullable = false, columnDefinition = "int default 0")
    private Integer storeScore;

    @NotNull
    @Min(value = 0)
    @Max(value = 100)
    @Column(name = "marginal_cost", precision = 5, scale = 2, nullable = false)
    private BigDecimal marginalCost;

}
