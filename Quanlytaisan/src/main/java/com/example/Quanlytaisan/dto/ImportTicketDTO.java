package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class ImportTicketDTO {
    Long id;
    Long deviceId;
    String deviceName;
    Long stockId;
    String stockName;
    Integer quantity;
    LocalDateTime importDate;
    Long performedById;
    String performedByName;
    String note;
} 