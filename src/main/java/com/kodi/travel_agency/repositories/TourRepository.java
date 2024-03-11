package com.kodi.travel_agency.repositories;

import com.kodi.travel_agency.models.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, Long> {

    Tour findFirstByCode(Long id);
}
