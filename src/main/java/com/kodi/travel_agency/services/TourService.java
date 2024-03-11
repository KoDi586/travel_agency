package com.kodi.travel_agency.services;

import com.kodi.travel_agency.models.Provider;
import com.kodi.travel_agency.models.Tour;
import com.kodi.travel_agency.repositories.ProviderRepository;
import com.kodi.travel_agency.repositories.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService<T> {
    private final TourRepository tourRepository;
    private final ProviderRepository providerRepository;

    @Autowired
    public TourService(TourRepository tourRepository, ProviderRepository providerRepository) {
        this.tourRepository = tourRepository;
        this.providerRepository = providerRepository;

    }


    public Object create(String title, String description, String services, Long providerId) {
        Provider provider = providerRepository.findFirstById(providerId);
        Tour tour = new Tour(0L, title, description, services, provider);
        return tourRepository.save(tour);
    }


    public List<T> getAllTours() {
        return providerRepository.findAllWithoutDescription();
    }

    public Tour findById(Long id) {
        return tourRepository.findFirstByCode(id);
    }
}
