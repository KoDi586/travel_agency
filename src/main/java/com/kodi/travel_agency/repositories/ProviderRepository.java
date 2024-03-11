package com.kodi.travel_agency.repositories;

import com.kodi.travel_agency.models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
    Provider findFirstById(Long id);

    @Query(value = "select t.code, t.title, t.services \n" +
            "from tours t", nativeQuery = true)
    <T> List<T> findAllWithoutDescription();
}
