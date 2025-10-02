package com.example.backend.entity;


import jakarta.persistence.*;

@Entity
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomComplete;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role = Role.MEMBER;


    public user() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomComplete() {
        return nomComplete;
    }

    public void setNomComplete(String nomComplete) {
        this.nomComplete = nomComplete;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
