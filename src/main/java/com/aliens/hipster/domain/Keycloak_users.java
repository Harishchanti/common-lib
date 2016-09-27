package com.aliens.hipster.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Keycloak_users.
 */
@Entity
@Table(name = "keycloak_users")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Keycloak_users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Keycloak_users keycloak_users = (Keycloak_users) o;
        if(keycloak_users.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, keycloak_users.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Keycloak_users{" +
            "id=" + id +
            '}';
    }
}
