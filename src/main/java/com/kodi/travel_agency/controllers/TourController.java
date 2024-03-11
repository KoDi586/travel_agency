package com.kodi.travel_agency.controllers;

import com.kodi.travel_agency.models.Tour;
import com.kodi.travel_agency.services.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TourController {

    private final TourService service;

    @Autowired
    public TourController(TourService service) {
        this.service = service;
    }

    @PostMapping("create")
    public ResponseEntity<?> createTour(@RequestParam String title,
                                        @RequestParam String description,
                                        @RequestParam String services,
                                        @RequestParam Long provider_id) {
        return ResponseEntity.ok(service.create(title, description, services, provider_id));
    }
}
