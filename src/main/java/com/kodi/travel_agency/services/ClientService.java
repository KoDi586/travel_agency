package com.kodi.travel_agency.services;

import com.kodi.travel_agency.models.Client;
import com.kodi.travel_agency.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ClientService<T> {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    public String createClient(Client client) {
        return clientRepository.save(client).toString();
    }

    public String post(String fullName, String contactInfo, String card, String preferences) {
        Client client = new Client(0L, fullName, contactInfo, card, preferences);
        return "create: " + clientRepository.save(client).toString();
    }


    /*
    return all clients with them id, full name, contact_info (without confidential data).
     */
    public List<T> getAll() {
        return clientRepository.findAllWithNameAndInfo();
    }
}
