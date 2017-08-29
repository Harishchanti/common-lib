package com.ailiens.optimusprime.autobots.rest.dto.n3ow.stateChangeDTO;

public class MultipleReturnStatusChangeDTO {

    public String returnId;

    public ReturnStatusChangeDTO returnStatusChangeDTO;

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public ReturnStatusChangeDTO getReturnStatusChangeDTO() {
        return returnStatusChangeDTO;
    }

    public void setReturnStatusChangeDTO(ReturnStatusChangeDTO returnStatusChangeDTO) {
        this.returnStatusChangeDTO = returnStatusChangeDTO;
    }

    @Override
    public String toString() {
        return "MultipleReturnStatusChangeDTO{" +
            "returnId='" + returnId + '\'' +
            ", returnStatusChangeDTO=" + returnStatusChangeDTO +
            '}';
    }
}
