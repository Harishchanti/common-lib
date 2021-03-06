package com.ailiens.common;


import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import com.ailiens.common.enumeration.*;

/**
 * A FCDetails.
 */
@Entity
@Table(name = "fcdetails")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName="fcdetails")
@Data
public class FCDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "fc_id")
    private String fcId;

    @Column(name = "sap_code")
    private String sapCode;

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

    @Column(name = "post_code")
    private String postCode;

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

    @Column(name = "opening_hours")
    private Integer openingHours;

    @Column(name = "opening_mins")
    private Integer openingMins;

    @Column(name = "closing_hours")
    private Integer closingHours;

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

    @Enumerated(EnumType.STRING)
    @Column(name = "fc_type")
    private FCTypes fcType;

    @Enumerated(EnumType.STRING)
    @Column(name = "operating_type")
    private OpsTypes operatingType;

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

    @NotNull
    @Min(value = 0)
    @Max(value = 100)
    @Column(name = "marginal_cost", precision=10, scale=2, nullable = false)
    private BigDecimal marginalCost;

    @Column(name = "dailyorder_volume")
    private Integer dailyorderVolume;

    @Column(name = "dailyorder_qty")
    private Integer dailyorderQty;

    @Column(name = "sold_by")
    private String soldBy;

    @Column(name = "sync_start_time")
    private String syncStartTime;

    @Column(name = "sync_end_time")
    private String syncEndTime;

    @Column(name = "buffer")
    private Integer buffer;

    @Column(name = "cutoff_inclusive")
    private Boolean cutoffInclusive;

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

    @Column(name = "ordering_enabled")
    private String orderingEnabled;

    @Column(name = "re")
    private String re;

    @Column(name = "rm")
    private String rm;

    @Column(name = "state_code")
    private String stateCode;

    @Column(name = "gstn_code")
    private String gstnCode;

    @Column(name = "store_score")
    private Integer storeScore;

    @OneToMany(mappedBy = "fCDetails")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Brand> brands = new HashSet<>();

    @OneToMany(mappedBy = "fCDetails")
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Staff> staffs = new HashSet<>();

    @OneToOne
    private MultiBrand multiBrand;

    @OneToOne
    private Warehouse warehouse;

    @OneToOne
    private Store store;

    @ManyToOne
    private EntityType entityType;

    @ManyToOne
    private FranchiseInfo franchiseInfo;


}
