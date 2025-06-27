package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class DeviceUseDTO {
    Long idDeviceUse;
    Long deviceId;
    String deviceName;
    String deviceType;
    String deviceModel;
    String serialNumber;
    String deviceStatus;
    Long useId;
    String userName;
    String locationName;
    Long siteId;
    String siteName;
    Integer quantity;
}
