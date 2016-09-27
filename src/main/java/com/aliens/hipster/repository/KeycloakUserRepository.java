package com.aliens.hipster.repository;

import com.aliens.hipster.domain.KeycloakUser;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the KeycloakUser entity.
 */
@SuppressWarnings("unused")
public interface KeycloakUserRepository extends JpaRepository<KeycloakUser,Long> {

}
