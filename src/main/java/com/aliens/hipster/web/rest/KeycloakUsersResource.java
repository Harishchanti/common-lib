package com.aliens.hipster.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.aliens.hipster.domain.KeycloakUsers;

import com.aliens.hipster.repository.KeycloakUsersRepository;
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
 * REST controller for managing KeycloakUsers.
 */
@RestController
@RequestMapping("/api")
public class KeycloakUsersResource {

    private final Logger log = LoggerFactory.getLogger(KeycloakUsersResource.class);
        
    @Inject
    private KeycloakUsersRepository keycloakUsersRepository;

    /**
     * POST  /keycloak-users : Create a new keycloakUsers.
     *
     * @param keycloakUsers the keycloakUsers to create
     * @return the ResponseEntity with status 201 (Created) and with body the new keycloakUsers, or with status 400 (Bad Request) if the keycloakUsers has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @RequestMapping(value = "/keycloak-users",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<KeycloakUsers> createKeycloakUsers(@RequestBody KeycloakUsers keycloakUsers) throws URISyntaxException {
        log.debug("REST request to save KeycloakUsers : {}", keycloakUsers);
        if (keycloakUsers.getId() != null) {
            return ResponseEntity.badRequest().headers(HeaderUtil.createFailureAlert("keycloakUsers", "idexists", "A new keycloakUsers cannot already have an ID")).body(null);
        }
        KeycloakUsers result = keycloakUsersRepository.save(keycloakUsers);
        return ResponseEntity.created(new URI("/api/keycloak-users/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert("keycloakUsers", result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /keycloak-users : Updates an existing keycloakUsers.
     *
     * @param keycloakUsers the keycloakUsers to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated keycloakUsers,
     * or with status 400 (Bad Request) if the keycloakUsers is not valid,
     * or with status 500 (Internal Server Error) if the keycloakUsers couldnt be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @RequestMapping(value = "/keycloak-users",
        method = RequestMethod.PUT,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<KeycloakUsers> updateKeycloakUsers(@RequestBody KeycloakUsers keycloakUsers) throws URISyntaxException {
        log.debug("REST request to update KeycloakUsers : {}", keycloakUsers);
        if (keycloakUsers.getId() == null) {
            return createKeycloakUsers(keycloakUsers);
        }
        KeycloakUsers result = keycloakUsersRepository.save(keycloakUsers);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert("keycloakUsers", keycloakUsers.getId().toString()))
            .body(result);
    }

    /**
     * GET  /keycloak-users : get all the keycloakUsers.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of keycloakUsers in body
     */
    @RequestMapping(value = "/keycloak-users",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public List<KeycloakUsers> getAllKeycloakUsers() {
        log.debug("REST request to get all KeycloakUsers");
        List<KeycloakUsers> keycloakUsers = keycloakUsersRepository.findAll();
        return keycloakUsers;
    }

    /**
     * GET  /keycloak-users/:id : get the "id" keycloakUsers.
     *
     * @param id the id of the keycloakUsers to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the keycloakUsers, or with status 404 (Not Found)
     */
    @RequestMapping(value = "/keycloak-users/{id}",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<KeycloakUsers> getKeycloakUsers(@PathVariable Long id) {
        log.debug("REST request to get KeycloakUsers : {}", id);
        KeycloakUsers keycloakUsers = keycloakUsersRepository.findOne(id);
        return Optional.ofNullable(keycloakUsers)
            .map(result -> new ResponseEntity<>(
                result,
                HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * DELETE  /keycloak-users/:id : delete the "id" keycloakUsers.
     *
     * @param id the id of the keycloakUsers to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @RequestMapping(value = "/keycloak-users/{id}",
        method = RequestMethod.DELETE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> deleteKeycloakUsers(@PathVariable Long id) {
        log.debug("REST request to delete KeycloakUsers : {}", id);
        keycloakUsersRepository.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert("keycloakUsers", id.toString())).build();
    }

}
