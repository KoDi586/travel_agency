package com.kodi.travel_agency.models;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

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

    @OneToMany(mappedBy = "provider")
    private Set<Tour> tours;

    public Provider() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Set<Tour> getTours() {
        return tours;
    }

    public void setTours(Set<Tour> tours) {
        this.tours = tours;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return Objects.equals(id, provider.id) && Objects.equals(fullName, provider.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName);
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", companyName='" + companyName + '\'' +
                ", tours=" + tours +
                '}';
    }
}
