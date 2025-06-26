package com.example.Quanlytaisan.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "devicetype")
public class DeviceType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idType;

    @Column(nullable = false, length = 25)
    private String nameType;

}
