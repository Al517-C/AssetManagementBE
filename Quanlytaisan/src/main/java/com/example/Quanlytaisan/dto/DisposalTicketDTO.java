package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class DisposalTicketDTO {
    Long id;
    Long deviceId;
    String deviceName;
    LocalDateTime createdDate;
    String note;
    Long createdById;
    String createdByName;
    Long exportTicketId;
    String disposalReason;
    String disposalMethod;
}
