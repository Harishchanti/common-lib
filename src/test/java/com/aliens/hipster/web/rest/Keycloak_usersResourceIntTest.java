package com.aliens.hipster.web.rest;

import com.aliens.hipster.MsgApp;
import com.aliens.hipster.domain.Keycloak_users;
import com.aliens.hipster.repository.Keycloak_usersRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.Matchers.hasItem;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the Keycloak_usersResource REST controller.
 *
 * @see Keycloak_usersResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MsgApp.class)
public class Keycloak_usersResourceIntTest {

    @Inject
    private Keycloak_usersRepository keycloak_usersRepository;

    @Inject
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Inject
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Inject
    private EntityManager em;

    private MockMvc restKeycloak_usersMockMvc;

    private Keycloak_users keycloak_users;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.initMocks(this);
        Keycloak_usersResource keycloak_usersResource = new Keycloak_usersResource();
        ReflectionTestUtils.setField(keycloak_usersResource, "keycloak_usersRepository", keycloak_usersRepository);
        this.restKeycloak_usersMockMvc = MockMvcBuilders.standaloneSetup(keycloak_usersResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Keycloak_users createEntity(EntityManager em) {
        Keycloak_users keycloak_users = new Keycloak_users();
        keycloak_users = new Keycloak_users();
        return keycloak_users;
    }

    @Before
    public void initTest() {
        keycloak_users = createEntity(em);
    }

    @Test
    @Transactional
    public void createKeycloak_users() throws Exception {
        int databaseSizeBeforeCreate = keycloak_usersRepository.findAll().size();

        // Create the Keycloak_users

        restKeycloak_usersMockMvc.perform(post("/api/keycloak-users")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(keycloak_users)))
                .andExpect(status().isCreated());

        // Validate the Keycloak_users in the database
        List<Keycloak_users> keycloak_users = keycloak_usersRepository.findAll();
        assertThat(keycloak_users).hasSize(databaseSizeBeforeCreate + 1);
        Keycloak_users testKeycloak_users = keycloak_users.get(keycloak_users.size() - 1);
    }

    @Test
    @Transactional
    public void getAllKeycloak_users() throws Exception {
        // Initialize the database
        keycloak_usersRepository.saveAndFlush(keycloak_users);

        // Get all the keycloak_users
        restKeycloak_usersMockMvc.perform(get("/api/keycloak-users?sort=id,desc"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$.[*].id").value(hasItem(keycloak_users.getId().intValue())));
    }

    @Test
    @Transactional
    public void getKeycloak_users() throws Exception {
        // Initialize the database
        keycloak_usersRepository.saveAndFlush(keycloak_users);

        // Get the keycloak_users
        restKeycloak_usersMockMvc.perform(get("/api/keycloak-users/{id}", keycloak_users.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(keycloak_users.getId().intValue()));
    }

    @Test
    @Transactional
    public void getNonExistingKeycloak_users() throws Exception {
        // Get the keycloak_users
        restKeycloak_usersMockMvc.perform(get("/api/keycloak-users/{id}", Long.MAX_VALUE))
                .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateKeycloak_users() throws Exception {
        // Initialize the database
        keycloak_usersRepository.saveAndFlush(keycloak_users);
        int databaseSizeBeforeUpdate = keycloak_usersRepository.findAll().size();

        // Update the keycloak_users
        Keycloak_users updatedKeycloak_users = keycloak_usersRepository.findOne(keycloak_users.getId());

        restKeycloak_usersMockMvc.perform(put("/api/keycloak-users")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(updatedKeycloak_users)))
                .andExpect(status().isOk());

        // Validate the Keycloak_users in the database
        List<Keycloak_users> keycloak_users = keycloak_usersRepository.findAll();
        assertThat(keycloak_users).hasSize(databaseSizeBeforeUpdate);
        Keycloak_users testKeycloak_users = keycloak_users.get(keycloak_users.size() - 1);
    }

    @Test
    @Transactional
    public void deleteKeycloak_users() throws Exception {
        // Initialize the database
        keycloak_usersRepository.saveAndFlush(keycloak_users);
        int databaseSizeBeforeDelete = keycloak_usersRepository.findAll().size();

        // Get the keycloak_users
        restKeycloak_usersMockMvc.perform(delete("/api/keycloak-users/{id}", keycloak_users.getId())
                .accept(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());

        // Validate the database is empty
        List<Keycloak_users> keycloak_users = keycloak_usersRepository.findAll();
        assertThat(keycloak_users).hasSize(databaseSizeBeforeDelete - 1);
    }
}
