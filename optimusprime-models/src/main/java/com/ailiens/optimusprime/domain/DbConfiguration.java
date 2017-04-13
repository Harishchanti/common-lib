package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DbConfiguration.
 */
@Entity
@Table(name = "db_configuration")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DbConfiguration implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "config_key")
    private String configKey;

    @Column(name = "config_value")
    private String configValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DbConfiguration dbConfiguration = (DbConfiguration) o;
        return Objects.equals(id, dbConfiguration.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DbConfiguration{" +
            "id=" + id +
            ", configKey='" + configKey + "'" +
            ", configValue='" + configValue + "'" +
            '}';
    }
}
