package com.ailiens.optimusprime.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Accounts.
 */
@Entity
@Table(name = "accounts")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Accounts implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "account_id", nullable = false)
    private String accountId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "title")
    private String title;

    @Column(name = "username")
    private String username;

    @Column(name = "store_agent")
    private String storeAgent;

    @OneToOne(mappedBy = "accounts")
    @JsonIgnore
    private Orders orders;

    @OneToOne(mappedBy = "accounts")
    @JsonIgnore
    private OrderLine orderLine;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStoreAgent() {
        return storeAgent;
    }

    public void setStoreAgent(String storeAgent) {
        this.storeAgent = storeAgent;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Accounts accounts = (Accounts) o;
        return Objects.equals(id, accounts.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Accounts{" +
            "id=" + id +
            ", accountId='" + accountId + "'" +
            ", firstName='" + firstName + "'" +
            ", middleName='" + middleName + "'" +
            ", lastName='" + lastName + "'" +
            ", email='" + email + "'" +
            ", gender='" + gender + "'" +
            ", dateOfBirth='" + dateOfBirth + "'" +
            ", phoneNumber='" + phoneNumber + "'" +
            ", title='" + title + "'" +
            ", username='" + username + "'" +
            ", storeAgent='" + storeAgent + "'" +
            '}';
    }
}
