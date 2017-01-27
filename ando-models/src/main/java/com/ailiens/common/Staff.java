package com.ailiens.common;


import com.ailiens.common.enumeration.Designations;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Staff.
 */
@Entity
@Table(name = "staff")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName="staff")
public class Staff implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "staff_id")
    private String staffId;

    @Column(name = "name")
    private String name;

    @Column(name = "contact_no")
    private String contactNo;

    @Column(name = "fc_id")
    private String fcId;

    @Enumerated(EnumType.STRING)
    @Column(name = "designation")
    private Designations designation;

    @ManyToOne
    private FCDetails fCDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getFcId() {
        return fcId;
    }

    public void setFcId(String fcId) {
        this.fcId = fcId;
    }

    public Designations getDesignation() {
        return designation;
    }

    public void setDesignation(Designations designation) {
        this.designation = designation;
    }

    public FCDetails getFCDetails() {
        return fCDetails;
    }

    public void setFCDetails(FCDetails fCDetails) {
        this.fCDetails = fCDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Staff staff = (Staff) o;

        if ( ! Objects.equals(id, staff.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", staffId='" + staffId + "'" +
                ", name='" + name + "'" +
                ", contactNo='" + contactNo + "'" +
                ", fcId='" + fcId + "'" +
                ", designation='" + designation + "'" +
                '}';
    }
}
