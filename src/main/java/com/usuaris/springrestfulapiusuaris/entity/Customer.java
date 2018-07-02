package com.usuaris.springrestfulapiusuaris.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @Size(min = 8, max = 20)
    private String customername;

    private boolean active; // Si és un client actiu

    public Customer() {
    }

    public Customer(long id, String customername, boolean active) {
        this.id = id;
        this.customername = customername;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
