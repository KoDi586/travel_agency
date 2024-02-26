package com.kodi.travel_agency.models;

import jakarta.persistence.*;

@Entity
@Table(name = "providers")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "contact_info")
    private String contactInfo;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "service_type")
    private String serviceType;

}
