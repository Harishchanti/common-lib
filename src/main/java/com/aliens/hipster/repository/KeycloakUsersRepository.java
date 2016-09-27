package com.aliens.hipster.repository;

import com.aliens.hipster.domain.KeycloakUsers;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the KeycloakUsers entity.
 */
@SuppressWarnings("unused")
public interface KeycloakUsersRepository extends JpaRepository<KeycloakUsers,Long> {

}
