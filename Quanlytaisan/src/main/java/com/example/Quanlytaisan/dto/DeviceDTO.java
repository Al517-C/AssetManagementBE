package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class DeviceDTO {
    Long idDevice;
    String deviceName;
    String deviceType;
    String deviceModel;
    String serialNumber;
    String deviceStatus;
    java.time.LocalDate purchaseDate;
}
