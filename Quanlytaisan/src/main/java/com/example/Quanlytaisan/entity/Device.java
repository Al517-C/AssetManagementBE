package com.example.Quanlytaisan.entity;
import com.example.Quanlytaisan.enumtype.DeviceStatus;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDevice;

    @Column(nullable = false, length = 25)
    private String nameDevice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", referencedColumnName = "idType", nullable = true)
    private DeviceType deviceType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "model_id", referencedColumnName = "idModel", nullable = true)
    private DeviceModel deviceModel;

    @Column(nullable = true, length = 25)
    private String serialNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 25)
    private DeviceStatus status;

    @Column(nullable = true)
    private java.time.LocalDate purchaseDate;
}
