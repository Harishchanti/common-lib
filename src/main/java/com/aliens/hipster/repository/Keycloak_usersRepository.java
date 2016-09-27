package com.aliens.hipster.repository;

import com.aliens.hipster.domain.Keycloak_users;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Keycloak_users entity.
 */
@SuppressWarnings("unused")
public interface Keycloak_usersRepository extends JpaRepository<Keycloak_users,Long> {

}
