package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * Created by akki on 4/12/15.
 */

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class SavedCard implements Serializable {

    boolean isDefault;
    String cardType;
    @JsonProperty("cardToken")
    String tokenId;
    String pgCode;
    String expMonth;
    String expYear;
    String cardname;
    String cardMode;
    String cardNickName;
    String cardMorphedNumber;
    String typeCode;
    String bankCode;
    String bankBin;
    boolean expired;
    boolean isEnable;
}
