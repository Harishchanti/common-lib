package com.ailiens.optimusprime.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A OrderStatesMessages.
 */
@Entity
@Table(name = "order_states_messages")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class OrderStatesMessages implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "template_id")
    private String templateId;

    @Column(name = "message_text")
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "order_states_id")
    private OrderStates orderStates;

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

    public OrderStates getOrderStates() {
        return orderStates;
    }

    public void setOrderStates(OrderStates orderStates) {
        this.orderStates = orderStates;
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
        OrderStatesMessages orderStatesMessages = (OrderStatesMessages) o;
        return Objects.equals(id, orderStatesMessages.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "OrderStatesMessages{" +
            "id=" + id +
            ", templateId='" + templateId + "'" +
            ", messageText='" + messageText + "'" +
            '}';
    }
}
