package com.ailiens.common;


import com.ailiens.common.dto.BrandMetaDataDTO;
import com.ailiens.common.dto.EntityMetaDataDTO;
import com.ailiens.common.enumeration.FCTypes;
import com.ailiens.common.enumeration.OpsTypes;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class FCDetailsMetaData implements Serializable {

	private Long id;

	private String fcId;

	private String sapCode;

	private String fcName;

	private String streetNo;

	private String streetName;

	private String town;

	private String postCode;

	private String city;

	private String state;

	private String country;

	private Float latitude;

	private Float longitude;

	private Integer openingHours;

	private Integer openingMins;

	private Integer closingHours;

	private Integer closingMins;

	private String workingDays;

	private Integer holidays;

	private Boolean storeEnabled;

	private Boolean returnEnabled;

	private Integer capacity;

	private FCTypes fcType;

	private OpsTypes operatingType;

	private String cinNo;

	private String tinNo;

	private String panNo;

	private String contactNo;

	private String contactPerson;

	private Integer dailyorderVolume;

	private Integer dailyorderQty;

	private Integer buffer;

	private Boolean cutoffInclusive;

	private String soldBy;

	private String syncStartTime;

	private String syncEndTime;

	private String storeEmailId;

    private String ivrPhoneNumber;

    private Boolean ivrEnabled;

    private String returnFcId;

    private BigDecimal marginalCost;

    private String storeBrand;

    private String orderingEnabled;

    private String re;

    private String rm;

    private String stateCode;

    private String gstnCode;

    private Integer storeScore;

	private Set<Brand> brands = new HashSet<>();

	private Set<Staff> staffs = new HashSet<>();

	private MultiBrand multiBrand = new MultiBrand();

	private Warehouse warehouse = new Warehouse();

	private Store store = new Store();

	private EntityType entityType = new EntityType();

	private FranchiseInfo franchiseInfo = new FranchiseInfo();

	private List<BrandMetaDataDTO> brandMetaData = new ArrayList<BrandMetaDataDTO>();

	private List<EntityMetaDataDTO> entityMetaData = new ArrayList<EntityMetaDataDTO>();

}
