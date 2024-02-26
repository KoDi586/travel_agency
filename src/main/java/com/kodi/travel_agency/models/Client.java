package com.kodi.travel_agency.models;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "contact_info")
    private String contactInfo;

    @Column(name = "card_number")
    private String cardNumber;

    private String preferences;

}
