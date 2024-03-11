package com.kodi.travel_agency.controllers;

import com.kodi.travel_agency.models.Client;
import com.kodi.travel_agency.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("client")
public class ClientController {

    private ClientService service;

    @Autowired
    public ClientController(ClientService service) {
        this.service = service;
    }

    @PostMapping("registration_new_client")
    public String postClient(@RequestParam Long id, @RequestParam String fullName,
                             @RequestParam(required = false) String contactInfo,
                             @RequestParam(required = false) String card,
                             @RequestParam(required = false) String preferences) {

        return service.post(id, fullName, contactInfo, card, preferences);
    }

    @GetMapping("get_all")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
