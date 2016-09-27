package com.aliens.hipster.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A KeycloakUsers.
 */
@Entity
@Table(name = "keycloak_users")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class KeycloakUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "keycloak_username")
    private String keycloakUsername;

    @Column(name = "keycloak_client_id")
    private String keycloakClientId;

    @Column(name = "keycloak_client_password")
    private String keycloakClientPassword;

    @Column(name = "keycloak_user")
    private String keycloakUser;

    @ManyToOne
    private Clients manyToOne;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeycloakUsername() {
        return keycloakUsername;
    }

    public KeycloakUsers keycloakUsername(String keycloakUsername) {
        this.keycloakUsername = keycloakUsername;
        return this;
    }

    public void setKeycloakUsername(String keycloakUsername) {
        this.keycloakUsername = keycloakUsername;
    }

    public String getKeycloakClientId() {
        return keycloakClientId;
    }

    public KeycloakUsers keycloakClientId(String keycloakClientId) {
        this.keycloakClientId = keycloakClientId;
        return this;
    }

    public void setKeycloakClientId(String keycloakClientId) {
        this.keycloakClientId = keycloakClientId;
    }

    public String getKeycloakClientPassword() {
        return keycloakClientPassword;
    }

    public KeycloakUsers keycloakClientPassword(String keycloakClientPassword) {
        this.keycloakClientPassword = keycloakClientPassword;
        return this;
    }

    public void setKeycloakClientPassword(String keycloakClientPassword) {
        this.keycloakClientPassword = keycloakClientPassword;
    }

    public String getKeycloakUser() {
        return keycloakUser;
    }

    public KeycloakUsers keycloakUser(String keycloakUser) {
        this.keycloakUser = keycloakUser;
        return this;
    }

    public void setKeycloakUser(String keycloakUser) {
        this.keycloakUser = keycloakUser;
    }

    public Clients getManyToOne() {
        return manyToOne;
    }

    public KeycloakUsers manyToOne(Clients clients) {
        this.manyToOne = clients;
        return this;
    }

    public void setManyToOne(Clients clients) {
        this.manyToOne = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeycloakUsers keycloakUsers = (KeycloakUsers) o;
        if(keycloakUsers.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, keycloakUsers.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "KeycloakUsers{" +
            "id=" + id +
            ", keycloakUsername='" + keycloakUsername + "'" +
            ", keycloakClientId='" + keycloakClientId + "'" +
            ", keycloakClientPassword='" + keycloakClientPassword + "'" +
            ", keycloakUser='" + keycloakUser + "'" +
            '}';
    }
}
