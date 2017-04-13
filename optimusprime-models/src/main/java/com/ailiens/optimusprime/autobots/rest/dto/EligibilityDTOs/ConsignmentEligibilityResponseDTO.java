package com.ailiens.optimusprime.autobots.rest.dto.EligibilityDTOs;

public class ConsignmentEligibilityResponseDTO {

    public ConsignmentEligibilityResponseDTO() {
        this.rto = new EligibilityDetailsDTO();
        this.addressChange = new EligibilityDetailsDTO();
        this.deliveryModification = new EligibilityDetailsDTO();
        this.cancel = new EligibilityDetailsDTO();
    }

    private String consignmentId;

    private EligibilityDetailsDTO rto;

    private EligibilityDetailsDTO deliveryModification;

    private EligibilityDetailsDTO addressChange;

    private EligibilityDetailsDTO cancel;

    public String getConsignmentId() {
        return consignmentId;
    }

    public void setConsignmentId(String consignmentId) {
        this.consignmentId = consignmentId;
    }

   
    public EligibilityDetailsDTO getRto() {
        return rto;
    }

    public void setRto(EligibilityDetailsDTO rto) {
        this.rto = rto;
    }

    public EligibilityDetailsDTO getDeliveryModification() {
        return deliveryModification;
    }

    public void setDeliveryModification(EligibilityDetailsDTO deliveryModification) {
        this.deliveryModification = deliveryModification;
    }

    public EligibilityDetailsDTO getAddressChange() {
        return addressChange;
    }

    public void setAddressChange(EligibilityDetailsDTO addressChange) {
        this.addressChange = addressChange;
    }

    public EligibilityDetailsDTO getCancel() {
        return cancel;
    }

    public void setCancel(EligibilityDetailsDTO cancel) {
        this.cancel = cancel;
    }

    @Override
    public String toString() {
        return "ConsignmentEligibilityResponseDTO{" +
            "consignmentId='" + consignmentId + '\'' +
            ", rto=" + rto +
            ", deliveryModification=" + deliveryModification +
            ", addressChange=" + addressChange +
            ", cancel=" + cancel +
            '}';
    }
}
