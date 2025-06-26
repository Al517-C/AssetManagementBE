package com.example.Quanlytaisan.entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "uses")
public class Uses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUses;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "site_id", referencedColumnName = "idSite", nullable = false)
    private Site site;

    @Column(nullable = true, length = 50)
    private String nameUser;

    @Column(nullable = true, length = 50)
    private String namelocation;

}
