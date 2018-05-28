package com.ailiens.optimusprime.domain;

import javax.persistence.*;

@Entity
@Table(name = "fc_id_sequence_no")
public class FcIdSequenceNo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fc_id")
    private String fcId;

    @Column(name = "sequence_no")
    private String sequenceNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFcId() {
        return fcId;
    }

    public void setFcId(String fcId) {
        this.fcId = fcId;
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(String sequenceNo) {
        this.sequenceNo = sequenceNo;
    }
}
