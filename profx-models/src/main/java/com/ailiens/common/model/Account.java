package com.ailiens.common.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by vaibhav on 19/10/15.
 */

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Account extends MetaData implements Serializable {
    /**
     *
     */
    static final long serialVersionUID = 4207569452805669772L;
    String typeOfUser;
    @Id
    String id;
    boolean onBoardingCompleted;
    AilStaff ailStaff;
    @Valid
    @NotNull
    List<Email> emails;
    List<IDMMappings> IDMMappings;
    HashMap<String, HashMap<String, LinkedHashMap<String, InsertableItem>>> baseList;
    Settings settings;
    @Transient
    String password;
    String registeredWith;
    String image;
    @Valid
    UserInfo userInfo;
    HashMap<String, HashMap<String, OnBoard>> onBoarding;
    List<Anniversaries> anniversaries;
    @Valid
    @NotNull
    List<MobileNumber> mobileNumbers;
    List<String> attachedWith;
    HashMap<String, HashMap<String, HashMap<String, FavouriteBase>>> favourites;
    HashMap<String, HashMap<String, NotificationConfiguration>> accountSettings;
    HashMap<String, HashMap<String, LinkedHashMap<String, InsertableCartItem>>> cart;
    HashMap<String, HashMap<String, CommonAddressFields>> address;
    HashMap<String, HashMap<String, Wallet>> wallet;
    HashMap<String, HashMap<String, SavedCard>> savedCard;
    HashMap<String, HashMap<String, Neft>> neft;
    String userStatus;
    Subscription subscription;

}
