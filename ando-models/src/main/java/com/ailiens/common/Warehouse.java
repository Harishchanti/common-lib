package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Warehouse.
 */
@Entity
@Table(name = "warehouse")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName="warehouse")
public class Warehouse implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "ftp_location")
    private String ftpLocation;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToOne(mappedBy = "warehouse")
    @JsonIgnore
    private FCDetails fCDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFtpLocation() {
        return ftpLocation;
    }

    public void setFtpLocation(String ftpLocation) {
        this.ftpLocation = ftpLocation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

        Warehouse warehouse = (Warehouse) o;

        if ( ! Objects.equals(id, warehouse.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", ftpLocation='" + ftpLocation + "'" +
                ", username='" + username + "'" +
                ", password='" + password + "'" +
                '}';
    }
}
