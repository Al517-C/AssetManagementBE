package com.example.Quanlytaisan.entity;

import com.example.Quanlytaisan.enumtype.ExportType;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "export_ticket")
public class ExportTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id", referencedColumnName = "idDevice")
    private Device device;

    // Kho nguồn (nơi xuất kho)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_stock_id", referencedColumnName = "idStock")
    private Stock fromStock;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private ExportType type; // CAP_PHAT, BAO_TRI, THANH_LY, CHUYEN_SITE

    // Liên kết với phiếu bảo trì (nếu xuất kho để bảo trì)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "maintenance_ticket_id")
    private MaintenanceTicket maintenanceTicket;

    // Liên kết với phiếu thanh lý (nếu xuất kho để thanh lý)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "disposal_ticket_id")
    private DisposalTicket disposalTicket;

    // Kho đích (nơi nhận kho nếu chuyển site)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_stock_id", referencedColumnName = "idStock")
    private Stock toStock; // nullable nếu không chuyển site

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private boolean approved; // true nếu admin đã duyệt

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approved_by")
    private Account approvedBy;

    @Column
    private LocalDateTime approvedDate;

    @Column(length = 255)
    private String note;


}
