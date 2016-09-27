package com.aliens.hipster.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A KeycloakUser.
 */
@Entity
@Table(name = "keycloak_user")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class KeycloakUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "client_id")
    private String clientId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "keycloakUser")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Clients> clients = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public KeycloakUser name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientId() {
        return clientId;
    }

    public KeycloakUser clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getUsername() {
        return username;
    }

    public KeycloakUser username(String username) {
        this.username = username;
        return this;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public KeycloakUser password(String password) {
        this.password = password;
        return this;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Clients> getClients() {
        return clients;
    }

    public KeycloakUser clients(Set<Clients> clients) {
        this.clients = clients;
        return this;
    }

    public KeycloakUser addClients(Clients clients) {
        clients.add(clients);
        clients.setKeycloakUser(this);
        return this;
    }

    public KeycloakUser removeClients(Clients clients) {
        clients.remove(clients);
        clients.setKeycloakUser(null);
        return this;
    }

    public void setClients(Set<Clients> clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeycloakUser keycloakUser = (KeycloakUser) o;
        if(keycloakUser.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, keycloakUser.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "KeycloakUser{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", clientId='" + clientId + "'" +
            ", username='" + username + "'" +
            ", password='" + password + "'" +
            '}';
    }
}
