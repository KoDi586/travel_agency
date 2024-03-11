package com.kodi.travel_agency.repositories;

import com.kodi.travel_agency.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
