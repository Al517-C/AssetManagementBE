package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class TransactionDTO {
    Long idTransaction;
    Long deviceId;
    String deviceName;
    Integer quantity;
    LocalDateTime dateTransaction;
    String transactionType;
    Long exportTicketId;
    Long maintenanceTicketId;
    Long disposalTicketId;
    Long fromStockId;
    String fromStockName;
    Long toStockId;
    String toStockName;
    Long performedById;
    String performedByName;
    String note;
    String status;
}
