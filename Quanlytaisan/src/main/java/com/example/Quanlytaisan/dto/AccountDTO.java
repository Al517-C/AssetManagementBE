package com.example.Quanlytaisan.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class AccountDTO {
    Long idaccount;
    String username;
    String password;
    String email;
    String role;
}
