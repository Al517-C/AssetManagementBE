package com.example.Quanlytaisan.entity;

import com.example.Quanlytaisan.enumtype.TicketStatus;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "maintenance_ticket")
public class MaintenanceTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id", referencedColumnName = "idDevice", nullable = true)
    private Device device;

    @Column(nullable = false)
    private LocalDateTime createdDate;

    @Column(length = 255)
    private String note;

    // Người tạo phiếu bảo trì
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by")
    private Account createdBy;

    @Column
    private LocalDateTime approvedDate;

    // Liên kết với phiếu xuất kho (nếu đã xuất kho để bảo trì)
    @OneToOne(mappedBy = "maintenanceTicket", fetch = FetchType.LAZY)
    private ExportTicket exportTicket;

}
