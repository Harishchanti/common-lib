package com.aliens.hipster.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.aliens.hipster.domain.Keycloak_users;

import com.aliens.hipster.repository.Keycloak_usersRepository;
import com.aliens.hipster.web.rest.util.HeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Keycloak_users.
 */
@RestController
@RequestMapping("/api")
public class Keycloak_usersResource {

    private final Logger log = LoggerFactory.getLogger(Keycloak_usersResource.class);
        
    @Inject
    private Keycloak_usersRepository keycloak_usersRepository;

    /**
     * POST  /keycloak-users : Create a new keycloak_users.
     *
     * @param keycloak_users the keycloak_users to create
     * @return the ResponseEntity with status 201 (Created) and with body the new keycloak_users, or with status 400 (Bad Request) if the keycloak_users has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @RequestMapping(value = "/keycloak-users",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Keycloak_users> createKeycloak_users(@RequestBody Keycloak_users keycloak_users) throws URISyntaxException {
        log.debug("REST request to save Keycloak_users : {}", keycloak_users);
        if (keycloak_users.getId() != null) {
            return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert("keycloak_users", "idexists", "A new keycloak_users cannot already have an ID")).body(null);
        }
        Keycloak_users result = keycloak_usersRepository.save(keycloak_users);
        return ResponseEntity.created(new URI("/api/keycloak-users/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert("keycloak_users", result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /keycloak-users : Updates an existing keycloak_users.
     *
     * @param keycloak_users the keycloak_users to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated keycloak_users,
     * or with status 400 (Bad Request) if the keycloak_users is not valid,
     * or with status 500 (Internal Server Error) if the keycloak_users couldnt be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @RequestMapping(value = "/keycloak-users",
        method = RequestMethod.PUT,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Keycloak_users> updateKeycloak_users(@RequestBody Keycloak_users keycloak_users) throws URISyntaxException {
        log.debug("REST request to update Keycloak_users : {}", keycloak_users);
        if (keycloak_users.getId() == null) {
            return createKeycloak_users(keycloak_users);
        }
        Keycloak_users result = keycloak_usersRepository.save(keycloak_users);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert("keycloak_users", keycloak_users.getId().toString()))
            .body(result);
    }

    /**
     * GET  /keycloak-users : get all the keycloak_users.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of keycloak_users in body
     */
    @RequestMapping(value = "/keycloak-users",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public List<Keycloak_users> getAllKeycloak_users() {
        log.debug("REST request to get all Keycloak_users");
        List<Keycloak_users> keycloak_users = keycloak_usersRepository.findAll();
        return keycloak_users;
    }

    /**
     * GET  /keycloak-users/:id : get the "id" keycloak_users.
     *
     * @param id the id of the keycloak_users to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the keycloak_users, or with status 404 (Not Found)
     */
    @RequestMapping(value = "/keycloak-users/{id}",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Keycloak_users> getKeycloak_users(@PathVariable Long id) {
        log.debug("REST request to get Keycloak_users : {}", id);
        Keycloak_users keycloak_users = keycloak_usersRepository.findOne(id);
        return Optional.ofNullable(keycloak_users)
            .map(result -> new ResponseEntity<>(
                result,
                HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * DELETE  /keycloak-users/:id : delete the "id" keycloak_users.
     *
     * @param id the id of the keycloak_users to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @RequestMapping(value = "/keycloak-users/{id}",
        method = RequestMethod.DELETE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> deleteKeycloak_users(@PathVariable Long id) {
        log.debug("REST request to delete Keycloak_users : {}", id);
        keycloak_usersRepository.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert("keycloak_users", id.toString())).build();
    }

}
