package com.aliens.hipster.web.rest;

import com.aliens.hipster.MsgApp;
import com.aliens.hipster.domain.Clients;
import com.aliens.hipster.repository.ClientsRepository;

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
 * Test class for the ClientsResource REST controller.
 *
 * @see ClientsResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MsgApp.class)
public class ClientsResourceIntTest {
    private static final String DEFAULT_NAME = "AAAAA";
    private static final String UPDATED_NAME = "BBBBB";
    private static final String DEFAULT_TOPIC = "AAAAA";
    private static final String UPDATED_TOPIC = "BBBBB";

    private static final Integer DEFAULT_CONSUMER_COUNT = 1;
    private static final Integer UPDATED_CONSUMER_COUNT = 2;
    private static final String DEFAULT_TARGET_ENDPOINT = "AAAAA";
    private static final String UPDATED_TARGET_ENDPOINT = "BBBBB";

    private static final Integer DEFAULT_KEYCLOAK_USER = 1;
    private static final Integer UPDATED_KEYCLOAK_USER = 2;

    @Inject
    private ClientsRepository clientsRepository;

    @Inject
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Inject
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Inject
    private EntityManager em;

    private MockMvc restClientsMockMvc;

    private Clients clients;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.initMocks(this);
        ClientsResource clientsResource = new ClientsResource();
        ReflectionTestUtils.setField(clientsResource, "clientsRepository", clientsRepository);
        this.restClientsMockMvc = MockMvcBuilders.standaloneSetup(clientsResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Clients createEntity(EntityManager em) {
        Clients clients = new Clients();
        clients = new Clients()
                .name(DEFAULT_NAME)
                .topic(DEFAULT_TOPIC)
                .consumer_count(DEFAULT_CONSUMER_COUNT)
                .target_endpoint(DEFAULT_TARGET_ENDPOINT)
                .keycloak_user(DEFAULT_KEYCLOAK_USER);
        return clients;
    }

    @Before
    public void initTest() {
        clients = createEntity(em);
    }

    @Test
    @Transactional
    public void createClients() throws Exception {
        int databaseSizeBeforeCreate = clientsRepository.findAll().size();

        // Create the Clients

        restClientsMockMvc.perform(post("/api/clients")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(clients)))
                .andExpect(status().isCreated());

        // Validate the Clients in the database
        List<Clients> clients = clientsRepository.findAll();
        assertThat(clients).hasSize(databaseSizeBeforeCreate + 1);
        Clients testClients = clients.get(clients.size() - 1);
        assertThat(testClients.getName()).isEqualTo(DEFAULT_NAME);
        assertThat(testClients.getTopic()).isEqualTo(DEFAULT_TOPIC);
        assertThat(testClients.getConsumer_count()).isEqualTo(DEFAULT_CONSUMER_COUNT);
        assertThat(testClients.getTarget_endpoint()).isEqualTo(DEFAULT_TARGET_ENDPOINT);
        assertThat(testClients.getKeycloak_user()).isEqualTo(DEFAULT_KEYCLOAK_USER);
    }

    @Test
    @Transactional
    public void getAllClients() throws Exception {
        // Initialize the database
        clientsRepository.saveAndFlush(clients);

        // Get all the clients
        restClientsMockMvc.perform(get("/api/clients?sort=id,desc"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
                .andExpect(jsonPath("$.[*].id").value(hasItem(clients.getId().intValue())))
                .andExpect(jsonPath("$.[*].name").value(hasItem(DEFAULT_NAME.toString())))
                .andExpect(jsonPath("$.[*].topic").value(hasItem(DEFAULT_TOPIC.toString())))
                .andExpect(jsonPath("$.[*].consumer_count").value(hasItem(DEFAULT_CONSUMER_COUNT)))
                .andExpect(jsonPath("$.[*].target_endpoint").value(hasItem(DEFAULT_TARGET_ENDPOINT.toString())))
                .andExpect(jsonPath("$.[*].keycloak_user").value(hasItem(DEFAULT_KEYCLOAK_USER)));
    }

    @Test
    @Transactional
    public void getClients() throws Exception {
        // Initialize the database
        clientsRepository.saveAndFlush(clients);

        // Get the clients
        restClientsMockMvc.perform(get("/api/clients/{id}", clients.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(clients.getId().intValue()))
            .andExpect(jsonPath("$.name").value(DEFAULT_NAME.toString()))
            .andExpect(jsonPath("$.topic").value(DEFAULT_TOPIC.toString()))
            .andExpect(jsonPath("$.consumer_count").value(DEFAULT_CONSUMER_COUNT))
            .andExpect(jsonPath("$.target_endpoint").value(DEFAULT_TARGET_ENDPOINT.toString()))
            .andExpect(jsonPath("$.keycloak_user").value(DEFAULT_KEYCLOAK_USER));
    }

    @Test
    @Transactional
    public void getNonExistingClients() throws Exception {
        // Get the clients
        restClientsMockMvc.perform(get("/api/clients/{id}", Long.MAX_VALUE))
                .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateClients() throws Exception {
        // Initialize the database
        clientsRepository.saveAndFlush(clients);
        int databaseSizeBeforeUpdate = clientsRepository.findAll().size();

        // Update the clients
        Clients updatedClients = clientsRepository.findOne(clients.getId());
        updatedClients
                .name(UPDATED_NAME)
                .topic(UPDATED_TOPIC)
                .consumer_count(UPDATED_CONSUMER_COUNT)
                .target_endpoint(UPDATED_TARGET_ENDPOINT)
                .keycloak_user(UPDATED_KEYCLOAK_USER);

        restClientsMockMvc.perform(put("/api/clients")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(updatedClients)))
                .andExpect(status().isOk());

        // Validate the Clients in the database
        List<Clients> clients = clientsRepository.findAll();
        assertThat(clients).hasSize(databaseSizeBeforeUpdate);
        Clients testClients = clients.get(clients.size() - 1);
        assertThat(testClients.getName()).isEqualTo(UPDATED_NAME);
        assertThat(testClients.getTopic()).isEqualTo(UPDATED_TOPIC);
        assertThat(testClients.getConsumer_count()).isEqualTo(UPDATED_CONSUMER_COUNT);
        assertThat(testClients.getTarget_endpoint()).isEqualTo(UPDATED_TARGET_ENDPOINT);
        assertThat(testClients.getKeycloak_user()).isEqualTo(UPDATED_KEYCLOAK_USER);
    }

    @Test
    @Transactional
    public void deleteClients() throws Exception {
        // Initialize the database
        clientsRepository.saveAndFlush(clients);
        int databaseSizeBeforeDelete = clientsRepository.findAll().size();

        // Get the clients
        restClientsMockMvc.perform(delete("/api/clients/{id}", clients.getId())
                .accept(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());

        // Validate the database is empty
        List<Clients> clients = clientsRepository.findAll();
        assertThat(clients).hasSize(databaseSizeBeforeDelete - 1);
    }
}
