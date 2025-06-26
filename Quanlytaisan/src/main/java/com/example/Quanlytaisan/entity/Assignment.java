package com.example.Quanlytaisan.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Assignment")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAssignment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id", referencedColumnName = "idDevice", nullable = false)
    private Device device;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "use_id", referencedColumnName = "idUses", nullable = false)
    private Uses uses;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "device_id", referencedColumnName = "device_id", insertable = false, updatable = false),
        @JoinColumn(name = "use_id", referencedColumnName = "use_id", insertable = false, updatable = false)
    })
    private DeviceUse deviceUse;

    @Column(nullable = false, length = 50)
    private String status;

    @Column(name = "dateAssigned", nullable = false)
    private LocalDateTime dateAssigned;

}
