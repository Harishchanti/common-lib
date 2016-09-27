package com.aliens.hipster.web.rest;

import com.aliens.hipster.MsgApp;
import com.aliens.hipster.domain.KeycloakUsers;
import com.aliens.hipster.repository.KeycloakUsersRepository;

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
 * Test class for the KeycloakUsersResource REST controller.
 *
 * @see KeycloakUsersResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MsgApp.class)
public class KeycloakUsersResourceIntTest {
    private static final String DEFAULT_KEYCLOAK_USERNAME = "AAAAA";
    private static final String UPDATED_KEYCLOAK_USERNAME = "BBBBB";
    private static final String DEFAULT_KEYCLOAK_CLIENT_ID = "AAAAA";
    private static final String UPDATED_KEYCLOAK_CLIENT_ID = "BBBBB";
    private static final String DEFAULT_KEYCLOAK_CLIENT_PASSWORD = "AAAAA";
    private static final String UPDATED_KEYCLOAK_CLIENT_PASSWORD = "BBBBB";
    private static final String DEFAULT_KEYCLOAK_USER = "AAAAA";
    private static final String UPDATED_KEYCLOAK_USER = "BBBBB";

    @Inject
    private KeycloakUsersRepository keycloakUsersRepository;

    @Inject
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Inject
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Inject
    private EntityManager em;

    private MockMvc restKeycloakUsersMockMvc;

    private KeycloakUsers keycloakUsers;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.initMocks(this);
        KeycloakUsersResource keycloakUsersResource = new KeycloakUsersResource();
        ReflectionTestUtils.setField(keycloakUsersResource, "keycloakUsersRepository", keycloakUsersRepository);
        this.restKeycloakUsersMockMvc = MockMvcBuilders.standaloneSetup(keycloakUsersResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static KeycloakUsers createEntity(EntityManager em) {
        KeycloakUsers keycloakUsers = new KeycloakUsers();
        keycloakUsers = new KeycloakUsers()
                .keycloakUsername(DEFAULT_KEYCLOAK_USERNAME)
                .keycloakClientId(DEFAULT_KEYCLOAK_CLIENT_ID)
                .keycloakClientPassword(DEFAULT_KEYCLOAK_CLIENT_PASSWORD)
                .keycloakUser(DEFAULT_KEYCLOAK_USER);
        return keycloakUsers;
    }

    @Before
    public void initTest() {
        keycloakUsers = createEntity(em);
    }

    @Test
    @Transactional
    public void createKeycloakUsers() throws Exception {
        int databaseSizeBeforeCreate = keycloakUsersRepository.findAll().size();

        // Create the KeycloakUsers

        restKeycloakUsersMockMvc.perform(post("/api/keycloak-users")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(keycloakUsers)))
                .andExpect(status().isCreated());

        // Validate the KeycloakUsers in the database
        List<KeycloakUsers> keycloakUsers = keycloakUsersRepository.findAll();
        assertThat(keycloakUsers).hasSize(databaseSizeBeforeCreate + 1);
        KeycloakUsers testKeycloakUsers = keycloakUsers.get(keycloakUsers.size() - 1);
        assertThat(testKeycloakUsers.getKeycloakUsername()).isEqualTo(DEFAULT_KEYCLOAK_USERNAME);
        assertThat(testKeycloakUsers.getKeycloakClientId()).isEqualTo(DEFAULT_KEYCLOAK_CLIENT_ID);
        assertThat(testKeycloakUsers.getKeycloakClientPassword()).isEqualTo(DEFAULT_KEYCLOAK_CLIENT_PASSWORD);
        assertThat(testKeycloakUsers.getKeycloakUser()).isEqualTo(DEFAULT_KEYCLOAK_USER);
    }

    @Test
    @Transactional
    public void getAllKeycloakUsers() throws Exception {
        // Initialize the database
        keycloakUsersRepository.saveAndFlush(keycloakUsers);

        // Get all the keycloakUsers
        restKeycloakUsersMockMvc.perform(get("/api/keycloak-users?sort=id,desc"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$.[*].id").value(hasItem(keycloakUsers.getId().intValue())))
                .andExpect(jsonPath("$.[*].keycloakUsername").value(hasItem(DEFAULT_KEYCLOAK_USERNAME.toString())))
                .andExpect(jsonPath("$.[*].keycloakClientId").value(hasItem(DEFAULT_KEYCLOAK_CLIENT_ID.toString())))
                .andExpect(jsonPath("$.[*].keycloakClientPassword").value(hasItem(DEFAULT_KEYCLOAK_CLIENT_PASSWORD.toString())))
                .andExpect(jsonPath("$.[*].keycloakUser").value(hasItem(DEFAULT_KEYCLOAK_USER.toString())));
    }

    @Test
    @Transactional
    public void getKeycloakUsers() throws Exception {
        // Initialize the database
        keycloakUsersRepository.saveAndFlush(keycloakUsers);

        // Get the keycloakUsers
        restKeycloakUsersMockMvc.perform(get("/api/keycloak-users/{id}", keycloakUsers.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(keycloakUsers.getId().intValue()))
            .andExpect(jsonPath("$.keycloakUsername").value(DEFAULT_KEYCLOAK_USERNAME.toString()))
            .andExpect(jsonPath("$.keycloakClientId").value(DEFAULT_KEYCLOAK_CLIENT_ID.toString()))
            .andExpect(jsonPath("$.keycloakClientPassword").value(DEFAULT_KEYCLOAK_CLIENT_PASSWORD.toString()))
            .andExpect(jsonPath("$.keycloakUser").value(DEFAULT_KEYCLOAK_USER.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingKeycloakUsers() throws Exception {
        // Get the keycloakUsers
        restKeycloakUsersMockMvc.perform(get("/api/keycloak-users/{id}", Long.MAX_VALUE))
                .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateKeycloakUsers() throws Exception {
        // Initialize the database
        keycloakUsersRepository.saveAndFlush(keycloakUsers);
        int databaseSizeBeforeUpdate = keycloakUsersRepository.findAll().size();

        // Update the keycloakUsers
        KeycloakUsers updatedKeycloakUsers = keycloakUsersRepository.findOne(keycloakUsers.getId());
        updatedKeycloakUsers
                .keycloakUsername(UPDATED_KEYCLOAK_USERNAME)
                .keycloakClientId(UPDATED_KEYCLOAK_CLIENT_ID)
                .keycloakClientPassword(UPDATED_KEYCLOAK_CLIENT_PASSWORD)
                .keycloakUser(UPDATED_KEYCLOAK_USER);

        restKeycloakUsersMockMvc.perform(put("/api/keycloak-users")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(updatedKeycloakUsers)))
                .andExpect(status().isOk());

        // Validate the KeycloakUsers in the database
        List<KeycloakUsers> keycloakUsers = keycloakUsersRepository.findAll();
        assertThat(keycloakUsers).hasSize(databaseSizeBeforeUpdate);
        KeycloakUsers testKeycloakUsers = keycloakUsers.get(keycloakUsers.size() - 1);
        assertThat(testKeycloakUsers.getKeycloakUsername()).isEqualTo(UPDATED_KEYCLOAK_USERNAME);
        assertThat(testKeycloakUsers.getKeycloakClientId()).isEqualTo(UPDATED_KEYCLOAK_CLIENT_ID);
        assertThat(testKeycloakUsers.getKeycloakClientPassword()).isEqualTo(UPDATED_KEYCLOAK_CLIENT_PASSWORD);
        assertThat(testKeycloakUsers.getKeycloakUser()).isEqualTo(UPDATED_KEYCLOAK_USER);
    }

    @Test
    @Transactional
    public void deleteKeycloakUsers() throws Exception {
        // Initialize the database
        keycloakUsersRepository.saveAndFlush(keycloakUsers);
        int databaseSizeBeforeDelete = keycloakUsersRepository.findAll().size();

        // Get the keycloakUsers
        restKeycloakUsersMockMvc.perform(delete("/api/keycloak-users/{id}", keycloakUsers.getId())
                .accept(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());

        // Validate the database is empty
        List<KeycloakUsers> keycloakUsers = keycloakUsersRepository.findAll();
        assertThat(keycloakUsers).hasSize(databaseSizeBeforeDelete - 1);
    }
}
