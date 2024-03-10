package com.kodi.travel_agency.models;

import jakarta.persistence.*;

import java.util.Objects;

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

    /**
     * rating in five points range
     */
    private float rating;

    public Review() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getTourId() {
        return tourId;
    }

    public void setTourId(Long tourId) {
        this.tourId = tourId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(id, review.id) && Objects.equals(clientId, review.clientId) && Objects.equals(tourId, review.tourId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, tourId);
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", tourId=" + tourId +
                ", text='" + text + '\'' +
                ", rating=" + rating +
                '}';
    }
}
