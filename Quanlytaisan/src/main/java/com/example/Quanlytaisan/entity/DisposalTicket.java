package com.example.Quanlytaisan.entity;

import com.example.Quanlytaisan.enumtype.DisposalReason;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "disposal_ticket")
public class DisposalTicket {
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

    // Người tạo phiếu thanh lý
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by")
    private Account createdBy;

    // Liên kết với phiếu xuất kho (nếu đã xuất kho để thanh lý)
    @OneToOne(mappedBy = "disposalTicket", fetch = FetchType.LAZY)
    private ExportTicket exportTicket;

    // Lý do thanh lý
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 100)
    private DisposalReason disposalReason; // ly do thanh ly

}
