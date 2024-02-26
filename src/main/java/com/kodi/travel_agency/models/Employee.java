package com.kodi.travel_agency.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;
    private String position;
    @Column(name = "contact_info")
    private String contactInfo;
    private Double salary;

    @Column(name = "hire_date", columnDefinition = "DATE")
    private LocalDate hireDate;


}
