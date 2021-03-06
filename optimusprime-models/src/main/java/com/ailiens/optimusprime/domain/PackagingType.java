package com.ailiens.optimusprime.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.context.annotation.Lazy;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A PackagingType.
 */
@Entity
@Table(name = "packaging_type")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PackagingType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "packaging_type_name")
    private String packagingTypeName;

    @Column(name = "packaging_length")
    private Integer packagingLength;

    @Column(name = "packaging_breadth")
    private Integer packagingBreadth;

    @Column(name = "packaging_height")
    private Integer packagingHeight;

    @Column(name = "packaging_description")
    private String packagingDescription;

    @OneToMany(mappedBy = "packagingType")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<OrderLine> orderLines = new HashSet<>();
    
    @ManyToOne
    @JoinColumn(name = "source_id")
    @Lazy
    private SourceMetadata source;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPackagingTypeName() {
        return packagingTypeName;
    }

    public void setPackagingTypeName(String packagingTypeName) {
        this.packagingTypeName = packagingTypeName;
    }

    public Integer getPackagingLength() {
        return packagingLength;
    }

    public void setPackagingLength(Integer packagingLength) {
        this.packagingLength = packagingLength;
    }

    public Integer getPackagingBreadth() {
        return packagingBreadth;
    }

    public void setPackagingBreadth(Integer packagingBreadth) {
        this.packagingBreadth = packagingBreadth;
    }

    public Integer getPackagingHeight() {
        return packagingHeight;
    }

    public void setPackagingHeight(Integer packagingHeight) {
        this.packagingHeight = packagingHeight;
    }

    public String getPackagingDescription() {
        return packagingDescription;
    }

    public void setPackagingDescription(String packagingDescription) {
        this.packagingDescription = packagingDescription;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
    
    
    public SourceMetadata getSource() {
		return source;
	}

	public void setSource(SourceMetadata source) {
		this.source = source;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PackagingType packagingType = (PackagingType) o;
        return Objects.equals(id, packagingType.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "PackagingType{" +
            "id=" + id +
            ", packagingTypeName='" + packagingTypeName + "'" +
            ", packagingLength='" + packagingLength + "'" +
            ", packagingBreadth='" + packagingBreadth + "'" +
            ", packagingHeight='" + packagingHeight + "'" +
            ", packagingDescription='" + packagingDescription + "'" +
            '}';
    }
}
