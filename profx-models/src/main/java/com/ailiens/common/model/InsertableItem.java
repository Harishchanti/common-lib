package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Transient;

import java.io.Serializable;

/**
 * Created by vaibhav on 30/10/15.
 */

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InsertableItem implements Serializable {

    private static final long serialVersionUID = -3344517156046643494L;

    @Transient
    String id;

    String skuId;
    String styleId;
    String createdDate;
    String lastModifiedDate;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        InsertableItem that = (InsertableItem) o;

        return this.styleId.equals(that.styleId);

    }
}
