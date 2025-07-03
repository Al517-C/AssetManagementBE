package com.example.Quanlytaisan.enumtype;

public enum ImportType {
    IMPORT_NEW("Nhập thiết bị mới"),
    IMPORT_MAINTAIN("Nhập thiết bị bảo trì"),
    IMPORT_RETURN("Nhập thiết bị được trả về"),
    IMPORT_ANOTHER("Nhập thiết bị từ Site khác");

    private final String description;

    ImportType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
