package com.kodi.travel_agency.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tour_id")
    private Long tourId;

    private Boolean status;

    @Column(name = "reservations_date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime reservationsDateTime;

    @Column(name = "client_id")
    private Long clientId;

}
