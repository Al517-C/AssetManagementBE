package com.example.Quanlytaisan.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@IdClass(DeviceUseId.class)
@Entity
public class DeviceUse {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id", referencedColumnName = "idDevice", nullable = true)
    private Device device;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "use_id", referencedColumnName = "idUses", nullable = false)
    private Uses uses;

    @Column(nullable = false)
    private Integer quantity;
}
