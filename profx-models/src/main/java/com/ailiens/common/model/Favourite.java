package com.ailiens.common.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 * Created by anagha on 1/18/17.
 */

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Favourite<T extends FavoriteBase> implements Serializable {
    /**
     *
     */
    static final long serialVersionUID = 4207569452805669772L;
    @Id
    String userId;
    HashMap<String, HashMap<String, List<T>>> favourites;

}
