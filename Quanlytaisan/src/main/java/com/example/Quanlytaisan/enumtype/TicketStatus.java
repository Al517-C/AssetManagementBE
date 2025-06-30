package com.example.Quanlytaisan.enumtype;

public enum TicketStatus {
    PENDING("Chờ xử lý"),
    APPROVED("Đã duyệt"),
    REJECTED("Từ chối"),
    CANCELLED("Đã hủy");

    private final String description;

    TicketStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
} 