package com.ailiens.optimusprime.domain;

import com.ailiens.optimusprime.domain.enumeration.downloadStatus;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A DownloadDetails.
 */
@Entity
@Table(name = "download_details")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DownloadDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "download_status")
    private downloadStatus downloadStatus;

    @Column(name = "download_id")
    private String downloadId;

    @Column(name = "metadata")
    private String metadata;

    @Column(name = "last_modified_time")
    private ZonedDateTime lastModifiedTime;

    @Column(name = "creation_time")
    private ZonedDateTime creationTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public downloadStatus getDownloadStatus() {
        return downloadStatus;
    }

    public void setDownloadStatus(downloadStatus downloadStatus) {
        this.downloadStatus = downloadStatus;
    }

    public String getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(String downloadId) {
        this.downloadId = downloadId;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public ZonedDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(ZonedDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public ZonedDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(ZonedDateTime creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadDetails downloadDetails = (DownloadDetails) o;
        return Objects.equals(id, downloadDetails.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DownloadDetails{" +
            "id=" + id +
            ", downloadStatus='" + downloadStatus + "'" +
            ", downloadId='" + downloadId + "'" +
            ", metadata='" + metadata + "'" +
            ", lastModifiedTime='" + lastModifiedTime + "'" +
            ", creationTime='" + creationTime + "'" +
            '}';
    }
}
