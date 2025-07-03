package com.example.Quanlytaisan.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@IdClass(DeviceStockId.class)
@Entity
@Table(name = "devicestock")
public class DeviceStock {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id", referencedColumnName = "idDevice", nullable = true)
    private Device device;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_id", referencedColumnName = "idStock", nullable = false)
    private Stock stock;

    @Column(nullable = false)
    private Integer quantity;

}
