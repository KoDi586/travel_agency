package com.kodi.travel_agency.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tour_id")
    private Long tourId;

    private Boolean status;

    @Column(name = "reservation_date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime reservationDateTime;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Reservation() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTourId() {
        return tourId;
    }

    public void setTourId(Long tourId) {
        this.tourId = tourId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDateTime getReservationDateTime() {
        return reservationDateTime;
    }

    public void setReservationDateTime(LocalDateTime reservationDateTime) {
        this.reservationDateTime = reservationDateTime;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id) && Objects.equals(tourId, that.tourId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tourId);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", tourId=" + tourId +
                ", status=" + status +
                ", reservationDateTime=" + reservationDateTime +
                ", client=" + client +
                '}';
    }
}
