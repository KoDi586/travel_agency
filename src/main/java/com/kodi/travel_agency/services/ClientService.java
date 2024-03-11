package com.kodi.travel_agency.services;

import com.kodi.travel_agency.models.Client;
import com.kodi.travel_agency.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

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

    public String post(Long id, String fullName, String contactInfo, String card, String preferences) {
        Client client = new Client(id, fullName, contactInfo, card, preferences);
        return "create: " + clientRepository.save(client).toString();
    }


    public Collection<Client> getAll() {
        return clientRepository.findAllWithNameAndInfo();
    }
}
