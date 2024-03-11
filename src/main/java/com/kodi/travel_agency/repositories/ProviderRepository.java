package com.kodi.travel_agency.repositories;

import com.kodi.travel_agency.models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
    Provider findFirstById(Long id);
}
