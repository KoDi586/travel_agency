package com.kodi.travel_agency.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tours")
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code;

    private String title;

    private String description;

    private String services;

    private List<LocalDateTime> dateTimes;

}
