package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A MultiBrand.
 */
@Entity
@Table(name = "multi_brand")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName="multibrand")
public class MultiBrand implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToOne(mappedBy = "multiBrand")
    @JsonIgnore
    private FCDetails fCDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

        MultiBrand multiBrand = (MultiBrand) o;

        if ( ! Objects.equals(id, multiBrand.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "MultiBrand{" +
                "id=" + id +
                '}';
    }
}
