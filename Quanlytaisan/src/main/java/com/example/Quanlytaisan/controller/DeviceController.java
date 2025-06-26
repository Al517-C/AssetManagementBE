package com.example.Quanlytaisan.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/devices")
public class DeviceController {

    @PostMapping
    public String addDevice() {
        // Logic to add a device
        return "Device added successfully";
    }
}
