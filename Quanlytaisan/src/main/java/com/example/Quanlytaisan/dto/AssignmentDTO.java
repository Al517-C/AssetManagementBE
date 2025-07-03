package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class AssignmentDTO {
    Long idAssignment;
    Long deviceId;
    String deviceName;
    Long useId;
    String userName;
    String locationName;
    Integer quantity;
    String status;
    LocalDateTime dateAssigned;
}
