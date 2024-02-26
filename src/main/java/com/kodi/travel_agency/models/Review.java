package com.kodi.travel_agency.models;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_id")
            private Long clientId;

    @Column(name = "tour_id")
    private Long tourId;

    @Column(name = "review_text")
    private String text;

    private Integer rating;

}
