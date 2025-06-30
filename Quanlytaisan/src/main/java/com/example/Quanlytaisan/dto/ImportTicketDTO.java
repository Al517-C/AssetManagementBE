package com.example.Quanlytaisan.dto;

import com.example.Quanlytaisan.enumtype.ImportType;
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
    private ImportType importType; // Nhập mới, Nhập bảo trì, Nhập trả về, Nhập từ Site khác
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