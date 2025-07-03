package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class ExportTicketDTO {
    Long id;
    Long deviceId;
    String deviceName;
    Long fromStockId;
    String fromStockName;
    Long toStockId;
    String toStockName;
    Integer quantity;
    String type;
    LocalDateTime createdDate;
    boolean approved;
    Long approvedById;
    String approvedByName;
    LocalDateTime approvedDate;
    String note;
    Long maintenanceTicketId;
    Long disposalTicketId;
}
