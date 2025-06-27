package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class MaintenanceTicketDTO {
    Long id;
    Long deviceId;
    String deviceName;
    LocalDateTime createdDate;
    String note;
    Long createdById;
    String createdByName;
    LocalDateTime approvedDate;
    Long exportTicketId;
}
