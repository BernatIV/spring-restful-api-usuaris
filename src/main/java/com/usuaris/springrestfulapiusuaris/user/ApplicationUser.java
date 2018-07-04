package com.usuaris.springrestfulapiusuaris.user;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @Size(min = 4, max = 20) // Hauria de ser min 8 però suda
    private String username;

    @Column(length = 100)
    private String password;

    public ApplicationUser() {
    }

    public ApplicationUser(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
