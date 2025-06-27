package com.example.Quanlytaisan.controller;

import com.example.Quanlytaisan.dto.DTOTmp;
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
    public DTOTmp addDevice() {
        // Logic to add a device
        return new DTOTmp("Hello, device added!", "Success");
    }
}
