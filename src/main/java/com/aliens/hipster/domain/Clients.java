package com.aliens.hipster.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Clients.
 */
@Entity
@Table(name = "clients")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Clients implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "topic")
    private String topic;

    @Column(name = "consumer_count")
    private Integer consumer_count;

    @Column(name = "target_endpoint")
    private String target_endpoint;

    @Column(name = "keycloak_user")
    private Integer keycloak_user;

    @ManyToOne
    private KeycloakUser keycloakUserMap;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Clients name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public Clients topic(String topic) {
        this.topic = topic;
        return this;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getConsumer_count() {
        return consumer_count;
    }

    public Clients consumer_count(Integer consumer_count) {
        this.consumer_count = consumer_count;
        return this;
    }

    public void setConsumer_count(Integer consumer_count) {
        this.consumer_count = consumer_count;
    }

    public String getTarget_endpoint() {
        return target_endpoint;
    }

    public Clients target_endpoint(String target_endpoint) {
        this.target_endpoint = target_endpoint;
        return this;
    }

    public void setTarget_endpoint(String target_endpoint) {
        this.target_endpoint = target_endpoint;
    }

    public Integer getKeycloak_user() {
        return keycloak_user;
    }

    public Clients keycloak_user(Integer keycloak_user) {
        this.keycloak_user = keycloak_user;
        return this;
    }

    public void setKeycloak_user(Integer keycloak_user) {
        this.keycloak_user = keycloak_user;
    }

    public KeycloakUser getKeycloakUserMap() {
        return keycloakUserMap;
    }

    public Clients keycloakUserMap(KeycloakUser keycloakUser) {
        this.keycloakUserMap = keycloakUser;
        return this;
    }

    public void setKeycloakUserMap(KeycloakUser keycloakUser) {
        this.keycloakUserMap = keycloakUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Clients clients = (Clients) o;
        if(clients.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, clients.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Clients{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", topic='" + topic + "'" +
            ", consumer_count='" + consumer_count + "'" +
            ", target_endpoint='" + target_endpoint + "'" +
            ", keycloak_user='" + keycloak_user + "'" +
            '}';
    }
}
