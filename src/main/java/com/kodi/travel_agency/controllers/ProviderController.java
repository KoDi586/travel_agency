package com.kodi.travel_agency.controllers;

import com.kodi.travel_agency.models.Provider;
import com.kodi.travel_agency.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "provider")
public class ProviderController {
    private final ProviderService service;

    @Autowired
    public ProviderController(ProviderService service) {
        this.service = service;
    }

    @PostMapping(value = "create")
    public ResponseEntity<?> createProvider(@RequestParam String fullName,
                                            @RequestParam String contactInfo,
                                            @RequestParam String companyName) {
        return ResponseEntity.ok(service.createProvider(fullName, contactInfo, companyName).toString());
    }
}
