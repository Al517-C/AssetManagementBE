package com.example.Quanlytaisan.entity;

import com.example.Quanlytaisan.enumtype.TransactionType;
import com.example.Quanlytaisan.enumtype.TicketStatus;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id", referencedColumnName = "idDevice")
    private Device device;

    @Column(nullable = false)
    private Integer quantity;

    @Column(name = "dateTransaction", nullable = false)
    private LocalDateTime dateTransaction;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private TransactionType typetransaction; // IMPORT, EXPORT, TRANSFER

    // Liên kết với phiếu nhập kho (nếu có)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "import_ticket_id")
    private ImportTicket importTicket;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "export_ticket_id")
    private ExportTicket exportTicket;

    // Kho nguồn (cho giao dịch xuất/chuyển)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_stock_id")
    private Stock fromStock;

    // Kho đích (cho giao dịch nhập/chuyển)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_stock_id")
    private Stock toStock;

    // Người thực hiện giao dịch
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performed_by")
    private Account performedBy;

    // Ghi chú giao dịch
    @Column(length = 255)
    private String note;

    // Trạng thái giao dịch
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private TicketStatus status; // PENDING, COMPLETED, CANCELLED, FAILED
}
