package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class UsesDTO {
    Long idUses;
    Long idSite;
    String siteName;
    String usesName;
    String nameLocation;
}
