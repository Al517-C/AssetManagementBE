package com.example.Quanlytaisan.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;

    @Column(nullable = false, length = 10)
    private String nameStock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "site_id", referencedColumnName = "idSite", nullable = false)
    private Site site;

}
