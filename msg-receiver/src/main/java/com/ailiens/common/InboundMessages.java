package com.ailiens.common;

import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A InboundMessages.
 */
@Entity
@Table(name = "inbound_messages")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class InboundMessages implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final int MAX_PAYLOAD_SIZE =10000;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "message_id")
    private String messageId;

    @Column(name = "group_id")
    private String groupId;

    @Column(name = "payload")
    private String payload;

    @Setter
    private String response;

    private String clip(String str)
    {
        if(str.length()>MAX_PAYLOAD_SIZE)
            return str.substring(0,MAX_PAYLOAD_SIZE)+"...clipped";
        else return str;
    }

    @PrePersist
    public void checkSize()
    {
        payload=clip(payload);
        response=clip(response);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageId() {
        return messageId;
    }

    public InboundMessages messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getGroupId() {
        return groupId;
    }

    public InboundMessages groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }


    public String getPayload() {
        return payload;
    }

    public InboundMessages payload(String payload) {
        if(payload.length()<= MAX_PAYLOAD_SIZE)
            this.payload = payload;
        else this.payload=payload.substring(0,60000)+"...clipped";
        return this;
    }

    public void setPayload(String payload) {
        if(payload.length()< MAX_PAYLOAD_SIZE)
            this.payload = payload;
        else this.payload=payload.substring(0,60000)+"...clipped";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InboundMessages inboundMessages = (InboundMessages) o;
        if(inboundMessages.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, inboundMessages.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "InboundMessages{" +
            "id=" + id +
            ", messageId='" + messageId + "'" +
            ", groupId='" + groupId + "'" +
            ", payload='" + payload + "'" +
            '}';
    }
}
