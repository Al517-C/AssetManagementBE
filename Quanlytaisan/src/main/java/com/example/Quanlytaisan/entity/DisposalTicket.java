package com.example.Quanlytaisan.entity;

import com.example.Quanlytaisan.enumtype.DisposalMethod;
import com.example.Quanlytaisan.enumtype.DisposalReason;
import com.example.Quanlytaisan.enumtype.TicketStatus;
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
    @JoinColumn(name = "device_id", referencedColumnName = "idDevice", nullable = false)
    private Device device;

    @Column(nullable = false)
    private LocalDateTime createdDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private TicketStatus status; // PENDING, DONE, CANCELLED

    @Column(length = 255)
    private String note;

    // Người tạo phiếu thanh lý
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by")
    private Account createdBy;

    // Người duyệt phiếu thanh lý
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approved_by")
    private Account approvedBy;

    @Column
    private LocalDateTime approvedDate;

    // Liên kết với phiếu xuất kho (nếu đã xuất kho để thanh lý)
    @OneToOne(mappedBy = "disposalTicket", fetch = FetchType.LAZY)
    private ExportTicket exportTicket;

    // Lý do thanh lý
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 100)
    private DisposalReason disposalReason; // HONG_HONG, CU_KY, KHONG_SU_DUNG, NANG_CAP

    // Ngày dự kiến thanh lý
    @Column
    private LocalDateTime scheduledDate;

    // Ngày hoàn thành thanh lý
    @Column
    private LocalDateTime completedDate;

    // Phương thức thanh lý
    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private DisposalMethod disposalMethod; // BAN, VUT_BO, TAI_CHE, CHUYEN_GIAO
}
