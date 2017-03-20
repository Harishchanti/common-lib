package com.ailiens.common.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * Created by anagha on 1/18/17.
 */

@Data
@FieldDefaults(level = AccessLevel.PROTECTED)
public class FavoriteBase implements Serializable {

    /**
     *
     */
    static final long serialVersionUID = -737679553255184192L;

    String id;
    String createdDate;
    String lastModifiedDate;


}
