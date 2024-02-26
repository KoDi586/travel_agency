package com.kodi.travel_agency.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {
    @GetMapping("check/work/controller/by/client")
    public ResponseEntity<?> check() {
        return ResponseEntity.ok("normal");
    }
}
