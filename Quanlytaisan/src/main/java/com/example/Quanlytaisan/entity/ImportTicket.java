package com.example.Quanlytaisan.entity;

import com.example.Quanlytaisan.enumtype.ImportType;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "import_ticket")
public class ImportTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImportTicket;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private ImportType importType; // nhap moi, nhap bao tri, nhap tra ve, nhap tu Site khac

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private Device device;

    @Column(nullable = false)
    private Integer quantity;

    // Kho nhập (nơi xuất kho nếu là nhập từ site khác)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_stock_id")
    private Stock fromStock; // nullable nếu không phải nhập từ site khác

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stock_id")
    private Stock stock;// Kho nhập (nơi nhập kho)

    @Column(nullable = false)
    private LocalDateTime importDate;

    // Người tạo phiếu nhập kho
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performed_by")
    private Account performedBy;

    @Column(length = 255)
    private String note;
} 