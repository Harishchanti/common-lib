package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A RelatedItem.
 */
@Entity
@Table(name = "related_item")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class RelatedItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private OrderLine owner;

    @ManyToOne
    @JoinColumn(name = "related_to_id")
    private OrderLine relatedTo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderLine getOwner() {
        return owner;
    }

    public void setOwner(OrderLine orderLine) {
        this.owner = orderLine;
    }

    public OrderLine getRelatedTo() {
        return relatedTo;
    }

    public void setRelatedTo(OrderLine orderLine) {
        this.relatedTo = orderLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelatedItem relatedItem = (RelatedItem) o;
        return Objects.equals(id, relatedItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "RelatedItem{" +
            "id=" + id +
            '}';
    }
}
