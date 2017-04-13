package com.ailiens.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Transient;

import java.io.Serializable;

/**
 * Created by vaibhav on 2/11/15.
 */


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InsertableCartItem implements Serializable {

    /**
     *
     */
    static final long serialVersionUID = -5743154955381386128L;

    @Transient
    String id;

    String skuId;
    Integer qty;
    String shippingMethod;
    String lastModifiedDate;
    String createdDate;

    @Transient
    Integer maxQty;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        InsertableCartItem that = (InsertableCartItem) o;

        return this.skuId.equals(that.skuId);

    }

    @Override
    public int hashCode() {
        return skuId.hashCode();
    }


}
