package com.kodi.travel_agency.services;

import com.kodi.travel_agency.models.Provider;
import com.kodi.travel_agency.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {

    private final ProviderRepository providerRepository;

    @Autowired
    public ProviderService(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    public Provider createProvider(String fullName, String contactInfo, String companyName) {
        Provider provider = new Provider();
        provider.setId(0L);
        provider.setFullName(fullName);
        provider.setContactInfo(contactInfo);
        provider.setCompanyName(companyName);

        return providerRepository.save(provider);
    }
}
