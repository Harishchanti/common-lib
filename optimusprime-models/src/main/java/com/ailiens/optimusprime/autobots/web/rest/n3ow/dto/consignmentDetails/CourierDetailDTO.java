package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import com.ailiens.optimusprime.domain.Courier;


/**
 * Created by adi on 14/9/17.
 */

public class CourierDetailDTO {

    private Integer courierId;

    private String courierName = "";

    private String courierReferenceId = "";


    public CourierDetailDTO(Courier courier) {
        if(courier != null) {
            this.courierId = courier.getId();
            this.courierName = courier.getCourierName();
            this.courierReferenceId = courier.getCourierReferenceId();
        }
    }

    public CourierDetailDTO() {

    }

    public Integer getCourierId() {
        return courierId;
    }

    public void setCourierId(Integer courierId) {
        this.courierId = courierId;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getCourierReferenceId() {
        return courierReferenceId;
    }

    public void setCourierReferenceId(String courierReferenceId) {
        this.courierReferenceId = courierReferenceId;
    }


}
