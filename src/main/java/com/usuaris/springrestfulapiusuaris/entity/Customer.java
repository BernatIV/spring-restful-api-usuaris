package com.usuaris.springrestfulapiusuaris.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    @Size(min = 8, max = 20)
    private String customerName;

    private boolean active; // Si és un client actiu

    public Customer() {
    }

    public Customer(long id, String customerName, boolean active) {
        this.id = id;
        this.customerName = customerName;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
