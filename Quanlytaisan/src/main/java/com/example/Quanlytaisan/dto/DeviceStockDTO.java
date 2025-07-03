package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class DeviceStockDTO {
    Long idDeviceStock;
    Long deviceId;
    String deviceName;
    String deviceType;
    String deviceModel;
    String serialNumber;
    String deviceStatus;
    Long stockId;
    String stockName;
    Long siteId;
    String siteName;
    Integer quantity;
} 