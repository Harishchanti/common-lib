package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

/**
 * Created by anagha on 2/11/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Style implements Serializable {
    String styleId;

}
