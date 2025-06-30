package com.example.Quanlytaisan.enumtype;

public enum TransactionType {
    IMPORT("Nhập kho"),
    CAPPHAT_EXPORT("Xuất kho cấp phát"),
    TRANSFER("Chuyển kho"),
    MAINTENANCE_EXPORT("Xuất bảo trì"),
    DISPOSAL_EXPORT("Xuất thanh lý");

    private final String description;

    TransactionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
} 