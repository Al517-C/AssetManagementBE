package com.example.Quanlytaisan.enumtype;

public enum DeviceStatus {
    IN_STOCK("Có sẵn trong kho"),
    IN_USE("Đang sử dụng"),
    MAINTENANCE("Đang bảo trì"),
    DISPOSED("Đã thanh lý");

    private final String description;

    DeviceStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
} 