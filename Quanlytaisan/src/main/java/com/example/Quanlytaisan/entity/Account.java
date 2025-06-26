package com.example.Quanlytaisan.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idaccount;

    @Column(nullable = false, length = 25)
    private String username;

    @Column(nullable = false, length = 8)
    private String password;

    @Column(nullable = false, length = 25)
    private String email;

    @Column(nullable = false)
    private String role;
}
