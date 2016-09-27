package com.aliens.hipster.domain;

import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A Clients.
 */
@Entity
@Table(name = "clients")
@Data
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Clients implements Serializable {

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


    @ManyToOne(fetch =FetchType.LAZY )
    @JoinColumn(name="keycloak_user_id")
    private KeycloakUser keycloak_user;




}
