package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A ReturnStatesMessages.
 */
@Entity
@Table(name = "return_states_messages")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ReturnStatesMessages implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "template_id")
    private String templateId;

    @Column(name = "message_text")
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "return_states_id")
    private ReturnStates returnStates;

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

    public ReturnStates getReturnStates() {
        return returnStates;
    }

    public void setReturnStates(ReturnStates returnStates) {
        this.returnStates = returnStates;
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
        ReturnStatesMessages returnStatesMessages = (ReturnStatesMessages) o;
        return Objects.equals(id, returnStatesMessages.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReturnStatesMessages{" +
            "id=" + id +
            ", templateId='" + templateId + "'" +
            ", messageText='" + messageText + "'" +
            '}';
    }
}
