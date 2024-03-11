package com.kodi.travel_agency.services;

import com.kodi.travel_agency.models.Client;
import com.kodi.travel_agency.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    public String createClient(Client client) {
        return clientRepository.save(client).toString();
    }
}
