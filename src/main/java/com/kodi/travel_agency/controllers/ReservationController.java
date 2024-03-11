package com.kodi.travel_agency.controllers;

import com.kodi.travel_agency.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "reservation")
public class ReservationController {
    private final ReservationService service;

    @Autowired
    public ReservationController(ReservationService service) {
        this.service = service;
    }


    /**
     * no id because it auto generate
     * no payment because there isn't it
     * no status b it false by default
     * no dataTime b it no finished
     */


    @PostMapping("create")
    public ResponseEntity<?> createReservation(@RequestParam Long tourCode,
                                               @RequestParam Long clientId) {

        return ResponseEntity.ok(service.createReservation(tourCode, clientId));

    }
}
