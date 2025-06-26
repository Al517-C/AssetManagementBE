package com.example.Quanlytaisan.entity;

import lombok.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeviceStockId implements Serializable {
    private Long device;
    private Long stock;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceStockId that = (DeviceStockId) o;
        return Objects.equals(device, that.device) && Objects.equals(stock, that.stock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device, stock);
    }
}
