package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class DeviceModelDTO {
    Long idModel;
    String nameModel;
    Long deviceTypeId;
    String deviceTypeName;
    String modelinfo;
}
