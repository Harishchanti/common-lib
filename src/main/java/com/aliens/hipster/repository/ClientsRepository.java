package com.aliens.hipster.repository;

import com.aliens.hipster.domain.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Clients entity.
 */
@SuppressWarnings("unused")
public interface ClientsRepository extends JpaRepository<Clients,Long> {

}
