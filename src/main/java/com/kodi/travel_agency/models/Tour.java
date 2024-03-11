package com.kodi.travel_agency.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tours")
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String code;

    private String title;

    private String description;
    /**
     * list with tours services
     */
    private String services;

//    private List<LocalDateTime> dateTimes;

    @ManyToOne
    @JoinColumn(name = "provider_id")
    private Provider provider;

    public Tour() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    //    public List<LocalDateTime> getDateTimes() {
//        return dateTimes;
//    }
//
//    public void setDateTimes(List<LocalDateTime> dateTimes) {
//        this.dateTimes = dateTimes;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return Objects.equals(code, tour.code) && Objects.equals(title, tour.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, title);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", services='" + services + '\'' +
//                ", dateTimes=" + dateTimes +
                '}';
    }
}
