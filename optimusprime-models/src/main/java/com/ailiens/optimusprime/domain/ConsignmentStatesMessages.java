package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A ConsignmentStatesMessages.
 */
@Entity
@Table(name = "consignment_states_messages")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ConsignmentStatesMessages implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "template_id")
    private String templateId;

    @Column(name = "message_text")
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "consignment_states_id")
    private ConsignmentStates consignmentStates;

    @ManyToOne
    @JoinColumn(name = "message_types_id")
    private MessageTypes messageTypes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public ConsignmentStates getConsignmentStates() {
        return consignmentStates;
    }

    public void setConsignmentStates(ConsignmentStates consignmentStates) {
        this.consignmentStates = consignmentStates;
    }

    public MessageTypes getMessageTypes() {
        return messageTypes;
    }

    public void setMessageTypes(MessageTypes messageTypes) {
        this.messageTypes = messageTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsignmentStatesMessages consignmentStatesMessages = (ConsignmentStatesMessages) o;
        return Objects.equals(id, consignmentStatesMessages.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ConsignmentStatesMessages{" +
            "id=" + id +
            ", templateId='" + templateId + "'" +
            ", messageText='" + messageText + "'" +
            '}';
    }
}
