package com.kodi.travel_agency.controllers;

import com.kodi.travel_agency.models.Client;
import com.kodi.travel_agency.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {

    private ClientService service;

    @Autowired
    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping("registration_new_client")
    public ResponseEntity<?> createClient(@RequestParam Client client) {
        return ResponseEntity.ok(service.createClient(client));
    }

    @GetMapping("check/work/controller/by/client")
    public ResponseEntity<?> check() {
        return ResponseEntity.ok("normal");
    }
}
