package com.example.Quanlytaisan.entity;
import jakarta.persistence.*;
import lombok.*;


@Data
@Entity
@Table(name = "devicemodel")
public class DeviceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idModel;

    @Column(nullable = false, length = 25)
    private String nameModel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", referencedColumnName = "idType", nullable = false)
    private DeviceType deviceType;

    @Column(nullable = false, length = 50)
    private String modelinfo;
}
