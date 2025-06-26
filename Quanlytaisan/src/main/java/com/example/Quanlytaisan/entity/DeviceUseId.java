package com.example.Quanlytaisan.entity;

import lombok.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceUseId implements Serializable {
    private Long device;
    private Long uses;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceUseId that = (DeviceUseId) o;
        return Objects.equals(device, that.device) && Objects.equals(uses, that.uses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device, uses);
    }
}
